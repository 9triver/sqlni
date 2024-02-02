package com.kekwy.sqlni.node;

public class CommentNode implements Node {

    private final String comment;

    public CommentNode(String comment) {
        this.comment = " " + comment + " ";
    }

    @Override
    public void serialize(NodeSerializer serializer) {
        serializer.addComment(comment);
    }
}
