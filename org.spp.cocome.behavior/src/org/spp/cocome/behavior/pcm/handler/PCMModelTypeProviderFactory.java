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

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.spp.cocome.behavior.behavior.RepositoryReference;

import com.google.inject.Inject;

/**
 * The type provider factory controls the type provider, which is created by this class.
 * 
 * @author Christian Schneider - derived this class from
 *         org.eclipse.xtext.common.types.access.jdt.JdtTypeProviderFactory
 * @author Reiner Jung - commentary and cleanups
 */
public class PCMModelTypeProviderFactory {

	/**
	 * empty constructor.
	 */
	@Inject
	public PCMModelTypeProviderFactory() {}

	/**
	 * Create a new type provider or fetch the already created type provider for the primitive
	 * types.
	 * 
	 * @param resourceSet
	 *            The resource set associated with the type provider
	 * @param repository
	 *            the application model
	 * @return Returns the type provider for primitive types.
	 */
	public IPCMModelTypeProvider getTypeProvider(final ResourceSet resourceSet, final RepositoryReference repository) {
		if (resourceSet != null) {
			final Object o = resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
					.get(PCMModelTypeURIHelper.PROTOCOL);
			if (o != null) {
				if (!(o instanceof IPCMModelTypeProvider)) {
					// TODO something went terribly wrong, to be save create a new type provider
					return this.createTypeProvider(resourceSet, repository);
				} else {
					return (IPCMModelTypeProvider) o;
				}
			} else {
				return this.createTypeProvider(resourceSet, repository);
			}
		} else {
			throw new IllegalArgumentException("Cannot get type provide without a resourceSet.");
		}
	}

	/**
	 * Create a new type provider for primitive types and register it with the resource.
	 * 
	 * @param resourceSet
	 *            The resource set associated with the type provider.
	 * @param repository
	 *            the application model
	 * @return Returns the new type provider.
	 */
	private IPCMModelTypeProvider createTypeProvider(final ResourceSet resourceSet, final RepositoryReference repository) {
		final IPCMModelTypeProvider typeProvider = new PCMModelTypeProvider(resourceSet, repository);
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
				.put(PCMModelTypeURIHelper.PROTOCOL, typeProvider);
		return typeProvider;
	}

}
