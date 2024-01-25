package com.kekwy.sqlni.templates.function;

import com.kekwy.sqlni.node.Node;

import java.util.List;

/**
 * arg1 || arg2 || ...
 */
public class ConcatFunction2 implements SQLFunction {
    @Override
    public List<Node> apply(Node... args) {
        return null;
    }
}
