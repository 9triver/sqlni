package com.kekwy.sqlni.templates;

import com.kekwy.sqlni.node.Node;
import com.kekwy.sqlni.node.TextNode;
import com.kekwy.sqlni.templates.function.ConcatFunction1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 支持 MySQL 方言的 SQL 模板
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/12 14:28
 */
public class MySQLTemplates extends SQLTemplates {

    @Override
    public List<Node> concat(List<Node> columns) {
        List<Node> res = new LinkedList<>();
        res.add(new TextNode("concat("));
        Iterator<Node> it = columns.iterator();
        res.add(it.next());
        while (it.hasNext()) {
            res.add(new TextNode(", "));
            res.add(it.next());
        }
        res.add(new TextNode(")"));
        return res;
    }

    public MySQLTemplates() {
        addFunction(FunctionName.CONCAT, new ConcatFunction1());
    }
}
