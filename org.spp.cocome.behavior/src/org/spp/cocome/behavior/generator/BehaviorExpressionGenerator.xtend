package org.spp.cocome.behavior.generator

import org.spp.cocome.behavior.behavior.Expression
import org.spp.cocome.behavior.behavior.VariableCall
import org.spp.cocome.behavior.behavior.PropertyCall
import org.spp.cocome.behavior.behavior.InstantiationExpression

import static extension org.spp.cocome.behavior.generator.BehaviorTypeGenerator.*
import org.spp.cocome.behavior.behavior.Literal
import org.spp.cocome.behavior.behavior.StringLiteral
import org.spp.cocome.behavior.behavior.CharLiteral
import org.spp.cocome.behavior.behavior.NumberLiteral
import org.spp.cocome.behavior.behavior.BooleanLiteral
import org.spp.cocome.behavior.behavior.DataQuery

/**
 * Generates output for expressions. 
 */
class BehaviorExpressionGenerator {
	
	
	def dispatch static CharSequence createExpression(DataQuery expression) '''
		em.createQuery("«expression.query»", 
			«expression.type.createJavaTypeReference»).
			getResultList()
	'''
	
	def dispatch static CharSequence createExpression(InstantiationExpression expression) '''
		new «expression.type.createJavaTypeReference»(«expression.parameters.
			map[parameter | parameter.createExpression].join(', ')»)
	'''
	
	def dispatch static CharSequence createExpression(VariableCall expression) '''
		«expression.variable.name»«IF expression.index != null»[«expression.index.createExpression»]«ENDIF»«IF expression.subProperty != null»«expression.subProperty.createProperty»«ENDIF»
	'''
	
	def static CharSequence createProperty(PropertyCall property) '''
		.«property.property.name»«IF property.index != null»[«property.index.createExpression»]«ENDIF»«IF property.subProperty != null»«property.subProperty.createProperty»«ENDIF»
	'''

	def dispatch static CharSequence createExpression(StringLiteral expression) '''"«expression.value»"'''
	
	def dispatch static CharSequence createExpression(CharLiteral expression) '''
		'«expression.value»'
	'''
	
	def dispatch static CharSequence createExpression(NumberLiteral expression) '''«expression.value»'''
	
	def dispatch static CharSequence createExpression(BooleanLiteral expression) '''«if (expression.value) 'true' else 'false'»'''
	
	def dispatch static CharSequence createExpression(Literal expression) {
		throw new UnsupportedOperationException("Literal type " + expression.class + " not supported.")
	}
	
	def dispatch static CharSequence createExpression(Expression expression) {
		switch (expression.feature) {
			case '&&',
			case '||',
			case '>',
			case '<',
			case '>=',
			case '<=',
			case '==',
			case '!=',
			case '+',
			case '-',
			case '*',
			case '%',
			case '/': '''(«expression.left.createExpression» «expression.feature» «expression.right.createExpression»)'''
			case '!': '''(!(«expression.operand.createExpression»))'''
			case '++': '''«(expression.operand.createExpression)»++'''
			case '--': '''«(expression.operand.createExpression)»--'''
			case 'instanceof': '''«expression.expression» instanceof «expression.type.createJavaTypeReference»'''
			case 'as': '''((«expression.type.createJavaTypeReference»)«expression.target»)'''
		}
	}
		
}