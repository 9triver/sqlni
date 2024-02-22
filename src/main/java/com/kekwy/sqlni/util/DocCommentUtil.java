package com.kekwy.sqlni.util;

public class DocCommentUtil {

    public static String[] processDocComment(String comment) {
        if (comment != null) {
            return comment.split("\n");
        } else {
            return null;
        }
    }

}
