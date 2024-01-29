package com.kekwy.sqlni.mapper;

import com.kekwy.sqlni.node.ElementNode;

public record Mapper(String packageName, String mapperName, ElementNode root) {
}
