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
package org.spp.cocome.behavior.pcm.handler;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.util.Strings;
import org.spp.cocome.behavior.behavior.RepositoryReference;
import org.spp.cocome.behavior.mapping.NamedElement;
import org.spp.cocome.types.types.Type;

/**
 * The type provider allows to retrieve a list of all primitive types and provides type name lookup.
 * 
 * @author Christian Schneider - Initial contribution
 * @author Reiner Jung - Cleanup and commentary
 * 
 */
public class PCMModelTypeProvider implements Resource.Factory, IPCMModelTypeProvider {

	private final PCMModelTypeURIHelper typeUriHelper;

	private final ResourceSet resourceSet;

	private final RepositoryReference repository;

	/**
	 * Construct the type provider.
	 * 
	 * @param resourceSet
	 *            context resource set
	 * @param model
	 *            the application model
	 */
	public PCMModelTypeProvider(final ResourceSet resourceSet, final RepositoryReference repository) {
		this.resourceSet = resourceSet;
		this.typeUriHelper = new PCMModelTypeURIHelper();
		this.repository = repository;
	}

	/**
	 * Provides a list of all primitive types.
	 * 
	 * @return Returns an iterable with all primitive types.
	 */
	// @Override
	public Iterable<NamedElement> getAllTypes() {
		/*
		 * Get the (already created) types from the helper resource and cast the list to a list of
		 * types.
		 */
		final Resource resource = this.resourceSet.getResource(
				URI.createURI(PCMModelTypeURIHelper.PROTOCOL + ":" + PCMModelTypeURIHelper.ELEMENTS), true);
		final Collection<NamedElement> result = new ArrayList<NamedElement>();
		for (final EObject container : resource.getContents()) {
			if (container instanceof NamedElement) {
				result.add((NamedElement) container);
			}
		}
		return result;
	}

	/**
	 * Find the type for a given name and return it.
	 * 
	 * @param name
	 *            The name of the type.
	 * @return Returns the primitive type for a given type name, or null.
	 */
	// @Override
	public NamedElement findTypeByName(final String name) {
		if (Strings.isEmpty(name)) {
			throw new IllegalArgumentException("Internal error: Empty type name.");
		}
		final URI resourceURI = this.typeUriHelper.createResourceURI();
		final PCMModelResource resource = (PCMModelResource) this.resourceSet.getResource(resourceURI, true);

		return (NamedElement) resource.getEObject(name);
	}

	/**
	 * Create a type resource for a given URI and assign a PrimitiveMirror to it.
	 * 
	 * @param uri
	 *            The URI for the resource
	 */
	public PCMModelResource createResource(final URI uri) {
		return new PCMModelResource(uri, this.repository);
	}

	/**
	 * @returns Returns the URI helper for the type system.
	 */
	public PCMModelTypeURIHelper getTypeUriHelper() {
		return this.typeUriHelper;
	}

	public Iterable<Type> getAllDataTyes() {
		final Resource resource = this.resourceSet.getResource(
				URI.createURI(PCMModelTypeURIHelper.PROTOCOL + ":" + PCMModelTypeURIHelper.ELEMENTS), true);
		return ((PCMModelResource) resource).getAllDataTypes();
	}

}
