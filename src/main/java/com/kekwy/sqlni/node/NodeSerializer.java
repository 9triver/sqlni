package com.kekwy.sqlni.node;

import java.util.Map;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/29 8:50
 */
public interface NodeSerializer {

    NodeSerializer addElement(String name, Map<String, String> attributes);

    void addText(String text);

}
