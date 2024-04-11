/* file SQLNI.g4 */
grammar SQLNI;            // grammer name
//@header { package com.kekwy.mybatis.sqlni.parser; } // java package

/* Parser */
root: content* (limit offset?)? end?;

end: ';';

content
    : any
    | nestedExpr
    ;

any: CH+;

nestedExpr: '(' root ')';

limit
  : LIMIT any
  ;

offset
  : OFFSET any
  ;

LIMIT: [Ll][Ii][Mm][Ii][Tt];
OFFSET: [Oo][Ff][Ff][Ss][Ee][Tt];


CH: ~[()];

WS : [\t\r\n]+ -> skip ;   // skip spaces, tabs, newlines
//COMMENT : '#' .*? -> skip;

