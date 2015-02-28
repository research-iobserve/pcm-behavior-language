package org.spp.cocome.behavior.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.spp.cocome.behavior.behavior.Assignment;
import org.spp.cocome.behavior.behavior.BehaviorModel;
import org.spp.cocome.behavior.behavior.BehaviorPackage;
import org.spp.cocome.behavior.behavior.BinaryOperation;
import org.spp.cocome.behavior.behavior.BlockStatement;
import org.spp.cocome.behavior.behavior.BooleanLiteral;
import org.spp.cocome.behavior.behavior.CharLiteral;
import org.spp.cocome.behavior.behavior.CollectionType;
import org.spp.cocome.behavior.behavior.ComponentImpl;
import org.spp.cocome.behavior.behavior.ConstantDecl;
import org.spp.cocome.behavior.behavior.Expression;
import org.spp.cocome.behavior.behavior.IfStatement;
import org.spp.cocome.behavior.behavior.Import;
import org.spp.cocome.behavior.behavior.InstantiationExpression;
import org.spp.cocome.behavior.behavior.InterfaceRealization;
import org.spp.cocome.behavior.behavior.LoopStatement;
import org.spp.cocome.behavior.behavior.MapType;
import org.spp.cocome.behavior.behavior.MethodImpl;
import org.spp.cocome.behavior.behavior.NumberLiteral;
import org.spp.cocome.behavior.behavior.PropertyCall;
import org.spp.cocome.behavior.behavior.RepositoryReference;
import org.spp.cocome.behavior.behavior.StringLiteral;
import org.spp.cocome.behavior.behavior.TypeReference;
import org.spp.cocome.behavior.behavior.VariableCall;
import org.spp.cocome.behavior.behavior.VariableDecl;
import org.spp.cocome.behavior.services.BehaviorGrammarAccess;

@SuppressWarnings("all")
public class BehaviorSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BehaviorGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BehaviorPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BehaviorPackage.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.BEHAVIOR_MODEL:
				if(context == grammarAccess.getBehaviorModelRule()) {
					sequence_BehaviorModel(context, (BehaviorModel) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.BINARY_OPERATION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()) {
					sequence_Expression(context, (BinaryOperation) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.BLOCK_STATEMENT:
				if(context == grammarAccess.getBlockStatementRule()) {
					sequence_BlockStatement(context, (BlockStatement) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getBooleanLiteralRule() ||
				   context == grammarAccess.getCastedExpressionRule() ||
				   context == grammarAccess.getCastedExpressionAccess().getExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getBinaryOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherExpressionRule() ||
				   context == grammarAccess.getOtherExpressionAccess().getExpressionExpressionAction_1_0_0_0() ||
				   context == grammarAccess.getPostfixOperationRule() ||
				   context == grammarAccess.getPostfixOperationAccess().getExpressionOperandAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.CHAR_LITERAL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCastedExpressionRule() ||
				   context == grammarAccess.getCastedExpressionAccess().getExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getCharLiteralRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getBinaryOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherExpressionRule() ||
				   context == grammarAccess.getOtherExpressionAccess().getExpressionExpressionAction_1_0_0_0() ||
				   context == grammarAccess.getPostfixOperationRule() ||
				   context == grammarAccess.getPostfixOperationAccess().getExpressionOperandAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_CharLiteral(context, (CharLiteral) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.COLLECTION_TYPE:
				if(context == grammarAccess.getCollectionTypeRule() ||
				   context == grammarAccess.getDeclarationTypeReferenceRule()) {
					sequence_CollectionType(context, (CollectionType) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.COMPONENT_IMPL:
				if(context == grammarAccess.getComponentImplRule()) {
					sequence_ComponentImpl(context, (ComponentImpl) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.CONSTANT_DECL:
				if(context == grammarAccess.getConstantDeclRule()) {
					sequence_ConstantDecl(context, (ConstantDecl) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getBinaryOperationLeftAction_1_0_0_0()) {
					sequence_AdditiveExpression_AndExpression_CastedExpression_MultiplicativeExpression_OtherExpression_PostfixOperation_RelationalExpression_UnaryOperation(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getExpressionLeftAction_1_0_0_0()) {
					sequence_AdditiveExpression_CastedExpression_MultiplicativeExpression_OtherExpression_PostfixOperation_RelationalExpression_UnaryOperation(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getOtherExpressionRule()) {
					sequence_AdditiveExpression_CastedExpression_MultiplicativeExpression_OtherExpression_PostfixOperation_UnaryOperation(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherExpressionAccess().getExpressionExpressionAction_1_0_0_0()) {
					sequence_AdditiveExpression_CastedExpression_MultiplicativeExpression_PostfixOperation_UnaryOperation(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getExpressionLeftAction_1_0_0_0()) {
					sequence_CastedExpression_MultiplicativeExpression_PostfixOperation_UnaryOperation(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getCastedExpressionRule() ||
				   context == grammarAccess.getCastedExpressionAccess().getExpressionTargetAction_1_0_0_0()) {
					sequence_CastedExpression_PostfixOperation(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getUnaryOperationRule()) {
					sequence_CastedExpression_PostfixOperation_UnaryOperation(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPostfixOperationRule()) {
					sequence_PostfixOperation(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.IF_STATEMENT:
				if(context == grammarAccess.getIfStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_IfStatement(context, (IfStatement) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.INSTANTIATION_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCastedExpressionRule() ||
				   context == grammarAccess.getCastedExpressionAccess().getExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getBinaryOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getInstantiationExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherExpressionRule() ||
				   context == grammarAccess.getOtherExpressionAccess().getExpressionExpressionAction_1_0_0_0() ||
				   context == grammarAccess.getPostfixOperationRule() ||
				   context == grammarAccess.getPostfixOperationAccess().getExpressionOperandAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_InstantiationExpression(context, (InstantiationExpression) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.INTERFACE_REALIZATION:
				if(context == grammarAccess.getInterfaceRealizationRule()) {
					sequence_InterfaceRealization(context, (InterfaceRealization) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.LOOP_STATEMENT:
				if(context == grammarAccess.getLoopStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_LoopStatement(context, (LoopStatement) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.MAP_TYPE:
				if(context == grammarAccess.getDeclarationTypeReferenceRule() ||
				   context == grammarAccess.getMapTypeRule()) {
					sequence_MapType(context, (MapType) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.METHOD_IMPL:
				if(context == grammarAccess.getMethodImplRule()) {
					sequence_MethodImpl(context, (MethodImpl) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.NUMBER_LITERAL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCastedExpressionRule() ||
				   context == grammarAccess.getCastedExpressionAccess().getExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getBinaryOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberLiteralRule() ||
				   context == grammarAccess.getOtherExpressionRule() ||
				   context == grammarAccess.getOtherExpressionAccess().getExpressionExpressionAction_1_0_0_0() ||
				   context == grammarAccess.getPostfixOperationRule() ||
				   context == grammarAccess.getPostfixOperationAccess().getExpressionOperandAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_NumberLiteral(context, (NumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.PROPERTY_CALL:
				if(context == grammarAccess.getPropertyCallRule()) {
					sequence_PropertyCall(context, (PropertyCall) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.REPOSITORY_REFERENCE:
				if(context == grammarAccess.getRepositoryReferenceRule()) {
					sequence_RepositoryReference(context, (RepositoryReference) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.STRING_LITERAL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCastedExpressionRule() ||
				   context == grammarAccess.getCastedExpressionAccess().getExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getBinaryOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherExpressionRule() ||
				   context == grammarAccess.getOtherExpressionAccess().getExpressionExpressionAction_1_0_0_0() ||
				   context == grammarAccess.getPostfixOperationRule() ||
				   context == grammarAccess.getPostfixOperationAccess().getExpressionOperandAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getStringLiteralRule() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.TYPE_REFERENCE:
				if(context == grammarAccess.getDeclarationTypeReferenceRule() ||
				   context == grammarAccess.getTypeReferenceRule()) {
					sequence_TypeReference(context, (TypeReference) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.VARIABLE_CALL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCastedExpressionRule() ||
				   context == grammarAccess.getCastedExpressionAccess().getExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getBinaryOperationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOtherExpressionRule() ||
				   context == grammarAccess.getOtherExpressionAccess().getExpressionExpressionAction_1_0_0_0() ||
				   context == grammarAccess.getPostfixOperationRule() ||
				   context == grammarAccess.getPostfixOperationAccess().getExpressionOperandAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule() ||
				   context == grammarAccess.getVariableCallRule()) {
					sequence_VariableCall(context, (VariableCall) semanticObject); 
					return; 
				}
				else break;
			case BehaviorPackage.VARIABLE_DECL:
				if(context == grammarAccess.getVariableDeclRule()) {
					sequence_VariableDecl(context, (VariableDecl) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (feature='!' operand=UnaryOperation) | 
	 *         (target=CastedExpression_Expression_1_0_0_0 feature='as' type=TypeReference) | 
	 *         (operand=PostfixOperation_Expression_1_0_0 (feature='++' | feature='--')) | 
	 *         (left=MultiplicativeExpression_Expression_1_0_0_0 (feature='*' | feature='/' | feature='%' | feature='**') right=UnaryOperation) | 
	 *         (left=AdditiveExpression_Expression_1_0_0_0 (feature='+' | feature='-') right=MultiplicativeExpression) | 
	 *         (expression=OtherExpression_Expression_1_0_0_0 feature='instanceof' type=TypeReference) | 
	 *         (
	 *             left=RelationalExpression_Expression_1_0_0_0 
	 *             (
	 *                 feature='==' | 
	 *                 feature='!=' | 
	 *                 feature='>' | 
	 *                 feature='<' | 
	 *                 feature='>=' | 
	 *                 feature='<='
	 *             ) 
	 *             right=OtherExpression
	 *         ) | 
	 *         (left=AndExpression_Expression_1_0_0_0 feature='&&' right=RelationalExpression)
	 *     )
	 */
	protected void sequence_AdditiveExpression_AndExpression_CastedExpression_MultiplicativeExpression_OtherExpression_PostfixOperation_RelationalExpression_UnaryOperation(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (feature='!' operand=UnaryOperation) | 
	 *         (target=CastedExpression_Expression_1_0_0_0 feature='as' type=TypeReference) | 
	 *         (operand=PostfixOperation_Expression_1_0_0 (feature='++' | feature='--')) | 
	 *         (left=MultiplicativeExpression_Expression_1_0_0_0 (feature='*' | feature='/' | feature='%' | feature='**') right=UnaryOperation) | 
	 *         (left=AdditiveExpression_Expression_1_0_0_0 (feature='+' | feature='-') right=MultiplicativeExpression) | 
	 *         (expression=OtherExpression_Expression_1_0_0_0 feature='instanceof' type=TypeReference) | 
	 *         (
	 *             left=RelationalExpression_Expression_1_0_0_0 
	 *             (
	 *                 feature='==' | 
	 *                 feature='!=' | 
	 *                 feature='>' | 
	 *                 feature='<' | 
	 *                 feature='>=' | 
	 *                 feature='<='
	 *             ) 
	 *             right=OtherExpression
	 *         )
	 *     )
	 */
	protected void sequence_AdditiveExpression_CastedExpression_MultiplicativeExpression_OtherExpression_PostfixOperation_RelationalExpression_UnaryOperation(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (feature='!' operand=UnaryOperation) | 
	 *         (target=CastedExpression_Expression_1_0_0_0 feature='as' type=TypeReference) | 
	 *         (operand=PostfixOperation_Expression_1_0_0 (feature='++' | feature='--')) | 
	 *         (left=MultiplicativeExpression_Expression_1_0_0_0 (feature='*' | feature='/' | feature='%' | feature='**') right=UnaryOperation) | 
	 *         (left=AdditiveExpression_Expression_1_0_0_0 (feature='+' | feature='-') right=MultiplicativeExpression) | 
	 *         (expression=OtherExpression_Expression_1_0_0_0 feature='instanceof' type=TypeReference)
	 *     )
	 */
	protected void sequence_AdditiveExpression_CastedExpression_MultiplicativeExpression_OtherExpression_PostfixOperation_UnaryOperation(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (feature='!' operand=UnaryOperation) | 
	 *         (target=CastedExpression_Expression_1_0_0_0 feature='as' type=TypeReference) | 
	 *         (operand=PostfixOperation_Expression_1_0_0 (feature='++' | feature='--')) | 
	 *         (left=MultiplicativeExpression_Expression_1_0_0_0 (feature='*' | feature='/' | feature='%' | feature='**') right=UnaryOperation) | 
	 *         (left=AdditiveExpression_Expression_1_0_0_0 (feature='+' | feature='-') right=MultiplicativeExpression)
	 *     )
	 */
	protected void sequence_AdditiveExpression_CastedExpression_MultiplicativeExpression_PostfixOperation_UnaryOperation(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=VariableCall expression=Expression)
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BehaviorPackage.Literals.ASSIGNMENT__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviorPackage.Literals.ASSIGNMENT__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, BehaviorPackage.Literals.ASSIGNMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviorPackage.Literals.ASSIGNMENT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentAccess().getVariableVariableCallParserRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName (imports+=Import | repositories+=RepositoryReference)* componentImpl=ComponentImpl)
	 */
	protected void sequence_BehaviorModel(EObject context, BehaviorModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=Statement*)
	 */
	protected void sequence_BlockStatement(EObject context, BlockStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOLEAN
	 */
	protected void sequence_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (feature='!' operand=UnaryOperation) | 
	 *         (target=CastedExpression_Expression_1_0_0_0 feature='as' type=TypeReference) | 
	 *         (operand=PostfixOperation_Expression_1_0_0 (feature='++' | feature='--')) | 
	 *         (left=MultiplicativeExpression_Expression_1_0_0_0 (feature='*' | feature='/' | feature='%' | feature='**') right=UnaryOperation)
	 *     )
	 */
	protected void sequence_CastedExpression_MultiplicativeExpression_PostfixOperation_UnaryOperation(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (target=CastedExpression_Expression_1_0_0_0 feature='as' type=TypeReference) | 
	 *         (operand=PostfixOperation_Expression_1_0_0 (feature='++' | feature='--'))
	 *     )
	 */
	protected void sequence_CastedExpression_PostfixOperation(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (feature='!' operand=UnaryOperation) | 
	 *         (target=CastedExpression_Expression_1_0_0_0 feature='as' type=TypeReference) | 
	 *         (operand=PostfixOperation_Expression_1_0_0 (feature='++' | feature='--'))
	 *     )
	 */
	protected void sequence_CastedExpression_PostfixOperation_UnaryOperation(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=CHARACTER
	 */
	protected void sequence_CharLiteral(EObject context, CharLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reference=TypeReference size=INT?)
	 */
	protected void sequence_CollectionType(EObject context, CollectionType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         kind=ComponentKind? 
	 *         refComponent=[Component|QualifiedName] 
	 *         (localDeclarations+=VariableDecl | localDeclarations+=ConstantDecl)* 
	 *         interfaces+=InterfaceRealization*
	 *     )
	 */
	protected void sequence_ComponentImpl(EObject context, ComponentImpl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=Expression)
	 */
	protected void sequence_ConstantDecl(EObject context, ConstantDecl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BehaviorPackage.Literals.CONSTANT_DECL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviorPackage.Literals.CONSTANT_DECL__NAME));
			if(transientValues.isValueTransient(semanticObject, BehaviorPackage.Literals.CONSTANT_DECL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviorPackage.Literals.CONSTANT_DECL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantDeclAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstantDeclAccess().getValueExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_BinaryOperation_1_0_0_0 feature='||' right=AndExpression)
	 */
	protected void sequence_Expression(EObject context, BinaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expression ifStatement=BlockStatement elseStatement=BlockStatement?)
	 */
	protected void sequence_IfStatement(EObject context, IfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BehaviorPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviorPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeReference parameters+=Expression)
	 */
	protected void sequence_InstantiationExpression(EObject context, InstantiationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refInterface=[Interface|QualifiedName] methods+=MethodImpl*)
	 */
	protected void sequence_InterfaceRealization(EObject context, InterfaceRealization semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=VariableDecl expression=Expression statement=BlockStatement)
	 */
	protected void sequence_LoopStatement(EObject context, LoopStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BehaviorPackage.Literals.LOOP_STATEMENT__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviorPackage.Literals.LOOP_STATEMENT__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, BehaviorPackage.Literals.LOOP_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviorPackage.Literals.LOOP_STATEMENT__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, BehaviorPackage.Literals.LOOP_STATEMENT__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviorPackage.Literals.LOOP_STATEMENT__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLoopStatementAccess().getVariableVariableDeclParserRuleCall_2_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getLoopStatementAccess().getExpressionExpressionParserRuleCall_4_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getLoopStatementAccess().getStatementBlockStatementParserRuleCall_6_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (reference=TypeReference keyType=TypeReference)
	 */
	protected void sequence_MapType(EObject context, MapType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BehaviorPackage.Literals.MAP_TYPE__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviorPackage.Literals.MAP_TYPE__REFERENCE));
			if(transientValues.isValueTransient(semanticObject, BehaviorPackage.Literals.MAP_TYPE__KEY_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviorPackage.Literals.MAP_TYPE__KEY_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMapTypeAccess().getReferenceTypeReferenceParserRuleCall_0_0(), semanticObject.getReference());
		feeder.accept(grammarAccess.getMapTypeAccess().getKeyTypeTypeReferenceParserRuleCall_2_0_0(), semanticObject.getKeyType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (refMethod=[MethodDecl|QualifiedName] body=BlockStatement)
	 */
	protected void sequence_MethodImpl(EObject context, MethodImpl semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BehaviorPackage.Literals.METHOD_IMPL__REF_METHOD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviorPackage.Literals.METHOD_IMPL__REF_METHOD));
			if(transientValues.isValueTransient(semanticObject, BehaviorPackage.Literals.METHOD_IMPL__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviorPackage.Literals.METHOD_IMPL__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMethodImplAccess().getRefMethodMethodDeclQualifiedNameParserRuleCall_1_0_1(), semanticObject.getRefMethod());
		feeder.accept(grammarAccess.getMethodImplAccess().getBodyBlockStatementParserRuleCall_2_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=NUMBER
	 */
	protected void sequence_NumberLiteral(EObject context, NumberLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operand=PostfixOperation_Expression_1_0_0 (feature='++' | feature='--'))
	 */
	protected void sequence_PostfixOperation(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property=[Property|ID] index=Expression? subProperty=PropertyCall?)
	 */
	protected void sequence_PropertyCall(EObject context, PropertyCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     reference=STRING
	 */
	protected void sequence_RepositoryReference(EObject context, RepositoryReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BehaviorPackage.Literals.REPOSITORY_REFERENCE__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviorPackage.Literals.REPOSITORY_REFERENCE__REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRepositoryReferenceAccess().getReferenceSTRINGTerminalRuleCall_1_0(), semanticObject.getReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     reference=[NamedType|ID]
	 */
	protected void sequence_TypeReference(EObject context, TypeReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BehaviorPackage.Literals.TYPE_REFERENCE__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BehaviorPackage.Literals.TYPE_REFERENCE__REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeIDTerminalRuleCall_0_1(), semanticObject.getReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variable=[VariableDecl|ID] index=Expression? subProperty=PropertyCall?)
	 */
	protected void sequence_VariableCall(EObject context, VariableCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((modifier='var' | modifier='val') type=DeclarationTypeReference name=ID)
	 */
	protected void sequence_VariableDecl(EObject context, VariableDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
