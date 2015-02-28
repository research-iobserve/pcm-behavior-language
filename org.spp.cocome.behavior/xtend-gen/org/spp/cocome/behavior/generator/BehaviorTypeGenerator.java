package org.spp.cocome.behavior.generator;

import java.util.Arrays;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.spp.cocome.behavior.behavior.CollectionType;
import org.spp.cocome.behavior.behavior.DeclarationTypeReference;
import org.spp.cocome.behavior.behavior.MapType;
import org.spp.cocome.behavior.behavior.TypeReference;
import org.spp.cocome.types.types.NamedType;
import org.spp.cocome.types.types.PrimitiveType;

@SuppressWarnings("all")
public class BehaviorTypeGenerator {
  protected static CharSequence _createJavaTypeReference(final TypeReference reference) {
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
  
  protected static CharSequence _createJavaTypeReference(final CollectionType reference) {
    CharSequence _xifexpression = null;
    int _size = reference.getSize();
    boolean _notEquals = (_size != 0);
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      TypeReference _reference = reference.getReference();
      CharSequence _createJavaTypeReference = BehaviorTypeGenerator.createJavaTypeReference(_reference);
      _builder.append(_createJavaTypeReference, "");
      _builder.append("[");
      int _size_1 = reference.getSize();
      _builder.append(_size_1, "");
      _builder.append("]");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("List<");
      TypeReference _reference_1 = reference.getReference();
      CharSequence _createJavaTypeReference_1 = BehaviorTypeGenerator.createJavaTypeReference(_reference_1);
      _builder_1.append(_createJavaTypeReference_1, "");
      _builder_1.append(">");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected static CharSequence _createJavaTypeReference(final MapType reference) {
    throw new UnsupportedOperationException("Map type is not implemented");
  }
  
  protected static CharSequence _createJavaTypeReference(final DeclarationTypeReference reference) {
    Class<? extends DeclarationTypeReference> _class = reference.getClass();
    String _plus = ("Implementation error. Type reference type " + _class);
    String _plus_1 = (_plus + " not supported.");
    throw new UnsupportedOperationException(_plus_1);
  }
  
  public static CharSequence createJavaTypeReference(final DeclarationTypeReference reference) {
    if (reference instanceof CollectionType) {
      return _createJavaTypeReference((CollectionType)reference);
    } else if (reference instanceof MapType) {
      return _createJavaTypeReference((MapType)reference);
    } else if (reference instanceof TypeReference) {
      return _createJavaTypeReference((TypeReference)reference);
    } else if (reference != null) {
      return _createJavaTypeReference(reference);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(reference).toString());
    }
  }
}
