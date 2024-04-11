/* file SQLNI_old.g4 */
grammar SQLNI_old;            // grammer name
//@header { package com.kekwy.mybatis.sqlni.parser; } // java package

/* Parser */
root
    : select
//    | insert
    ;

select
    :   SELECT DISTINCT? ('*'|columns)
        FROM table
        (WHERE conditions)?
        orderBy?
        (limit (offset)?)? ';'?
    |
    ;

limit
    : LIMIT (param | NUMBER)
    ;

offset
    : OFFSET (param | NUMBER)
    ;

orderBy
    : ORDER BY orderColumn (',' orderColumn)*
    ;

orderColumn
    : column (DESC|ASC)?        # normalOrderColumn
    ;

columns
    : selectColumn (',' selectColumn)*
    ;

selectColumn
    : column as?
    ;

column
    : (ID|ID'.'ID)                      # normalColumn
    | param                             # paramColumn
    | STRING                            # stringConst
    | NUMBER                            # numberConst
    | ID '(' column (',' column)* ')'   # funcColumn
    | '(' select ')'                    # subQuery
    |  '#foreach(' param ')'                # setColumn
    ;

param
    : left='#{' ID right='}'    # param1
    | left='${' ID right='}'    # param2
    ;

table
    : ID as?    # normalTable
    | param as? # paramTable
    | '(' select ')' as # subQueryTable
    ;

as
    : ID
    ;

conditions
    : M_IF '(' ID OP ID ')' conditions M_ENFIF # optionalCondtion
    | condition                                # singleCondition
    | NOT conditions                           # notConditions
    | '(' conditions ')'                       # subConditions
    | conditions opt=(AND|OR) conditions       # multiCondtions
    ;

condition
    : column OP column                            # cmpCondition
    | column BETWEEN column AND column            # betweenAndCondition
    | column IS NULL                              # isNullCondition
    | column LIKE '%' column '%'                  # likeCondition // FIXME: 2024/4/11
    | column IN '(' column (', ' column)* ')'     # inCondition
    ;



//insert
//    :
//    ;


/* Lexer */
M_IF: '#'[Ii][Ff];
M_ENFIF: '#'[Ee][Nn][Dd][Ii][Ff];

SELECT : [Ss][Ee][Ll][Ee][Cc][Tt];     // select
FROM   : [Ff][Rr][Oo][Mm];             // from
WHERE  : [Ww][Hh][Ee][Rr][Ee];         // where
LIMIT  : [Ll][Ii][Mm][Ii][Tt];         // limit
OFFSET : [Oo][Ff][Ff][Ss][Ee][Tt];     // offset
AND    : [Aa][Nn][Dd];                 // and
OR     : [Oo][Rr];                     // or
IN     : [Ii][Nn];                     // in
ORDER  : [Oo][Rr][Dd][Ee][Rr];         // order
BY     : [Bb][Yy];                     // by
DESC   : [Dd][Ee][Ss][Cc];             // desc
ASC    : [Aa][Ss][Cc];                 // asc
BETWEEN: [Bb][Ee][Tt][Ww][Ee][Ee][Nn]; // between
IS     : [Ii][Ss];                     // is
NULL   : [Nn][Uu][Ll][Ll];             // null
NOT    : [Nn][Oo][Tt];                 // not
LIKE   : [Ll][Ii][Kk][Ee];             // like

OP: '='|'!='|'<'|'<='|'>'|'>=';

SET: [Ss][Ee][Tt];

DISTINCT: [Dd][Ii][Ss][Tt][Ii][Nn][Cc][Tt]; // distinct


NUMBER
    : '-'? INT '.' INT EXP?         // 1.35, 1.35E-9, 0.3, -4.5
    | '-'? INT  EXP                 // 1e10 -3e4
    | '-'? INT                      // -3, 45
    ;


fragment INT: '0' | [1-9] [0-9]*;   // 除 0 外的数字不允许以 0 开始
fragment EXP: [Ee] [+\-]? INT;


STRING : '\'' (ESC|.)*? '\'';     // 匹配字符常量，? 提供了对非贪婪匹配的支持

ID     :   [a-zA-Z][a-zA-Z_0-9]*;

WS : [ \t\r\n]+ -> skip ;   // skip spaces, tabs, newlines
//COMMENT : '#' .*? -> skip;

fragment
ESC : '\\"' | '\\\\';       // 双字符序列 \" 和 \\

