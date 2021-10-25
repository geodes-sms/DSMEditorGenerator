/**
 */
package interaction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see interaction.InteractionFactory
 * @model kind="package"
 * @generated
 */
public interface InteractionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interaction";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://udem.iro.geodes.ca/interaction";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "interaction";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InteractionPackage eINSTANCE = interaction.impl.InteractionPackageImpl.init();

	/**
	 * The meta object id for the '{@link interaction.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interaction.impl.StateImpl
	 * @see interaction.impl.InteractionPackageImpl#getState()
	 * @generated
	 */
	int STATE = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TO = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__FROM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link interaction.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interaction.impl.TransitionImpl
	 * @see interaction.impl.InteractionPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link interaction.impl.CElementImpl <em>CElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interaction.impl.CElementImpl
	 * @see interaction.impl.InteractionPackageImpl#getCElement()
	 * @generated
	 */
	int CELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Is Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELEMENT__IS_NEGATIVE = 1;

	/**
	 * The feature id for the '<em><b>Is Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELEMENT__IS_FOCUS = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELEMENT__VALUE = 3;

	/**
	 * The number of structural features of the '<em>CElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>CElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link interaction.impl.IElementImpl <em>IElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interaction.impl.IElementImpl
	 * @see interaction.impl.InteractionPackageImpl#getIElement()
	 * @generated
	 */
	int IELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT__ID = CELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT__IS_NEGATIVE = CELEMENT__IS_NEGATIVE;

	/**
	 * The feature id for the '<em><b>Is Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT__IS_FOCUS = CELEMENT__IS_FOCUS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT__VALUE = CELEMENT__VALUE;

	/**
	 * The number of structural features of the '<em>IElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT_FEATURE_COUNT = CELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT_OPERATION_COUNT = CELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link interaction.impl.OElementImpl <em>OElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interaction.impl.OElementImpl
	 * @see interaction.impl.InteractionPackageImpl#getOElement()
	 * @generated
	 */
	int OELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OELEMENT__ID = CELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OELEMENT__IS_NEGATIVE = CELEMENT__IS_NEGATIVE;

	/**
	 * The feature id for the '<em><b>Is Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OELEMENT__IS_FOCUS = CELEMENT__IS_FOCUS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OELEMENT__VALUE = CELEMENT__VALUE;

	/**
	 * The number of structural features of the '<em>OElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OELEMENT_FEATURE_COUNT = CELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OELEMENT_OPERATION_COUNT = CELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link interaction.impl.LElementImpl <em>LElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interaction.impl.LElementImpl
	 * @see interaction.impl.InteractionPackageImpl#getLElement()
	 * @generated
	 */
	int LELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LELEMENT__ID = CELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LELEMENT__IS_NEGATIVE = CELEMENT__IS_NEGATIVE;

	/**
	 * The feature id for the '<em><b>Is Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LELEMENT__IS_FOCUS = CELEMENT__IS_FOCUS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LELEMENT__VALUE = CELEMENT__VALUE;

	/**
	 * The number of structural features of the '<em>LElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LELEMENT_FEATURE_COUNT = CELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LELEMENT_OPERATION_COUNT = CELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link interaction.impl.VElementImpl <em>VElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interaction.impl.VElementImpl
	 * @see interaction.impl.InteractionPackageImpl#getVElement()
	 * @generated
	 */
	int VELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELEMENT__ID = CELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Is Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELEMENT__IS_NEGATIVE = CELEMENT__IS_NEGATIVE;

	/**
	 * The feature id for the '<em><b>Is Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELEMENT__IS_FOCUS = CELEMENT__IS_FOCUS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELEMENT__VALUE = CELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELEMENT__ELEMENT = CELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELEMENT_FEATURE_COUNT = CELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VELEMENT_OPERATION_COUNT = CELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link interaction.impl.InteractionsImpl <em>Interactions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interaction.impl.InteractionsImpl
	 * @see interaction.impl.InteractionPackageImpl#getInteractions()
	 * @generated
	 */
	int INTERACTIONS = 7;

	/**
	 * The feature id for the '<em><b>Interactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIONS__INTERACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Interactions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interactions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link interaction.impl.AtomicInteractionImpl <em>Atomic Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see interaction.impl.AtomicInteractionImpl
	 * @see interaction.impl.InteractionPackageImpl#getAtomicInteraction()
	 * @generated
	 */
	int ATOMIC_INTERACTION = 8;

	/**
	 * The feature id for the '<em><b>Has States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_INTERACTION__HAS_STATES = 0;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_INTERACTION__PRE_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_INTERACTION__GOAL = 2;

	/**
	 * The feature id for the '<em><b>Has Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_INTERACTION__HAS_TRANSITIONS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_INTERACTION__NAME = 4;

	/**
	 * The number of structural features of the '<em>Atomic Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_INTERACTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Atomic Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_INTERACTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link interaction.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see interaction.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link interaction.State#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see interaction.State#getConditions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Conditions();

	/**
	 * Returns the meta object for the reference '{@link interaction.State#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see interaction.State#getTo()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_To();

	/**
	 * Returns the meta object for the reference '{@link interaction.State#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see interaction.State#getFrom()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_From();

	/**
	 * Returns the meta object for the attribute '{@link interaction.State#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see interaction.State#getId()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Id();

	/**
	 * Returns the meta object for class '{@link interaction.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see interaction.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link interaction.Transition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see interaction.Transition#getEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Event();

	/**
	 * Returns the meta object for the reference '{@link interaction.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see interaction.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link interaction.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see interaction.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for class '{@link interaction.CElement <em>CElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CElement</em>'.
	 * @see interaction.CElement
	 * @generated
	 */
	EClass getCElement();

	/**
	 * Returns the meta object for the attribute '{@link interaction.CElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see interaction.CElement#getId()
	 * @see #getCElement()
	 * @generated
	 */
	EAttribute getCElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link interaction.CElement#isIsNegative <em>Is Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Negative</em>'.
	 * @see interaction.CElement#isIsNegative()
	 * @see #getCElement()
	 * @generated
	 */
	EAttribute getCElement_IsNegative();

	/**
	 * Returns the meta object for the attribute '{@link interaction.CElement#isIsFocus <em>Is Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Focus</em>'.
	 * @see interaction.CElement#isIsFocus()
	 * @see #getCElement()
	 * @generated
	 */
	EAttribute getCElement_IsFocus();

	/**
	 * Returns the meta object for the attribute '{@link interaction.CElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see interaction.CElement#getValue()
	 * @see #getCElement()
	 * @generated
	 */
	EAttribute getCElement_Value();

	/**
	 * Returns the meta object for class '{@link interaction.IElement <em>IElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IElement</em>'.
	 * @see interaction.IElement
	 * @generated
	 */
	EClass getIElement();

	/**
	 * Returns the meta object for class '{@link interaction.OElement <em>OElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OElement</em>'.
	 * @see interaction.OElement
	 * @generated
	 */
	EClass getOElement();

	/**
	 * Returns the meta object for class '{@link interaction.LElement <em>LElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LElement</em>'.
	 * @see interaction.LElement
	 * @generated
	 */
	EClass getLElement();

	/**
	 * Returns the meta object for class '{@link interaction.VElement <em>VElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VElement</em>'.
	 * @see interaction.VElement
	 * @generated
	 */
	EClass getVElement();

	/**
	 * Returns the meta object for the reference '{@link interaction.VElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see interaction.VElement#getElement()
	 * @see #getVElement()
	 * @generated
	 */
	EReference getVElement_Element();

	/**
	 * Returns the meta object for class '{@link interaction.Interactions <em>Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interactions</em>'.
	 * @see interaction.Interactions
	 * @generated
	 */
	EClass getInteractions();

	/**
	 * Returns the meta object for the containment reference list '{@link interaction.Interactions#getInteractions <em>Interactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interactions</em>'.
	 * @see interaction.Interactions#getInteractions()
	 * @see #getInteractions()
	 * @generated
	 */
	EReference getInteractions_Interactions();

	/**
	 * Returns the meta object for class '{@link interaction.AtomicInteraction <em>Atomic Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Interaction</em>'.
	 * @see interaction.AtomicInteraction
	 * @generated
	 */
	EClass getAtomicInteraction();

	/**
	 * Returns the meta object for the containment reference list '{@link interaction.AtomicInteraction#getHasStates <em>Has States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has States</em>'.
	 * @see interaction.AtomicInteraction#getHasStates()
	 * @see #getAtomicInteraction()
	 * @generated
	 */
	EReference getAtomicInteraction_HasStates();

	/**
	 * Returns the meta object for the reference '{@link interaction.AtomicInteraction#getPreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre Condition</em>'.
	 * @see interaction.AtomicInteraction#getPreCondition()
	 * @see #getAtomicInteraction()
	 * @generated
	 */
	EReference getAtomicInteraction_PreCondition();

	/**
	 * Returns the meta object for the reference '{@link interaction.AtomicInteraction#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal</em>'.
	 * @see interaction.AtomicInteraction#getGoal()
	 * @see #getAtomicInteraction()
	 * @generated
	 */
	EReference getAtomicInteraction_Goal();

	/**
	 * Returns the meta object for the containment reference list '{@link interaction.AtomicInteraction#getHasTransitions <em>Has Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Transitions</em>'.
	 * @see interaction.AtomicInteraction#getHasTransitions()
	 * @see #getAtomicInteraction()
	 * @generated
	 */
	EReference getAtomicInteraction_HasTransitions();

	/**
	 * Returns the meta object for the attribute '{@link interaction.AtomicInteraction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see interaction.AtomicInteraction#getName()
	 * @see #getAtomicInteraction()
	 * @generated
	 */
	EAttribute getAtomicInteraction_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InteractionFactory getInteractionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link interaction.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interaction.impl.StateImpl
		 * @see interaction.impl.InteractionPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__CONDITIONS = eINSTANCE.getState_Conditions();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TO = eINSTANCE.getState_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__FROM = eINSTANCE.getState_From();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__ID = eINSTANCE.getState_Id();

		/**
		 * The meta object literal for the '{@link interaction.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interaction.impl.TransitionImpl
		 * @see interaction.impl.InteractionPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__EVENT = eINSTANCE.getTransition_Event();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '{@link interaction.impl.CElementImpl <em>CElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interaction.impl.CElementImpl
		 * @see interaction.impl.InteractionPackageImpl#getCElement()
		 * @generated
		 */
		EClass CELEMENT = eINSTANCE.getCElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELEMENT__ID = eINSTANCE.getCElement_Id();

		/**
		 * The meta object literal for the '<em><b>Is Negative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELEMENT__IS_NEGATIVE = eINSTANCE.getCElement_IsNegative();

		/**
		 * The meta object literal for the '<em><b>Is Focus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELEMENT__IS_FOCUS = eINSTANCE.getCElement_IsFocus();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELEMENT__VALUE = eINSTANCE.getCElement_Value();

		/**
		 * The meta object literal for the '{@link interaction.impl.IElementImpl <em>IElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interaction.impl.IElementImpl
		 * @see interaction.impl.InteractionPackageImpl#getIElement()
		 * @generated
		 */
		EClass IELEMENT = eINSTANCE.getIElement();

		/**
		 * The meta object literal for the '{@link interaction.impl.OElementImpl <em>OElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interaction.impl.OElementImpl
		 * @see interaction.impl.InteractionPackageImpl#getOElement()
		 * @generated
		 */
		EClass OELEMENT = eINSTANCE.getOElement();

		/**
		 * The meta object literal for the '{@link interaction.impl.LElementImpl <em>LElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interaction.impl.LElementImpl
		 * @see interaction.impl.InteractionPackageImpl#getLElement()
		 * @generated
		 */
		EClass LELEMENT = eINSTANCE.getLElement();

		/**
		 * The meta object literal for the '{@link interaction.impl.VElementImpl <em>VElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interaction.impl.VElementImpl
		 * @see interaction.impl.InteractionPackageImpl#getVElement()
		 * @generated
		 */
		EClass VELEMENT = eINSTANCE.getVElement();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VELEMENT__ELEMENT = eINSTANCE.getVElement_Element();

		/**
		 * The meta object literal for the '{@link interaction.impl.InteractionsImpl <em>Interactions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interaction.impl.InteractionsImpl
		 * @see interaction.impl.InteractionPackageImpl#getInteractions()
		 * @generated
		 */
		EClass INTERACTIONS = eINSTANCE.getInteractions();

		/**
		 * The meta object literal for the '<em><b>Interactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTIONS__INTERACTIONS = eINSTANCE.getInteractions_Interactions();

		/**
		 * The meta object literal for the '{@link interaction.impl.AtomicInteractionImpl <em>Atomic Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see interaction.impl.AtomicInteractionImpl
		 * @see interaction.impl.InteractionPackageImpl#getAtomicInteraction()
		 * @generated
		 */
		EClass ATOMIC_INTERACTION = eINSTANCE.getAtomicInteraction();

		/**
		 * The meta object literal for the '<em><b>Has States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_INTERACTION__HAS_STATES = eINSTANCE.getAtomicInteraction_HasStates();

		/**
		 * The meta object literal for the '<em><b>Pre Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_INTERACTION__PRE_CONDITION = eINSTANCE.getAtomicInteraction_PreCondition();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_INTERACTION__GOAL = eINSTANCE.getAtomicInteraction_Goal();

		/**
		 * The meta object literal for the '<em><b>Has Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_INTERACTION__HAS_TRANSITIONS = eINSTANCE.getAtomicInteraction_HasTransitions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_INTERACTION__NAME = eINSTANCE.getAtomicInteraction_Name();

	}

} //InteractionPackage
