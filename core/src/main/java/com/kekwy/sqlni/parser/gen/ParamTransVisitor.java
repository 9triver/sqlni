package com.kekwy.sqlni.parser.gen;// Generated from E:/projects/sqlni/core/src/main/antlr/ParamTrans.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParamTransParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParamTransVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParamTransParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(ParamTransParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toParam1}
	 * labeled alternative in {@link ParamTransParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToParam1(ParamTransParser.ToParam1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code toParam2}
	 * labeled alternative in {@link ParamTransParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToParam2(ParamTransParser.ToParam2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code fromParam1}
	 * labeled alternative in {@link ParamTransParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromParam1(ParamTransParser.FromParam1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code fromParam2}
	 * labeled alternative in {@link ParamTransParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromParam2(ParamTransParser.FromParam2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ParamTransParser#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny(ParamTransParser.AnyContext ctx);
}