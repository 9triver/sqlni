grammar MyBatisTag;

root
    : any (func|any)*
    ;

func
    : IF LEFT any+? RIGHT root*? ENDIF                              # if
    | FOREACH LEFT param SPACE* SEPARATOR SPACE* STRING SPACE* RIGHT    # foreach
    ;

param
    : left=PARAM_LEFT ID right=PARAM_RIGHT    # param1
    | left=PARAM_LEFT ID right=PARAM_RIGHT    # param2
    ;

any: (CH|LEFT|RIGHT|SEPARATOR|ID|PARAM_LEFT|PARAM_RIGHT|STRING|SPACE)+;

LEFT: '(';
RIGHT: ')';

PARAM_LEFT: '#{'|'${';
PARAM_RIGHT: '}';


SEPARATOR: ',';

// func
IF: '#'[Mm][Ii][Ff];
ENDIF: '#'[Ee][Nn][Dd][Ii][Ff];
FOREACH: '#'[Mm][Ff][Oo][Rr];

STRING : '\'' (ESC|.)*? '\'';

fragment
ESC : '\\"' | '\\\\';       // 双字符序列 \" 和 \\

ID     :   [a-zA-Z][a-zA-Z_0-9]*;

SPACE: ' ';

CH    :   .;