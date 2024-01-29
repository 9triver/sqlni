package com.kekwy.sqlni.parser;// Generated from E:/projects/sqlni/src/main/antlr/SQLNI.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link SQLNIParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(SQLNIParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(SQLNIParser.SelectContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link SQLNIParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumns(SQLNIParser.ColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumns(SQLNIParser.ColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalColumn}
	 * labeled alternative in {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 */
	void enterNormalColumn(SQLNIParser.NormalColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalColumn}
	 * labeled alternative in {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 */
	void exitNormalColumn(SQLNIParser.NormalColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramColumn}
	 * labeled alternative in {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 */
	void enterParamColumn(SQLNIParser.ParamColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramColumn}
	 * labeled alternative in {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 */
	void exitParamColumn(SQLNIParser.ParamColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringConst}
	 * labeled alternative in {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 */
	void enterStringConst(SQLNIParser.StringConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringConst}
	 * labeled alternative in {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 */
	void exitStringConst(SQLNIParser.StringConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberConst}
	 * labeled alternative in {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 */
	void enterNumberConst(SQLNIParser.NumberConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberConst}
	 * labeled alternative in {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 */
	void exitNumberConst(SQLNIParser.NumberConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcColumn}
	 * labeled alternative in {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 */
	void enterFuncColumn(SQLNIParser.FuncColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcColumn}
	 * labeled alternative in {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 */
	void exitFuncColumn(SQLNIParser.FuncColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLNIParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(SQLNIParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(SQLNIParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constTable}
	 * labeled alternative in {@link SQLNIParser#table}.
	 * @param ctx the parse tree
	 */
	void enterConstTable(SQLNIParser.ConstTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constTable}
	 * labeled alternative in {@link SQLNIParser#table}.
	 * @param ctx the parse tree
	 */
	void exitConstTable(SQLNIParser.ConstTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramTable}
	 * labeled alternative in {@link SQLNIParser#table}.
	 * @param ctx the parse tree
	 */
	void enterParamTable(SQLNIParser.ParamTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramTable}
	 * labeled alternative in {@link SQLNIParser#table}.
	 * @param ctx the parse tree
	 */
	void exitParamTable(SQLNIParser.ParamTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleCondition}
	 * labeled alternative in {@link SQLNIParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterSingleCondition(SQLNIParser.SingleConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleCondition}
	 * labeled alternative in {@link SQLNIParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitSingleCondition(SQLNIParser.SingleConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiCondtions}
	 * labeled alternative in {@link SQLNIParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterMultiCondtions(SQLNIParser.MultiCondtionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiCondtions}
	 * labeled alternative in {@link SQLNIParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitMultiCondtions(SQLNIParser.MultiCondtionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subConditions}
	 * labeled alternative in {@link SQLNIParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterSubConditions(SQLNIParser.SubConditionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subConditions}
	 * labeled alternative in {@link SQLNIParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitSubConditions(SQLNIParser.SubConditionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmpCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCmpCondition(SQLNIParser.CmpConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmpCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCmpCondition(SQLNIParser.CmpConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inParamCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterInParamCondition(SQLNIParser.InParamConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inParamCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitInParamCondition(SQLNIParser.InParamConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inSetCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterInSetCondition(SQLNIParser.InSetConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inSetCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitInSetCondition(SQLNIParser.InSetConditionContext ctx);
}