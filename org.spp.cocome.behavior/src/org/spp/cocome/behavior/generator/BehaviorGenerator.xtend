/*
 * generated by Xtext
 */
package org.spp.cocome.behavior.generator

import java.io.File
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.spp.cocome.behavior.behavior.ComponentImpl

import static extension org.spp.cocome.behavior.generator.BehaviorStructureGenerator.*
import static extension org.spp.cocome.behavior.generator.BehaviorNameResolver.*
import org.spp.cocome.behavior.behavior.BehaviorModel

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class BehaviorGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.filter(ComponentImpl).forEach[component | 
			fsa.generateFile(component.createFileName,component.createComponent)
		]
	}
		
	private def createFileName(ComponentImpl com) {
		(com.eContainer as BehaviorModel).name.replace('.',File::separator) + 
		File::separator + com.createComponentName + '.frag'
	}
	
		
	private def createComponentName (ComponentImpl component) {
		component.refComponent.name.className
	}
	
}

// 	« »

