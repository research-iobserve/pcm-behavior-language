/***************************************************************************
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
 ***************************************************************************/
package org.spp.cocome.behavior.pcm.handler

import java.io.IOException
import java.io.InputStream
import java.util.Iterator
import java.util.List
import java.util.Map

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceImpl

import org.spp.cocome.behavior.mapping.MappingFactory
import org.spp.cocome.behavior.behavior.RepositoryReference
import org.spp.cocome.behavior.mapping.NamedElement
import org.spp.cocome.types.types.Type
import org.spp.cocome.behavior.mapping.MappingModel
import de.uka.ipd.sdq.pcm.repository.Repository
import de.uka.ipd.sdq.pcm.repository.ImplementationComponentType
import org.spp.cocome.behavior.mapping.Component
import de.uka.ipd.sdq.pcm.repository.Interface
import java.util.ArrayList
import de.uka.ipd.sdq.pcm.repository.OperationInterface

/**
 * Simulates a real resource by mapping the a PCM model to our hierarchy model.
 * 
 * @author Reiner Jung - initial contribution
 */
public class PCMModelResource extends ResourceImpl {

	/** hierarchy mapping model factory. */
	private final MappingFactory mappingFactory = MappingFactory.eINSTANCE
	/** Model of the application to be instrumented. */
	private final RepositoryReference repository
	
	private MappingModel resultModel
	
	/**
	 * Integrate a foreign model.
	 * 
	 * @param uri of the foreign model
	 * @param applicationModel the application model
	 */
	public new(URI uri, RepositoryReference repository) {
		super(uri)
		this.repository = repository
	}

	/**
	 * Return an EObject with the name specified by the uriFragment.
	 * 
	 * @param uriFragment
	 * 
	 * @return the EObject identified by the uriFragment or null if no such object exists. 
	 */
	override EObject getEObject(String uriFragment) {
		System.out.println("this.getContents " + this.getContents())
		if (!this.getContents().empty) {
			System.out.println("this.getContents get element " + this.getContents().get(0))
			val EObject object = null // (this.getContents()?.get(0) as Model).contents?.findFirst[uriFragment.equals(this.getURIFragment(it))]
			if (object != null)
				return object
			else
				return super.getEObject(uriFragment)
		} else
			return super.getEObject(uriFragment)
	}

	/**
	 * Compute the uriFragment for a given EObject.
	 * 
	 * @param eObject the object the fragment is computed for.
	 * 
	 * @return returns the uriFragment for the given object.
	 */
	override String getURIFragment(EObject eObject) {
		if (eObject instanceof NamedElement) {
			return (eObject as NamedElement).name
		} else {
			return super.getURIFragment(eObject)
		}
	}

	/**
	 * load the resource iff it is not already loaded.
	 */
	override void load(Map<?, ?> options) throws IOException {
		if (!this.isLoaded) {
			this.doLoad(null, null)
		}
	}

	/**
	 * Saving this resource is not allowed, as it is a virtual resource.
	 */
	override void save(Map<?, ?> options) throws IOException {
		throw new UnsupportedOperationException()
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
	override void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		if (this.getURI() != null) {
			this.createModel()
		} else {
			try {
				throw new IOException("URI not set on ForeignModelResource.onLoad");
			} catch (IOException e) {
				e.printStackTrace()
			}
		}
	}
	
	/**
	 * Helper routine to get a special part of the result model.
	 */
	def EList<Type> getAllDataTypes() {
		return null
	}

	/**
	 * Create an result model for a given ecore model.
	 */
	private def createModel() {
		synchronized(this) {
			if (this.repository != null) {
				
				// Get the resource
				val Resource source = resourceSet.getResource(URI::createPlatformResourceURI(this.repository.reference, true), true)
	
				// create main result model
				this.resultModel = this.mappingFactory.createMappingModel
				val List<Interface> pcmInterfaces = findAllInterfaceDeclarations(source)
				determineComponents(source, pcmInterfaces)
				// contents must be called via its getter otherwise xtend will used the variable which may
				// result in an null pointer result
				this.getContents().add(this.resultModel)
			}
		}
	}
	
	/**
	 * Collect all interfaces in all repositories in this resource.
	 */
	private def List<Interface> findAllInterfaceDeclarations(Resource source) {
		val result = new ArrayList<Interface>()
		val Iterator<EObject> iterator = source.getAllContents()
		while (iterator.hasNext()) {
			val EObject object = iterator.next()
			if (object instanceof Repository) {
				val repository = object as Repository
				for (element : repository.interfaces__Repository) {
					result.add(element as Interface)
				}
			}
		}
		
		return result
	}

	/**
	 * Scan the application model (i.e. in PCM the repository) and determine the container hierarchy.
	 * The hierarchy does not differentiate between packages, components or classes as only the
	 * hierarchy must be known.
	 * 
	 * @param source
	 */
	private def determineComponents(Resource source, List<Interface> pcmInterfaces) {
		val Iterator<EObject> iterator = source.getAllContents()
		while (iterator.hasNext()) {
			val EObject object = iterator.next()
			if (object instanceof Repository) {
				val repository = object as Repository
				for (element : repository.components__Repository) {
					if (element instanceof ImplementationComponentType) {
						val pcmComponent = element as ImplementationComponentType
						val component = this.mappingFactory.createComponent()
						component.name = pcmComponent.entityName
						component.determineInterfaces(pcmComponent, pcmInterfaces)
						resultModel.components.add(component)
					}
				} 				
			}
		}
	}
	
	/**
	 * Find all interfaces used by the type.
	 */
	private def void determineInterfaces(Component component, ImplementationComponentType type, List<Interface> pcmInterfaces) {
		for (entity : type.providedRoles_InterfaceProvidingEntity) {
			val iface = this.mappingFactory.createInterface()
			iface.name = entity.entityName
			iface.pcmInterface = entity
			
			for (operationInterface : pcmInterfaces.filter[it.entityName.equals(iface.name) && it instanceof OperationInterface]) {
				(operationInterface as OperationInterface).determineMethods(iface)
			}
			
			component.interfaces.add(iface)
		}
	}
	
	private def void determineMethods(OperationInterface operationInterface, org.spp.cocome.behavior.mapping.Interface iface) {
		for (signature : operationInterface.signatures__OperationInterface) {
			val method = this.mappingFactory.createMethodDecl
			method.name = signature.entityName
			method.pcmMethod = signature
			iface.methods.add(method)
		}
	}

	

}
