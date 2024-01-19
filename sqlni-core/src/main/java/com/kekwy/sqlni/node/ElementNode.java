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
    private final List<Node> subNodes;
    private TextNode textNode = null; // 若当前子节点中最后一个加入的节点为 TextNode 则保存对其的引用，否则为空。

    public ElementNode(String name) {
        this(name, new HashMap<>(), new LinkedList<>());
    }

    public ElementNode(String name, Map<String, String> attributes) {
        this(name, attributes, new LinkedList<>());
    }

    public ElementNode(String name, Map<String, String> attributes, List<Node> subNodes) {
        this.name = name;
        this.attributes = attributes;
        this.subNodes = subNodes;
    }

    public String name() {
        return this.name;
    }

    public Map<String, String> attributes() {
        return this.attributes;
    }

    public List<Node> subNodes() {
        return this.subNodes;
    }

    public void addAttribute(String key, String value) {
        attributes.put(key, value);
    }

    public void addAttributes(Map<String, String> attributes) {
        this.attributes.putAll(attributes);
    }

    /**
     * 添加新的标签节点
     *
     * @param name 标签节点的标签名
     * @return 新创建的标签结点对象
     */
    public ElementNode addElement(String name) {
        textNode = null;
        ElementNode node = new ElementNode(name);
        subNodes.add(node);
        return node;
    }

    /**
     * 添加文本内容
     *
     * @param text 文本内容
     */
    public void addText(String text) {
        if (textNode == null) {
            textNode = new TextNode(text);
            subNodes.add(textNode);
        } else {
            // 若当前子节点最后一个加入的子节点为 TextNode，则将 text 与其内容合并
            textNode.append(text);
        }
    }

}
