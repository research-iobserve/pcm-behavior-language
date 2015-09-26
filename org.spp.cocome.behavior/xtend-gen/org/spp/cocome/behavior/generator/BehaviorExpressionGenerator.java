package org.spp.cocome.behavior.generator;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.spp.cocome.behavior.behavior.BooleanLiteral;
import org.spp.cocome.behavior.behavior.CharLiteral;
import org.spp.cocome.behavior.behavior.Expression;
import org.spp.cocome.behavior.behavior.InstantiationExpression;
import org.spp.cocome.behavior.behavior.Literal;
import org.spp.cocome.behavior.behavior.NumberLiteral;
import org.spp.cocome.behavior.behavior.PropertyCall;
import org.spp.cocome.behavior.behavior.StringLiteral;
import org.spp.cocome.behavior.behavior.TypeReference;
import org.spp.cocome.behavior.behavior.VariableCall;
import org.spp.cocome.behavior.behavior.VariableDecl;
import org.spp.cocome.behavior.generator.BehaviorTypeGenerator;
import org.spp.cocome.types.types.Property;

/**
 * Generates output for expressions.
 */
@SuppressWarnings("all")
public class BehaviorExpressionGenerator {
  protected static CharSequence _createExpression(final InstantiationExpression expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new ");
    TypeReference _type = expression.getType();
    CharSequence _createJavaTypeReference = BehaviorTypeGenerator.createJavaTypeReference(_type);
    _builder.append(_createJavaTypeReference, "");
    _builder.append("(");
    EList<Expression> _parameters = expression.getParameters();
    final Function1<Expression, CharSequence> _function = (Expression parameter) -> {
      return BehaviorExpressionGenerator.createExpression(parameter);
    };
    List<CharSequence> _map = ListExtensions.<Expression, CharSequence>map(_parameters, _function);
    String _join = IterableExtensions.join(_map, ", ");
    _builder.append(_join, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _createExpression(final VariableCall expression) {
    StringConcatenation _builder = new StringConcatenation();
    VariableDecl _variable = expression.getVariable();
    String _name = _variable.getName();
    _builder.append(_name, "");
    {
      Expression _index = expression.getIndex();
      boolean _notEquals = (!Objects.equal(_index, null));
      if (_notEquals) {
        _builder.append("[");
        Expression _index_1 = expression.getIndex();
        CharSequence _createExpression = BehaviorExpressionGenerator.createExpression(_index_1);
        _builder.append(_createExpression, "");
        _builder.append("]");
      }
    }
    {
      PropertyCall _subProperty = expression.getSubProperty();
      boolean _notEquals_1 = (!Objects.equal(_subProperty, null));
      if (_notEquals_1) {
        PropertyCall _subProperty_1 = expression.getSubProperty();
        CharSequence _createProperty = BehaviorExpressionGenerator.createProperty(_subProperty_1);
        _builder.append(_createProperty, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public static CharSequence createProperty(final PropertyCall property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(".");
    Property _property = property.getProperty();
    String _name = _property.getName();
    _builder.append(_name, "");
    {
      Expression _index = property.getIndex();
      boolean _notEquals = (!Objects.equal(_index, null));
      if (_notEquals) {
        _builder.append("[");
        Expression _index_1 = property.getIndex();
        CharSequence _createExpression = BehaviorExpressionGenerator.createExpression(_index_1);
        _builder.append(_createExpression, "");
        _builder.append("]");
      }
    }
    {
      PropertyCall _subProperty = property.getSubProperty();
      boolean _notEquals_1 = (!Objects.equal(_subProperty, null));
      if (_notEquals_1) {
        PropertyCall _subProperty_1 = property.getSubProperty();
        CharSequence _createProperty = BehaviorExpressionGenerator.createProperty(_subProperty_1);
        _builder.append(_createProperty, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _createExpression(final StringLiteral expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _value = expression.getValue();
    _builder.append(_value, "");
    _builder.append("\"");
    return _builder;
  }
  
  protected static CharSequence _createExpression(final CharLiteral expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\'");
    String _value = expression.getValue();
    _builder.append(_value, "");
    _builder.append("\'");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected static CharSequence _createExpression(final NumberLiteral expression) {
    StringConcatenation _builder = new StringConcatenation();
    String _value = expression.getValue();
    _builder.append(_value, "");
    return _builder;
  }
  
  protected static CharSequence _createExpression(final BooleanLiteral expression) {
    StringConcatenation _builder = new StringConcatenation();
    String _xifexpression = null;
    boolean _isValue = expression.isValue();
    if (_isValue) {
      _xifexpression = "true";
    } else {
      _xifexpression = "false";
    }
    _builder.append(_xifexpression, "");
    return _builder;
  }
  
  protected static CharSequence _createExpression(final Literal expression) {
    Class<? extends Literal> _class = expression.getClass();
    String _plus = ("Literal type " + _class);
    String _plus_1 = (_plus + " not supported.");
    throw new UnsupportedOperationException(_plus_1);
  }
  
  protected static CharSequence _createExpression(final Expression expression) {
    CharSequence _switchResult = null;
    String _feature = expression.getFeature();
    switch (_feature) {
      case "&&":
      case "||":
      case ">":
      case "<":
      case ">=":
      case "<=":
      case "==":
      case "!=":
      case "+":
      case "-":
      case "*":
      case "%":
      case "/":
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Expression _left = expression.getLeft();
        CharSequence _createExpression = BehaviorExpressionGenerator.createExpression(_left);
        _builder.append(_createExpression, "");
        _builder.append(" ");
        String _feature_1 = expression.getFeature();
        _builder.append(_feature_1, "");
        _builder.append(" ");
        Expression _right = expression.getRight();
        CharSequence _createExpression_1 = BehaviorExpressionGenerator.createExpression(_right);
        _builder.append(_createExpression_1, "");
        _builder.append(")");
        _switchResult = _builder;
        break;
      case "!":
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("(!(");
        Expression _operand = expression.getOperand();
        CharSequence _createExpression_2 = BehaviorExpressionGenerator.createExpression(_operand);
        _builder_1.append(_createExpression_2, "");
        _builder_1.append("))");
        _switchResult = _builder_1;
        break;
      case "++":
        StringConcatenation _builder_2 = new StringConcatenation();
        Expression _operand_1 = expression.getOperand();
        CharSequence _createExpression_3 = BehaviorExpressionGenerator.createExpression(_operand_1);
        _builder_2.append(_createExpression_3, "");
        _builder_2.append("++");
        _switchResult = _builder_2;
        break;
      case "--":
        StringConcatenation _builder_3 = new StringConcatenation();
        Expression _operand_2 = expression.getOperand();
        CharSequence _createExpression_4 = BehaviorExpressionGenerator.createExpression(_operand_2);
        _builder_3.append(_createExpression_4, "");
        _builder_3.append("--");
        _switchResult = _builder_3;
        break;
      case "instanceof":
        StringConcatenation _builder_4 = new StringConcatenation();
        Expression _expression = expression.getExpression();
        _builder_4.append(_expression, "");
        _builder_4.append(" instanceof ");
        TypeReference _type = expression.getType();
        CharSequence _createJavaTypeReference = BehaviorTypeGenerator.createJavaTypeReference(_type);
        _builder_4.append(_createJavaTypeReference, "");
        _switchResult = _builder_4;
        break;
      case "as":
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("((");
        TypeReference _type_1 = expression.getType();
        CharSequence _createJavaTypeReference_1 = BehaviorTypeGenerator.createJavaTypeReference(_type_1);
        _builder_5.append(_createJavaTypeReference_1, "");
        _builder_5.append(")");
        Expression _target = expression.getTarget();
        _builder_5.append(_target, "");
        _builder_5.append(")");
        _switchResult = _builder_5;
        break;
    }
    return _switchResult;
  }
  
  public static CharSequence createExpression(final Expression expression) {
    if (expression instanceof BooleanLiteral) {
      return _createExpression((BooleanLiteral)expression);
    } else if (expression instanceof CharLiteral) {
      return _createExpression((CharLiteral)expression);
    } else if (expression instanceof NumberLiteral) {
      return _createExpression((NumberLiteral)expression);
    } else if (expression instanceof StringLiteral) {
      return _createExpression((StringLiteral)expression);
    } else if (expression instanceof InstantiationExpression) {
      return _createExpression((InstantiationExpression)expression);
    } else if (expression instanceof Literal) {
      return _createExpression((Literal)expression);
    } else if (expression instanceof VariableCall) {
      return _createExpression((VariableCall)expression);
    } else if (expression != null) {
      return _createExpression(expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
}
