package com.kekwy.sqlni.util;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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

    public String getName() {
        return name;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public List<Node> getNodes() {
        return nodes;
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
        } else {
            lastTextNode = null;
            nodes.add(node);
        }
    }

    public void addNodes(List<Node> nodes) {
        nodes.forEach(this::addNode);
    }

    private void addTextNode(TextNode textNode) {
        if (lastTextNode == null) {
            lastTextNode = textNode;
            nodes.add(lastTextNode);
        } else {
            // 若当前子节点最后一个加入的子节点为 TextNode，则将 text 与其内容合并
            lastTextNode.append(textNode.getText());
        }
    }

    public ElementNode addElement(String name) {
        ElementNode node = new ElementNode(name);
        nodes.add(node);
        return node;
    }

    @Override
    public void serialize(NodeSerializer serializer) {
        NodeSerializer subSerializer = serializer.addElement(name, attributes);
        for (Node node : nodes) {
            node.serialize(subSerializer);
        }
    }
}
