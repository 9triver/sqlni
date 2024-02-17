package com.kekwy.sqlni.annotation;


public @interface Select {
    String[] items();
    String condition();
    String[] distinct();
    String[] groupBy();
    int limit();
    int offset();


}
