package com.kekwy.sqlni.templates.function;

import com.kekwy.sqlni.XMLElement;

@FunctionalInterface
public interface SQLFunction {
    XMLElement apply(XMLElement... args);
}
