grammar ParamTrans;

root
    : any (param|any)*
    ;

param
     : PARAM1 ID # toParam1
     | PARAM2 ID # toParam2
     | PARAM_LEFT1 ID PARAM_RIGHT    # fromParam1
     | PARAM_LEFT2 ID PARAM_RIGHT    # fromParam2
     ;

any: (CH|ID)+;

PARAM_LEFT1: '#{';
PARAM_LEFT2: '${';

PARAM_RIGHT: '}';

PARAM1:   'SQLNI_PARAM1#';
PARAM2:   'SQLNI_PARAM2#';

ID     :   [a-zA-Z][.a-zA-Z_0-9]*;

CH    :   .;

//WS : [ \t\r]+ -> skip ;