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
	 * Enter a parse tree produced by {@link SQLNIParser#orderBy}.
	 * @param ctx the parse tree
	 */
	void enterOrderBy(SQLNIParser.OrderByContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParser#orderBy}.
	 * @param ctx the parse tree
	 */
	void exitOrderBy(SQLNIParser.OrderByContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalOrderColumn}
	 * labeled alternative in {@link SQLNIParser#orderColumn}.
	 * @param ctx the parse tree
	 */
	void enterNormalOrderColumn(SQLNIParser.NormalOrderColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalOrderColumn}
	 * labeled alternative in {@link SQLNIParser#orderColumn}.
	 * @param ctx the parse tree
	 */
	void exitNormalOrderColumn(SQLNIParser.NormalOrderColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramSetOrderColumn}
	 * labeled alternative in {@link SQLNIParser#orderColumn}.
	 * @param ctx the parse tree
	 */
	void enterParamSetOrderColumn(SQLNIParser.ParamSetOrderColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramSetOrderColumn}
	 * labeled alternative in {@link SQLNIParser#orderColumn}.
	 * @param ctx the parse tree
	 */
	void exitParamSetOrderColumn(SQLNIParser.ParamSetOrderColumnContext ctx);
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
	 * Enter a parse tree produced by {@link SQLNIParser#selectColumn}.
	 * @param ctx the parse tree
	 */
	void enterSelectColumn(SQLNIParser.SelectColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParser#selectColumn}.
	 * @param ctx the parse tree
	 */
	void exitSelectColumn(SQLNIParser.SelectColumnContext ctx);
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
	 * Enter a parse tree produced by the {@code subQuery}
	 * labeled alternative in {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 */
	void enterSubQuery(SQLNIParser.SubQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subQuery}
	 * labeled alternative in {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 */
	void exitSubQuery(SQLNIParser.SubQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code param1}
	 * labeled alternative in {@link SQLNIParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam1(SQLNIParser.Param1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code param1}
	 * labeled alternative in {@link SQLNIParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam1(SQLNIParser.Param1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code param2}
	 * labeled alternative in {@link SQLNIParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam2(SQLNIParser.Param2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code param2}
	 * labeled alternative in {@link SQLNIParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam2(SQLNIParser.Param2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code normalTable}
	 * labeled alternative in {@link SQLNIParser#table}.
	 * @param ctx the parse tree
	 */
	void enterNormalTable(SQLNIParser.NormalTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalTable}
	 * labeled alternative in {@link SQLNIParser#table}.
	 * @param ctx the parse tree
	 */
	void exitNormalTable(SQLNIParser.NormalTableContext ctx);
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
	 * Enter a parse tree produced by the {@code subQueryTable}
	 * labeled alternative in {@link SQLNIParser#table}.
	 * @param ctx the parse tree
	 */
	void enterSubQueryTable(SQLNIParser.SubQueryTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subQueryTable}
	 * labeled alternative in {@link SQLNIParser#table}.
	 * @param ctx the parse tree
	 */
	void exitSubQueryTable(SQLNIParser.SubQueryTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLNIParser#as}.
	 * @param ctx the parse tree
	 */
	void enterAs(SQLNIParser.AsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParser#as}.
	 * @param ctx the parse tree
	 */
	void exitAs(SQLNIParser.AsContext ctx);
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
	 * Enter a parse tree produced by the {@code notConditions}
	 * labeled alternative in {@link SQLNIParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterNotConditions(SQLNIParser.NotConditionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notConditions}
	 * labeled alternative in {@link SQLNIParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitNotConditions(SQLNIParser.NotConditionsContext ctx);
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
	 * Enter a parse tree produced by the {@code inParamSetCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterInParamSetCondition(SQLNIParser.InParamSetConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inParamSetCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitInParamSetCondition(SQLNIParser.InParamSetConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code betweenAndCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterBetweenAndCondition(SQLNIParser.BetweenAndConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code betweenAndCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitBetweenAndCondition(SQLNIParser.BetweenAndConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNullCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterIsNullCondition(SQLNIParser.IsNullConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNullCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitIsNullCondition(SQLNIParser.IsNullConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code likeCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLikeCondition(SQLNIParser.LikeConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code likeCondition}
	 * labeled alternative in {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLikeCondition(SQLNIParser.LikeConditionContext ctx);
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