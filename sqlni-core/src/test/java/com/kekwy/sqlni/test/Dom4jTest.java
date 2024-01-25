package com.kekwy.sqlni.test;

import com.querydsl.sql.MySQLTemplates;
import com.querydsl.sql.OracleTemplates;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.junit.Test;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/19 17:19
 */
public class Dom4jTest {

    @Test
    public void elementTest() {
        Document document = DocumentHelper.createDocument();
        Element root = document.addElement("name");
        root.addElement("sdfa");
        root.addText("txycg");
        root.addElement("eadsfgasdf");
        root.addText("sadgfafdg");
        System.out.println(document.asXML());

        Class<OracleTemplates> oracleTemplatesClass = OracleTemplates.class;
        Class<MySQLTemplates> mySQLTemplatesClass = MySQLTemplates.class;
    }

}
