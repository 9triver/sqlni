package com.kekwy.sqlni;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/12 11:15
 */
public class MapperBuilder {

//    private final

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

    private static final Pattern SQLNI_PATTERN = Pattern.compile(
            "(SELECT) +(.+) +(FROM) +(.+) +(WHERE) (.+) +((AND|OR) +conact(.+(,(.+))*)) in (.+)+"
    );
    // concat(department, '_', name) in #{departmentNameSet}

    /* 暂时采用正则表达式处理，且仅支持 concat 函数，默认方言上下文为 MySQL dialects */
    public MapperBuilder addMethodWithType(String name, String returnType, String statement) {

        // 获取 Sqlni 语句中的行为
        String action = getAction(statement);

        Element methodeNode = root.addElement(action);

        // 设置基本属性
        methodeNode.addAttribute("id", name);
        methodeNode.addAttribute("resultType", parseResultType(returnType));

        methodeNode.addComment("newLine").addText("SELECT * FROM t_employee WHERE type = #{type}");

        Element anIf = methodeNode.addElement("if");
        anIf.addAttribute("test", "departmentNameSet != null");

//        elementBuilder(anIf, statement.substring());
        elementBuilder(anIf, statement);

        return this;
    }

    private void traversSet(Element element, String setName) {
        element.addElement("foreach")
                .addAttribute("collection", setName)
                .addAttribute("item", setName + "Item")
                .addAttribute("index", "index")
                .addAttribute("open", "(")
                .addAttribute("close", ")")
                .addAttribute("separator", ",")
                .addComment("newLine")
                .addText("#{" + setName + "Item}");
    }

    private void elementBuilder(Element element, String statement) {
        element.addComment("newLine").addText("AND concat(department, '_', name) IN");
        traversSet(element, "departmentNameSet");
    }


    private String getAction(String statement) {
        return statement.substring(0, statement.indexOf(' ')).toLowerCase();
    }

    /* CONSTANT: pattern
     * --------------------------------------------------------------------------------------------------------- */
    private static final Pattern RESULT_TYPE_PATTERN = Pattern.compile(".+<(.+)>");

    /**
     * 当用户编写的方法返回值类型为集合时，解析出集合中元素的类型，作为 resultType
     *
     * @param returnType Mapper 接口中方法的返回值类型
     * @return 可以被 mybatis 识别的 resultType
     */
    private String parseResultType(String returnType) {
        Matcher matcher = RESULT_TYPE_PATTERN.matcher(returnType);
        if (matcher.find()) {
            return matcher.group(1);
        } else {
            return returnType;
        }
    }

}
