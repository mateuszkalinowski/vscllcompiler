grammar VSCLL;

prog: ( function? NEWLINE )*
    ;

if_block: (stat? NEWLINE)*
    ;

while_block: (stat? NEWLINE)*
    ;

function_block: (stat? NEWLINE)* return_statement SC NEWLINE?
    ;

stat:           print SC
          |     prints SC
          |     scani SC
          |     scand SC
          |     declaration SC
          |     declaration_with_initialization SC
          |     assign SC
          |     if_statement
          |     while_statement
   ;

function: function_type ID '(' function_parameters ')' '{' function_block '}'
    ;
if_statement: 'if' '('condition')' '{' if_block '}'
    ;

return_statement: 'return' expression?
            ;

while_statement: 'while' '(' condition ')' '{' while_block '}'
    ;

function_parameters:
                        function_parameter
            |           function_parameter ',' function_parameters
            ;

function_parameter: var ID
            |
        ;

condition:      expression '<'  expression         #condition_less_than
          |     expression '>'  expression         #condition_greater_than
          |     expression '==' expression         #condition_equal
          ;

expression :    TODOUBLE expression                #expression_to_double
          |     TOINT expression                   #expression_to_int
          |     expression '*' expression          #multiplicate
          |     expression '/' expression          #divide
          |     expression '+' expression          #add
          |     expression '-' expression          #subtract
          |     ID index                           #expression_index
          |     ID                                 #expression_id
          |     INT                                #expression_int
          |     DOUBLE                             #expression_double
          |     CHARACTER                          #expression_character
   ;

print:	        'print' '(' expression ')'         #print_expression
   ;

prints:         'prints' '(' STRING ')'            #prints_string
          |     'prints' '(' ID ')'                #prints_id
          |     'prints' '(' ID index ')'          #prints_id_index
   ;

scani:          'scani' '(' ID ')'                 #scani_id
          |     'scani' '(' ID index ')'           #scani_array
   ;

scand:          'scand' '(' ID ')'                 #scand_id
          |     'scand' '(' ID index ')'           #scand_array
    ;

declaration:
                 var ID                            #declaration_variable
           |     text_pointer ID '[]'              #declaration_text_pointer
           |     var ID index                      #declaration_array
    ;

declaration_with_initialization:
                  var ID '=' expression            #declaration_with_initialization_variable
           |      text_pointer ID'[]' '=' STRING   #declaration_with_initialization_text_pointer
    ;

assign:           ID '=' expression                 #assing_variable
           |      ID '=' STRING                     #assing_text_pointer
           |      ID index '=' expression           #assing_to_array
    ;

var: 'int' | 'double' | 'char'
    ;

function_type: 'int' | 'double' | 'void'
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

CHARACTER: '\''.'\'' | '\'' ('\\'.) '\''
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
