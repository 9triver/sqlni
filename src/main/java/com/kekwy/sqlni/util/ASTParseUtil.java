package com.kekwy.sqlni.util;

import com.kekwy.sqlni.parser.SQLNILexer;
import com.kekwy.sqlni.parser.SQLNIParamLexer;
import com.kekwy.sqlni.parser.SQLNIParamParser;
import com.kekwy.sqlni.parser.SQLNIParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ASTParseUtil {

    public static ParseTree parseSQLNI(String statement) {
        SQLNILexer lexer = new SQLNILexer(CharStreams.fromString(statement));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLNIParser parser = new SQLNIParser(tokens);
        return parser.root();
    }

    public static ParseTree parseSQLNIParam(String statement) {
        SQLNIParamLexer lexer = new SQLNIParamLexer(CharStreams.fromString(statement));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLNIParamParser parser = new SQLNIParamParser(tokens);
        return parser.root();
    }

}
