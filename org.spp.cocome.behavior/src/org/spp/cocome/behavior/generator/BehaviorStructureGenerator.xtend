package org.spp.cocome.behavior.generator

import org.spp.cocome.behavior.behavior.ComponentImpl
import org.spp.cocome.behavior.behavior.ConstantDecl
import org.spp.cocome.behavior.behavior.InterfaceRealization
import org.spp.cocome.behavior.behavior.MethodImpl
import org.spp.cocome.behavior.behavior.VariableDecl
import org.eclipse.emf.ecore.EObject

import static extension org.spp.cocome.behavior.generator.BehaviorExpressionGenerator.*
import static extension org.spp.cocome.behavior.generator.BehaviorStatementGenerator.*
import static extension org.spp.cocome.behavior.generator.BehaviorTypeGenerator.*
import static extension org.spp.cocome.behavior.generator.BehaviorNameResolver.*


class BehaviorStructureGenerator {

	/**
	 * Hauptprozedur
	 */
	def static CharSequence createComponent(ComponentImpl com) '''
		::ANNOTATIONS::
		«IF com.kind != null»@«com.kind.literal.toFirstUpper»«ENDIF»
		::ANNOTATIONS END::
		::VARIABLES::
		«com.localDeclarations.map[decl | decl.createDeclaration].join()»
		::VARIABLES END::
		«com.interfaces.map[iface | iface.createInterface].join()»		
	'''
	
	/**
	 * Iterate over interfaces.
	 */
	def static createInterface(InterfaceRealization iface) '''
		::METHODS FOR::«iface.refInterface.name»
		«iface.methods.map[m | m.createMethod].join()»
		::METHODS END::
	'''
	
	/**
	 * Create snipped code for one method
	 */
	// TODO are all Methods void with no parameters?
	def static createMethod(MethodImpl impl) '''
		::METHOD::«impl.refMethod.name.methodName»
		«impl.body.handleBlockstatement»
		::METHOD_END::
	'''
	
	/**
	 * Create declarations for variables and constants.
	 */
	def static createDeclaration(EObject object) {
		switch(object) {
			VariableDecl: object.createVariableDeclaration
			ConstantDecl: object.createConstantDeclaration
			default: throw new Exception()
		}
	}
	
	/**
	 * Constant declaration.
	 */
	def static createConstantDeclaration(ConstantDecl declaration) '''
		public static final «declaration.name» = «declaration.value.createExpression»;	
	'''
	
	/**
	 * Variable declaration.
	 */
	def static createVariableDeclaration(VariableDecl declaration) '''
		public «if(declaration.modifier=='val') '''static''' else{}» «declaration.type.createJavaTypeReference» «declaration.name»;	
	'''
	
}