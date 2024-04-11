package com.kekwy.sqlni.parser;

import com.kekwy.sqlni.util.ASTParseUtil;
import org.antlr.v4.runtime.tree.ParseTree;

public class SQLNIXMLProcessor {



    public String process(String statement) {
        ParseTree tree = ASTParseUtil.parseSQLNIParam(statement);
        statement = new SQLNIParamVisitorImpl().visit(tree); // 还原变量

        return statement;
    }



}
