package com.kekwy.sqlni.parser.gen;// Generated from E:/projects/sqlni/src/main/antlr/SQLNI.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLNIParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLNIVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLNIParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(SQLNIParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLNIParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(SQLNIParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLNIParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(SQLNIParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLNIParser#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny(SQLNIParser.AnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLNIParser#nestedExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedExpr(SQLNIParser.NestedExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLNIParser#enter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnter(SQLNIParser.EnterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLNIParser#limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit(SQLNIParser.LimitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLNIParser#offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset(SQLNIParser.OffsetContext ctx);
}