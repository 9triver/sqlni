package com.kekwy.sqlni.node;

import java.util.Map;

public interface NodeSerializer {

    NodeSerializer addElement(String name, Map<String, String> attributes);

    void addText(String text);

    void addComment(String comment);

}
