package org.spp.cocome.behavior.generator;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.spp.cocome.behavior.behavior.Assignment;
import org.spp.cocome.behavior.behavior.BlockStatement;
import org.spp.cocome.behavior.behavior.DeclarationTypeReference;
import org.spp.cocome.behavior.behavior.Expression;
import org.spp.cocome.behavior.behavior.IfStatement;
import org.spp.cocome.behavior.behavior.LoopStatement;
import org.spp.cocome.behavior.behavior.Statement;
import org.spp.cocome.behavior.behavior.VariableCall;
import org.spp.cocome.behavior.behavior.VariableDecl;
import org.spp.cocome.behavior.generator.BehaviorExpressionGenerator;
import org.spp.cocome.behavior.generator.BehaviorTypeGenerator;

/**
 * Generator functions for statements.
 */
@SuppressWarnings("all")
public class BehaviorStatementGenerator {
  public static CharSequence handleBlockstatement(final BlockStatement bStatement) {
    EList<Statement> _statements = bStatement.getStatements();
    final Function1<Statement, CharSequence> _function = new Function1<Statement, CharSequence>() {
      public CharSequence apply(final Statement bs) {
        return BehaviorStatementGenerator.handleStatement(bs);
      }
    };
    List<CharSequence> _map = ListExtensions.<Statement, CharSequence>map(_statements, _function);
    return IterableExtensions.join(_map);
  }
  
  public static CharSequence handleStatement(final Statement statement) {
    throw new Error("Unresolved compilation problems:"
      + "\nDataAccessStatement cannot be resolved to a type."
      + "\nThe method createDataAccessStatement is undefined for the type BehaviorStatementGenerator"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition.");
  }
  
  public static CharSequence createIfStatement(final IfStatement statement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if (");
    Expression _expr = statement.getExpr();
    CharSequence _createExpression = BehaviorExpressionGenerator.createExpression(_expr);
    _builder.append(_createExpression, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    BlockStatement _ifStatement = statement.getIfStatement();
    CharSequence _handleBlockstatement = BehaviorStatementGenerator.handleBlockstatement(_ifStatement);
    _builder.append(_handleBlockstatement, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t");
    BlockStatement _elseStatement = statement.getElseStatement();
    CharSequence _handleBlockstatement_1 = BehaviorStatementGenerator.handleBlockstatement(_elseStatement);
    _builder.append(_handleBlockstatement_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence createDataAccessStatement(final /* DataAccessStatement */Object statement) {
    throw new Error("Unresolved compilation problems:"
      + "\noperation cannot be resolved"
      + "\ncreateDBAOperation cannot be resolved"
      + "\nvariable cannot be resolved");
  }
  
  public static String createDBAOperation(final /* DataAccessOperation */Object operation) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field STORE is undefined for the type BehaviorStatementGenerator"
      + "\nThe method or field UPDATE is undefined for the type BehaviorStatementGenerator"
      + "\nThe method or field DELETE is undefined for the type BehaviorStatementGenerator");
  }
  
  public static CharSequence createAssignment(final Assignment statement) {
    StringConcatenation _builder = new StringConcatenation();
    VariableCall _variable = statement.getVariable();
    CharSequence _createExpression = BehaviorExpressionGenerator.createExpression(_variable);
    _builder.append(_createExpression, "");
    _builder.append(" = ");
    Expression _expression = statement.getExpression();
    CharSequence _createExpression_1 = BehaviorExpressionGenerator.createExpression(_expression);
    _builder.append(_createExpression_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence createLoopStatement(final LoopStatement statement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for (");
    VariableDecl _variable = statement.getVariable();
    DeclarationTypeReference _type = _variable.getType();
    CharSequence _createJavaTypeReference = BehaviorTypeGenerator.createJavaTypeReference(_type);
    _builder.append(_createJavaTypeReference, "");
    _builder.append(" ");
    VariableDecl _variable_1 = statement.getVariable();
    String _name = _variable_1.getName();
    _builder.append(_name, "");
    _builder.append(" : ");
    Expression _expression = statement.getExpression();
    CharSequence _createExpression = BehaviorExpressionGenerator.createExpression(_expression);
    _builder.append(_createExpression, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    BlockStatement _statement = statement.getStatement();
    CharSequence _handleBlockstatement = BehaviorStatementGenerator.handleBlockstatement(_statement);
    _builder.append(_handleBlockstatement, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
