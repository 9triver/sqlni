package com.kekwy.sqlni.util;


import com.kekwy.sqlni.parser.gen.*;
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

    public static ParseTree parseParamTrans(String statement) {
        ParamTransLexer lexer = new ParamTransLexer(CharStreams.fromString(statement));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ParamTransParser parser = new ParamTransParser(tokens);
        return parser.root();
    }

    public static ParseTree parseMyBatisTag(String statement) {
        MyBatisTagLexer lexer = new MyBatisTagLexer(CharStreams.fromString(statement));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyBatisTagParser parser = new MyBatisTagParser(tokens);
        return parser.root();
    }

}
