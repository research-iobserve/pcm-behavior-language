package org.spp.cocome.behavior.generator;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.spp.cocome.behavior.behavior.BlockStatement;
import org.spp.cocome.behavior.behavior.ComponentImpl;
import org.spp.cocome.behavior.behavior.ComponentKind;
import org.spp.cocome.behavior.behavior.ConstantDecl;
import org.spp.cocome.behavior.behavior.DeclarationTypeReference;
import org.spp.cocome.behavior.behavior.Expression;
import org.spp.cocome.behavior.behavior.InterfaceRealization;
import org.spp.cocome.behavior.behavior.LifeCycleMethod;
import org.spp.cocome.behavior.behavior.MethodImpl;
import org.spp.cocome.behavior.behavior.VariableDecl;
import org.spp.cocome.behavior.generator.BehaviorExpressionGenerator;
import org.spp.cocome.behavior.generator.BehaviorNameResolver;
import org.spp.cocome.behavior.generator.BehaviorStatementGenerator;
import org.spp.cocome.behavior.generator.BehaviorTypeGenerator;
import org.spp.cocome.behavior.mapping.Interface;
import org.spp.cocome.behavior.mapping.MethodDecl;

@SuppressWarnings("all")
public class BehaviorStructureGenerator {
  /**
   * Hauptprozedur
   */
  public static CharSequence createComponent(final ComponentImpl com) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("::ANNOTATIONS::");
    _builder.newLine();
    {
      ComponentKind _kind = com.getKind();
      boolean _notEquals = (!Objects.equal(_kind, null));
      if (_notEquals) {
        _builder.append("@");
        ComponentKind _kind_1 = com.getKind();
        String _literal = _kind_1.getLiteral();
        String _firstUpper = StringExtensions.toFirstUpper(_literal);
        _builder.append(_firstUpper, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("::ANNOTATIONS END::");
    _builder.newLine();
    _builder.append("::VARIABLES::");
    _builder.newLine();
    EList<EObject> _localDeclarations = com.getLocalDeclarations();
    final Function1<EObject, CharSequence> _function = (EObject decl) -> {
      return BehaviorStructureGenerator.createDeclaration(decl);
    };
    List<CharSequence> _map = ListExtensions.<EObject, CharSequence>map(_localDeclarations, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    _builder.append("::VARIABLES END::");
    _builder.newLine();
    {
      boolean _or = false;
      LifeCycleMethod _postConstruct = com.getPostConstruct();
      boolean _notEquals_1 = (!Objects.equal(_postConstruct, null));
      if (_notEquals_1) {
        _or = true;
      } else {
        LifeCycleMethod _preDestroy = com.getPreDestroy();
        boolean _notEquals_2 = (!Objects.equal(_preDestroy, null));
        _or = _notEquals_2;
      }
      if (_or) {
        _builder.append("::LIFECYCLE::");
      }
    }
    _builder.newLineIfNotEmpty();
    CharSequence _xifexpression = null;
    LifeCycleMethod _postConstruct_1 = com.getPostConstruct();
    boolean _notEquals_3 = (!Objects.equal(_postConstruct_1, null));
    if (_notEquals_3) {
      LifeCycleMethod _postConstruct_2 = com.getPostConstruct();
      _xifexpression = BehaviorStructureGenerator.createLifeCycleMethod(_postConstruct_2, "PostConstruct", "initialize");
    }
    _builder.append(_xifexpression, "");
    _builder.newLineIfNotEmpty();
    CharSequence _xifexpression_1 = null;
    LifeCycleMethod _preDestroy_1 = com.getPreDestroy();
    boolean _notEquals_4 = (!Objects.equal(_preDestroy_1, null));
    if (_notEquals_4) {
      LifeCycleMethod _preDestroy_2 = com.getPreDestroy();
      _xifexpression_1 = BehaviorStructureGenerator.createLifeCycleMethod(_preDestroy_2, "PreDestroy", "shutdown");
    }
    _builder.append(_xifexpression_1, "");
    _builder.newLineIfNotEmpty();
    {
      boolean _or_1 = false;
      LifeCycleMethod _postConstruct_3 = com.getPostConstruct();
      boolean _notEquals_5 = (!Objects.equal(_postConstruct_3, null));
      if (_notEquals_5) {
        _or_1 = true;
      } else {
        LifeCycleMethod _preDestroy_3 = com.getPreDestroy();
        boolean _notEquals_6 = (!Objects.equal(_preDestroy_3, null));
        _or_1 = _notEquals_6;
      }
      if (_or_1) {
        _builder.append("::LIFECYCLE END::");
      }
    }
    _builder.newLineIfNotEmpty();
    EList<InterfaceRealization> _interfaces = com.getInterfaces();
    final Function1<InterfaceRealization, CharSequence> _function_1 = (InterfaceRealization iface) -> {
      return BehaviorStructureGenerator.createInterface(iface);
    };
    List<CharSequence> _map_1 = ListExtensions.<InterfaceRealization, CharSequence>map(_interfaces, _function_1);
    String _join_1 = IterableExtensions.join(_map_1);
    _builder.append(_join_1, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * life cycle methods
   */
  public static CharSequence createLifeCycleMethod(final LifeCycleMethod method, final String annotation, final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@");
    _builder.append(annotation, "");
    _builder.newLineIfNotEmpty();
    _builder.append("  \t\t");
    _builder.append("public void ");
    _builder.append(name, "  \t\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("    \t\t");
    BlockStatement _body = method.getBody();
    CharSequence _handleBlockstatement = BehaviorStatementGenerator.handleBlockstatement(_body);
    _builder.append(_handleBlockstatement, "    \t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("  \t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Iterate over interfaces.
   */
  public static CharSequence createInterface(final InterfaceRealization iface) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("::METHODS FOR::");
    Interface _refInterface = iface.getRefInterface();
    String _name = _refInterface.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    EList<MethodImpl> _methods = iface.getMethods();
    final Function1<MethodImpl, CharSequence> _function = (MethodImpl m) -> {
      return BehaviorStructureGenerator.createMethod(m);
    };
    List<CharSequence> _map = ListExtensions.<MethodImpl, CharSequence>map(_methods, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    _builder.append("::METHODS END::");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Create snipped code for one method
   */
  public static CharSequence createMethod(final MethodImpl impl) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("::METHOD::");
    MethodDecl _refMethod = impl.getRefMethod();
    String _name = _refMethod.getName();
    String _methodName = BehaviorNameResolver.getMethodName(_name);
    _builder.append(_methodName, "");
    _builder.newLineIfNotEmpty();
    BlockStatement _body = impl.getBody();
    CharSequence _handleBlockstatement = BehaviorStatementGenerator.handleBlockstatement(_body);
    _builder.append(_handleBlockstatement, "");
    _builder.newLineIfNotEmpty();
    _builder.append("::METHOD_END::");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Create declarations for variables and constants.
   */
  public static CharSequence createDeclaration(final EObject object) {
    try {
      CharSequence _switchResult = null;
      boolean _matched = false;
      if (!_matched) {
        if (object instanceof VariableDecl) {
          _matched=true;
          _switchResult = BehaviorStructureGenerator.createVariableDeclaration(((VariableDecl)object));
        }
      }
      if (!_matched) {
        if (object instanceof ConstantDecl) {
          _matched=true;
          _switchResult = BehaviorStructureGenerator.createConstantDeclaration(((ConstantDecl)object));
        }
      }
      if (!_matched) {
        throw new Exception();
      }
      return _switchResult;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Constant declaration.
   */
  public static CharSequence createConstantDeclaration(final ConstantDecl declaration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static final ");
    String _name = declaration.getName();
    _builder.append(_name, "");
    _builder.append(" = ");
    Expression _value = declaration.getValue();
    CharSequence _createExpression = BehaviorExpressionGenerator.createExpression(_value);
    _builder.append(_createExpression, "");
    _builder.append(";\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Variable declaration.
   */
  public static CharSequence createVariableDeclaration(final VariableDecl declaration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    CharSequence _xifexpression = null;
    String _modifier = declaration.getModifier();
    boolean _equals = Objects.equal(_modifier, "val");
    if (_equals) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("static");
      _xifexpression = _builder_1;
    } else {
      _xifexpression = null;
    }
    _builder.append(_xifexpression, "");
    _builder.append(" ");
    DeclarationTypeReference _type = declaration.getType();
    CharSequence _createJavaTypeReference = BehaviorTypeGenerator.createJavaTypeReference(_type);
    _builder.append(_createJavaTypeReference, "");
    _builder.append(" ");
    String _name = declaration.getName();
    _builder.append(_name, "");
    _builder.append(";\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
