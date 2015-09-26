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
import org.spp.cocome.behavior.behavior.BlockStatement;
import org.spp.cocome.behavior.behavior.ComponentImpl;
import org.spp.cocome.behavior.behavior.ConstantDecl;
import org.spp.cocome.behavior.behavior.DeclarationTypeReference;
import org.spp.cocome.behavior.behavior.Expression;
import org.spp.cocome.behavior.behavior.InterfaceRealization;
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
    _builder.append("::VARIABLES_END::");
    _builder.newLine();
    EList<InterfaceRealization> _interfaces = com.getInterfaces();
    final Function1<InterfaceRealization, CharSequence> _function_1 = (InterfaceRealization iface) -> {
      return BehaviorStructureGenerator.createInterface(iface);
    };
    List<CharSequence> _map_1 = ListExtensions.<InterfaceRealization, CharSequence>map(_interfaces, _function_1);
    String _join_1 = IterableExtensions.join(_map_1);
    _builder.append(_join_1, "");
    _builder.append("\t\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Iterate over interfaces.
   */
  public static CharSequence createInterface(final InterfaceRealization iface) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("::METHODS_FOR_");
    Interface _refInterface = iface.getRefInterface();
    String _name = _refInterface.getName();
    _builder.append(_name, "");
    _builder.append("::");
    _builder.newLineIfNotEmpty();
    EList<MethodImpl> _methods = iface.getMethods();
    final Function1<MethodImpl, CharSequence> _function = (MethodImpl m) -> {
      return BehaviorStructureGenerator.createMethod(m);
    };
    List<CharSequence> _map = ListExtensions.<MethodImpl, CharSequence>map(_methods, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "");
    _builder.newLineIfNotEmpty();
    _builder.append("::METHODS_END::");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Create snipped code for one method
   */
  public static CharSequence createMethod(final MethodImpl impl) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("::METHOD:: ");
    _builder.newLine();
    _builder.append("public void ");
    MethodDecl _refMethod = impl.getRefMethod();
    String _name = _refMethod.getName();
    String _methodName = BehaviorNameResolver.getMethodName(_name);
    _builder.append(_methodName, "");
    _builder.append(" () {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    BlockStatement _body = impl.getBody();
    CharSequence _handleBlockstatement = BehaviorStatementGenerator.handleBlockstatement(_body);
    _builder.append(_handleBlockstatement, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
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
