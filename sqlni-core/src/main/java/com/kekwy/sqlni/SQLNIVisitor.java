package com.kekwy.sqlni;

import com.kekwy.sqlni.parser.SQLNIBaseVisitor;
import com.kekwy.sqlni.parser.SQLNIParser;
import com.kekwy.sqlni.templates.MySQLTemplates;
import com.kekwy.sqlni.templates.SQLTemplates;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import static com.kekwy.sqlni.XMLElement.*;

/**
 * SQLNI 语法树的访问器。
 * 后序遍历语法树，生成 XML 数据及其结构。
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/17 21:31
 */
public class SQLNIVisitor extends SQLNIBaseVisitor<XMLElement> {

    /**
     * 从配置文件中读取的全局 SQL 模板
     */
    private static SQLTemplates defaultTemplates = new MySQLTemplates();

    private final SQLTemplates templates;

    /**
     * 使用配置文件中指定的全局 SQL 模板
     */
    public SQLNIVisitor() {
        this.templates = defaultTemplates;
    }

    /**
     * 用户可以为单独的方法指定 SQL 模板（不建议使用）
     */
    public SQLNIVisitor(SQLTemplates templates) {
        this.templates = templates;
    }

    private static final String TAG_SELECT = "select";

    @Override
    public XMLElement visitSelect(SQLNIParser.SelectContext ctx) {
        XMLElement selectNode = XMLElement.createNode(TAG_SELECT);
        String select = templates.select();
        String from = templates.from();
        selectNode.addElement(createText(select));              // select
        selectNode.addElement(visitColumns(ctx.columns()));     // select columns
        selectNode.addElement(createText(from));                // select columns from
        selectNode.addElement(visitTable(ctx.table()));         // select columns from table
        return XMLElement.createText("");
    }

    @Override
    public XMLElement visitColumns(SQLNIParser.ColumnsContext ctx) {
        StringBuilder strBuilder = new StringBuilder();
        for (SQLNIParser.ColumnContext columnCtx : ctx.column()) {
            strBuilder.append(visitColumn(columnCtx).getText());
            strBuilder.append(", ");
        }
        strBuilder.delete(strBuilder.lastIndexOf(", "), strBuilder.length());
        return null ;
    }

    /**
     * 符号集合，用于在生成循环内部局部变量时避免重复
     */
    Set<String> symbolsSet = new HashSet<>(); // 暂未实现有关功能

}
