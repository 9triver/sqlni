package com.kekwy.sqlni.templates;

import com.kekwy.sqlni.mapper.MapperSerializer;
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
    public void serialize(SQLNIParser.SelectContext context, MapperSerializer serializer) {
        if (context.limit() != null || context.limit() != null) {
            if (context.offset() == null) {
                serializer.append(limitQueryStart);
                serializer.serialize(context);
                function("limitQueryEnd", List.of(context.limit()), serializer);
            } else {
                serializer.append(outerQueryStart);
                serializer.serialize(context);
                serializer.append(outerQueryEnd);
                if (context.limit() == null) {
                    function("offsetTemplate", List.of(context.limit()), serializer);
                } else {
                    function("limitOffsetTemplate", List.of(context.offset(), context.limit()), serializer);
                }
            }
        } else {
            serializer.serialize(context);
        }
    }

    @Override
    public void serializeLimit(SQLNIParser.SelectContext context, MapperSerializer serializer) {
        // do nothing.
    }

    private static final String outerQueryStart = "SELECT * FROM (SELECT tmp.*, ROWNUM RN FROM (";

    private static final String outerQueryEnd = ") tmp) WHERE ";

    private static final String limitQueryStart = "SELECT * FROM (";

    private static final String limitQueryEnd = ") WHERE ROWNUM <= {0}";

    private static final String limitOffsetTemplate = "RN > {0} AND ROWNUM <= {0} + {1}";

    private static final String offsetTemplate = "RN > {0}";

}
