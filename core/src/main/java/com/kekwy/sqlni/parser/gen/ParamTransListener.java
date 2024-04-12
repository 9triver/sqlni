package com.kekwy.sqlni.parser.gen;// Generated from E:/projects/sqlni/src/main/antlr/ParamTrans.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParamTransParser}.
 */
public interface ParamTransListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParamTransParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(ParamTransParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamTransParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(ParamTransParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toParam1}
	 * labeled alternative in {@link ParamTransParser#param}.
	 * @param ctx the parse tree
	 */
	void enterToParam1(ParamTransParser.ToParam1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code toParam1}
	 * labeled alternative in {@link ParamTransParser#param}.
	 * @param ctx the parse tree
	 */
	void exitToParam1(ParamTransParser.ToParam1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code toParam2}
	 * labeled alternative in {@link ParamTransParser#param}.
	 * @param ctx the parse tree
	 */
	void enterToParam2(ParamTransParser.ToParam2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code toParam2}
	 * labeled alternative in {@link ParamTransParser#param}.
	 * @param ctx the parse tree
	 */
	void exitToParam2(ParamTransParser.ToParam2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code fromParam1}
	 * labeled alternative in {@link ParamTransParser#param}.
	 * @param ctx the parse tree
	 */
	void enterFromParam1(ParamTransParser.FromParam1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code fromParam1}
	 * labeled alternative in {@link ParamTransParser#param}.
	 * @param ctx the parse tree
	 */
	void exitFromParam1(ParamTransParser.FromParam1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code fromParam2}
	 * labeled alternative in {@link ParamTransParser#param}.
	 * @param ctx the parse tree
	 */
	void enterFromParam2(ParamTransParser.FromParam2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code fromParam2}
	 * labeled alternative in {@link ParamTransParser#param}.
	 * @param ctx the parse tree
	 */
	void exitFromParam2(ParamTransParser.FromParam2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ParamTransParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(ParamTransParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParamTransParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(ParamTransParser.AnyContext ctx);
}