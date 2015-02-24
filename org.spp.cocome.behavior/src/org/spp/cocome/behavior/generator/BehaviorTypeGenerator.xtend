package org.spp.cocome.behavior.generator

import org.spp.cocome.behavior.behavior.Literal
import org.spp.cocome.types.types.PropertyReference
import org.spp.cocome.behavior.behavior.StringLiteral
import org.spp.cocome.behavior.behavior.CharLiteral
import org.spp.cocome.behavior.behavior.NumberLiteral
import org.spp.cocome.behavior.behavior.BooleanLiteral
import org.spp.cocome.behavior.behavior.TypeReference
import org.spp.cocome.types.types.PrimitiveType
import org.spp.cocome.behavior.behavior.CollectionType
import org.spp.cocome.behavior.behavior.MapType

class BehaviorTypeGenerator {
	def static createLiteral(Literal literal) {
		switch (literal) {
			PropertyReference : return '''null''' // this should be illegal
			StringLiteral : return literal.value
			CharLiteral : return "'" + literal.value + "'" 
			NumberLiteral : return literal.value
			BooleanLiteral : return if (literal.value) 'true' else 'false'
		}
	}
	
	dispatch def static CharSequence createJavaType(TypeReference reference) {
		switch (reference.reference) {
			PrimitiveType case reference.reference.name.equals("string") : 'String'
			PrimitiveType case reference.reference.name.equals("currency") : 'double'
			PrimitiveType case reference.reference.name.equals("date") : 'Date'
			PrimitiveType : reference.reference.name
			default : reference.reference.name
		}
	}
	
	dispatch def static CharSequence createJavaType(CollectionType reference) {
		if (reference.size != 0) '''
			«reference.reference.createJavaType»[«reference.size»]'''
		else '''
			List<«reference.reference.createJavaType»>'''
	}
	
	dispatch def static CharSequence createJavaType(MapType reference){
		//TODO
	}
}