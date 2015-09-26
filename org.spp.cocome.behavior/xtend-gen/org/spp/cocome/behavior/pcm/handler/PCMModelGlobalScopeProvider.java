/**
 * Copyright 2013 Kieker Project (http://kieker-monitoring.net)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.spp.cocome.behavior.pcm.handler;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.spp.cocome.behavior.behavior.RepositoryReference;
import org.spp.cocome.behavior.pcm.handler.IPCMModelTypeProvider;
import org.spp.cocome.behavior.pcm.handler.PCMModelTypeProviderFactory;
import org.spp.cocome.behavior.pcm.handler.PCMModelTypeScope;
import org.spp.cocome.types.types.TypesPackage;
import org.spp.cocome.types.typing.ITypeProvider;
import org.spp.cocome.types.typing.PrimitiveTypeScope;
import org.spp.cocome.types.typing.TypeProviderFactory;

@SuppressWarnings("all")
public class PCMModelGlobalScopeProvider extends DefaultGlobalScopeProvider {
  @Inject
  private PCMModelTypeProviderFactory pcmModeltypeProviderFactory;
  
  @Inject
  private TypeProviderFactory typeProviderFactory;
  
  @Inject
  private IQualifiedNameConverter qualifiedNameConverter;
  
  @Override
  public IScope getScope(final Resource resource, final EReference reference, final Predicate<IEObjectDescription> filter) {
    EClass _eReferenceType = reference.getEReferenceType();
    final IScope parentTypeScope = this.getParentTypeScope(resource, reference, filter, _eReferenceType);
    EClass _eReferenceType_1 = reference.getEReferenceType();
    return super.getScope(parentTypeScope, resource, false, _eReferenceType_1, filter);
  }
  
  public IScope getParentTypeScope(final Resource resource, final EReference reference, final Predicate<IEObjectDescription> filter, final EClass referenceType) {
    boolean _isAssignableFrom = EcoreUtil2.isAssignableFrom(TypesPackage.Literals.TYPE, referenceType);
    if (_isAssignableFrom) {
      boolean _equals = Objects.equal(resource, null);
      if (_equals) {
        throw new IllegalStateException("context must be contained in a resource");
      }
      final ResourceSet resourceSet = resource.getResourceSet();
      boolean _equals_1 = Objects.equal(resourceSet, null);
      if (_equals_1) {
        throw new IllegalStateException("context must be contained in a resource set");
      }
      final ITypeProvider typeProvider = this.typeProviderFactory.getTypeProvider(resourceSet);
      return new PrimitiveTypeScope(typeProvider, this.qualifiedNameConverter, filter);
    } else {
      boolean _isAssignableFrom_1 = EcoreUtil2.isAssignableFrom(EcorePackage.Literals.EOBJECT, referenceType);
      if (_isAssignableFrom_1) {
        boolean _notEquals = (!Objects.equal(resource, null));
        if (_notEquals) {
          final ResourceSet resourceSet_1 = resource.getResourceSet();
          boolean _notEquals_1 = (!Objects.equal(resourceSet_1, null));
          if (_notEquals_1) {
            TreeIterator<EObject> _allContents = resource.getAllContents();
            Iterator<RepositoryReference> _filter = Iterators.<RepositoryReference>filter(_allContents, RepositoryReference.class);
            RepositoryReference _head = IteratorExtensions.<RepositoryReference>head(_filter);
            final IPCMModelTypeProvider typeProvider_1 = this.pcmModeltypeProviderFactory.getTypeProvider(resourceSet_1, _head);
            return new PCMModelTypeScope(typeProvider_1, this.qualifiedNameConverter, filter);
          } else {
            throw new IllegalStateException("context must be contained in a resource set");
          }
        } else {
          throw new IllegalStateException("context must be contained in a resource");
        }
      } else {
        return IScope.NULLSCOPE;
      }
    }
  }
}
