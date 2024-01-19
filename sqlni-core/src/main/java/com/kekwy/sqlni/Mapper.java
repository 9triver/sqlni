package com.kekwy.sqlni;

import com.kekwy.sqlni.node.ElementNode;

public record Mapper(String packageName, String mapperName, ElementNode root) {
}
