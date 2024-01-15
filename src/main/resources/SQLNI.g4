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
    : '*'                         # allColumn
    | (ID|PARAM) (',' ID|PARAM)*  # column
    ;

table
    : (ID|PARAM)      # table
    ;

condition
    : ;

insertStatement:;


/* Lexer */
SELECT : 'select' | 'SELECT' ;
FROM   : 'from'   | 'FROM'   ;
WHERE  : 'where'  | 'WHERE'  ;

ID     :   [a-zA-Z_]+  ;
PARAM  :   '#{'ID'}'   ;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
