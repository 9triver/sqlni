package com.kekwy.sqlni.parser;// Generated from E:/projects/sqlni/src/main/antlr/ToParam.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ToParamParser}.
 */
public interface ToParamListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ToParamParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(ToParamParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToParamParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(ToParamParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code param1}
	 * labeled alternative in {@link ToParamParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam1(ToParamParser.Param1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code param1}
	 * labeled alternative in {@link ToParamParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam1(ToParamParser.Param1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code param2}
	 * labeled alternative in {@link ToParamParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam2(ToParamParser.Param2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code param2}
	 * labeled alternative in {@link ToParamParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam2(ToParamParser.Param2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ToParamParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(ToParamParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToParamParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(ToParamParser.AnyContext ctx);
}