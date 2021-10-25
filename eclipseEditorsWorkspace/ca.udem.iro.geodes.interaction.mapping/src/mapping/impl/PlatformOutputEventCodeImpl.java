/**
 */
package mapping.impl;

import java.util.Collection;

import mapping.CodeLine;
import mapping.EditorOutputEvent;
import mapping.MappingPackage;
import mapping.PlatformOutputEventCode;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Output Event Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mapping.impl.PlatformOutputEventCodeImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link mapping.impl.PlatformOutputEventCodeImpl#getRaiseCode <em>Raise Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformOutputEventCodeImpl extends MinimalEObjectImpl.Container implements PlatformOutputEventCode {
	/**
	 * The cached value of the '{@link #getEditor() <em>Editor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditor()
	 * @generated
	 * @ordered
	 */
	protected EList<EditorOutputEvent> editor;

	/**
	 * The cached value of the '{@link #getRaiseCode() <em>Raise Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaiseCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeLine> raiseCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformOutputEventCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.PLATFORM_OUTPUT_EVENT_CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EditorOutputEvent> getEditor() {
		if (editor == null) {
			editor = new EObjectWithInverseResolvingEList.ManyInverse<EditorOutputEvent>(EditorOutputEvent.class, this, MappingPackage.PLATFORM_OUTPUT_EVENT_CODE__EDITOR, MappingPackage.EDITOR_OUTPUT_EVENT__PLATFORM);
		}
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeLine> getRaiseCode() {
		if (raiseCode == null) {
			raiseCode = new EObjectContainmentEList<CodeLine>(CodeLine.class, this, MappingPackage.PLATFORM_OUTPUT_EVENT_CODE__RAISE_CODE);
		}
		return raiseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.PLATFORM_OUTPUT_EVENT_CODE__EDITOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEditor()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.PLATFORM_OUTPUT_EVENT_CODE__EDITOR:
				return ((InternalEList<?>)getEditor()).basicRemove(otherEnd, msgs);
			case MappingPackage.PLATFORM_OUTPUT_EVENT_CODE__RAISE_CODE:
				return ((InternalEList<?>)getRaiseCode()).basicRemove(otherEnd, msgs);
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
			case MappingPackage.PLATFORM_OUTPUT_EVENT_CODE__EDITOR:
				return getEditor();
			case MappingPackage.PLATFORM_OUTPUT_EVENT_CODE__RAISE_CODE:
				return getRaiseCode();
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
			case MappingPackage.PLATFORM_OUTPUT_EVENT_CODE__EDITOR:
				getEditor().clear();
				getEditor().addAll((Collection<? extends EditorOutputEvent>)newValue);
				return;
			case MappingPackage.PLATFORM_OUTPUT_EVENT_CODE__RAISE_CODE:
				getRaiseCode().clear();
				getRaiseCode().addAll((Collection<? extends CodeLine>)newValue);
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
			case MappingPackage.PLATFORM_OUTPUT_EVENT_CODE__EDITOR:
				getEditor().clear();
				return;
			case MappingPackage.PLATFORM_OUTPUT_EVENT_CODE__RAISE_CODE:
				getRaiseCode().clear();
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
			case MappingPackage.PLATFORM_OUTPUT_EVENT_CODE__EDITOR:
				return editor != null && !editor.isEmpty();
			case MappingPackage.PLATFORM_OUTPUT_EVENT_CODE__RAISE_CODE:
				return raiseCode != null && !raiseCode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlatformOutputEventCodeImpl
