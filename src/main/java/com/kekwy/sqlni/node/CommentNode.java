package com.kekwy.sqlni.node;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/2/2 11:25
 */
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
