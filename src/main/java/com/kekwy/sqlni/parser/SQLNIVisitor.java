package com.kekwy.sqlni.parser;// Generated from E:/projects/sqlni/src/main/antlr/SQLNI.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by the {@code paramLimit}
	 * labeled alternative in {@link SQLNIParser#limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamLimit(SQLNIParser.ParamLimitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberLimit}
	 * labeled alternative in {@link SQLNIParser#limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLimit(SQLNIParser.NumberLimitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramOffset}
	 * labeled alternative in {@link SQLNIParser#offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamOffset(SQLNIParser.ParamOffsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberOffset}
	 * labeled alternative in {@link SQLNIParser#offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberOffset(SQLNIParser.NumberOffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLNIParser#orderBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderBy(SQLNIParser.OrderByContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalOrderColumn}
	 * labeled alternative in {@link SQLNIParser#orderColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalOrderColumn(SQLNIParser.NormalOrderColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramSetOrderColumn}
	 * labeled alternative in {@link SQLNIParser#orderColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamSetOrderColumn(SQLNIParser.ParamSetOrderColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLNIParser#columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns(SQLNIParser.ColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalColumn}
	 * labeled alternative in {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalColumn(SQLNIParser.NormalColumnContext ctx);
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
	 * Visit a parse tree produced by {@link SQLNIParser#as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs(SQLNIParser.AsContext ctx);
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
	 * Visit a parse tree produced by the {@code inParamSetCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInParamSetCondition(SQLNIParser.InParamSetConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inSetCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInSetCondition(SQLNIParser.InSetConditionContext ctx);
}