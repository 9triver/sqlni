package com.kekwy.sqlni;

import java.util.*;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/17 21:45
 */
public class XMLElement {

    private XMLElement() {
    }

    private enum Type {
        TEXT,
        NODE
    }

    private Type type;

    private Object value;

    public boolean isText() {
        return type == Type.TEXT;
    }

    public String getText() {
        if (isText()) return (String) value;
        else throw new RuntimeException("XMLElement 类型错误，不是 TEXT");
    }

    public boolean isNode() {
        return type == Type.NODE;
    }

    public List<XMLElement> getElements() {
        if (isNode()) //noinspection unchecked
            return (List<XMLElement>) ((Object[]) value)[2];
        else throw new RuntimeException("XMLElement 类型错误，不是 NODE");
    }


    public static XMLElement createText(String text) {
        XMLElement element = new XMLElement();
        element.type = Type.TEXT;
        element.value = text;
        return element;
    }

    public static XMLElement createNode(String name, Map<String, String> attributes) {
        XMLElement element = new XMLElement();
        element.type = Type.NODE;
//        Map<String, String> attributes = new HashMap<>();
        List<XMLElement> elements = new LinkedList<>();
        element.value = new Object[]{attributes, elements};
        return element;
    }

}
