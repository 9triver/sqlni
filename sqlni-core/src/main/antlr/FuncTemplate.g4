grammar FuncTemplate;

function
    : STRING? '...' STRING? # varParams
    | (STRING|param)+       # fixedParams
    ;

param
    : '{' INT '}'
    ;

//WS  : [ \t\r\n]+ -> skip;

INT : '0' | [1-9] [0-9]*;
STRING : (ESC|~[{}.])+;

fragment ESC : '\\"' | '\\\\';


