package com.kekwy.sqlni;

import com.kekwy.sqlni.node.ElementNode;

import java.util.LinkedList;
import java.util.List;

/**
 * MapperBuilder
 *
 * @author Kekwy
 * @version 1.0
 * @see MethodBuilder
 * @since 2024/1/12 11:15
 */
public class MapperBuilder {

    private final String className;

    public MapperBuilder(String className) {
        this.className = className;
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

    /**
     * 根据输入进行语法分析，生成目标 Mapper XML 文件对应的数据结构
     */
    public Mapper build() {
        ElementNode root = new ElementNode(NAME_ROOT);
        root.addAttribute(NAME_NAMESPACE, className);
        // 遍历 methodBuilder，并调用 build() 方法
        for (MethodBuilder methodBuilder : methodBuilders) {
            root.addElement(methodBuilder.build());
        }
        // 解析 Mapper 的包名和类名，创建 Mapper 对象
        int index = className.lastIndexOf('.');
        return new Mapper(className.substring(0, index),
                className.substring(index + 1), root);
    }

    /* CONSTANT: 关键字
     * --------------------------------------------------------------------------------------------------------- */
    private static final String NAME_ROOT = "mapper";
    private static final String NAME_NAMESPACE = "namespace";

}
