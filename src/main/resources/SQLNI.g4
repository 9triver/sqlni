/* file SQLNI.g4 */
grammar SQLNI;            // grammer name
//@header { package com.kekwy.mybatis.sqlni.parser; } // java package

/* Parser */
root
    : select
//    | insert
    ;

select
    : SELECT columns FROM table ';'?
    ;

columns
    : '*'
    | (column) (',' column)*
    ;

column
    : ID
    | param
    ;

param: '#{' ID '}';

table
    : ID
    | param
    ;

condition
    : AND condition
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

//PARAM  :   '#{'ID'}'   ;

STRING : '\'' (ESC|.)*? '\'';     // 匹配字符常量，? 提供了对非贪婪匹配的支持

ID     :   [a-zA-Z][a-zA-Z_0-9]*;

WS : [ \t\r\n]+ -> skip ;   // skip spaces, tabs, newlines
//COMMENT : '#' .*? -> skip;

fragment
ESC : '\\"' | '\\\\';       // 双字符序列 \" 和 \\

