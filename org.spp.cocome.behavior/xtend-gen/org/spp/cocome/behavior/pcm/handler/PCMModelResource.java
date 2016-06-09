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
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.palladiosimulator.pcm.repository.ImplementationComponentType;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.spp.cocome.behavior.behavior.RepositoryReference;
import org.spp.cocome.behavior.mapping.Component;
import org.spp.cocome.behavior.mapping.MappingFactory;
import org.spp.cocome.behavior.mapping.MappingModel;
import org.spp.cocome.behavior.mapping.MethodDecl;
import org.spp.cocome.behavior.mapping.NamedElement;
import org.spp.cocome.types.types.Type;

/**
 * Simulates a real resource by mapping the a PCM model to our hierarchy model.
 * 
 * @author Reiner Jung - initial contribution
 */
@SuppressWarnings("all")
public class PCMModelResource extends ResourceImpl {
  /**
   * hierarchy mapping model factory.
   */
  private final MappingFactory mappingFactory = MappingFactory.eINSTANCE;
  
  /**
   * Model of the application to be instrumented.
   */
  private final RepositoryReference repository;
  
  private MappingModel resultModel;
  
  /**
   * Integrate a foreign model.
   * 
   * @param uri of the foreign model
   * @param applicationModel the application model
   */
  public PCMModelResource(final URI uri, final RepositoryReference repository) {
    super(uri);
    this.repository = repository;
  }
  
  /**
   * Return an EObject with the name specified by the uriFragment.
   * 
   * @param uriFragment
   * 
   * @return the EObject identified by the uriFragment or null if no such object exists.
   */
  @Override
  public EObject getEObject(final String uriFragment) {
    EList<EObject> _contents = this.getContents();
    String _plus = ("this.getContents " + _contents);
    System.out.println(_plus);
    EList<EObject> _contents_1 = this.getContents();
    boolean _isEmpty = _contents_1.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      EList<EObject> _contents_2 = this.getContents();
      EObject _get = _contents_2.get(0);
      String _plus_1 = ("this.getContents get element " + _get);
      System.out.println(_plus_1);
      final EObject object = null;
      boolean _notEquals = (!Objects.equal(object, null));
      if (_notEquals) {
        return object;
      } else {
        return super.getEObject(uriFragment);
      }
    } else {
      return super.getEObject(uriFragment);
    }
  }
  
  /**
   * Compute the uriFragment for a given EObject.
   * 
   * @param eObject the object the fragment is computed for.
   * 
   * @return returns the uriFragment for the given object.
   */
  @Override
  public String getURIFragment(final EObject eObject) {
    if ((eObject instanceof NamedElement)) {
      return ((NamedElement) eObject).getName();
    } else {
      return super.getURIFragment(eObject);
    }
  }
  
  /**
   * load the resource iff it is not already loaded.
   */
  @Override
  public void load(final Map<?, ?> options) throws IOException {
    if ((!this.isLoaded)) {
      this.doLoad(null, null);
    }
  }
  
  /**
   * Saving this resource is not allowed, as it is a virtual resource.
   */
  @Override
  public void save(final Map<?, ?> options) throws IOException {
    throw new UnsupportedOperationException();
  }
  
  /**
   * This routine is called from ResourceImpl load after the load method above is triggered.
   * It initializes the primitive type mirror.
   * 
   * TODO fix documentation
   * 
   * @param inputStream
   * @param options
   * 
   * @throws IOException
   */
  @Override
  public void doLoad(final InputStream inputStream, final Map<?, ?> options) throws IOException {
    URI _uRI = this.getURI();
    boolean _notEquals = (!Objects.equal(_uRI, null));
    if (_notEquals) {
      this.createModel();
    } else {
      try {
        throw new IOException("URI not set on ForeignModelResource.onLoad");
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
          final IOException e = (IOException)_t;
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
  }
  
  /**
   * Helper routine to get a special part of the result model.
   */
  public EList<Type> getAllDataTypes() {
    return null;
  }
  
  /**
   * Create an result model for a given ecore model.
   */
  private boolean createModel() {
    boolean _xsynchronizedexpression = false;
    synchronized (this) {
      boolean _xifexpression = false;
      boolean _notEquals = (!Objects.equal(this.repository, null));
      if (_notEquals) {
        boolean _xblockexpression = false;
        {
          String _reference = this.repository.getReference();
          URI _createPlatformResourceURI = URI.createPlatformResourceURI(_reference, true);
          final Resource source = this.resourceSet.getResource(_createPlatformResourceURI, true);
          MappingModel _createMappingModel = this.mappingFactory.createMappingModel();
          this.resultModel = _createMappingModel;
          final List<Interface> pcmInterfaces = this.findAllInterfaceDeclarations(source);
          this.determineComponents(source, pcmInterfaces);
          EList<EObject> _contents = this.getContents();
          _xblockexpression = _contents.add(this.resultModel);
        }
        _xifexpression = _xblockexpression;
      }
      _xsynchronizedexpression = _xifexpression;
    }
    return _xsynchronizedexpression;
  }
  
  /**
   * Collect all interfaces in all repositories in this resource.
   */
  private List<Interface> findAllInterfaceDeclarations(final Resource source) {
    final ArrayList<Interface> result = new ArrayList<Interface>();
    final Iterator<EObject> iterator = source.getAllContents();
    while (iterator.hasNext()) {
      {
        final EObject object = iterator.next();
        if ((object instanceof Repository)) {
          final Repository repository = ((Repository) object);
          EList<Interface> _interfaces__Repository = repository.getInterfaces__Repository();
          for (final Interface element : _interfaces__Repository) {
            result.add(((Interface) element));
          }
        }
      }
    }
    return result;
  }
  
  /**
   * Scan the application model (i.e. in PCM the repository) and determine the container hierarchy.
   * The hierarchy does not differentiate between packages, components or classes as only the
   * hierarchy must be known.
   * 
   * @param source
   */
  private void determineComponents(final Resource source, final List<Interface> pcmInterfaces) {
    final Iterator<EObject> iterator = source.getAllContents();
    while (iterator.hasNext()) {
      {
        final EObject object = iterator.next();
        if ((object instanceof Repository)) {
          final Repository repository = ((Repository) object);
          EList<RepositoryComponent> _components__Repository = repository.getComponents__Repository();
          for (final RepositoryComponent element : _components__Repository) {
            if ((element instanceof ImplementationComponentType)) {
              final ImplementationComponentType pcmComponent = ((ImplementationComponentType) element);
              final Component component = this.mappingFactory.createComponent();
              String _entityName = pcmComponent.getEntityName();
              component.setName(_entityName);
              this.determineInterfaces(component, pcmComponent, pcmInterfaces);
              EList<Component> _components = this.resultModel.getComponents();
              _components.add(component);
            }
          }
        }
      }
    }
  }
  
  /**
   * Find all interfaces used by the type.
   */
  private void determineInterfaces(final Component component, final ImplementationComponentType type, final List<Interface> pcmInterfaces) {
    EList<ProvidedRole> _providedRoles_InterfaceProvidingEntity = type.getProvidedRoles_InterfaceProvidingEntity();
    for (final ProvidedRole entity : _providedRoles_InterfaceProvidingEntity) {
      {
        final org.spp.cocome.behavior.mapping.Interface iface = this.mappingFactory.createInterface();
        String _entityName = entity.getEntityName();
        iface.setName(_entityName);
        iface.setPcmInterface(entity);
        final Function1<Interface, Boolean> _function = (Interface it) -> {
          boolean _and = false;
          String _entityName_1 = it.getEntityName();
          String _name = iface.getName();
          boolean _equals = _entityName_1.equals(_name);
          if (!_equals) {
            _and = false;
          } else {
            _and = (it instanceof OperationInterface);
          }
          return Boolean.valueOf(_and);
        };
        Iterable<Interface> _filter = IterableExtensions.<Interface>filter(pcmInterfaces, _function);
        for (final Interface operationInterface : _filter) {
          this.determineMethods(((OperationInterface) operationInterface), iface);
        }
        EList<org.spp.cocome.behavior.mapping.Interface> _interfaces = component.getInterfaces();
        _interfaces.add(iface);
      }
    }
  }
  
  private void determineMethods(final OperationInterface operationInterface, final org.spp.cocome.behavior.mapping.Interface iface) {
    EList<OperationSignature> _signatures__OperationInterface = operationInterface.getSignatures__OperationInterface();
    for (final OperationSignature signature : _signatures__OperationInterface) {
      {
        final MethodDecl method = this.mappingFactory.createMethodDecl();
        String _entityName = signature.getEntityName();
        method.setName(_entityName);
        method.setPcmMethod(signature);
        EList<Parameter> _parameters__OperationSignature = signature.getParameters__OperationSignature();
        final Consumer<Parameter> _function = (Parameter it) -> {
          EList<org.spp.cocome.behavior.mapping.Parameter> _parameters = method.getParameters();
          this.mapParameter(_parameters, it);
        };
        _parameters__OperationSignature.forEach(_function);
        EList<MethodDecl> _methods = iface.getMethods();
        _methods.add(method);
      }
    }
  }
  
  private void mapParameter(final EList<org.spp.cocome.behavior.mapping.Parameter> parameters, final Parameter parameter) {
    final org.spp.cocome.behavior.mapping.Parameter result = this.mappingFactory.createParameter();
    String _parameterName = parameter.getParameterName();
    result.setName(_parameterName);
    result.setPcmParameter(parameter);
    parameters.add(result);
  }
}
