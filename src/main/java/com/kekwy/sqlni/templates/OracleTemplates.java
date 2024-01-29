package com.kekwy.sqlni.templates;

import com.kekwy.sqlni.SQLNISerializer;
import com.kekwy.sqlni.node.TextNode;
import com.kekwy.sqlni.parser.SQLNIParser;

import java.util.List;

/**
 * 支持 Oracle 方言的 SQL 模板
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/24 14:50
 */
public class OracleTemplates extends SQLTemplates {

    public OracleTemplates() {
        addFuncTemplate("concat", "({0} || ...)");

        addFuncTemplate("limitQueryEnd", limitQueryEnd);
        addFuncTemplate("offsetTemplate", offsetTemplate);
        addFuncTemplate("limitOffsetTemplate", limitOffsetTemplate);
    }


    // 参考 querydsl-sql 通过访问者模式解决 limit 的问题
    @Override
    public void serialize(SQLNIParser.SelectContext context, SQLNISerializer serializer) {
        if (context.offset() == null) {
            serializer.append(limitQueryStart);
            serializer.visitSelect(context);
            function("limitQueryEnd", context.limit(), serializer);
        } else {
            serializer.append(outerQueryStart);
            serializer.visitSelect(context);
            serializer.append(outerQueryEnd);
            if (context.limit() == null) {
                function("offsetTemplate", context.limit(), serializer);
            } else {
                function("limitOffsetTemplate", context.offset(), serializer);
            }
        }
    }

    @Override
    public void serializeLimit(SQLNIParser.SelectContext context, SQLNISerializer serializer) {
        // do nothing.
    }

    private static final String outerQueryStart = "SELECT * FROM ( SELECT tmp.*, ROWNUM RN FROM (";

    private static final String outerQueryEnd = ") tmp) WHERE ";

    private static final String limitQueryStart = "SELECT * FROM (";

    private static final String limitQueryEnd = ") WHERE ROWNUM <= {0}";

    private static final String limitOffsetTemplate = "RN > {0} AND ROWNUM <= {1}";

    private static final String offsetTemplate = "RN > {0}";

}
