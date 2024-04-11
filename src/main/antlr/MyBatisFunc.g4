grammar MyBatisFunc;

root:
    | any (func|any)*
    ;

func:
    | IF '(' any ',' root ')'
    ;

column
    : (ID|ID'.'ID)                      # normalColumn
    | STRING                            # stringConst
    | NUMBER                            # numberConst
    | ID '(' column (',' column)* ')'   # funcColumn
    ;

any: CH+;

PARAM1:   'SQLNI_PARAM1_'[a-zA-Z][a-zA-Z_0-9]*;
PARAM2:   'SQLNI_PARAM2_'[a-zA-Z][a-zA-Z_0-9]*;

OP: '='|'!='|'<'|'<='|'>'|'>=';

// func
IF: [Mm][Ii][Ff];

NUMBER
    : '-'? INT '.' INT EXP?         // 1.35, 1.35E-9, 0.3, -4.5
    | '-'? INT  EXP                 // 1e10 -3e4
    | '-'? INT                      // -3, 45
    ;

fragment INT: '0' | [1-9] [0-9]*;   // 除 0 外的数字不允许以 0 开始
fragment EXP: [Ee] [+\-]? INT;

STRING : '\'' (ESC|.)*? '\'';     // 匹配字符常量，? 提供了对非贪婪匹配的支持

ID     :   [a-zA-Z][a-zA-Z_0-9]*;

fragment
ESC : '\\"' | '\\\\';       // 双字符序列 \" 和 \\

CH    :   .;