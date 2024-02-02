package com.kekwy.sqlni.node;

import org.dom4j.Document;
import org.dom4j.Element;

import java.util.Map;

/**
 * 将 Node 序列化为 XML 文件，基于 Dom4j 的实现
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/29 9:51
 */
public class NodeSerializerDom4jImp implements NodeSerializer {

    private final NodeSerializer innerSerializer;

    private record DocumentSerializer(Document document) implements NodeSerializer {

        @Override
        public NodeSerializer addElement(String name, Map<String, String> attributes) {
            Element element = document.addElement(name);
            attributes.forEach(element::addAttribute);
            return new NodeSerializerDom4jImp(element);
        }

        @Override
        public void addText(String text) {
            // do nothing
        }

        @Override
        public void addComment(String comment) {
            // do nothing
        }
    }

    private record ElementSerializer(Element element) implements NodeSerializer {

        @Override
        public NodeSerializer addElement(String name, Map<String, String> attributes) {
            Element subElement = element.addElement(name);
            attributes.forEach(subElement::addAttribute);
            return new NodeSerializerDom4jImp(subElement);
        }

        @Override
        public void addText(String text) {
            element.addText(text);
        }

        @Override
        public void addComment(String comment) {
            element.addComment(comment);
        }
    }

    public NodeSerializerDom4jImp(Document document) {
        innerSerializer = new DocumentSerializer(document);
    }

    public NodeSerializerDom4jImp(Element element) {
        innerSerializer = new ElementSerializer(element);
    }

    @Override
    public NodeSerializer addElement(String name, Map<String, String> attributes) {
        return innerSerializer.addElement(name, attributes);
    }

    @Override
    public void addText(String text) {
        innerSerializer.addText(text);
    }

    @Override
    public void addComment(String comment) {
        innerSerializer.addComment(comment);
    }

}
