package com.kekwy.sqlni.parser.gen;// Generated from E:/projects/sqlni/core/src/main/antlr/DynamicSQL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DynamicSQLParser}.
 */
public interface DynamicSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DynamicSQLParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(DynamicSQLParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicSQLParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(DynamicSQLParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link DynamicSQLParser#func}.
	 * @param ctx the parse tree
	 */
	void enterIf(DynamicSQLParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link DynamicSQLParser#func}.
	 * @param ctx the parse tree
	 */
	void exitIf(DynamicSQLParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foreach}
	 * labeled alternative in {@link DynamicSQLParser#func}.
	 * @param ctx the parse tree
	 */
	void enterForeach(DynamicSQLParser.ForeachContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foreach}
	 * labeled alternative in {@link DynamicSQLParser#func}.
	 * @param ctx the parse tree
	 */
	void exitForeach(DynamicSQLParser.ForeachContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicSQLParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(DynamicSQLParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicSQLParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(DynamicSQLParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link DynamicSQLParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(DynamicSQLParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DynamicSQLParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(DynamicSQLParser.AnyContext ctx);
}