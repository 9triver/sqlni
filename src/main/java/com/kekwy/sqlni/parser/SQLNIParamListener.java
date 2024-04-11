package com.kekwy.sqlni.parser;// Generated from E:/projects/sqlni/src/main/antlr/SQLNIParam.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLNIParamParser}.
 */
public interface SQLNIParamListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLNIParamParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(SQLNIParamParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParamParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(SQLNIParamParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code param1}
	 * labeled alternative in {@link SQLNIParamParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam1(SQLNIParamParser.Param1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code param1}
	 * labeled alternative in {@link SQLNIParamParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam1(SQLNIParamParser.Param1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code param2}
	 * labeled alternative in {@link SQLNIParamParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam2(SQLNIParamParser.Param2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code param2}
	 * labeled alternative in {@link SQLNIParamParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam2(SQLNIParamParser.Param2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLNIParamParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(SQLNIParamParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParamParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(SQLNIParamParser.AnyContext ctx);
}