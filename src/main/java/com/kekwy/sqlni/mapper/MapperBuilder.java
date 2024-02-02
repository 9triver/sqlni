package com.kekwy.sqlni.mapper;

import com.kekwy.sqlni.node.CommentNode;
import com.kekwy.sqlni.node.ElementNode;
import com.kekwy.sqlni.templates.SQLTemplates;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * MapperBuilder
 *
 * @author Kekwy
 * @version 1.0
 * @see MethodBuilder
 * @since 2024/1/12 11:15
 */
public class MapperBuilder {

    private final String namespace;

    private final SQLTemplates sqlTemplates;

    public MapperBuilder(String namespace, SQLTemplates sqlTemplates) {
        this.namespace = namespace;
        this.sqlTemplates = sqlTemplates;
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
        root.addAttribute(NAME_NAMESPACE, namespace);
        // 遍历 methodBuilder，并调用 build() 方法
        for (MethodBuilder methodBuilder : methodBuilders) {
            root.addNode(new CommentNode(methodBuilder.id));
            root.addNode(methodBuilder.build());
        }
        // 解析 Mapper 的包名和类名，创建 Mapper 对象
        int index = namespace.lastIndexOf('.');
        return new Mapper(namespace.substring(0, index),
                namespace.substring(index + 1), root);
    }

    /* CONSTANT: 关键字
     * --------------------------------------------------------------------------------------------------------- */
    private static final String NAME_ROOT = "mapper";
    private static final String NAME_NAMESPACE = "namespace";


    @SuppressWarnings("UnusedReturnValue")
    public class MethodBuilder {

        private final String id;

        private String resultType = "java.lang.Object";

        private String resultMap;

        private String statement;

        private MethodBuilder(String id) {
            this.id = id;
        }

        public MethodBuilder resultType(String resultType) {
            this.resultType = parseResultType(resultType);
            return this;
        }

        public MethodBuilder resultMap(String resultMap) {
            this.resultMap = resultMap;
            return this;
        }

        public MethodBuilder statement(String statement) {
            this.statement = statement;
            return this;
        }

//        private final static Set<String> COLLECTION_TYPE = Set.of(
//                "java.util.Set", "java.util.List"
//        );

        public ElementNode build() {
            ElementNode node = new MapperSerializer(sqlTemplates)
                    .serialize(statement);
            node.addAttributes(Map.of(
                    NAME_ID, id,
                    NAME_RESULT_TYPE, resultType
            ));
            return node;
        }

        /* CONSTANT: pattern
         * --------------------------------------------------------------------------------------------------------- */
        private static final Pattern RESULT_TYPE_PATTERN = Pattern.compile("(.+)<(.+)>");

        /**
         * 当用户编写的方法返回值类型为集合时，解析出集合中元素的类型，作为 resultType
         *
         * @param resultType Mapper 接口中方法的返回值类型
         * @return 可以被 Mybatis 识别的 resultType
         */
        private String parseResultType(String resultType) {
            Matcher matcher = RESULT_TYPE_PATTERN.matcher(resultType);
            if (matcher.find()) {
                return matcher.group(2);
            } else {
                return resultType;
            }
        }

        /* 静态常量
         * --------------------------------------------------------------------------------------------------------- */
        private static final String NAME_ID = "id";

        private static final String NAME_RESULT_TYPE = "resultType";


    }


}
