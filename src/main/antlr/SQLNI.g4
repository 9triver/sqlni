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

any: (CH|enter)+;

nestedExpr: '(' root ')';

enter: '\n';

limit
  : LIMIT any
  ;

offset
  : OFFSET any
  ;

LIMIT: [Ll][Ii][Mm][Ii][Tt];
OFFSET: [Oo][Ff][Ff][Ss][Ee][Tt];

ENTER: [\n];

CH: ~[()];

WS : [\t\r]+ -> skip ;   // skip spaces, tabs, newlines
//COMMENT : '#' .*? -> skip;

