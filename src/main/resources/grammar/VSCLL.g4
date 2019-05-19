grammar VSCLL;

prog: ( stat? NEWLINE )*
    ;

stat:       print SC
       |    scani SC
       |    scand SC
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
          | TOINT expresion             #expresion_to_int
          | TODOUBLE expresion          #expresion_to_double
   ;

print:	    'print' '(' expresion ')'       #print_expression
        |   'print' '(' STRING ')'          #print_string
   ;

scani: 'scani' '(' ID ')'
   ;

scand: 'scand' '(' ID ')'
    ;

declaration:   var ID                   #declaration_variable
             | text_pointer ID          #declaration_text_pointer
    ;

declaration_with_initialization:    var ID '=' expresion            #declaration_with_initialization_variable
                                |   text_pointer ID '=' STRING      #declaration_with_initialization_text_pointer
    ;

assign:     ID '=' expresion            #assing_variable
        |   ID '=' STRING               #assing_text_pointer
    ;

var: 'int' | 'double'
    ;

text_pointer: 'char*';

TOINT: '(int)'
    ;

TODOUBLE: '(double)'
    ;

STRING :  '"' ( ~('\\'|'"') )* '"'
    ;

ID:   ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*
   ;

INT:   ('0'..'9'+)
    |
       '(''-'('0'..'9'+)')'
    ;

DOUBLE: ('0'..'9'+)'.'('0'..'9'*)
    |
        '(''-'('0'..'9'+)'.'('0'..'9'*)')'
    ;

NEWLINE:	'\r'? '\n'
    ;

WS:   (' '|'\t')+ { skip(); }
    ;

SC: ';'
    ;
