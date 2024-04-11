grammar ToParam;

root
    : any (param|any)*
    ;

param
     : PARAM1 # param1
     | PARAM2 # param2
     ;

any: CH+;

PARAM1:   'SQLNI_PARAM1_'[a-zA-Z][a-zA-Z_0-9]*;
PARAM2:   'SQLNI_PARAM2_'[a-zA-Z][a-zA-Z_0-9]*;

CH    :   .;

//WS : [ \t\r]+ -> skip ;