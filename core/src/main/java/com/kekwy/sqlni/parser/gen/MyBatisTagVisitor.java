package com.kekwy.sqlni.parser.gen;// Generated from E:/projects/sqlni/src/main/antlr/MyBatisTag.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyBatisTagParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyBatisTagVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyBatisTagParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(MyBatisTagParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link MyBatisTagParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(MyBatisTagParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code foreach}
	 * labeled alternative in {@link MyBatisTagParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach(MyBatisTagParser.ForeachContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyBatisTagParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(MyBatisTagParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyBatisTagParser#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny(MyBatisTagParser.AnyContext ctx);
}