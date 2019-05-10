grammar oscar;

// Importing python modules
@header{
import rules
}

/*
* Parser Rules
*/

programa	:	'#oscar' ';' {rules.create_function_table()} vars_? {rules.generate_first_goto()} modulo* {rules.fill_first_goto()} main {rules.destroy()} ; 
modulo	    :	'def' (tipo ID {rules.add_to_func_table($ID.text, $tipo.text)} | 'void' ID {rules.add_to_func_table($ID.text, 'void')}) param bloque {rules.set_func_end()} ;
main		:	'main' {rules.add_to_func_table('main','main')} param bloque {rules.create_packet_main()};
param		:	'(' (id_{rules.update_func_firm()}(','id_{rules.update_func_firm()})*)? ')' ;
bloque	    :	'{' {rules.set_func_start()} vars_? estatuto* ('return' exp ';' {rules.create_return()})? '}' ;
vars_		:	'var' ( tipo ID {rules.add_to_var_table($ID.text, $tipo.text)} {rules.add_to_operand_stack($ID.text, $tipo.text)} ('['CTE_I {rules.addRows($ID.text,$CTE_I.text)}(','CTE_I{rules.addColumns($ID.text,$CTE_I.text)})?']')? igualdad?  (',' ID  {rules.add_to_var_table($ID.text, $tipo.text)} {rules.add_to_operand_stack($ID.text, $tipo.text)} ('['CTE_I {rules.addRows($ID.text,$CTE_I.text)}(','CTE_I{rules.addColumns($ID.text,$CTE_I.text)})?']')? igualdad?)* ';' )+ ;                   // Se tuvo que cambiar vars por vars_ porque ese nombre tiene conflicto en Python
id_		    :	tipo ID {rules.add_to_var_table($ID.text, $tipo.text)} ;                                          // Se tuvo que cambiar id por id_ porque ese nombre tiene conflicto en Python
condicion	:	'if' '(' expresion ')'{rules.add_conditional()} estats ('else'{rules.add_else()} estats)? {rules.add_end_conditional()} ;
escritura	:	'print' '(' (expresion {rules.add_print()} | CTE_STRING | acceso) (','(expresion {rules.add_print()} | CTE_STRING | acceso) )*  ')' ';' ;
lectura	    :	'read' '(' tipo ')' {rules.generate_read($tipo.text)} ;
expresion	:	exp ((RELACIONALES {rules.add_to_operator_stack($RELACIONALES.text)} | LOGICOS {rules.add_to_operator_stack($LOGICOS.text)}) exp {rules.pop_rel_from_stack()} )? ;
exp		    :	termino (( '+' {rules.add_to_operator_stack('+')} | '-' {rules.add_to_operator_stack('-')} ) termino {rules.pop_sum_from_stack()})* ;
termino	    :	factor (( '*' {rules.add_to_operator_stack('*')} | '/' {rules.add_to_operator_stack('/')} | '%' {rules.add_to_operator_stack('%')} )  factor{rules.pop_mult_from_stack()})* ;
factor	    :	('(' {rules.add_to_operator_stack('(')} expresion ')') | (( '+' | '-')? var_cte ) | llamadaret;
var_cte	    :	ID {rules.add_to_operand_stack($ID.text, 'var')} element?
                | CTE_I {rules.add_to_operand_stack($CTE_I.text, 'int')} 
                | CTE_F {rules.add_to_operand_stack($CTE_F.text, 'float')} 
                | CTE_B {rules.add_to_operand_stack($CTE_B.text, 'bool')}
                | CTE_STRING {rules.add_to_operand_stack($CTE_STRING.text, 'string')};
tipo		: 	'int' | 'float' | 'string' | 'bool' | 'list' ;
estatuto	:	asignacion | condicion | escritura | ciclo | llamadavoid ;
ciclo		:	( 'for' ID {rules.add_to_operand_stack($ID.text, 'var')} '=' {rules.add_to_operator_stack('=')} exp {rules.pop_equals_from_stack()} ':'{rules.add_for_inicio($ID.text)} exp {rules.add_for_limite()} (':' exp{rules.add_for_step()})? estats {rules.add_for_final()}) 
                | ( 'while' {rules.add_while()}'(' expresion ')'{rules.add_expr_while()} estats{rules.add_end_while()}) ;
estats	    :	'{' estatuto+ '}' ;
acceso      :   ID {rules.add_to_operand_stack($ID.text, 'var')} element;
asignacion	:	ID {rules.add_to_operand_stack($ID.text, 'var')} element? igualdad ';' ;
igualdad    :   '=' {rules.add_to_operator_stack('=')} ( expresion | acceso | ('['((exp {rules.crear_array(1)} | sub_lista ) (','(exp {rules.crear_array(1)} | sub_lista ) )*)?']'{rules.asignar_array(1)}) | llamadaret ) {rules.pop_equals_from_stack()} ;
sub_lista   :   '[' (exp {rules.crear_array(2)} (','exp {rules.crear_array(2)})*)?']' {rules.asignar_array(2)};
element	    :	{rules.nombre_arreglo()}'[' exp {rules.verifica_index(1)} (','exp {rules.verifica_index(2)})? ']' ;
llamadaret	:	concat {rules.add_special('string')} | sort {rules.add_special('list')} | splice {rules.add_special('string')} | length {rules.add_special('int')} | min_ {rules.add_special('int')} | max_ {rules.add_special('int')} | mean {rules.add_special('float')} | variance {rules.add_special('float')} | median {rules.add_special('list')} | stdev {rules.add_special('float')}| head {rules.add_special('list')} | tail {rules.add_special('list')}| import_csv {rules.add_special('list')}| union {rules.add_special('list')}| intersect {rules.add_special('list')}| find {rules.add_special('int')}| lectura | userdef {rules.add_return_value($userdef.text)} ;
llamadavoid :   histograma | pie_chart | bar_graph | export_csv | (userdef ';');
mean		:	'mean' '(' ID {rules.generate_special_function("mean", $ID.text)} ')' ;
variance	:	'variance' '(' ID {rules.generate_special_function("variance", $ID.text)}')' ;
median	    :	'median' '(' ID {rules.generate_special_function("median", $ID.text)}')' ;
stdev		: 	'stdev' '(' ID {rules.generate_special_function("stdev", $ID.text)}')' ;
head		: 	'head' '(' ID {rules.generate_special_function("head", $ID.text)}')' ;
tail		:	'tail' '(' ID {rules.generate_special_function("tail", $ID.text)}')' ;
union		:	'union' '(' ID {rules.add_special_stack($ID.text, 'list')} ',' ID {rules.add_special_stack($ID.text, 'list')} ')' {rules.generate_special_function2("union")} ;
intersect	:	'intersect' '(' ID {rules.add_special_stack($ID.text, 'list')}',' ID {rules.add_special_stack($ID.text, 'list')}')' {rules.generate_special_function2("intersect")} ;
find		:	'find' '(' ID {rules.add_special_stack($ID.text, 'list')}',' exp {##FALTA}')' {rules.generate_special_function2("find")} ;
import_csv	:	'import' '(' CTE_STRING ')' {rules.generate_special_function("import", $CTE_STRING.text)} ;
length  	:	'length' '(' ID {rules.generate_special_function("length", $ID.text)}')' ;
min_		:	'min' '(' ID {rules.generate_special_function("min", $ID.text)}')' ;                       // Se tuvo que cambiar min por min_ porque ese nombre tiene conflicto en Python
max_	    :	'max' '(' ID {rules.generate_special_function("max", $ID.text)}')' ;                       // Se tuvo que cambiar max por max_ porque ese nombre tiene conflicto en Python
concat	    :	'concat' '(' ID {rules.add_special_stack($ID.text, 'string')} ',' ID {rules.add_special_stack($ID.text, 'string')} ')' {rules.generate_special_function2("concat")} ;
sort		:	'sort' '(' ID {rules.add_special_stack($ID.text, 'list')}  ',' CTE_I {rules.add_special_stack($CTE_I.text, 'int')}')' {rules.generate_special_function2("sort")} ;
splice 	    :	'splice' '(' ID{rules.add_special_stack($ID.text, 'string')} ',' CTE_I{rules.add_special_stack($CTE_I.text, 'int')} ',' CTE_I{rules.add_special_stack($CTE_I.text, 'int')} ')' {rules.generate_special_function3("splice")} ;
userdef	    :	 ID {rules.func_call_validation($ID.text)}'(' (exp {rules.func_add_argument()}(',' exp{rules.func_add_argument()})* )? ')' {rules.func_gosub()};
histograma	:	'histogram' '(' ID{rules.add_special_stack($ID.text, 'list')} ',' CTE_I{rules.add_special_stack($CTE_I.text, 'int')} ')' {rules.generate_special_function2("histogram")} ';' ; 
pie_chart	:	'pie_chart' '(' ID{rules.add_special_stack($ID.text, 'list')} ',' ID{rules.add_special_stack($ID.text, 'list')} ')' {rules.generate_special_function2("pie_chart")} ';' ;
bar_graph	:	'bar_graph' '(' ID{rules.add_special_stack($ID.text, 'list')} ',' ID{rules.add_special_stack($ID.text, 'list')} ')' {rules.generate_special_function2("bar_graph")} ';' ;
export_csv	:	'export' '(' ID ',' CTE_STRING '.csv' ')' {###FALTA} {rules.generate_special_function("export")} ';';

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