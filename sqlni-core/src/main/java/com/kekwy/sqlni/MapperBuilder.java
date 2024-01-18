package com.kekwy.sqlni;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.LinkedList;
import java.util.List;

/**
 * MapperBuilder
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/12 11:15
 */
public class MapperBuilder {

    private final String className;

    private final Document document;

    private final Element root;

    /* CONSTANT: element names
     * --------------------------------------------------------------------------------------------------------- */
    private static final String NAME_ROOT = "mapper";

    /* CONSTANT: attribute names
     * --------------------------------------------------------------------------------------------------------- */
    private static final String NAME_NAMESPACE = "namespace";

    /* CONSTANT: doctype
     * --------------------------------------------------------------------------------------------------------- */
    private static final String DOCTYPE_NAME = "mapper";
    private static final String DOCTYPE_PUBLIC_ID = "-//mybatis.org//DTD Mapper 3.0//EN";
    private static final String DOCTYPE_SYSTEM_ID = "http://mybatis.org/dtd/mybatis-3-mapper.dtd";

    public MapperBuilder(String className) {
        document = DocumentHelper.createDocument();
        document.addDocType(DOCTYPE_NAME, DOCTYPE_PUBLIC_ID, DOCTYPE_SYSTEM_ID);
        root = document.addElement(NAME_ROOT);
        root.addAttribute(NAME_NAMESPACE, className);
        this.className = className;
    }

    public Mapper build() {
        int index = className.lastIndexOf('.');
        return new Mapper(className.substring(0, index),
                className.substring(index + 1), document);
    }

    private final List<MethodBuilder> methodBuilders = new LinkedList<>();

    /**
     * 为 Mapper 添加一个方法。
     *
     * @param id Mapper XML 中对应方法标签的 id 属性值，即对应 Java 方法的方法名
     * @return 方法建造者对象
     */
    public MethodBuilder addMethod(String id) {
        MethodBuilder methodBuilder = new MethodBuilder(id);
        methodBuilders.add(methodBuilder);
        return methodBuilder;
    }

}
