package com.kekwy.sqlni;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

public class XMLGeneratorTest {

//    @Test
    public void generatorTest() {
        try {
            // 创建文档
            Document document = DocumentHelper.createDocument();
            Element root = document.addElement("tag").addComment("text").addText("text");

            // 设置输出格式
            OutputFormat format = OutputFormat.createPrettyPrint();
            format.setTrimText(false);
            format.setIndent("  "); // 设置缩进，可以是空格、制表符等
            format.setNewlines(true); // 设置换行

            // 创建 XMLWriter
            XMLWriter writer = new XMLWriter(new FileWriter("output.xml"), format);

            // 输出到文件
            writer.write(document);
            writer.close();

            System.out.println("XML 文件生成成功。");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}