grammar oscar;

// Importing python modules
@header{
import rules
}

/*
* Parser Rules
*/

programa	:	'#oscar' ';' {#crear tabla funciones} vars_? modulo* main {#destruir tabla funciones y tablas de variables} ; 
modulo	    :	'def' {#agregar funcion a tabla funciones} (id_ | 'void' ID) param bloque {#borrar tabla de variables};
main		:	'main' param bloque ;
param		:	'('{#crea directorio vars para funcion} (id_(','id_)*)? ')' ;
bloque	    :	'{' vars_? estatuto+ ('return' exp ';')? '}' ;
vars_		:	'var' {#crear tabla de variables} ( tipo ID igualdad? {#agregar a tabla variables} (',' ID igualdad? {#agregar a tabla variables})* ';' )+ ;                   // Se tuvo que cambiar vars por vars_ porque ese nombre tiene conflicto en Python
id_		    :	tipo ID {#agregar nombre a tabla variables actual } ;                                          // Se tuvo que cambiar id por id_ porque ese nombre tiene conflicto en Python
condicion	:	'if' '(' expresion ')' estats ('else' estats)? ;
escritura	:	'print' {}'(' (expresion | CTE_STRING) (','(expresion | CTE_STRING))* ')' ';' ; // Ejemplo de codigo en reglas
lectura	    :	'read' '(' ')' ;
expresion	:	exp ((RELACIONALES | LOGICOS) exp)? ;
exp		    :	termino (( '+' | '-' ) termino)* ;
termino	    :	factor (( '*' | '/' | '%' ) factor)* ;
factor	    :	('(' expresion ')') | (( '+' | '-')? var_cte) | llamadaret;
var_cte	    :	ID | CTE_I | CTE_F | CTE_B | CTE_STRING {print ("String: " + $CTE_STRING.text)}| element ; //Codigo entre reglas para acceder al valor de un elemento
tipo		: 	('int' | 'float' | 'string' | 'boolean' | 'list') {#agregar tipo a tabla variables} ;
estatuto	:	asignacion | condicion | escritura | ciclo | llamadavoid ;
ciclo		:	( 'for' ID '=' exp ':' exp (':' exp)? estats ) | ( 'while' '(' expresion ')' estats) ;
estats	    :	'{' estatuto+ '}' ;
asignacion	:	ID element? igualdad ';' ;
igualdad    :   '=' ( expresion |('[' ((exp | sub_lista )(','(exp | sub_lista ) )*)?']') | llamadaret ) ;
sub_lista   :   '[' (exp(','exp)*)?']' ;
element	    :	'[' exp (','exp)? ']' ;
llamadaret	:	concat | sort | splice | length | min_ | max_ | mean | variance | median | stdev | head | tail | import_csv | union | intersect | find | userdef ;
llamadavoid :   histograma | pie_chart | bar_graph | export_csv | (userdef ';');
mean		:	'mean' '(' ID ')' ;
variance	:	'variance' '(' ID ')' ;
median	    :	'median' '(' ID ')' ;
stdev		: 	'stdev' '(' ID ')' ;
head		: 	'head' '(' ID ')' ;
tail		:	'tail' '(' ID ')' ;
union		:	'union' '(' ID ',' ID ')' ;
intersect	:	'intersect' '(' ID ',' ID ')' ;
find		:	'find' '(' ID ',' exp ')' ;
import_csv	:	'import' '(' CTE_STRING ')' ;
length  	:	'length' '(' ID ')' ;
min_		:	'min' '(' ID ')' ;                       // Se tuvo que cambiar min por min_ porque ese nombre tiene conflicto en Python
max_	    :	'max' '(' ID ')' ;                       // Se tuvo que cambiar max por max_ porque ese nombre tiene conflicto en Python
concat	    :	'concat' '(' ID ',' ID ')' ;
sort		:	'sort' '(' ID ',' CTE_I ')' ;
splice 	    :	'splice' '(' ID ',' exp ',' exp ')' ;
userdef	    :	 ID'('((ID | var_cte)(','(ID | var_cte))*)?')';
histograma	:	'histogram' '(' ID ',' ID ')' ';' ; 
pie_chart	:	'pie_chart' '(' ID ',' ID ')' ';' ;
bar_graph	:	'bar_graph' '(' ID ',' ID ')' ';' ;
export_csv	:	'export' '(' ID ',' CTE_STRING '.csv' ')' ';';

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