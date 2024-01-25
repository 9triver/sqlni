grammar FuncTemplate;

function
    : left=STRING? param separator=STRING '...' right=STRING? # varParams
    | (text|param)+       # fixedParams
    ;

text
    : STRING
    ;

param
    : '{' INT '}'
    ;

//WS  : [ \t\r\n]+ -> skip;

INT : '0' | [1-9] [0-9]*;
STRING : (ESC|~[{}.])+;

fragment ESC : '\\"' | '\\\\';


