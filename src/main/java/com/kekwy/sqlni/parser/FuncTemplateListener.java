package com.kekwy.sqlni.parser;// Generated from E:/projects/sqlni/sqlni-core/src/main/antlr/FuncTemplate.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FuncTemplateParser}.
 */
public interface FuncTemplateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code varParams}
	 * labeled alternative in {@link FuncTemplateParser#function}.
	 * @param ctx the parse tree
	 */
	void enterVarParams(FuncTemplateParser.VarParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varParams}
	 * labeled alternative in {@link FuncTemplateParser#function}.
	 * @param ctx the parse tree
	 */
	void exitVarParams(FuncTemplateParser.VarParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fixedParams}
	 * labeled alternative in {@link FuncTemplateParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFixedParams(FuncTemplateParser.FixedParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fixedParams}
	 * labeled alternative in {@link FuncTemplateParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFixedParams(FuncTemplateParser.FixedParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncTemplateParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(FuncTemplateParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncTemplateParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(FuncTemplateParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link FuncTemplateParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(FuncTemplateParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link FuncTemplateParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(FuncTemplateParser.ParamContext ctx);
}