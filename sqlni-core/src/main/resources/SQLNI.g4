/* file SQLNI.g4 */
grammar SQLNI;            // grammer name
//@header { package com.kekwy.mybatis.sqlni.parser; } // java package

/* Parser */
root
    : select
//    | insert
    ;

select
    : SELECT DISTANCE? ('*'|columns) FROM table (WHERE conditions)? ';'?
    ;

columns
    : '*'                       # allColumns  // bugfix: 对于这条分支，columnsCtx 中 column() 的返回值为空 List
    | (column) (',' column)*    # certainColumns
    ;

column
    : ID                                # constColumn
    | param                             # paramColumn
    | ID '(' column (',' column)* ')'   # funcColumn
    ;

param: '#{' ID '}';

table
    : ID        # constTable
    | param     # paramTable
    ;

conditions
    : condition
    | condition (AND|OR) conditions
    | condition (AND|OR) '(' conditions ')'
    ;

condition
    : column ('='|'<'|'>') column   # cmpCondition
    | column IN param               # inParamCondition
    | column IN SET                 # inSetCondition
    ;



//insert
//    :
//    ;


/* Lexer */
SELECT: [Ss][Ee][Ll][Ee][Cc][Tt]; // select
FROM  : [Ff][Rr][Oo][Mm];         // from
WHERE : [Ww][Hh][Ee][Rr][Ee];     // where

AND : [Aa][Nn][Dd]; // and
OR  : [Oo][Rr];     // or

IN: [Ii][Nn];

SET: [Ss][Ee][Tt];

DISTANCE: [Dd][Ii][Ss][Tt][Aa][Nn][Cc][Ee]; // distance

//PARAM  :   '#{'ID'}'   ;

STRING : '\'' (ESC|.)*? '\'';     // 匹配字符常量，? 提供了对非贪婪匹配的支持

ID     :   [a-zA-Z][a-zA-Z_0-9]*;

WS : [ \t\r\n]+ -> skip ;   // skip spaces, tabs, newlines
//COMMENT : '#' .*? -> skip;

fragment
ESC : '\\"' | '\\\\';       // 双字符序列 \" 和 \\

