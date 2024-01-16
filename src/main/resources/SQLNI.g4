/* file SQLNI.g4 */
grammar SQLNI;            // grammer name
//@header { package com.kekwy.mybatis.sqlni.parser; } // java package

/* Parser */
root
    : selectStatement   # select
    | insertStatement   # insert
    ;

selectStatement
    : SELECT columns FROM table (WHERE condition)?
    ;

columns
    : '*'
    | (ID|PARAM) (',' ID|PARAM)*
    ;

table
    : (ID|PARAM)
    ;

condition
    : ;

insertStatement
    :
    ;


/* Lexer */
SELECT : 'select' | 'SELECT' ;
FROM   : 'from'   | 'FROM'   ;
WHERE  : 'where'  | 'WHERE'  ;

PARAM  :   '#{'ID'}'   ;

STRING : '\'' (ESC|.)*? '\'';     // 匹配字符常量，? 提供了对非贪婪匹配的支持

ID     :   [a-zA-Z_]+  ;

WS : [ \t\r\n]+ -> skip ;   // skip spaces, tabs, newlines
//COMMENT : '#' .*? -> skip;

fragment
ESC : '\\"' | '\\\\';       // 双字符序列 \" 和 \\

