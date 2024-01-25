package com.kekwy.sqlni.util;

import com.kekwy.sqlni.parser.FuncTemplateLexer;
import com.kekwy.sqlni.parser.FuncTemplateParser;
import com.kekwy.sqlni.parser.SQLNILexer;
import com.kekwy.sqlni.parser.SQLNIParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * 语法分析工具类
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/18 9:40
 */
public class ParserUtil {

    public static ParseTree parseSQLNI(String statement) {
        SQLNILexer lexer = new SQLNILexer(CharStreams.fromString(statement));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLNIParser parser = new SQLNIParser(tokens);
        return parser.root();
    }

    public static ParseTree parseFuncTemplate(String template) {
        FuncTemplateLexer lexer = new FuncTemplateLexer(CharStreams.fromString(template));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FuncTemplateParser parser = new FuncTemplateParser(tokens);
        return parser.function();
    }

}
