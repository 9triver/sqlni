grammar DynamicSQL;

root
    : any (func|any)*
    ;

func
    : IF LEFT any RIGHT root ENDIF            # if
    | FOREACH LEFT SPACE* param SPACE* RIGHT  # foreach
    ;

param
    : left=(PARAM_LEFT1|PARAM_LEFT2) ID right=PARAM_RIGHT
    ;

any: (CH|LEFT|RIGHT|SEPARATOR|ID|PARAM_LEFT1|PARAM_LEFT2|PARAM_RIGHT|STRING|SPACE)+;

LEFT: '(';
RIGHT: ')';

PARAM_LEFT1: '#{';
PARAM_LEFT2: '${';

PARAM_RIGHT: '}';


SEPARATOR: ',';

// func
IF: '#'[Ii][Ff];
ENDIF: '#'[Ee][Nn][Dd][Ii][Ff];
FOREACH: '#'[Ff][Oo][Rr][Ee][Aa][Cc][Hh];

STRING : '\'' (ESC|.)*? '\'';

fragment ESC : '\\"' | '\\\\';       // 双字符序列 \" 和 \\

ID     :   [a-zA-Z][a-zA-Z_0-9]*;

SPACE: ' ';

CH    :   .;