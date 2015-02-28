/**
 */
package org.spp.cocome.behavior.behavior.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.spp.cocome.behavior.behavior.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorFactoryImpl extends EFactoryImpl implements BehaviorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BehaviorFactory init()
  {
    try
    {
      BehaviorFactory theBehaviorFactory = (BehaviorFactory)EPackage.Registry.INSTANCE.getEFactory(BehaviorPackage.eNS_URI);
      if (theBehaviorFactory != null)
      {
        return theBehaviorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BehaviorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BehaviorPackage.BEHAVIOR_MODEL: return createBehaviorModel();
      case BehaviorPackage.REPOSITORY_REFERENCE: return createRepositoryReference();
      case BehaviorPackage.IMPORT: return createImport();
      case BehaviorPackage.COMPONENT_IMPL: return createComponentImpl();
      case BehaviorPackage.VARIABLE_DECL: return createVariableDecl();
      case BehaviorPackage.CONSTANT_DECL: return createConstantDecl();
      case BehaviorPackage.INTERFACE_REALIZATION: return createInterfaceRealization();
      case BehaviorPackage.METHOD_IMPL: return createMethodImpl();
      case BehaviorPackage.STATEMENT: return createStatement();
      case BehaviorPackage.IF_STATEMENT: return createIfStatement();
      case BehaviorPackage.BLOCK_STATEMENT: return createBlockStatement();
      case BehaviorPackage.ASSIGNMENT: return createAssignment();
      case BehaviorPackage.LOOP_STATEMENT: return createLoopStatement();
      case BehaviorPackage.VARIABLE_CALL: return createVariableCall();
      case BehaviorPackage.PROPERTY_CALL: return createPropertyCall();
      case BehaviorPackage.EXPRESSION: return createExpression();
      case BehaviorPackage.INSTANTIATION_EXPRESSION: return createInstantiationExpression();
      case BehaviorPackage.TYPE_REFERENCE: return createTypeReference();
      case BehaviorPackage.COLLECTION_TYPE: return createCollectionType();
      case BehaviorPackage.MAP_TYPE: return createMapType();
      case BehaviorPackage.DECLARATION_TYPE_REFERENCE: return createDeclarationTypeReference();
      case BehaviorPackage.LITERAL: return createLiteral();
      case BehaviorPackage.STRING_LITERAL: return createStringLiteral();
      case BehaviorPackage.CHAR_LITERAL: return createCharLiteral();
      case BehaviorPackage.NUMBER_LITERAL: return createNumberLiteral();
      case BehaviorPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case BehaviorPackage.BINARY_OPERATION: return createBinaryOperation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorModel createBehaviorModel()
  {
    BehaviorModelImpl behaviorModel = new BehaviorModelImpl();
    return behaviorModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepositoryReference createRepositoryReference()
  {
    RepositoryReferenceImpl repositoryReference = new RepositoryReferenceImpl();
    return repositoryReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentImpl createComponentImpl()
  {
    ComponentImplImpl componentImpl = new ComponentImplImpl();
    return componentImpl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDecl createVariableDecl()
  {
    VariableDeclImpl variableDecl = new VariableDeclImpl();
    return variableDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDecl createConstantDecl()
  {
    ConstantDeclImpl constantDecl = new ConstantDeclImpl();
    return constantDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceRealization createInterfaceRealization()
  {
    InterfaceRealizationImpl interfaceRealization = new InterfaceRealizationImpl();
    return interfaceRealization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodImpl createMethodImpl()
  {
    MethodImplImpl methodImpl = new MethodImplImpl();
    return methodImpl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockStatement createBlockStatement()
  {
    BlockStatementImpl blockStatement = new BlockStatementImpl();
    return blockStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopStatement createLoopStatement()
  {
    LoopStatementImpl loopStatement = new LoopStatementImpl();
    return loopStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableCall createVariableCall()
  {
    VariableCallImpl variableCall = new VariableCallImpl();
    return variableCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyCall createPropertyCall()
  {
    PropertyCallImpl propertyCall = new PropertyCallImpl();
    return propertyCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstantiationExpression createInstantiationExpression()
  {
    InstantiationExpressionImpl instantiationExpression = new InstantiationExpressionImpl();
    return instantiationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference createTypeReference()
  {
    TypeReferenceImpl typeReference = new TypeReferenceImpl();
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionType createCollectionType()
  {
    CollectionTypeImpl collectionType = new CollectionTypeImpl();
    return collectionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapType createMapType()
  {
    MapTypeImpl mapType = new MapTypeImpl();
    return mapType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclarationTypeReference createDeclarationTypeReference()
  {
    DeclarationTypeReferenceImpl declarationTypeReference = new DeclarationTypeReferenceImpl();
    return declarationTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharLiteral createCharLiteral()
  {
    CharLiteralImpl charLiteral = new CharLiteralImpl();
    return charLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryOperation createBinaryOperation()
  {
    BinaryOperationImpl binaryOperation = new BinaryOperationImpl();
    return binaryOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorPackage getBehaviorPackage()
  {
    return (BehaviorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BehaviorPackage getPackage()
  {
    return BehaviorPackage.eINSTANCE;
  }

} //BehaviorFactoryImpl