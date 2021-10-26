/**
 */
package mapping.impl;

import java.util.Collection;

import mapping.CodeLine;
import mapping.EditorInputEvent;
import mapping.MappingPackage;
import mapping.PlatformInputEventCode;

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
 * An implementation of the model object '<em><b>Platform Input Event Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mapping.impl.PlatformInputEventCodeImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link mapping.impl.PlatformInputEventCodeImpl#getListnerCode <em>Listner Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformInputEventCodeImpl extends MinimalEObjectImpl.Container implements PlatformInputEventCode {
	/**
	 * The cached value of the '{@link #getEditor() <em>Editor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditor()
	 * @generated
	 * @ordered
	 */
	protected EList<EditorInputEvent> editor;

	/**
	 * The cached value of the '{@link #getListnerCode() <em>Listner Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListnerCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeLine> listnerCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformInputEventCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.PLATFORM_INPUT_EVENT_CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EditorInputEvent> getEditor() {
		if (editor == null) {
			editor = new EObjectWithInverseResolvingEList.ManyInverse<EditorInputEvent>(EditorInputEvent.class, this, MappingPackage.PLATFORM_INPUT_EVENT_CODE__EDITOR, MappingPackage.EDITOR_INPUT_EVENT__PLATFORM);
		}
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeLine> getListnerCode() {
		if (listnerCode == null) {
			listnerCode = new EObjectContainmentEList<CodeLine>(CodeLine.class, this, MappingPackage.PLATFORM_INPUT_EVENT_CODE__LISTNER_CODE);
		}
		return listnerCode;
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
			case MappingPackage.PLATFORM_INPUT_EVENT_CODE__EDITOR:
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
			case MappingPackage.PLATFORM_INPUT_EVENT_CODE__EDITOR:
				return ((InternalEList<?>)getEditor()).basicRemove(otherEnd, msgs);
			case MappingPackage.PLATFORM_INPUT_EVENT_CODE__LISTNER_CODE:
				return ((InternalEList<?>)getListnerCode()).basicRemove(otherEnd, msgs);
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
			case MappingPackage.PLATFORM_INPUT_EVENT_CODE__EDITOR:
				return getEditor();
			case MappingPackage.PLATFORM_INPUT_EVENT_CODE__LISTNER_CODE:
				return getListnerCode();
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
			case MappingPackage.PLATFORM_INPUT_EVENT_CODE__EDITOR:
				getEditor().clear();
				getEditor().addAll((Collection<? extends EditorInputEvent>)newValue);
				return;
			case MappingPackage.PLATFORM_INPUT_EVENT_CODE__LISTNER_CODE:
				getListnerCode().clear();
				getListnerCode().addAll((Collection<? extends CodeLine>)newValue);
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
			case MappingPackage.PLATFORM_INPUT_EVENT_CODE__EDITOR:
				getEditor().clear();
				return;
			case MappingPackage.PLATFORM_INPUT_EVENT_CODE__LISTNER_CODE:
				getListnerCode().clear();
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
			case MappingPackage.PLATFORM_INPUT_EVENT_CODE__EDITOR:
				return editor != null && !editor.isEmpty();
			case MappingPackage.PLATFORM_INPUT_EVENT_CODE__LISTNER_CODE:
				return listnerCode != null && !listnerCode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlatformInputEventCodeImpl
