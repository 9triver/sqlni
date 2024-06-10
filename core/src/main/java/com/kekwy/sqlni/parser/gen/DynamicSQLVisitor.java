package com.kekwy.sqlni.parser.gen;// Generated from E:/projects/sqlni/core/src/main/antlr/DynamicSQL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DynamicSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DynamicSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DynamicSQLParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(DynamicSQLParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link DynamicSQLParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(DynamicSQLParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code foreach}
	 * labeled alternative in {@link DynamicSQLParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach(DynamicSQLParser.ForeachContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicSQLParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(DynamicSQLParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link DynamicSQLParser#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny(DynamicSQLParser.AnyContext ctx);
}