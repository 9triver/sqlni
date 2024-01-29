package com.kekwy.sqlni.util;

import com.kekwy.sqlni.node.*;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

/**
 * 基于 Dom4j 实现 XML 文件的生成
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/18 9:47
 */
public class XMLUtil {

    /* CONSTANT: doctype
     * --------------------------------------------------------------------------------------------------------- */
    private static final String DOCTYPE_NAME = "mapper";
    private static final String DOCTYPE_PUBLIC_ID = "-//mybatis.org//DTD Mapper 3.0//EN";
    private static final String DOCTYPE_SYSTEM_ID = "http://mybatis.org/dtd/mybatis-3-mapper.dtd";

    private static Document createDocument() {
        Document document = DocumentHelper.createDocument();
        return document.addDocType(DOCTYPE_NAME, DOCTYPE_PUBLIC_ID, DOCTYPE_SYSTEM_ID);
    }

    public static void writeXMLFile(ElementNode root, Writer writer) throws IOException {
        Document document = createDocument();

        NodeSerializer serializer = new NodeSerializerDom4jImp(document);
        root.serialize(serializer);

        // TODO: 解决 text 内容换行问题
        // 设置生成 XML 的格式
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setNewlines(true);
        format.setTrimText(false);
        // 设置编码格式
        format.setEncoding("UTF-8");

        XMLWriter xmlWriter = new XMLWriter(writer, format);
        xmlWriter.write(document);
        // TODO: 记录关于 close() 的相关问题
        xmlWriter.close();
    }

}