package com.kekwy.sqlni.parser.gen;// Generated from E:/projects/sqlni/src/main/antlr/MyBatisTag.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyBatisTagParser}.
 */
public interface MyBatisTagListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyBatisTagParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(MyBatisTagParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyBatisTagParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(MyBatisTagParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link MyBatisTagParser#func}.
	 * @param ctx the parse tree
	 */
	void enterIf(MyBatisTagParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link MyBatisTagParser#func}.
	 * @param ctx the parse tree
	 */
	void exitIf(MyBatisTagParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foreach}
	 * labeled alternative in {@link MyBatisTagParser#func}.
	 * @param ctx the parse tree
	 */
	void enterForeach(MyBatisTagParser.ForeachContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foreach}
	 * labeled alternative in {@link MyBatisTagParser#func}.
	 * @param ctx the parse tree
	 */
	void exitForeach(MyBatisTagParser.ForeachContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyBatisTagParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(MyBatisTagParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyBatisTagParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(MyBatisTagParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyBatisTagParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(MyBatisTagParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyBatisTagParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(MyBatisTagParser.AnyContext ctx);
}