package org.spp.cocome.behavior.generator

import org.spp.cocome.behavior.behavior.TypeReference
import org.spp.cocome.types.types.PrimitiveType
import org.spp.cocome.behavior.behavior.CollectionType
import org.spp.cocome.behavior.behavior.MapType
import org.spp.cocome.behavior.behavior.DeclarationTypeReference

class BehaviorTypeGenerator {
	
	
	dispatch def static CharSequence createJavaTypeReference(TypeReference reference) {
		switch (reference.reference) {
			PrimitiveType case reference.reference.name.equals("string") : 'String'
			PrimitiveType case reference.reference.name.equals("currency") : 'double'
			PrimitiveType case reference.reference.name.equals("date") : 'Date'
			PrimitiveType : reference.reference.name
			default : reference.reference.name
		}
	}
	
	dispatch def static CharSequence createJavaTypeReference(CollectionType reference) {
		if (reference.size != 0) '''
			«reference.reference.createJavaTypeReference»[«reference.size»]'''
		else '''
			List<«reference.reference.createJavaTypeReference»>'''
	}
	
	dispatch def static CharSequence createJavaTypeReference(MapType reference) {
		// TODO
		throw new UnsupportedOperationException("Map type is not implemented")
	}
	
	dispatch def static CharSequence createJavaTypeReference(DeclarationTypeReference reference) {
		throw new UnsupportedOperationException("Implementation error. Type reference type " + reference.class + " not supported.")
	}
}