package com.kekwy.sqlni.util;

public class TextNode implements Node {

    private final StringBuilder builder;

    public TextNode() {
        builder = new StringBuilder();
    }

    public TextNode(String text) {
        builder = new StringBuilder(text);
    }

    public String getText() {
        return builder.toString();
    }

    public void append(String text) {
        builder.append(text);
    }

    @Override
    public void serialize(NodeSerializer serializer) {
        serializer.addText(getText());
    }
}
