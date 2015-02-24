package org.spp.cocome.behavior.generator

import org.spp.cocome.behavior.behavior.BlockStatement
import org.spp.cocome.behavior.behavior.Statement
import org.spp.cocome.behavior.behavior.IfStatement
import org.spp.cocome.behavior.behavior.Assignment
import org.spp.cocome.behavior.behavior.LoopStatement
import static extension org.spp.cocome.behavior.generator.BehaviorExpressionGenerator.*
import static extension org.spp.cocome.behavior.generator.BehaviorTypeGenerator.*
import org.spp.cocome.behavior.behavior.VariableCall
import org.spp.cocome.behavior.behavior.PropertyCall

/**
 * Generator functions for statements.
 */
class BehaviorStatementGenerator {
	
		
	def static CharSequence handleBlockstatement(BlockStatement bStatement){
		bStatement.statements.map[bs | bs.handleStatement].join()
		
	}
	
		def static handleStatement(Statement statement){
		switch(statement){
			 IfStatement : statement.createIfStatement
			 Assignment : statement.createAssignment
			 LoopStatement : statement.createLoopStatement
			 default : throw new Exception("This should not happen (handleStatement)")
	}}
	
	def static createIfStatement(IfStatement ifS)'''
	if («ifS.expr.createExpression»){
		«ifS.ifStatement.handleBlockstatement»
	}
	else {
		«ifS.elseStatement.handleBlockstatement»
	};
	'''
	
	def static createAssignment(Assignment assignm)'''
	«assignm.variable.handleVariableCall» = «assignm.expression.createExpression»;
	'''
	
	def static createLoopStatement(LoopStatement lS)'''
	for («lS.variable.type.createJavaType» «lS.variable.name» : «lS.expression.createExpression») {
		«lS.statement.handleBlockstatement»
	};
	'''
	
	//TODO
	def static handleVariableCall(VariableCall vc)'''
	'''
	
	//TODO
	def static handlePropertyCall(PropertyCall pc)'''
	'''
		
}