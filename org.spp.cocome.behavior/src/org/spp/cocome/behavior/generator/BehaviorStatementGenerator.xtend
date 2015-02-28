package org.spp.cocome.behavior.generator

import org.spp.cocome.behavior.behavior.BlockStatement
import org.spp.cocome.behavior.behavior.Statement
import org.spp.cocome.behavior.behavior.IfStatement
import org.spp.cocome.behavior.behavior.Assignment
import org.spp.cocome.behavior.behavior.LoopStatement
import static extension org.spp.cocome.behavior.generator.BehaviorExpressionGenerator.*
import static extension org.spp.cocome.behavior.generator.BehaviorTypeGenerator.*
import org.spp.cocome.behavior.behavior.DataAccessOperation
import org.spp.cocome.behavior.behavior.DataAccessStatement

/**
 * Generator functions for statements.
 */
class BehaviorStatementGenerator {
	
		
	def static CharSequence handleBlockstatement(BlockStatement bStatement){
		bStatement.statements.map[bs | bs.handleStatement].join()
		
	}
	
	def static handleStatement(Statement statement) {
		switch(statement) {
			 IfStatement : statement.createIfStatement
			 Assignment : statement.createAssignment
			 LoopStatement : statement.createLoopStatement
			 DataAccessStatement: statement.createDataAccessStatement
			 default : throw new Exception("This should not happen (handleStatement)")
	}}
	
	def static createIfStatement(IfStatement statement) '''
		if («statement.expr.createExpression») {
			«statement.ifStatement.handleBlockstatement»
		} else {
			«statement.elseStatement.handleBlockstatement»
		}
	'''
	
	def static createDataAccessStatement(DataAccessStatement statement) '''
		em.«statement.operation.createDBAOperation»(«statement.variable»);
	'''
	
	def static createDBAOperation(DataAccessOperation operation) {
		switch(operation) {
			case STORE: 'persist'
			case UPDATE: 'merge'
			case DELETE: 'remove'
		}
	}
	
	def static createAssignment(Assignment statement)'''
		«statement.variable.createExpression» = «statement.expression.createExpression»;
	'''
	
	def static createLoopStatement(LoopStatement statement) '''
		for («statement.variable.type.createJavaTypeReference» «statement.variable.name» : «statement.expression.createExpression») {
			«statement.statement.handleBlockstatement»
		}
	'''
		
}