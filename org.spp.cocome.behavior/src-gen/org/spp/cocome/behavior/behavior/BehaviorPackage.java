/**
 */
package org.spp.cocome.behavior.behavior;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.spp.cocome.behavior.behavior.BehaviorFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviorPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "behavior";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.spp.org/cocome/behavior/Behavior";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "behavior";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BehaviorPackage eINSTANCE = org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl.init();

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.BehaviorModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorModelImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getBehaviorModel()
   * @generated
   */
  int BEHAVIOR_MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_MODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_MODEL__REPOSITORIES = 2;

  /**
   * The feature id for the '<em><b>Component Impl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_MODEL__COMPONENT_IMPL = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.RepositoryReferenceImpl <em>Repository Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.RepositoryReferenceImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getRepositoryReference()
   * @generated
   */
  int REPOSITORY_REFERENCE = 1;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_REFERENCE__REFERENCE = 0;

  /**
   * The number of structural features of the '<em>Repository Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPOSITORY_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.ImportImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.ComponentImplImpl <em>Component Impl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.ComponentImplImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getComponentImpl()
   * @generated
   */
  int COMPONENT_IMPL = 3;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_IMPL__KIND = 0;

  /**
   * The feature id for the '<em><b>Ref Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_IMPL__REF_COMPONENT = 1;

  /**
   * The feature id for the '<em><b>Local Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_IMPL__LOCAL_DECLARATIONS = 2;

  /**
   * The feature id for the '<em><b>Post Construct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_IMPL__POST_CONSTRUCT = 3;

  /**
   * The feature id for the '<em><b>Pre Destroy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_IMPL__PRE_DESTROY = 4;

  /**
   * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_IMPL__INTERFACES = 5;

  /**
   * The number of structural features of the '<em>Component Impl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_IMPL_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.LifeCycleMethodImpl <em>Life Cycle Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.LifeCycleMethodImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getLifeCycleMethod()
   * @generated
   */
  int LIFE_CYCLE_METHOD = 4;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIFE_CYCLE_METHOD__BODY = 0;

  /**
   * The number of structural features of the '<em>Life Cycle Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIFE_CYCLE_METHOD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.VariableDeclImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getVariableDecl()
   * @generated
   */
  int VARIABLE_DECL = 5;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__NAME = 2;

  /**
   * The number of structural features of the '<em>Variable Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.ConstantDeclImpl <em>Constant Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.ConstantDeclImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getConstantDecl()
   * @generated
   */
  int CONSTANT_DECL = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECL__VALUE = 1;

  /**
   * The number of structural features of the '<em>Constant Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.InterfaceRealizationImpl <em>Interface Realization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.InterfaceRealizationImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getInterfaceRealization()
   * @generated
   */
  int INTERFACE_REALIZATION = 7;

  /**
   * The feature id for the '<em><b>Ref Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_REALIZATION__REF_INTERFACE = 0;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_REALIZATION__METHODS = 1;

  /**
   * The number of structural features of the '<em>Interface Realization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_REALIZATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.MethodImplImpl <em>Method Impl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.MethodImplImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getMethodImpl()
   * @generated
   */
  int METHOD_IMPL = 8;

  /**
   * The feature id for the '<em><b>Ref Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_IMPL__REF_METHOD = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_IMPL__BODY = 1;

  /**
   * The number of structural features of the '<em>Method Impl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_IMPL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.StatementImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 9;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.IfStatementImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 10;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__EXPR = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>If Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__IF_STATEMENT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSE_STATEMENT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.BlockStatementImpl <em>Block Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.BlockStatementImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getBlockStatement()
   * @generated
   */
  int BLOCK_STATEMENT = 11;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STATEMENT__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Block Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.AssignmentImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 12;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.LoopStatementImpl <em>Loop Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.LoopStatementImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getLoopStatement()
   * @generated
   */
  int LOOP_STATEMENT = 13;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_STATEMENT__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_STATEMENT__STATEMENT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Loop Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.DataAccessStatementImpl <em>Data Access Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.DataAccessStatementImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getDataAccessStatement()
   * @generated
   */
  int DATA_ACCESS_STATEMENT = 14;

  /**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_STATEMENT__OPERATION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_STATEMENT__VARIABLE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Access Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ACCESS_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.ExpressionImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__FEATURE = 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT = 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPRESSION = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__TYPE = 4;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OPERAND = 5;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__TARGET = 6;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.VariableCallImpl <em>Variable Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.VariableCallImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getVariableCall()
   * @generated
   */
  int VARIABLE_CALL = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__FEATURE = EXPRESSION__FEATURE;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__TYPE = EXPRESSION__TYPE;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__TARGET = EXPRESSION__TARGET;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__INDEX = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sub Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL__SUB_PROPERTY = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Variable Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.PropertyCallImpl <em>Property Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.PropertyCallImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getPropertyCall()
   * @generated
   */
  int PROPERTY_CALL = 16;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CALL__PROPERTY = 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CALL__INDEX = 1;

  /**
   * The feature id for the '<em><b>Sub Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CALL__SUB_PROPERTY = 2;

  /**
   * The number of structural features of the '<em>Property Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_CALL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.DataQueryImpl <em>Data Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.DataQueryImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getDataQuery()
   * @generated
   */
  int DATA_QUERY = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUERY__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUERY__FEATURE = EXPRESSION__FEATURE;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUERY__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUERY__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUERY__TYPE = EXPRESSION__TYPE;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUERY__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUERY__TARGET = EXPRESSION__TARGET;

  /**
   * The feature id for the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUERY__QUERY = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_QUERY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.InstantiationExpressionImpl <em>Instantiation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.InstantiationExpressionImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getInstantiationExpression()
   * @generated
   */
  int INSTANTIATION_EXPRESSION = 19;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION_EXPRESSION__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION_EXPRESSION__FEATURE = EXPRESSION__FEATURE;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION_EXPRESSION__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION_EXPRESSION__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION_EXPRESSION__TYPE = EXPRESSION__TYPE;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION_EXPRESSION__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION_EXPRESSION__TARGET = EXPRESSION__TARGET;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION_EXPRESSION__PARAMETERS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Instantiation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.DeclarationTypeReferenceImpl <em>Declaration Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.DeclarationTypeReferenceImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getDeclarationTypeReference()
   * @generated
   */
  int DECLARATION_TYPE_REFERENCE = 20;

  /**
   * The number of structural features of the '<em>Declaration Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_TYPE_REFERENCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.TypeReferenceImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getTypeReference()
   * @generated
   */
  int TYPE_REFERENCE = 21;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__REFERENCE = DECLARATION_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE_FEATURE_COUNT = DECLARATION_TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.CollectionTypeImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getCollectionType()
   * @generated
   */
  int COLLECTION_TYPE = 22;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TYPE__REFERENCE = DECLARATION_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TYPE__SIZE = DECLARATION_TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Collection Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TYPE_FEATURE_COUNT = DECLARATION_TYPE_REFERENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.MapTypeImpl <em>Map Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.MapTypeImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getMapType()
   * @generated
   */
  int MAP_TYPE = 23;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__REFERENCE = DECLARATION_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Key Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__KEY_TYPE = DECLARATION_TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Map Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE_FEATURE_COUNT = DECLARATION_TYPE_REFERENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.LiteralImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 24;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__FEATURE = EXPRESSION__FEATURE;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__RIGHT = EXPRESSION__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__TYPE = EXPRESSION__TYPE;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__OPERAND = EXPRESSION__OPERAND;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__TARGET = EXPRESSION__TARGET;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.StringLiteralImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 25;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__FEATURE = LITERAL__FEATURE;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__RIGHT = LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__EXPRESSION = LITERAL__EXPRESSION;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__TYPE = LITERAL__TYPE;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__OPERAND = LITERAL__OPERAND;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__TARGET = LITERAL__TARGET;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.CharLiteralImpl <em>Char Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.CharLiteralImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getCharLiteral()
   * @generated
   */
  int CHAR_LITERAL = 26;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL__FEATURE = LITERAL__FEATURE;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL__RIGHT = LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL__EXPRESSION = LITERAL__EXPRESSION;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL__TYPE = LITERAL__TYPE;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL__OPERAND = LITERAL__OPERAND;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL__TARGET = LITERAL__TARGET;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Char Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.NumberLiteralImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__FEATURE = LITERAL__FEATURE;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__RIGHT = LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__EXPRESSION = LITERAL__EXPRESSION;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__TYPE = LITERAL__TYPE;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__OPERAND = LITERAL__OPERAND;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__TARGET = LITERAL__TARGET;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.impl.BooleanLiteralImpl
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__LEFT = LITERAL__LEFT;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__FEATURE = LITERAL__FEATURE;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__RIGHT = LITERAL__RIGHT;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__EXPRESSION = LITERAL__EXPRESSION;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__TYPE = LITERAL__TYPE;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__OPERAND = LITERAL__OPERAND;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__TARGET = LITERAL__TARGET;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.ComponentKind <em>Component Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.ComponentKind
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getComponentKind()
   * @generated
   */
  int COMPONENT_KIND = 29;

  /**
   * The meta object id for the '{@link org.spp.cocome.behavior.behavior.DataAccessOperation <em>Data Access Operation</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.spp.cocome.behavior.behavior.DataAccessOperation
   * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getDataAccessOperation()
   * @generated
   */
  int DATA_ACCESS_OPERATION = 30;


  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.BehaviorModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.spp.cocome.behavior.behavior.BehaviorModel
   * @generated
   */
  EClass getBehaviorModel();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.behavior.behavior.BehaviorModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.spp.cocome.behavior.behavior.BehaviorModel#getName()
   * @see #getBehaviorModel()
   * @generated
   */
  EAttribute getBehaviorModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.spp.cocome.behavior.behavior.BehaviorModel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.spp.cocome.behavior.behavior.BehaviorModel#getImports()
   * @see #getBehaviorModel()
   * @generated
   */
  EReference getBehaviorModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.spp.cocome.behavior.behavior.BehaviorModel#getRepositories <em>Repositories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Repositories</em>'.
   * @see org.spp.cocome.behavior.behavior.BehaviorModel#getRepositories()
   * @see #getBehaviorModel()
   * @generated
   */
  EReference getBehaviorModel_Repositories();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.BehaviorModel#getComponentImpl <em>Component Impl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Component Impl</em>'.
   * @see org.spp.cocome.behavior.behavior.BehaviorModel#getComponentImpl()
   * @see #getBehaviorModel()
   * @generated
   */
  EReference getBehaviorModel_ComponentImpl();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.RepositoryReference <em>Repository Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repository Reference</em>'.
   * @see org.spp.cocome.behavior.behavior.RepositoryReference
   * @generated
   */
  EClass getRepositoryReference();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.behavior.behavior.RepositoryReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see org.spp.cocome.behavior.behavior.RepositoryReference#getReference()
   * @see #getRepositoryReference()
   * @generated
   */
  EAttribute getRepositoryReference_Reference();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.spp.cocome.behavior.behavior.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.behavior.behavior.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.spp.cocome.behavior.behavior.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.ComponentImpl <em>Component Impl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Impl</em>'.
   * @see org.spp.cocome.behavior.behavior.ComponentImpl
   * @generated
   */
  EClass getComponentImpl();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.behavior.behavior.ComponentImpl#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.spp.cocome.behavior.behavior.ComponentImpl#getKind()
   * @see #getComponentImpl()
   * @generated
   */
  EAttribute getComponentImpl_Kind();

  /**
   * Returns the meta object for the reference '{@link org.spp.cocome.behavior.behavior.ComponentImpl#getRefComponent <em>Ref Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Component</em>'.
   * @see org.spp.cocome.behavior.behavior.ComponentImpl#getRefComponent()
   * @see #getComponentImpl()
   * @generated
   */
  EReference getComponentImpl_RefComponent();

  /**
   * Returns the meta object for the containment reference list '{@link org.spp.cocome.behavior.behavior.ComponentImpl#getLocalDeclarations <em>Local Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Local Declarations</em>'.
   * @see org.spp.cocome.behavior.behavior.ComponentImpl#getLocalDeclarations()
   * @see #getComponentImpl()
   * @generated
   */
  EReference getComponentImpl_LocalDeclarations();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.ComponentImpl#getPostConstruct <em>Post Construct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Post Construct</em>'.
   * @see org.spp.cocome.behavior.behavior.ComponentImpl#getPostConstruct()
   * @see #getComponentImpl()
   * @generated
   */
  EReference getComponentImpl_PostConstruct();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.ComponentImpl#getPreDestroy <em>Pre Destroy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pre Destroy</em>'.
   * @see org.spp.cocome.behavior.behavior.ComponentImpl#getPreDestroy()
   * @see #getComponentImpl()
   * @generated
   */
  EReference getComponentImpl_PreDestroy();

  /**
   * Returns the meta object for the containment reference list '{@link org.spp.cocome.behavior.behavior.ComponentImpl#getInterfaces <em>Interfaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interfaces</em>'.
   * @see org.spp.cocome.behavior.behavior.ComponentImpl#getInterfaces()
   * @see #getComponentImpl()
   * @generated
   */
  EReference getComponentImpl_Interfaces();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.LifeCycleMethod <em>Life Cycle Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Life Cycle Method</em>'.
   * @see org.spp.cocome.behavior.behavior.LifeCycleMethod
   * @generated
   */
  EClass getLifeCycleMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.LifeCycleMethod#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.spp.cocome.behavior.behavior.LifeCycleMethod#getBody()
   * @see #getLifeCycleMethod()
   * @generated
   */
  EReference getLifeCycleMethod_Body();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.VariableDecl <em>Variable Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Decl</em>'.
   * @see org.spp.cocome.behavior.behavior.VariableDecl
   * @generated
   */
  EClass getVariableDecl();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.behavior.behavior.VariableDecl#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see org.spp.cocome.behavior.behavior.VariableDecl#getModifier()
   * @see #getVariableDecl()
   * @generated
   */
  EAttribute getVariableDecl_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.VariableDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.spp.cocome.behavior.behavior.VariableDecl#getType()
   * @see #getVariableDecl()
   * @generated
   */
  EReference getVariableDecl_Type();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.behavior.behavior.VariableDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.spp.cocome.behavior.behavior.VariableDecl#getName()
   * @see #getVariableDecl()
   * @generated
   */
  EAttribute getVariableDecl_Name();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.ConstantDecl <em>Constant Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Decl</em>'.
   * @see org.spp.cocome.behavior.behavior.ConstantDecl
   * @generated
   */
  EClass getConstantDecl();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.behavior.behavior.ConstantDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.spp.cocome.behavior.behavior.ConstantDecl#getName()
   * @see #getConstantDecl()
   * @generated
   */
  EAttribute getConstantDecl_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.ConstantDecl#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.spp.cocome.behavior.behavior.ConstantDecl#getValue()
   * @see #getConstantDecl()
   * @generated
   */
  EReference getConstantDecl_Value();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.InterfaceRealization <em>Interface Realization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Realization</em>'.
   * @see org.spp.cocome.behavior.behavior.InterfaceRealization
   * @generated
   */
  EClass getInterfaceRealization();

  /**
   * Returns the meta object for the reference '{@link org.spp.cocome.behavior.behavior.InterfaceRealization#getRefInterface <em>Ref Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Interface</em>'.
   * @see org.spp.cocome.behavior.behavior.InterfaceRealization#getRefInterface()
   * @see #getInterfaceRealization()
   * @generated
   */
  EReference getInterfaceRealization_RefInterface();

  /**
   * Returns the meta object for the containment reference list '{@link org.spp.cocome.behavior.behavior.InterfaceRealization#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see org.spp.cocome.behavior.behavior.InterfaceRealization#getMethods()
   * @see #getInterfaceRealization()
   * @generated
   */
  EReference getInterfaceRealization_Methods();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.MethodImpl <em>Method Impl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Impl</em>'.
   * @see org.spp.cocome.behavior.behavior.MethodImpl
   * @generated
   */
  EClass getMethodImpl();

  /**
   * Returns the meta object for the reference '{@link org.spp.cocome.behavior.behavior.MethodImpl#getRefMethod <em>Ref Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Method</em>'.
   * @see org.spp.cocome.behavior.behavior.MethodImpl#getRefMethod()
   * @see #getMethodImpl()
   * @generated
   */
  EReference getMethodImpl_RefMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.MethodImpl#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.spp.cocome.behavior.behavior.MethodImpl#getBody()
   * @see #getMethodImpl()
   * @generated
   */
  EReference getMethodImpl_Body();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.spp.cocome.behavior.behavior.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see org.spp.cocome.behavior.behavior.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.IfStatement#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.spp.cocome.behavior.behavior.IfStatement#getExpr()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Expr();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.IfStatement#getIfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Statement</em>'.
   * @see org.spp.cocome.behavior.behavior.IfStatement#getIfStatement()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_IfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.IfStatement#getElseStatement <em>Else Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Statement</em>'.
   * @see org.spp.cocome.behavior.behavior.IfStatement#getElseStatement()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_ElseStatement();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.BlockStatement <em>Block Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Statement</em>'.
   * @see org.spp.cocome.behavior.behavior.BlockStatement
   * @generated
   */
  EClass getBlockStatement();

  /**
   * Returns the meta object for the containment reference list '{@link org.spp.cocome.behavior.behavior.BlockStatement#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.spp.cocome.behavior.behavior.BlockStatement#getStatements()
   * @see #getBlockStatement()
   * @generated
   */
  EReference getBlockStatement_Statements();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see org.spp.cocome.behavior.behavior.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.Assignment#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.spp.cocome.behavior.behavior.Assignment#getVariable()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.Assignment#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.spp.cocome.behavior.behavior.Assignment#getExpression()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Expression();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.LoopStatement <em>Loop Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Statement</em>'.
   * @see org.spp.cocome.behavior.behavior.LoopStatement
   * @generated
   */
  EClass getLoopStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.LoopStatement#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.spp.cocome.behavior.behavior.LoopStatement#getVariable()
   * @see #getLoopStatement()
   * @generated
   */
  EReference getLoopStatement_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.LoopStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.spp.cocome.behavior.behavior.LoopStatement#getExpression()
   * @see #getLoopStatement()
   * @generated
   */
  EReference getLoopStatement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.LoopStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.spp.cocome.behavior.behavior.LoopStatement#getStatement()
   * @see #getLoopStatement()
   * @generated
   */
  EReference getLoopStatement_Statement();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.DataAccessStatement <em>Data Access Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Access Statement</em>'.
   * @see org.spp.cocome.behavior.behavior.DataAccessStatement
   * @generated
   */
  EClass getDataAccessStatement();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.behavior.behavior.DataAccessStatement#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see org.spp.cocome.behavior.behavior.DataAccessStatement#getOperation()
   * @see #getDataAccessStatement()
   * @generated
   */
  EAttribute getDataAccessStatement_Operation();

  /**
   * Returns the meta object for the reference '{@link org.spp.cocome.behavior.behavior.DataAccessStatement#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see org.spp.cocome.behavior.behavior.DataAccessStatement#getVariable()
   * @see #getDataAccessStatement()
   * @generated
   */
  EReference getDataAccessStatement_Variable();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.VariableCall <em>Variable Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Call</em>'.
   * @see org.spp.cocome.behavior.behavior.VariableCall
   * @generated
   */
  EClass getVariableCall();

  /**
   * Returns the meta object for the reference '{@link org.spp.cocome.behavior.behavior.VariableCall#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see org.spp.cocome.behavior.behavior.VariableCall#getVariable()
   * @see #getVariableCall()
   * @generated
   */
  EReference getVariableCall_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.VariableCall#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.spp.cocome.behavior.behavior.VariableCall#getIndex()
   * @see #getVariableCall()
   * @generated
   */
  EReference getVariableCall_Index();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.VariableCall#getSubProperty <em>Sub Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Property</em>'.
   * @see org.spp.cocome.behavior.behavior.VariableCall#getSubProperty()
   * @see #getVariableCall()
   * @generated
   */
  EReference getVariableCall_SubProperty();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.PropertyCall <em>Property Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Call</em>'.
   * @see org.spp.cocome.behavior.behavior.PropertyCall
   * @generated
   */
  EClass getPropertyCall();

  /**
   * Returns the meta object for the reference '{@link org.spp.cocome.behavior.behavior.PropertyCall#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.spp.cocome.behavior.behavior.PropertyCall#getProperty()
   * @see #getPropertyCall()
   * @generated
   */
  EReference getPropertyCall_Property();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.PropertyCall#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.spp.cocome.behavior.behavior.PropertyCall#getIndex()
   * @see #getPropertyCall()
   * @generated
   */
  EReference getPropertyCall_Index();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.PropertyCall#getSubProperty <em>Sub Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Property</em>'.
   * @see org.spp.cocome.behavior.behavior.PropertyCall#getSubProperty()
   * @see #getPropertyCall()
   * @generated
   */
  EReference getPropertyCall_SubProperty();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.spp.cocome.behavior.behavior.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.Expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.spp.cocome.behavior.behavior.Expression#getLeft()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.behavior.behavior.Expression#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see org.spp.cocome.behavior.behavior.Expression#getFeature()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Feature();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.spp.cocome.behavior.behavior.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Right();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.Expression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.spp.cocome.behavior.behavior.Expression#getExpression()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.Expression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.spp.cocome.behavior.behavior.Expression#getType()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.Expression#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see org.spp.cocome.behavior.behavior.Expression#getOperand()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Operand();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.Expression#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.spp.cocome.behavior.behavior.Expression#getTarget()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Target();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.DataQuery <em>Data Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Query</em>'.
   * @see org.spp.cocome.behavior.behavior.DataQuery
   * @generated
   */
  EClass getDataQuery();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.behavior.behavior.DataQuery#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query</em>'.
   * @see org.spp.cocome.behavior.behavior.DataQuery#getQuery()
   * @see #getDataQuery()
   * @generated
   */
  EAttribute getDataQuery_Query();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.InstantiationExpression <em>Instantiation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instantiation Expression</em>'.
   * @see org.spp.cocome.behavior.behavior.InstantiationExpression
   * @generated
   */
  EClass getInstantiationExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.spp.cocome.behavior.behavior.InstantiationExpression#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.spp.cocome.behavior.behavior.InstantiationExpression#getParameters()
   * @see #getInstantiationExpression()
   * @generated
   */
  EReference getInstantiationExpression_Parameters();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.DeclarationTypeReference <em>Declaration Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration Type Reference</em>'.
   * @see org.spp.cocome.behavior.behavior.DeclarationTypeReference
   * @generated
   */
  EClass getDeclarationTypeReference();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Reference</em>'.
   * @see org.spp.cocome.behavior.behavior.TypeReference
   * @generated
   */
  EClass getTypeReference();

  /**
   * Returns the meta object for the reference '{@link org.spp.cocome.behavior.behavior.TypeReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see org.spp.cocome.behavior.behavior.TypeReference#getReference()
   * @see #getTypeReference()
   * @generated
   */
  EReference getTypeReference_Reference();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.CollectionType <em>Collection Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Type</em>'.
   * @see org.spp.cocome.behavior.behavior.CollectionType
   * @generated
   */
  EClass getCollectionType();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.CollectionType#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see org.spp.cocome.behavior.behavior.CollectionType#getReference()
   * @see #getCollectionType()
   * @generated
   */
  EReference getCollectionType_Reference();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.behavior.behavior.CollectionType#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.spp.cocome.behavior.behavior.CollectionType#getSize()
   * @see #getCollectionType()
   * @generated
   */
  EAttribute getCollectionType_Size();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.MapType <em>Map Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Type</em>'.
   * @see org.spp.cocome.behavior.behavior.MapType
   * @generated
   */
  EClass getMapType();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.MapType#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see org.spp.cocome.behavior.behavior.MapType#getReference()
   * @see #getMapType()
   * @generated
   */
  EReference getMapType_Reference();

  /**
   * Returns the meta object for the containment reference '{@link org.spp.cocome.behavior.behavior.MapType#getKeyType <em>Key Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key Type</em>'.
   * @see org.spp.cocome.behavior.behavior.MapType#getKeyType()
   * @see #getMapType()
   * @generated
   */
  EReference getMapType_KeyType();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.spp.cocome.behavior.behavior.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.spp.cocome.behavior.behavior.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.behavior.behavior.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.spp.cocome.behavior.behavior.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.CharLiteral <em>Char Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Char Literal</em>'.
   * @see org.spp.cocome.behavior.behavior.CharLiteral
   * @generated
   */
  EClass getCharLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.behavior.behavior.CharLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.spp.cocome.behavior.behavior.CharLiteral#getValue()
   * @see #getCharLiteral()
   * @generated
   */
  EAttribute getCharLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see org.spp.cocome.behavior.behavior.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.behavior.behavior.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.spp.cocome.behavior.behavior.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.spp.cocome.behavior.behavior.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see org.spp.cocome.behavior.behavior.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.spp.cocome.behavior.behavior.BooleanLiteral#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.spp.cocome.behavior.behavior.BooleanLiteral#isValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for enum '{@link org.spp.cocome.behavior.behavior.ComponentKind <em>Component Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Component Kind</em>'.
   * @see org.spp.cocome.behavior.behavior.ComponentKind
   * @generated
   */
  EEnum getComponentKind();

  /**
   * Returns the meta object for enum '{@link org.spp.cocome.behavior.behavior.DataAccessOperation <em>Data Access Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Data Access Operation</em>'.
   * @see org.spp.cocome.behavior.behavior.DataAccessOperation
   * @generated
   */
  EEnum getDataAccessOperation();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BehaviorFactory getBehaviorFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.BehaviorModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorModelImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getBehaviorModel()
     * @generated
     */
    EClass BEHAVIOR_MODEL = eINSTANCE.getBehaviorModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEHAVIOR_MODEL__NAME = eINSTANCE.getBehaviorModel_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR_MODEL__IMPORTS = eINSTANCE.getBehaviorModel_Imports();

    /**
     * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR_MODEL__REPOSITORIES = eINSTANCE.getBehaviorModel_Repositories();

    /**
     * The meta object literal for the '<em><b>Component Impl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR_MODEL__COMPONENT_IMPL = eINSTANCE.getBehaviorModel_ComponentImpl();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.RepositoryReferenceImpl <em>Repository Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.RepositoryReferenceImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getRepositoryReference()
     * @generated
     */
    EClass REPOSITORY_REFERENCE = eINSTANCE.getRepositoryReference();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPOSITORY_REFERENCE__REFERENCE = eINSTANCE.getRepositoryReference_Reference();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.ImportImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.ComponentImplImpl <em>Component Impl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.ComponentImplImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getComponentImpl()
     * @generated
     */
    EClass COMPONENT_IMPL = eINSTANCE.getComponentImpl();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_IMPL__KIND = eINSTANCE.getComponentImpl_Kind();

    /**
     * The meta object literal for the '<em><b>Ref Component</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_IMPL__REF_COMPONENT = eINSTANCE.getComponentImpl_RefComponent();

    /**
     * The meta object literal for the '<em><b>Local Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_IMPL__LOCAL_DECLARATIONS = eINSTANCE.getComponentImpl_LocalDeclarations();

    /**
     * The meta object literal for the '<em><b>Post Construct</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_IMPL__POST_CONSTRUCT = eINSTANCE.getComponentImpl_PostConstruct();

    /**
     * The meta object literal for the '<em><b>Pre Destroy</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_IMPL__PRE_DESTROY = eINSTANCE.getComponentImpl_PreDestroy();

    /**
     * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_IMPL__INTERFACES = eINSTANCE.getComponentImpl_Interfaces();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.LifeCycleMethodImpl <em>Life Cycle Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.LifeCycleMethodImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getLifeCycleMethod()
     * @generated
     */
    EClass LIFE_CYCLE_METHOD = eINSTANCE.getLifeCycleMethod();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIFE_CYCLE_METHOD__BODY = eINSTANCE.getLifeCycleMethod_Body();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.VariableDeclImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getVariableDecl()
     * @generated
     */
    EClass VARIABLE_DECL = eINSTANCE.getVariableDecl();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECL__MODIFIER = eINSTANCE.getVariableDecl_Modifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECL__TYPE = eINSTANCE.getVariableDecl_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECL__NAME = eINSTANCE.getVariableDecl_Name();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.ConstantDeclImpl <em>Constant Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.ConstantDeclImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getConstantDecl()
     * @generated
     */
    EClass CONSTANT_DECL = eINSTANCE.getConstantDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_DECL__NAME = eINSTANCE.getConstantDecl_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_DECL__VALUE = eINSTANCE.getConstantDecl_Value();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.InterfaceRealizationImpl <em>Interface Realization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.InterfaceRealizationImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getInterfaceRealization()
     * @generated
     */
    EClass INTERFACE_REALIZATION = eINSTANCE.getInterfaceRealization();

    /**
     * The meta object literal for the '<em><b>Ref Interface</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_REALIZATION__REF_INTERFACE = eINSTANCE.getInterfaceRealization_RefInterface();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_REALIZATION__METHODS = eINSTANCE.getInterfaceRealization_Methods();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.MethodImplImpl <em>Method Impl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.MethodImplImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getMethodImpl()
     * @generated
     */
    EClass METHOD_IMPL = eINSTANCE.getMethodImpl();

    /**
     * The meta object literal for the '<em><b>Ref Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_IMPL__REF_METHOD = eINSTANCE.getMethodImpl_RefMethod();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_IMPL__BODY = eINSTANCE.getMethodImpl_Body();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.StatementImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.IfStatementImpl <em>If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.IfStatementImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getIfStatement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getIfStatement();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__EXPR = eINSTANCE.getIfStatement_Expr();

    /**
     * The meta object literal for the '<em><b>If Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__IF_STATEMENT = eINSTANCE.getIfStatement_IfStatement();

    /**
     * The meta object literal for the '<em><b>Else Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ELSE_STATEMENT = eINSTANCE.getIfStatement_ElseStatement();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.BlockStatementImpl <em>Block Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.BlockStatementImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getBlockStatement()
     * @generated
     */
    EClass BLOCK_STATEMENT = eINSTANCE.getBlockStatement();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_STATEMENT__STATEMENTS = eINSTANCE.getBlockStatement_Statements();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.AssignmentImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__VARIABLE = eINSTANCE.getAssignment_Variable();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__EXPRESSION = eINSTANCE.getAssignment_Expression();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.LoopStatementImpl <em>Loop Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.LoopStatementImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getLoopStatement()
     * @generated
     */
    EClass LOOP_STATEMENT = eINSTANCE.getLoopStatement();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP_STATEMENT__VARIABLE = eINSTANCE.getLoopStatement_Variable();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP_STATEMENT__EXPRESSION = eINSTANCE.getLoopStatement_Expression();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP_STATEMENT__STATEMENT = eINSTANCE.getLoopStatement_Statement();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.DataAccessStatementImpl <em>Data Access Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.DataAccessStatementImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getDataAccessStatement()
     * @generated
     */
    EClass DATA_ACCESS_STATEMENT = eINSTANCE.getDataAccessStatement();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_ACCESS_STATEMENT__OPERATION = eINSTANCE.getDataAccessStatement_Operation();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ACCESS_STATEMENT__VARIABLE = eINSTANCE.getDataAccessStatement_Variable();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.VariableCallImpl <em>Variable Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.VariableCallImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getVariableCall()
     * @generated
     */
    EClass VARIABLE_CALL = eINSTANCE.getVariableCall();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_CALL__VARIABLE = eINSTANCE.getVariableCall_Variable();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_CALL__INDEX = eINSTANCE.getVariableCall_Index();

    /**
     * The meta object literal for the '<em><b>Sub Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_CALL__SUB_PROPERTY = eINSTANCE.getVariableCall_SubProperty();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.PropertyCallImpl <em>Property Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.PropertyCallImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getPropertyCall()
     * @generated
     */
    EClass PROPERTY_CALL = eINSTANCE.getPropertyCall();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CALL__PROPERTY = eINSTANCE.getPropertyCall_Property();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CALL__INDEX = eINSTANCE.getPropertyCall_Index();

    /**
     * The meta object literal for the '<em><b>Sub Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_CALL__SUB_PROPERTY = eINSTANCE.getPropertyCall_SubProperty();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.ExpressionImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT = eINSTANCE.getExpression_Left();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__FEATURE = eINSTANCE.getExpression_Feature();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXPRESSION = eINSTANCE.getExpression_Expression();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__TYPE = eINSTANCE.getExpression_Type();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__OPERAND = eINSTANCE.getExpression_Operand();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__TARGET = eINSTANCE.getExpression_Target();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.DataQueryImpl <em>Data Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.DataQueryImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getDataQuery()
     * @generated
     */
    EClass DATA_QUERY = eINSTANCE.getDataQuery();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_QUERY__QUERY = eINSTANCE.getDataQuery_Query();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.InstantiationExpressionImpl <em>Instantiation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.InstantiationExpressionImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getInstantiationExpression()
     * @generated
     */
    EClass INSTANTIATION_EXPRESSION = eINSTANCE.getInstantiationExpression();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANTIATION_EXPRESSION__PARAMETERS = eINSTANCE.getInstantiationExpression_Parameters();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.DeclarationTypeReferenceImpl <em>Declaration Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.DeclarationTypeReferenceImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getDeclarationTypeReference()
     * @generated
     */
    EClass DECLARATION_TYPE_REFERENCE = eINSTANCE.getDeclarationTypeReference();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.TypeReferenceImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getTypeReference()
     * @generated
     */
    EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REFERENCE__REFERENCE = eINSTANCE.getTypeReference_Reference();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.CollectionTypeImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getCollectionType()
     * @generated
     */
    EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_TYPE__REFERENCE = eINSTANCE.getCollectionType_Reference();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTION_TYPE__SIZE = eINSTANCE.getCollectionType_Size();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.MapTypeImpl <em>Map Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.MapTypeImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getMapType()
     * @generated
     */
    EClass MAP_TYPE = eINSTANCE.getMapType();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE__REFERENCE = eINSTANCE.getMapType_Reference();

    /**
     * The meta object literal for the '<em><b>Key Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE__KEY_TYPE = eINSTANCE.getMapType_KeyType();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.LiteralImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.StringLiteralImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.CharLiteralImpl <em>Char Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.CharLiteralImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getCharLiteral()
     * @generated
     */
    EClass CHAR_LITERAL = eINSTANCE.getCharLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHAR_LITERAL__VALUE = eINSTANCE.getCharLiteral_Value();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.NumberLiteralImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.impl.BooleanLiteralImpl
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.ComponentKind <em>Component Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.ComponentKind
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getComponentKind()
     * @generated
     */
    EEnum COMPONENT_KIND = eINSTANCE.getComponentKind();

    /**
     * The meta object literal for the '{@link org.spp.cocome.behavior.behavior.DataAccessOperation <em>Data Access Operation</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.spp.cocome.behavior.behavior.DataAccessOperation
     * @see org.spp.cocome.behavior.behavior.impl.BehaviorPackageImpl#getDataAccessOperation()
     * @generated
     */
    EEnum DATA_ACCESS_OPERATION = eINSTANCE.getDataAccessOperation();

  }

} //BehaviorPackage
