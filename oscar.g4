grammar oscar;

// Importing python modules
@header{
import rules
}

/*
* Parser Rules
*/

programa	:	'#oscar' ';' {rules.create_function_table()} vars_? modulo* main {rules.destroy()} ; 
modulo	    :	'def' (id_ {rules.add_to_func_table($id_.text)} | 'void' ID {rules.add_to_func_table('void '+$ID.text)}) param bloque {rules.delete_var_table()};
main		:	'main' {rules.add_to_func_table("main")} param bloque ;
param		:	'('{rules.create_variable_table('param')} (id_(','id_)*)? ')' ;
bloque	    :	'{' vars_? estatuto+ ('return' exp ';')? '}' ;
vars_		:	'var' {rules.create_variable_table('vars')} ( tipo ID igualdad? {rules.add_to_var_table($ID.text, $tipo.text)} (',' ID igualdad? {rules.add_to_var_table($ID.text, $tipo.text)})* ';' )+ ;                   // Se tuvo que cambiar vars por vars_ porque ese nombre tiene conflicto en Python
id_		    :	tipo ID {rules.add_to_var_table($ID.text, $tipo.text)} ;                                          // Se tuvo que cambiar id por id_ porque ese nombre tiene conflicto en Python
condicion	:	'if' '(' expresion ')' estats ('else' estats)? ;
escritura	:	'print' '(' (expresion | CTE_STRING) (','(expresion | CTE_STRING))* ')' ';' ;
lectura	    :	(ID | element) '=' 'read' '(' ')' ';' ;
expresion	:	exp ((RELACIONALES | LOGICOS) exp)? ;
exp		    :	termino (( '+' | '-' ) termino)* ;
termino	    :	factor (( '*' | '/' | '%' ) factor)* ;
factor	    :	('(' expresion ')') | (( '+' | '-')? var_cte) ;
var_cte	    :	ID | CTE_I | CTE_F | CTE_B | CTE_STRING | element ;
tipo		: 	'int' | 'float' | 'string' | 'boolean' | 'list' ;
estatuto	:	asignacion | condicion | escritura | lectura | ciclo | llamada ;
ciclo		:	( 'for' ID '=' exp ':' exp (':' exp)? estats ) | ( 'while' '(' expresion ')' estats) ;
estats	    :	'{' estatuto+ '}' ;
asignacion	:	ID element? igualdad ';' ;
igualdad    : '=' ( expresion |('[' ((exp | sub_lista )(','(exp | sub_lista ) )*)?']') ) ;
sub_lista   : '[' (exp(','exp)*)?']' ;
element	    :	'[' exp (','exp)? ']' ;
llamada	    :	concat | sort | splice | length | min_ | max_ | mean | variance | median | stdev | head | tail | histograma | pie_chart | bar_graph | import_csv| export_csv | union | intersect | find | userdef ;
mean		:	ID '=' 'mean' '(' ID ')' ';' ;
variance	:	ID '=' 'variance' '(' ID ')' ';' ;
median	    :	ID '=' 'median' '(' ID ')' ';' ;
stdev		: 	ID '=' 'stdev' '(' ID ')' ';' ;
head		: 	ID '=' 'head' '(' ID ')' ';' ;
tail		:	ID '=' 'tail' '(' ID ')' ';' ;
histograma	:	'histogram' '(' ID ',' ID ')' ';' ; //Ejemplo de como meter codigo en reglas
pie_chart	:	'pie_chart' '(' ID ',' ID ')' ';' ;
bar_graph	:	'bar_graph' '(' ID ',' ID ')' ';' ;
union		:	ID '=' 'union' '(' ID ',' ID ')' ';' ;
intersect	:	ID '=' 'intersect' '(' ID ',' ID ')' ';' ;
find		:	ID '=' 'find' '(' ID ',' exp ')' ';' ;
import_csv	:	ID '=' 'import' '(' CTE_STRING ')' ';' ;
export_csv	:	'export' '(' ID ',' CTE_STRING '.csv' ')' ';';
length  	:	ID '=' 'length' '(' ID ')' ';' ;
min_		    :	ID '=' 'min' '(' ID ')' ';' ;                       // Se tuvo que cambiar min por min_ porque ese nombre tiene conflicto en Python
max_	    	:	ID '=' 'max' '(' ID ')' ';' ;                       // Se tuvo que cambiar max por max_ porque ese nombre tiene conflicto en Python
concat	    :	ID '=' 'concat' '(' ID ',' ID ')' ';' ;
sort		:	ID '=' 'sort' '(' ID ',' CTE_I ')' ';' ;
splice 	    :	ID '=' 'splice' '(' ID ',' CTE_I ',' CTE_I ')' ';' ;
userdef	    :	(ID '=')? ID'('((ID | var_cte)(','(ID | var_cte))*)?')' ;

/** LEXER RULES **/

RESERVED	        : '#oscar' | 'for' | 'while' | 'if' | 'else' | 'int' | 'float' | 'string' | 'bool' | 'list' | 'min' | 'max' | 'mean' | 'mode' | 'variance' | 'stdev' | 'median' | 'tail' | 'head' | 'read' | 'print' | 'return' | 'length' | 'and' | 'or' | 'import' | 'export' | 'pie_chart' | 'histogram' | 'bar_graph' | 'concat' | 'splice' | 'find' | 'union' | 'intersect' | 'sort' ;
RELACIONALES	    : '>' | '<' | '=>' | '=<' | '!=' | '!' ;
LOGICOS		        : '&&' | '||';
DELIMITADORES	    : '[' | ']' | '(' | ')' | '{' | '}' ; 
WS		            : ( ' ' | '\t' | '\r' | '\n') -> skip;
ID			        : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')* ;
CTE_B			    : 'true' | 'false';
CTE_I			    : ('0'..'9')+ ;
CTE_F			    : ('0'..'9')+ '.' ('0'..'9')* ;
CTE_STRING		    : '"' ( ('a'..'z'|'A'..'Z') | '0'..'9' | WS)* '"' ;
LIST			    : '[' (CTE_STRING | CTE_I | CTE_F | CTE_B | LIST)* ']';