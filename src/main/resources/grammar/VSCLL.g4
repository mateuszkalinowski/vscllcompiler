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

expression : expression '*' expression     #multiplicate
          | expression '/' expression     #divide
          | expression '+' expression     #add
          | expression '-' expression     #subtract
          | ID index                    #expression_index
          | ID                          #expresion_id
          | INT                         #expresion_int
          | DOUBLE                      #expresion_double
          | TOINT expression             #expresion_to_int
          | TODOUBLE expression          #expresion_to_double
   ;

print:	    'print' '(' expression ')'       #print_expression
        |   'print' '(' STRING ')'          #print_string
   ;

scani:      'scani' '(' ID ')'                   #scani_id
       |    'scani' '(' ID index ')'             #scani_array
   ;

scand:      'scand' '(' ID ')'                   #scand_id
       |    'scand' '(' ID index ')'             #scand_array
    ;

declaration:   var ID                   #declaration_variable
             | text_pointer ID '[]'     #declaration_text_pointer
             | var ID index             #declaration_array
    ;

declaration_with_initialization:    var ID '=' expression            #declaration_with_initialization_variable
                                |   text_pointer ID'[]' '=' STRING      #declaration_with_initialization_text_pointer
    ;

assign:     ID '=' expression            #assing_variable
        |   ID '=' STRING               #assing_text_pointer
        |   ID index '=' expression      #assing_to_array
    ;

var: 'int' | 'double'
    ;

text_pointer: 'char';

index: '[' INT ']'
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
