package com.kekwy.sqlni;

import com.kekwy.sqlni.parser.SQLNIBaseVisitor;
import com.kekwy.sqlni.parser.SQLNIParser;

/**
 * SQLNI 语法树的访问器。
 * 后序遍历语法树，生成 XML 数据及其结构。
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/17 21:31
 */
public class SQLNIVisitor extends SQLNIBaseVisitor<XMLElement> {

    // TODO: 完成语法树的遍历，构建 XML 数据结构
    @Override
    public XMLElement visitSelect(SQLNIParser.SelectContext ctx) {
        return XMLElement.createText("");
    }
}
