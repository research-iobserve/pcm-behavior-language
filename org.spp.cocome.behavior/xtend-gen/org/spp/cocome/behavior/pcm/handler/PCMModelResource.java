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
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.spp.cocome.behavior.behavior.RepositoryReference;
import org.spp.cocome.behavior.mapping.Component;
import org.spp.cocome.behavior.mapping.Interface;
import org.spp.cocome.behavior.mapping.MappingFactory;
import org.spp.cocome.behavior.mapping.MappingModel;
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
    throw new Error("Unresolved compilation problems:"
      + "\nInterface cannot be resolved to a type.");
  }
  
  /**
   * Collect all interfaces in all repositories in this resource.
   */
  private /* List<Interface> */Object findAllInterfaceDeclarations(final Resource source) {
    throw new Error("Unresolved compilation problems:"
      + "\nInterface cannot be resolved to a type."
      + "\nRepository cannot be resolved to a type."
      + "\nRepository cannot be resolved to a type."
      + "\nInterface cannot be resolved to a type."
      + "\ninterfaces__Repository cannot be resolved");
  }
  
  /**
   * Scan the application model (i.e. in PCM the repository) and determine the container hierarchy.
   * The hierarchy does not differentiate between packages, components or classes as only the
   * hierarchy must be known.
   * 
   * @param source
   */
  private void determineComponents(final Resource source, final /* List<Interface> */Object pcmInterfaces) {
    throw new Error("Unresolved compilation problems:"
      + "\nRepository cannot be resolved to a type."
      + "\nRepository cannot be resolved to a type."
      + "\nImplementationComponentType cannot be resolved to a type."
      + "\nImplementationComponentType cannot be resolved to a type."
      + "\ncomponents__Repository cannot be resolved"
      + "\nentityName cannot be resolved");
  }
  
  /**
   * Find all interfaces used by the type.
   */
  private void determineInterfaces(final Component component, final /* ImplementationComponentType */Object type, final /* List<Interface> */Object pcmInterfaces) {
    throw new Error("Unresolved compilation problems:"
      + "\nOperationInterface cannot be resolved to a type."
      + "\nOperationInterface cannot be resolved to a type."
      + "\nThe method or field pcmInterface is undefined for the type PCMModelResource"
      + "\nprovidedRoles_InterfaceProvidingEntity cannot be resolved"
      + "\nentityName cannot be resolved"
      + "\nentityName cannot be resolved"
      + "\nequals cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ndetermineMethods cannot be resolved");
  }
  
  private void determineMethods(final /* OperationInterface */Object operationInterface, final Interface iface) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field pcmMethod is undefined for the type PCMModelResource"
      + "\nsignatures__OperationInterface cannot be resolved"
      + "\nentityName cannot be resolved");
  }
}
