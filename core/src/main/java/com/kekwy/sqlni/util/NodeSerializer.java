package com.kekwy.sqlni.util;

import java.util.Map;

public interface NodeSerializer {

    default NodeSerializer addElement(String name, Map<String, String> attributes) {
        return null;
    }

    default void finishElement(String name) {
    }

    default void addText(String text) {
    }

    @Deprecated
    default void addComment(String comment) {
    }

}
