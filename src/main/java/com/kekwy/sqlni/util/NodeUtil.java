package com.kekwy.sqlni.util;

import com.kekwy.sqlni.node.ElementNode;

import java.util.Map;

public class NodeUtil {

    private static final String TAG_IF = "if";
    private static final String TAG_FOREACH = "foreach";
    private static final String ATTR_TEST = "test";

    public static ElementNode ifNotNull(String param) {
        ElementNode node = new ElementNode(TAG_IF);
        node.addAttribute(ATTR_TEST, param + "!= null");
        return node;
    }

    public static ElementNode foreach(String collection, String item) {
        ElementNode node = new ElementNode(TAG_FOREACH);
        node.addAttributes(Map.of(
                "collection", collection,
                "index", "i",
                "item", item,
                "open", "",
                "close", "",
                "separator", ", "
        ));
        return node;
    }

}
