grammar VSCLL;

prog: ( stat? NEWLINE )*
    ;

stat:       print SC
       |    scani SC
       |    declaration SC
       |    declaration_with_initialization SC
       |    assign SC
   ;

expresion : expresion '*' expresion     #multiplicate
          | expresion '/' expresion     #divide
          | expresion '+' expresion     #add
          | expresion '-' expresion     #subtract
          | ID                          #expresion_id
          | INT                         #expresion_int
          | DOUBLE                      #expresion_double
          | STRING                      #expresion_string
          | TOINT expresion             #expresion_to_int
          | TODOUBLE expresion          #expresion_to_double
   ;

print:	'print' '(' expresion ')'
   ;

scani: 'scani' '(' ID ')'
   ;

declaration: var ID
    ;

declaration_with_initialization: var ID '=' expresion
    ;
assign: ID '=' expresion
    ;

var: 'int' | 'double' | 'string'
    ;

TOINT: '(int)'
    ;

TODOUBLE: '(double)'
    ;

STRING :  '"' ( ~('\\'|'"') )* '"'
    ;

ID:   ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*
   ;

INT:   ('0'..'9'+)
    ;

DOUBLE: ('0'..'9'+)'.'('0'..'9'*)
    ;

NEWLINE:	'\r'? '\n'
    ;

WS:   (' '|'\t')+ { skip(); }
    ;

SC: ';'
    ;
