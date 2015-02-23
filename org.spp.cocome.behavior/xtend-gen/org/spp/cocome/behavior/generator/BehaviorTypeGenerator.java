package org.spp.cocome.behavior.generator;

import java.util.Arrays;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.spp.cocome.behavior.behavior.BooleanLiteral;
import org.spp.cocome.behavior.behavior.CharLiteral;
import org.spp.cocome.behavior.behavior.CollectionType;
import org.spp.cocome.behavior.behavior.DeclarationTypeReference;
import org.spp.cocome.behavior.behavior.Literal;
import org.spp.cocome.behavior.behavior.NumberLiteral;
import org.spp.cocome.behavior.behavior.StringLiteral;
import org.spp.cocome.behavior.behavior.TypeReference;
import org.spp.cocome.types.types.NamedType;
import org.spp.cocome.types.types.PrimitiveType;
import org.spp.cocome.types.types.PropertyReference;

@SuppressWarnings("all")
public class BehaviorTypeGenerator {
  public static String createLiteral(final Literal literal) {
    boolean _matched = false;
    if (!_matched) {
      if (literal instanceof PropertyReference) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("null");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (literal instanceof StringLiteral) {
        _matched=true;
        return ((StringLiteral)literal).getValue();
      }
    }
    if (!_matched) {
      if (literal instanceof CharLiteral) {
        _matched=true;
        String _value = ((CharLiteral)literal).getValue();
        String _plus = ("\'" + _value);
        return (_plus + "\'");
      }
    }
    if (!_matched) {
      if (literal instanceof NumberLiteral) {
        _matched=true;
        return ((NumberLiteral)literal).getValue();
      }
    }
    if (!_matched) {
      if (literal instanceof BooleanLiteral) {
        _matched=true;
        String _xifexpression = null;
        boolean _isValue = ((BooleanLiteral)literal).isValue();
        if (_isValue) {
          _xifexpression = "true";
        } else {
          _xifexpression = "false";
        }
        return _xifexpression;
      }
    }
    return null;
  }
  
  protected static CharSequence _createJavaType(final TypeReference reference) {
    String _switchResult = null;
    NamedType _reference = reference.getReference();
    boolean _matched = false;
    if (!_matched) {
      if (_reference instanceof PrimitiveType) {
        NamedType _reference_1 = reference.getReference();
        String _name = _reference_1.getName();
        boolean _equals = _name.equals("string");
        if (_equals) {
          _matched=true;
          _switchResult = "String";
        }
      }
    }
    if (!_matched) {
      if (_reference instanceof PrimitiveType) {
        NamedType _reference_1 = reference.getReference();
        String _name = _reference_1.getName();
        boolean _equals = _name.equals("currency");
        if (_equals) {
          _matched=true;
          _switchResult = "double";
        }
      }
    }
    if (!_matched) {
      if (_reference instanceof PrimitiveType) {
        NamedType _reference_1 = reference.getReference();
        String _name = _reference_1.getName();
        boolean _equals = _name.equals("date");
        if (_equals) {
          _matched=true;
          _switchResult = "Date";
        }
      }
    }
    if (!_matched) {
      if (_reference instanceof PrimitiveType) {
        _matched=true;
        NamedType _reference_1 = reference.getReference();
        _switchResult = _reference_1.getName();
      }
    }
    if (!_matched) {
      NamedType _reference_1 = reference.getReference();
      _switchResult = _reference_1.getName();
    }
    return _switchResult;
  }
  
  protected static CharSequence _createJavaType(final CollectionType reference) {
    CharSequence _xifexpression = null;
    int _size = reference.getSize();
    boolean _notEquals = (_size != 0);
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      TypeReference _reference = reference.getReference();
      CharSequence _createJavaType = BehaviorTypeGenerator.createJavaType(_reference);
      _builder.append(_createJavaType, "");
      _builder.append("[");
      int _size_1 = reference.getSize();
      _builder.append(_size_1, "");
      _builder.append("]");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("List<");
      TypeReference _reference_1 = reference.getReference();
      CharSequence _createJavaType_1 = BehaviorTypeGenerator.createJavaType(_reference_1);
      _builder_1.append(_createJavaType_1, "");
      _builder_1.append(">");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public static CharSequence createJavaType(final DeclarationTypeReference reference) {
    if (reference instanceof CollectionType) {
      return _createJavaType((CollectionType)reference);
    } else if (reference instanceof TypeReference) {
      return _createJavaType((TypeReference)reference);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(reference).toString());
    }
  }
}
