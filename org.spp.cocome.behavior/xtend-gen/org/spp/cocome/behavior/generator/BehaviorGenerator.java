/**
 * generated by Xtext
 */
package org.spp.cocome.behavior.generator;

import com.google.common.collect.Iterators;
import java.io.File;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.spp.cocome.behavior.behavior.ComponentImpl;
import org.spp.cocome.behavior.generator.BehaviorNameResolver;
import org.spp.cocome.behavior.generator.BehaviorStructureGenerator;
import org.spp.cocome.behavior.mapping.Component;
import org.spp.cocome.types.types.Model;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class BehaviorGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<ComponentImpl> _filter = Iterators.<ComponentImpl>filter(_allContents, ComponentImpl.class);
    final Procedure1<ComponentImpl> _function = new Procedure1<ComponentImpl>() {
      public void apply(final ComponentImpl component) {
        String _createFileName = BehaviorGenerator.this.createFileName(component);
        CharSequence _createComponent = BehaviorStructureGenerator.createComponent(component);
        fsa.generateFile(_createFileName, _createComponent);
      }
    };
    IteratorExtensions.<ComponentImpl>forEach(_filter, _function);
  }
  
  private String createFileName(final ComponentImpl com) {
    EObject _eContainer = com.eContainer();
    String _name = ((Model) _eContainer).getName();
    String _replace = _name.replace(".", File.separator);
    String _plus = (_replace + 
      File.separator);
    String _createComponentName = this.createComponentName(com);
    String _plus_1 = (_plus + _createComponentName);
    return (_plus_1 + ".frag");
  }
  
  private String createComponentName(final ComponentImpl component) {
    Component _refComponent = component.getRefComponent();
    String _name = _refComponent.getName();
    return BehaviorNameResolver.getClassName(_name);
  }
}