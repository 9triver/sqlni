package com.kekwy.sqlni.templates;

import com.kekwy.sqlni.node.Node;
import com.kekwy.sqlni.node.TextNode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/24 14:50
 */
public class OracleTemplates extends SQLTemplates {
    @Override
    public List<Node> concat(List<Node> columns) {
        List<Node> res = new LinkedList<>();
        Iterator<Node> it = columns.iterator();
        res.add(it.next());
        while (it.hasNext()) {
            res.add(new TextNode(" || "));
            res.add(it.next());
        }
        return res;
    }
}
