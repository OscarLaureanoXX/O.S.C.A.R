grammar oscar;

// Importing python modules
@header{
import rules
}

/*
* Parser Rules
*/

programa	:	'#oscar' ';' {rules.create_function_table()} vars_? modulo* main {rules.destroy()} ; 
modulo	    :	'def' (tipo ID {rules.add_to_func_table($ID.text, $tipo.text)} | 'void' ID {rules.add_to_func_table($ID.text, 'void')}) param bloque {rules.set_func_end()};
main		:	'main' {rules.add_to_func_table('main','main')} param bloque ;
param		:	'(' (id_{rules.update_func_firm()}(','id_{rules.update_func_firm()})*)? ')' ;
bloque	    :	'{' vars_? {rules.set_func_start()}estatuto+ ('return' exp ';')? '}' ;
vars_		:	'var' ( tipo ID {rules.add_to_var_table($ID.text, $tipo.text)} {rules.add_to_operand_stack($ID.text, $tipo.text)} ('['CTE_I {rules.addRows($ID.text,$CTE_I.text)}(','CTE_I{rules.addColumns($ID.text,$CTE_I.text)})?']')? igualdad?  (',' ID  {rules.add_to_var_table($ID.text, $tipo.text)} {rules.add_to_operand_stack($ID.text, $tipo.text)} ('['CTE_I {rules.addRows($ID.text,$CTE_I.text)}(','CTE_I{rules.addColumns($ID.text,$CTE_I.text)})?']')? igualdad?)* ';' )+ ;                   // Se tuvo que cambiar vars por vars_ porque ese nombre tiene conflicto en Python
id_		    :	tipo ID {rules.add_to_var_table($ID.text, $tipo.text)} ;                                          // Se tuvo que cambiar id por id_ porque ese nombre tiene conflicto en Python
condicion	:	'if' '(' expresion ')'{rules.add_conditional()} estats ('else'{rules.add_else()} estats)? {rules.add_end_conditional()} ;
escritura	:	'print' '(' (expresion {rules.add_print()} | CTE_STRING) (','(expresion {rules.add_print()} | CTE_STRING) )*  ')' ';' ;
lectura	    :	'read' '(' ')' ;
expresion	:	exp ((RELACIONALES {rules.add_to_operator_stack($RELACIONALES.text)} | LOGICOS {rules.add_to_operator_stack($LOGICOS.text)}) exp {rules.pop_rel_from_stack()} )? ;
exp		    :	termino (( '+' {rules.add_to_operator_stack('+')} | '-' {rules.add_to_operator_stack('-')} ) termino {rules.pop_sum_from_stack()})* ;
termino	    :	factor (( '*' {rules.add_to_operator_stack('*')} | '/' {rules.add_to_operator_stack('/')} | '%' {rules.add_to_operator_stack('%')} )  factor{rules.pop_mult_from_stack()})* ;
factor	    :	('(' {rules.add_to_operator_stack('(')} expresion ')'{#sacar parentesis}) | (( '+' | '-')? var_cte ) | llamadaret;
var_cte	    :	ID {rules.add_to_operand_stack($ID.text, 'var')} 
                | CTE_I {rules.add_to_operand_stack($CTE_I.text, 'int')} 
                | CTE_F {rules.add_to_operand_stack($CTE_F.text, 'float')} 
                | CTE_B {rules.add_to_operand_stack($CTE_B.text, 'bool')}
                | CTE_STRING {rules.add_to_operand_stack($CTE_STRING.text, 'string')}
                | element ;
tipo		: 	'int' | 'float' | 'string' | 'bool' | 'list' ;
estatuto	:	asignacion | condicion | escritura | ciclo | llamadavoid ;
ciclo		:	( 'for' ID {rules.add_to_operand_stack($ID.text, 'var')} '=' {rules.add_to_operator_stack('=')} exp {rules.pop_equals_from_stack()} ':'{rules.add_for_inicio($ID.text)} exp {rules.add_for_limite()} (':' exp{rules.add_for_step()})? estats {rules.add_for_final()}) 
                | ( 'while' {rules.add_while()}'(' expresion ')'{rules.add_expr_while()} estats{rules.add_end_while()}) ;
estats	    :	'{' estatuto+ '}' ;
asignacion	:	ID {rules.add_to_operand_stack($ID.text, 'var')} element? igualdad ';' ;
igualdad    :   '=' {rules.add_to_operator_stack('=')} ( expresion |('[' ((exp | sub_lista )(','(exp | sub_lista ) )*)?']') | llamadaret ) {rules.pop_equals_from_stack()} ;
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
userdef	    :	 ID {rules.func_call_validation($ID.text)}'(' (var_cte {rules.func_add_argument()}(',' var_cte{rules.func_add_argument()})* )? ')' {rules.func_gosub()};
histograma	:	'histogram' '(' ID ',' ID ')' ';' ; 
pie_chart	:	'pie_chart' '(' ID ',' ID ')' ';' ;
bar_graph	:	'bar_graph' '(' ID ',' ID ')' ';' ;
export_csv	:	'export' '(' ID ',' CTE_STRING '.csv' ')' ';';

/** LEXER RULES **/

RESERVED	        : '#oscar' | 'for' | 'while' | 'if' | 'else' | 'int' | 'float' | 'string' | 'bool' | 'list' | 'min' | 'max' | 'mean' | 'mode' | 'variance' | 'stdev' | 'median' | 'tail' | 'head' | 'read' | 'print' | 'return' | 'length' | 'and' | 'or' | 'import' | 'export' | 'pie_chart' | 'histogram' | 'bar_graph' | 'concat' | 'splice' | 'find' | 'union' | 'intersect' | 'sort' ;
RELACIONALES	    : '>' | '<' | '>=' | '<=' | '!=' | '==';
LOGICOS		        : '&&' | '||';
DELIMITADORES	    : '[' | ']' | '(' | ')' | '{' | '}' ; 
WS		            : ( ' ' | '\t' | '\r' | '\n') -> skip;
ID			        : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')* ;
CTE_B			    : '_true' | '_false';
CTE_I			    : ('0'..'9')+ ;
CTE_F			    : ('0'..'9')+ '.' ('0'..'9')* ;
CTE_STRING		    : '"' ( ('a'..'z'|'A'..'Z') | '0'..'9' | WS)* '"' ;
LIST			    : '[' (CTE_STRING | CTE_I | CTE_F | CTE_B | LIST)* ']';