package com.kekwy.sqlni.node;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/19 16:37
 */
public class TextNode implements Node {

    private final StringBuilder builder;

    public TextNode() {
        builder = new StringBuilder();
    }

    public TextNode(String text) {
        builder = new StringBuilder(text);
    }

    public String text() {
        return builder.toString();
    }

    public void append(String text) {
        builder.append(text);
    }

}
