package com.kekwy.sqlni.node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/19 16:37
 */
public class ElementNode implements Node {

    private final String name;
    private final Map<String, String> attributes;
    private final List<Node> nodes;
    private TextNode lastTextNode = null; // 若当前子节点中最后一个加入的节点为 TextNode 则保存对其的引用，否则为空。

    public ElementNode(String name) {
        this(name, new HashMap<>(), new LinkedList<>());
    }

    public ElementNode(String name, Map<String, String> attributes) {
        this(name, attributes, new LinkedList<>());
    }

    public ElementNode(String name, Map<String, String> attributes, List<Node> nodes) {
        this.name = name;
        this.attributes = attributes;
        this.nodes = nodes;
    }

    public String name() {
        return this.name;
    }

    public Map<String, String> attributes() {
        return this.attributes;
    }

    public List<Node> subNodes() {
        return this.nodes;
    }

    public void addAttribute(String key, String value) {
        attributes.put(key, value);
    }

    public void addAttributes(Map<String, String> attributes) {
        this.attributes.putAll(attributes);
    }

    public void addNode(Node node) {
        if (node instanceof TextNode textNode) {
            addTextNode(textNode);
        } else if (node instanceof ElementNode elementNode) {
            addElementNode(elementNode);
        }
    }

    public void addNodes(List<Node> nodes) {
        nodes.forEach(this::addNode);
    }

    private void addElementNode(ElementNode node) {
        lastTextNode = null;
        nodes.add(node);
    }

    private void addTextNode(TextNode textNode) {
        if (lastTextNode == null) {
            lastTextNode = textNode;
            nodes.add(lastTextNode);
        } else {
            // 若当前子节点最后一个加入的子节点为 TextNode，则将 text 与其内容合并
            lastTextNode.append(textNode.text());
        }
    }

}
