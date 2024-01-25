package com.kekwy.sqlni.templates.function;


import com.kekwy.sqlni.node.Node;

import java.util.List;

@FunctionalInterface
public interface SQLFunction {
    List<Node> apply(Node... args);
}
