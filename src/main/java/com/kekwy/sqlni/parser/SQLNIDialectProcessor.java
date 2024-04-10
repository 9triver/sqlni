package com.kekwy.sqlni.parser;

import com.github.drinkjava2.jdialects.Dialect;
import com.kekwy.sqlni.util.SQLNIParseUtil;
import org.antlr.v4.runtime.tree.ParseTree;

public class SQLNIDialectProcessor extends SQLNIBaseVisitor<String> {

    private String limit;
    private String offset;
    private Dialect dialect;

    public String process(String statement, Dialect dialect) {
        this.dialect = dialect;
        String sql = visit(SQLNIParseUtil.parse(statement));
        if (limit != null) {
            return dialect.limitAndTrans(offset, limit, sql);
        } else {
            return dialect.trans(sql);
        }
    }



}
