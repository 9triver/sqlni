package com.kekwy.sqlni.dialect;

import com.github.drinkjava2.jdialects.Dialect;

public interface DialectFactory {

    Dialect createDialect();

}
