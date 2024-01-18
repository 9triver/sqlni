package com.kekwy.sqlni.parser;// Generated from E:/projects/sqlni/src/main/resources/SQLNI.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link SQLNIParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(SQLNIParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLNIParser#columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns(SQLNIParser.ColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(SQLNIParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLNIParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(SQLNIParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLNIParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(SQLNIParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SQLNIParser.ConditionContext ctx);
}