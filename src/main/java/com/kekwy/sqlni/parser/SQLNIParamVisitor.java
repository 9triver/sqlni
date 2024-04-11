package com.kekwy.sqlni.parser;// Generated from E:/projects/sqlni/src/main/antlr/SQLNIParam.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLNIParamParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLNIParamVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLNIParamParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(SQLNIParamParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code param1}
	 * labeled alternative in {@link SQLNIParamParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam1(SQLNIParamParser.Param1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code param2}
	 * labeled alternative in {@link SQLNIParamParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam2(SQLNIParamParser.Param2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLNIParamParser#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny(SQLNIParamParser.AnyContext ctx);
}