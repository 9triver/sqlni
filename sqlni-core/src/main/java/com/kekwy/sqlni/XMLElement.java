package com.kekwy.sqlni;

import java.util.*;

/**
 * 保存由 SQLNI 语句转化得到的 XML 数据及其结构
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

    /**
     * 当前元素的类型，
     * - TEXT: 文本
     * - NODE: 结点
     */
    private Type type;

    /**
     * 为文本时，value 为 String 对象
     * 为结点时，value 为 Object[] 对象，
     * 其中：
     * - objects[0]: String name;
     * - objects[1]: Map attributes;
     * - objects[2]: List elements;
     */
    private Object value;

    public boolean isText() {
        return type == Type.TEXT;
    }

    public boolean isNode() {
        return type == Type.NODE;
    }

    public String getText() {
        if (isText()) return (String) value;
        else throw new RuntimeException("XMLElement 类型错误，不是 TEXT");
    }

    public String getName() {
        if (isNode())
            return (String) ((Object[]) value)[0];
        else throw new RuntimeException("XMLElement 类型错误，不是 NODE");
    }

    public Map<String, String> getAttributes() {
        if (isNode()) //noinspection unchecked
            return (Map<String, String>) ((Object[]) value)[1];
        else throw new RuntimeException("XMLElement 类型错误，不是 NODE");
    }

    public List<XMLElement> getElements() {
        if (isNode()) //noinspection unchecked
            return (List<XMLElement>) ((Object[]) value)[2];
        else throw new RuntimeException("XMLElement 类型错误，不是 NODE");
    }

    public void addElement(XMLElement element) {
        List<XMLElement> elements = getElements();
        elements.add(element);
    }

    public void addAttribute(String name, String value) {
        getAttributes().put(name, value);
    }

    public void addAttributes(Map<String, String> attributes) {
        getAttributes().putAll(attributes);
    }

    /* STATIC: methods
     * --------------------------------------------------------------------------------------------------------- */
    public static XMLElement createText(String text) {
        XMLElement element = new XMLElement();
        element.type = Type.TEXT;
        element.value = text;
        return element;
    }

    public static XMLElement createNode(String name) {
        Object[] value = new Object[3];
        value[0] = name;
        value[1] = new HashMap<>();
        value[2] = new LinkedList<XMLElement>();

        XMLElement node = new XMLElement();
        node.type = Type.NODE;
        node.value = value;

        return node;
    }

    public static XMLElement createNode(String name, Map<String, String> attributes) {
        XMLElement node = createNode(name);
        node.addAttributes(attributes);
        return node;
    }


}
