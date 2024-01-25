package com.kekwy.sqlni.parser;// Generated from E:/projects/sqlni/sqlni-core/src/main/antlr/FuncTemplate.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FuncTemplateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FuncTemplateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code varParams}
	 * labeled alternative in {@link FuncTemplateParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarParams(FuncTemplateParser.VarParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fixedParams}
	 * labeled alternative in {@link FuncTemplateParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedParams(FuncTemplateParser.FixedParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncTemplateParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(FuncTemplateParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link FuncTemplateParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(FuncTemplateParser.ParamContext ctx);
}