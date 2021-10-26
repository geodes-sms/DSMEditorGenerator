/**
 */
package layoutRel.impl;

import java.util.Collection;

import layoutRel.InteractionStream;
import layoutRel.LayoutRelPackage;
import layoutRel.RelLayoutDiagram;

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
 * An implementation of the model object '<em><b>Rel Layout Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link layoutRel.impl.RelLayoutDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link layoutRel.impl.RelLayoutDiagramImpl#getInteractionStreams <em>Interaction Streams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelLayoutDiagramImpl extends MinimalEObjectImpl.Container implements RelLayoutDiagram {
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
	 * The cached value of the '{@link #getInteractionStreams() <em>Interaction Streams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionStreams()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionStream> interactionStreams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelLayoutDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutRelPackage.Literals.REL_LAYOUT_DIAGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutRelPackage.REL_LAYOUT_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionStream> getInteractionStreams() {
		if (interactionStreams == null) {
			interactionStreams = new EObjectContainmentEList<InteractionStream>(InteractionStream.class, this, LayoutRelPackage.REL_LAYOUT_DIAGRAM__INTERACTION_STREAMS);
		}
		return interactionStreams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutRelPackage.REL_LAYOUT_DIAGRAM__INTERACTION_STREAMS:
				return ((InternalEList<?>)getInteractionStreams()).basicRemove(otherEnd, msgs);
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
			case LayoutRelPackage.REL_LAYOUT_DIAGRAM__NAME:
				return getName();
			case LayoutRelPackage.REL_LAYOUT_DIAGRAM__INTERACTION_STREAMS:
				return getInteractionStreams();
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
			case LayoutRelPackage.REL_LAYOUT_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case LayoutRelPackage.REL_LAYOUT_DIAGRAM__INTERACTION_STREAMS:
				getInteractionStreams().clear();
				getInteractionStreams().addAll((Collection<? extends InteractionStream>)newValue);
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
			case LayoutRelPackage.REL_LAYOUT_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LayoutRelPackage.REL_LAYOUT_DIAGRAM__INTERACTION_STREAMS:
				getInteractionStreams().clear();
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
			case LayoutRelPackage.REL_LAYOUT_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LayoutRelPackage.REL_LAYOUT_DIAGRAM__INTERACTION_STREAMS:
				return interactionStreams != null && !interactionStreams.isEmpty();
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

} //RelLayoutDiagramImpl
