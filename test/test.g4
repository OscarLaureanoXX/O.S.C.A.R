grammar test;
import reglas;

/*
* Parser Rules
*/

says  : 'says' string ;
string : STRING printz;

/*
* Lexer Rules
*/

WS		        : ( ' ' | '\t' | '\r' | '\n') -> skip;
fragment COMILLAS      : '"' ;
STRING		    : COMILLAS ( ('a'..'z'|'A'..'Z') | '0'..'9' | WS)* COMILLAS ;