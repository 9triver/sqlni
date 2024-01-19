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
public class TreeNode implements Node {

    private final String name;
    private final Map<String, String> attributes;
    private final List<Node> subNodes;

    public TreeNode(String name) {
        this(name, new HashMap<>(), new LinkedList<>());
    }

    public TreeNode(String name, Map<String, String> attributes) {
        this(name, attributes, new LinkedList<>());
    }

    public TreeNode(String name, Map<String, String> attributes, List<Node> subNodes) {
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

    public void addAttribute() {

    }

    public void addAttributes() {

    }

    public void addSubNode() {

    }

    public void addSubNodes() {

    }

    /**
     * 将给定 TreeNode 对象的子节点按序加入当前 TreeNode 对象
     *
     * @param node 其子结点将会被加入当前
     */
    public void unionSubNode(TreeNode node) {

    }

}
