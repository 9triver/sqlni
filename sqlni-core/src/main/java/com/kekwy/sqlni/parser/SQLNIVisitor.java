package com.kekwy.sqlni.parser;// Generated from E:/projects/sqlni/sqlni-core/src/main/resources/SQLNI.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link SQLNIParser#limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit(SQLNIParser.LimitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allColumns}
	 * labeled alternative in {@link SQLNIParser#columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllColumns(SQLNIParser.AllColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code certainColumns}
	 * labeled alternative in {@link SQLNIParser#columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCertainColumns(SQLNIParser.CertainColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constColumn}
	 * labeled alternative in {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstColumn(SQLNIParser.ConstColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramColumn}
	 * labeled alternative in {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamColumn(SQLNIParser.ParamColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringConst}
	 * labeled alternative in {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConst(SQLNIParser.StringConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberConst}
	 * labeled alternative in {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberConst(SQLNIParser.NumberConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcColumn}
	 * labeled alternative in {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncColumn(SQLNIParser.FuncColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLNIParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(SQLNIParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constTable}
	 * labeled alternative in {@link SQLNIParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstTable(SQLNIParser.ConstTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramTable}
	 * labeled alternative in {@link SQLNIParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamTable(SQLNIParser.ParamTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleCondition}
	 * labeled alternative in {@link SQLNIParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCondition(SQLNIParser.SingleConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiCondtions}
	 * labeled alternative in {@link SQLNIParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiCondtions(SQLNIParser.MultiCondtionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subConditions}
	 * labeled alternative in {@link SQLNIParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubConditions(SQLNIParser.SubConditionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpCondition(SQLNIParser.CmpConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inParamCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInParamCondition(SQLNIParser.InParamConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inSetCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInSetCondition(SQLNIParser.InSetConditionContext ctx);
}