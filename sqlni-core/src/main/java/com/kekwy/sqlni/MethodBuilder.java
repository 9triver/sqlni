package com.kekwy.sqlni;

import com.kekwy.sqlni.node.ElementNode;
import com.kekwy.sqlni.util.ParserUtil;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * MethodBuilder
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/18 9:49
 */
@SuppressWarnings("UnusedReturnValue")
public class MethodBuilder {

    private final String id;

    private String resultType = "java.lang.Object";

    private String resultMap;

    private String statement;

    public MethodBuilder(String id) {
        this.id = id;
    }

    public MethodBuilder resultType(String resultType) {
        this.resultType = parseResultType(resultType);
        return this;
    }

    public MethodBuilder resultMap(String resultMap) {
        this.resultMap = resultMap;
        return this;
    }

    public MethodBuilder statement(String statement) {
        this.statement = statement;
        return this;
    }

    public ElementNode build() {
        ParseTree root = ParserUtil.parseFromString(statement);
        return new SQLNIVisitor().visit(root, Map.of(
                NAME_ID, id,
                NAME_RESULT_TYPE, resultType
        ));
    }

    /* CONSTANT: pattern
     * --------------------------------------------------------------------------------------------------------- */
    private static final Pattern RESULT_TYPE_PATTERN = Pattern.compile(".+<(.+)>");

    /**
     * 当用户编写的方法返回值类型为集合时，解析出集合中元素的类型，作为 resultType
     *
     * @param resultType Mapper 接口中方法的返回值类型
     * @return 可以被 Mybatis 识别的 resultType
     */
    private String parseResultType(String resultType) {
        Matcher matcher = RESULT_TYPE_PATTERN.matcher(resultType);
        if (matcher.find()) {
            return matcher.group(1);
        } else {
            return resultType;
        }
    }

    /* CONSTANT: attribute names
     * --------------------------------------------------------------------------------------------------------- */
    private static final String NAME_ID = "id";

    private static final String NAME_RESULT_TYPE = "resultType";

}
