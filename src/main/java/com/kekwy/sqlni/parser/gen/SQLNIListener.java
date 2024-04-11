package com.kekwy.sqlni.parser.gen;// Generated from E:/projects/sqlni/src/main/antlr/SQLNI.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLNIParser}.
 */
public interface SQLNIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLNIParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(SQLNIParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(SQLNIParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLNIParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(SQLNIParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(SQLNIParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLNIParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(SQLNIParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(SQLNIParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLNIParser#any}.
	 * @param ctx the parse tree
	 */
	void enterAny(SQLNIParser.AnyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParser#any}.
	 * @param ctx the parse tree
	 */
	void exitAny(SQLNIParser.AnyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLNIParser#nestedExpr}.
	 * @param ctx the parse tree
	 */
	void enterNestedExpr(SQLNIParser.NestedExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParser#nestedExpr}.
	 * @param ctx the parse tree
	 */
	void exitNestedExpr(SQLNIParser.NestedExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLNIParser#enter}.
	 * @param ctx the parse tree
	 */
	void enterEnter(SQLNIParser.EnterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParser#enter}.
	 * @param ctx the parse tree
	 */
	void exitEnter(SQLNIParser.EnterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLNIParser#limit}.
	 * @param ctx the parse tree
	 */
	void enterLimit(SQLNIParser.LimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParser#limit}.
	 * @param ctx the parse tree
	 */
	void exitLimit(SQLNIParser.LimitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLNIParser#offset}.
	 * @param ctx the parse tree
	 */
	void enterOffset(SQLNIParser.OffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParser#offset}.
	 * @param ctx the parse tree
	 */
	void exitOffset(SQLNIParser.OffsetContext ctx);
}