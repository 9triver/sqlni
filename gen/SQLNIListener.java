// Generated from E:/projects/sqlni/src/main/resources/SQLNI.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(SQLNIParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(SQLNIParser.ColumnContext ctx);
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
	 * Enter a parse tree produced by {@link SQLNIParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(SQLNIParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(SQLNIParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SQLNIParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLNIParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SQLNIParser.ConditionContext ctx);
}