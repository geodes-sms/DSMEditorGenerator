/**
 */
package interaction.impl;

import interaction.AtomicInteraction;
import interaction.InteractionPackage;
import interaction.State;
import interaction.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link interaction.impl.AtomicInteractionImpl#getHasStates <em>Has States</em>}</li>
 *   <li>{@link interaction.impl.AtomicInteractionImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link interaction.impl.AtomicInteractionImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link interaction.impl.AtomicInteractionImpl#getHasTransitions <em>Has Transitions</em>}</li>
 *   <li>{@link interaction.impl.AtomicInteractionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicInteractionImpl extends MinimalEObjectImpl.Container implements AtomicInteraction {
	/**
	 * The cached value of the '{@link #getHasStates() <em>Has States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> hasStates;

	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected State preCondition;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected State goal;

	/**
	 * The cached value of the '{@link #getHasTransitions() <em>Has Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> hasTransitions;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.ATOMIC_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getHasStates() {
		if (hasStates == null) {
			hasStates = new EObjectContainmentEList<State>(State.class, this, InteractionPackage.ATOMIC_INTERACTION__HAS_STATES);
		}
		return hasStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getPreCondition() {
		if (preCondition != null && preCondition.eIsProxy()) {
			InternalEObject oldPreCondition = (InternalEObject)preCondition;
			preCondition = (State)eResolveProxy(oldPreCondition);
			if (preCondition != oldPreCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ATOMIC_INTERACTION__PRE_CONDITION, oldPreCondition, preCondition));
			}
		}
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetPreCondition() {
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreCondition(State newPreCondition) {
		State oldPreCondition = preCondition;
		preCondition = newPreCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ATOMIC_INTERACTION__PRE_CONDITION, oldPreCondition, preCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getGoal() {
		if (goal != null && goal.eIsProxy()) {
			InternalEObject oldGoal = (InternalEObject)goal;
			goal = (State)eResolveProxy(oldGoal);
			if (goal != oldGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ATOMIC_INTERACTION__GOAL, oldGoal, goal));
			}
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(State newGoal) {
		State oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ATOMIC_INTERACTION__GOAL, oldGoal, goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getHasTransitions() {
		if (hasTransitions == null) {
			hasTransitions = new EObjectContainmentEList<Transition>(Transition.class, this, InteractionPackage.ATOMIC_INTERACTION__HAS_TRANSITIONS);
		}
		return hasTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ATOMIC_INTERACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InteractionPackage.ATOMIC_INTERACTION__HAS_STATES:
				return ((InternalEList<?>)getHasStates()).basicRemove(otherEnd, msgs);
			case InteractionPackage.ATOMIC_INTERACTION__HAS_TRANSITIONS:
				return ((InternalEList<?>)getHasTransitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.ATOMIC_INTERACTION__HAS_STATES:
				return getHasStates();
			case InteractionPackage.ATOMIC_INTERACTION__PRE_CONDITION:
				if (resolve) return getPreCondition();
				return basicGetPreCondition();
			case InteractionPackage.ATOMIC_INTERACTION__GOAL:
				if (resolve) return getGoal();
				return basicGetGoal();
			case InteractionPackage.ATOMIC_INTERACTION__HAS_TRANSITIONS:
				return getHasTransitions();
			case InteractionPackage.ATOMIC_INTERACTION__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InteractionPackage.ATOMIC_INTERACTION__HAS_STATES:
				getHasStates().clear();
				getHasStates().addAll((Collection<? extends State>)newValue);
				return;
			case InteractionPackage.ATOMIC_INTERACTION__PRE_CONDITION:
				setPreCondition((State)newValue);
				return;
			case InteractionPackage.ATOMIC_INTERACTION__GOAL:
				setGoal((State)newValue);
				return;
			case InteractionPackage.ATOMIC_INTERACTION__HAS_TRANSITIONS:
				getHasTransitions().clear();
				getHasTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case InteractionPackage.ATOMIC_INTERACTION__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InteractionPackage.ATOMIC_INTERACTION__HAS_STATES:
				getHasStates().clear();
				return;
			case InteractionPackage.ATOMIC_INTERACTION__PRE_CONDITION:
				setPreCondition((State)null);
				return;
			case InteractionPackage.ATOMIC_INTERACTION__GOAL:
				setGoal((State)null);
				return;
			case InteractionPackage.ATOMIC_INTERACTION__HAS_TRANSITIONS:
				getHasTransitions().clear();
				return;
			case InteractionPackage.ATOMIC_INTERACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InteractionPackage.ATOMIC_INTERACTION__HAS_STATES:
				return hasStates != null && !hasStates.isEmpty();
			case InteractionPackage.ATOMIC_INTERACTION__PRE_CONDITION:
				return preCondition != null;
			case InteractionPackage.ATOMIC_INTERACTION__GOAL:
				return goal != null;
			case InteractionPackage.ATOMIC_INTERACTION__HAS_TRANSITIONS:
				return hasTransitions != null && !hasTransitions.isEmpty();
			case InteractionPackage.ATOMIC_INTERACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AtomicInteractionImpl
