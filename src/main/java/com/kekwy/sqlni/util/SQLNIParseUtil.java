package com.kekwy.sqlni.util;

import com.kekwy.sqlni.parser.SQLNILexer;
import com.kekwy.sqlni.parser.SQLNIParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class SQLNIParseUtil {

    public static ParseTree parse(String statement) {
        SQLNILexer lexer = new SQLNILexer(CharStreams.fromString(statement));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLNIParser parser = new SQLNIParser(tokens);
        return parser.root();
    }

}
