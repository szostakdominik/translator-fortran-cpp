// Generated from fortran77.g by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link fortran77Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface fortran77Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(fortran77Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#executableUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecutableUnit(fortran77Parser.ExecutableUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#mainProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainProgram(fortran77Parser.MainProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#programStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramStatement(fortran77Parser.ProgramStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#subprogramBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogramBody(fortran77Parser.SubprogramBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#wholeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWholeStatement(fortran77Parser.WholeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(fortran77Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#executableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecutableStatement(fortran77Parser.ExecutableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#doWyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWyrazenie(fortran77Parser.DoWyrazenieContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#doSlowo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoSlowo(fortran77Parser.DoSlowoContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#endDoSlowo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndDoSlowo(fortran77Parser.EndDoSlowoContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#ifstatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatment(fortran77Parser.IfstatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#elseSlowo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseSlowo(fortran77Parser.ElseSlowoContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#endIfSlowo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndIfSlowo(fortran77Parser.EndIfSlowoContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#ifSlowo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSlowo(fortran77Parser.IfSlowoContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#thenSlowo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenSlowo(fortran77Parser.ThenSlowoContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(fortran77Parser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenie(fortran77Parser.WyrazenieContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#wyrazenieMatematyczne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieMatematyczne(fortran77Parser.WyrazenieMatematyczneContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#operacja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacja(fortran77Parser.OperacjaContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(fortran77Parser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(fortran77Parser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#expExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpExpr(fortran77Parser.ExpExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#funkcjaMatematyczna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunkcjaMatematyczna(fortran77Parser.FunkcjaMatematycznaContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#nazwaFunkcjiMatematycznej}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNazwaFunkcjiMatematycznej(fortran77Parser.NazwaFunkcjiMatematycznejContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#typeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStatement(fortran77Parser.TypeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#typeStatementNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStatementNameList(fortran77Parser.TypeStatementNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#typeStatementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStatementName(fortran77Parser.TypeStatementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#arrayDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclarator(fortran77Parser.ArrayDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#arrayDeclaratorExtents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaratorExtents(fortran77Parser.ArrayDeclaratorExtentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#arrayDeclaratorExtent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaratorExtent(fortran77Parser.ArrayDeclaratorExtentContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#typename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypename(fortran77Parser.TypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#seos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeos(fortran77Parser.SeosContext ctx);
	/**
	 * Visit a parse tree produced by {@link fortran77Parser#endStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndStatement(fortran77Parser.EndStatementContext ctx);
}