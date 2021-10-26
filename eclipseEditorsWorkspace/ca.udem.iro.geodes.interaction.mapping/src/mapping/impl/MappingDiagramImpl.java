/**
 */
package mapping.impl;

import java.util.Collection;

import mapping.EditorInputEvent;
import mapping.EditorOutputEvent;
import mapping.MappingDiagram;
import mapping.MappingPackage;
import mapping.PlatformControllCode;
import mapping.PlatformIElementCode;
import mapping.PlatformInputControllCode;
import mapping.PlatformInputEventCode;
import mapping.PlatformLElementCode;
import mapping.PlatformOutputControllCode;
import mapping.PlatformOutputEventCode;

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
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mapping.impl.MappingDiagramImpl#getEditorInputEvents <em>Editor Input Events</em>}</li>
 *   <li>{@link mapping.impl.MappingDiagramImpl#getEditorOutputEvents <em>Editor Output Events</em>}</li>
 *   <li>{@link mapping.impl.MappingDiagramImpl#getPlatformInputEvents <em>Platform Input Events</em>}</li>
 *   <li>{@link mapping.impl.MappingDiagramImpl#getPlatformOutputEvents <em>Platform Output Events</em>}</li>
 *   <li>{@link mapping.impl.MappingDiagramImpl#getPlatformIElementSetters <em>Platform IElement Setters</em>}</li>
 *   <li>{@link mapping.impl.MappingDiagramImpl#getPlatformLElementOperations <em>Platform LElement Operations</em>}</li>
 *   <li>{@link mapping.impl.MappingDiagramImpl#getPlatformOutputControll <em>Platform Output Controll</em>}</li>
 *   <li>{@link mapping.impl.MappingDiagramImpl#getPlatformInputControll <em>Platform Input Controll</em>}</li>
 *   <li>{@link mapping.impl.MappingDiagramImpl#getPlatformBaseCode <em>Platform Base Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingDiagramImpl extends MinimalEObjectImpl.Container implements MappingDiagram {
	/**
	 * The cached value of the '{@link #getEditorInputEvents() <em>Editor Input Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorInputEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<EditorInputEvent> editorInputEvents;

	/**
	 * The cached value of the '{@link #getEditorOutputEvents() <em>Editor Output Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditorOutputEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<EditorOutputEvent> editorOutputEvents;

	/**
	 * The cached value of the '{@link #getPlatformInputEvents() <em>Platform Input Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformInputEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<PlatformInputEventCode> platformInputEvents;

	/**
	 * The cached value of the '{@link #getPlatformOutputEvents() <em>Platform Output Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformOutputEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<PlatformOutputEventCode> platformOutputEvents;

	/**
	 * The cached value of the '{@link #getPlatformIElementSetters() <em>Platform IElement Setters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformIElementSetters()
	 * @generated
	 * @ordered
	 */
	protected EList<PlatformIElementCode> platformIElementSetters;

	/**
	 * The cached value of the '{@link #getPlatformLElementOperations() <em>Platform LElement Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformLElementOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<PlatformLElementCode> platformLElementOperations;

	/**
	 * The cached value of the '{@link #getPlatformOutputControll() <em>Platform Output Controll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformOutputControll()
	 * @generated
	 * @ordered
	 */
	protected PlatformOutputControllCode platformOutputControll;

	/**
	 * The cached value of the '{@link #getPlatformInputControll() <em>Platform Input Controll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformInputControll()
	 * @generated
	 * @ordered
	 */
	protected PlatformInputControllCode platformInputControll;

	/**
	 * The cached value of the '{@link #getPlatformBaseCode() <em>Platform Base Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformBaseCode()
	 * @generated
	 * @ordered
	 */
	protected PlatformControllCode platformBaseCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.MAPPING_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EditorInputEvent> getEditorInputEvents() {
		if (editorInputEvents == null) {
			editorInputEvents = new EObjectContainmentEList<EditorInputEvent>(EditorInputEvent.class, this, MappingPackage.MAPPING_DIAGRAM__EDITOR_INPUT_EVENTS);
		}
		return editorInputEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EditorOutputEvent> getEditorOutputEvents() {
		if (editorOutputEvents == null) {
			editorOutputEvents = new EObjectContainmentEList<EditorOutputEvent>(EditorOutputEvent.class, this, MappingPackage.MAPPING_DIAGRAM__EDITOR_OUTPUT_EVENTS);
		}
		return editorOutputEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlatformInputEventCode> getPlatformInputEvents() {
		if (platformInputEvents == null) {
			platformInputEvents = new EObjectContainmentEList<PlatformInputEventCode>(PlatformInputEventCode.class, this, MappingPackage.MAPPING_DIAGRAM__PLATFORM_INPUT_EVENTS);
		}
		return platformInputEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlatformOutputEventCode> getPlatformOutputEvents() {
		if (platformOutputEvents == null) {
			platformOutputEvents = new EObjectContainmentEList<PlatformOutputEventCode>(PlatformOutputEventCode.class, this, MappingPackage.MAPPING_DIAGRAM__PLATFORM_OUTPUT_EVENTS);
		}
		return platformOutputEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlatformIElementCode> getPlatformIElementSetters() {
		if (platformIElementSetters == null) {
			platformIElementSetters = new EObjectContainmentEList<PlatformIElementCode>(PlatformIElementCode.class, this, MappingPackage.MAPPING_DIAGRAM__PLATFORM_IELEMENT_SETTERS);
		}
		return platformIElementSetters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlatformLElementCode> getPlatformLElementOperations() {
		if (platformLElementOperations == null) {
			platformLElementOperations = new EObjectContainmentEList<PlatformLElementCode>(PlatformLElementCode.class, this, MappingPackage.MAPPING_DIAGRAM__PLATFORM_LELEMENT_OPERATIONS);
		}
		return platformLElementOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformOutputControllCode getPlatformOutputControll() {
		return platformOutputControll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatformOutputControll(PlatformOutputControllCode newPlatformOutputControll, NotificationChain msgs) {
		PlatformOutputControllCode oldPlatformOutputControll = platformOutputControll;
		platformOutputControll = newPlatformOutputControll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING_DIAGRAM__PLATFORM_OUTPUT_CONTROLL, oldPlatformOutputControll, newPlatformOutputControll);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformOutputControll(PlatformOutputControllCode newPlatformOutputControll) {
		if (newPlatformOutputControll != platformOutputControll) {
			NotificationChain msgs = null;
			if (platformOutputControll != null)
				msgs = ((InternalEObject)platformOutputControll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingPackage.MAPPING_DIAGRAM__PLATFORM_OUTPUT_CONTROLL, null, msgs);
			if (newPlatformOutputControll != null)
				msgs = ((InternalEObject)newPlatformOutputControll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingPackage.MAPPING_DIAGRAM__PLATFORM_OUTPUT_CONTROLL, null, msgs);
			msgs = basicSetPlatformOutputControll(newPlatformOutputControll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING_DIAGRAM__PLATFORM_OUTPUT_CONTROLL, newPlatformOutputControll, newPlatformOutputControll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformInputControllCode getPlatformInputControll() {
		return platformInputControll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatformInputControll(PlatformInputControllCode newPlatformInputControll, NotificationChain msgs) {
		PlatformInputControllCode oldPlatformInputControll = platformInputControll;
		platformInputControll = newPlatformInputControll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING_DIAGRAM__PLATFORM_INPUT_CONTROLL, oldPlatformInputControll, newPlatformInputControll);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformInputControll(PlatformInputControllCode newPlatformInputControll) {
		if (newPlatformInputControll != platformInputControll) {
			NotificationChain msgs = null;
			if (platformInputControll != null)
				msgs = ((InternalEObject)platformInputControll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingPackage.MAPPING_DIAGRAM__PLATFORM_INPUT_CONTROLL, null, msgs);
			if (newPlatformInputControll != null)
				msgs = ((InternalEObject)newPlatformInputControll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingPackage.MAPPING_DIAGRAM__PLATFORM_INPUT_CONTROLL, null, msgs);
			msgs = basicSetPlatformInputControll(newPlatformInputControll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING_DIAGRAM__PLATFORM_INPUT_CONTROLL, newPlatformInputControll, newPlatformInputControll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformControllCode getPlatformBaseCode() {
		return platformBaseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatformBaseCode(PlatformControllCode newPlatformBaseCode, NotificationChain msgs) {
		PlatformControllCode oldPlatformBaseCode = platformBaseCode;
		platformBaseCode = newPlatformBaseCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING_DIAGRAM__PLATFORM_BASE_CODE, oldPlatformBaseCode, newPlatformBaseCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformBaseCode(PlatformControllCode newPlatformBaseCode) {
		if (newPlatformBaseCode != platformBaseCode) {
			NotificationChain msgs = null;
			if (platformBaseCode != null)
				msgs = ((InternalEObject)platformBaseCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingPackage.MAPPING_DIAGRAM__PLATFORM_BASE_CODE, null, msgs);
			if (newPlatformBaseCode != null)
				msgs = ((InternalEObject)newPlatformBaseCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingPackage.MAPPING_DIAGRAM__PLATFORM_BASE_CODE, null, msgs);
			msgs = basicSetPlatformBaseCode(newPlatformBaseCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING_DIAGRAM__PLATFORM_BASE_CODE, newPlatformBaseCode, newPlatformBaseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.MAPPING_DIAGRAM__EDITOR_INPUT_EVENTS:
				return ((InternalEList<?>)getEditorInputEvents()).basicRemove(otherEnd, msgs);
			case MappingPackage.MAPPING_DIAGRAM__EDITOR_OUTPUT_EVENTS:
				return ((InternalEList<?>)getEditorOutputEvents()).basicRemove(otherEnd, msgs);
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_INPUT_EVENTS:
				return ((InternalEList<?>)getPlatformInputEvents()).basicRemove(otherEnd, msgs);
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_OUTPUT_EVENTS:
				return ((InternalEList<?>)getPlatformOutputEvents()).basicRemove(otherEnd, msgs);
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_IELEMENT_SETTERS:
				return ((InternalEList<?>)getPlatformIElementSetters()).basicRemove(otherEnd, msgs);
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_LELEMENT_OPERATIONS:
				return ((InternalEList<?>)getPlatformLElementOperations()).basicRemove(otherEnd, msgs);
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_OUTPUT_CONTROLL:
				return basicSetPlatformOutputControll(null, msgs);
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_INPUT_CONTROLL:
				return basicSetPlatformInputControll(null, msgs);
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_BASE_CODE:
				return basicSetPlatformBaseCode(null, msgs);
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
			case MappingPackage.MAPPING_DIAGRAM__EDITOR_INPUT_EVENTS:
				return getEditorInputEvents();
			case MappingPackage.MAPPING_DIAGRAM__EDITOR_OUTPUT_EVENTS:
				return getEditorOutputEvents();
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_INPUT_EVENTS:
				return getPlatformInputEvents();
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_OUTPUT_EVENTS:
				return getPlatformOutputEvents();
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_IELEMENT_SETTERS:
				return getPlatformIElementSetters();
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_LELEMENT_OPERATIONS:
				return getPlatformLElementOperations();
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_OUTPUT_CONTROLL:
				return getPlatformOutputControll();
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_INPUT_CONTROLL:
				return getPlatformInputControll();
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_BASE_CODE:
				return getPlatformBaseCode();
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
			case MappingPackage.MAPPING_DIAGRAM__EDITOR_INPUT_EVENTS:
				getEditorInputEvents().clear();
				getEditorInputEvents().addAll((Collection<? extends EditorInputEvent>)newValue);
				return;
			case MappingPackage.MAPPING_DIAGRAM__EDITOR_OUTPUT_EVENTS:
				getEditorOutputEvents().clear();
				getEditorOutputEvents().addAll((Collection<? extends EditorOutputEvent>)newValue);
				return;
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_INPUT_EVENTS:
				getPlatformInputEvents().clear();
				getPlatformInputEvents().addAll((Collection<? extends PlatformInputEventCode>)newValue);
				return;
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_OUTPUT_EVENTS:
				getPlatformOutputEvents().clear();
				getPlatformOutputEvents().addAll((Collection<? extends PlatformOutputEventCode>)newValue);
				return;
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_IELEMENT_SETTERS:
				getPlatformIElementSetters().clear();
				getPlatformIElementSetters().addAll((Collection<? extends PlatformIElementCode>)newValue);
				return;
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_LELEMENT_OPERATIONS:
				getPlatformLElementOperations().clear();
				getPlatformLElementOperations().addAll((Collection<? extends PlatformLElementCode>)newValue);
				return;
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_OUTPUT_CONTROLL:
				setPlatformOutputControll((PlatformOutputControllCode)newValue);
				return;
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_INPUT_CONTROLL:
				setPlatformInputControll((PlatformInputControllCode)newValue);
				return;
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_BASE_CODE:
				setPlatformBaseCode((PlatformControllCode)newValue);
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
			case MappingPackage.MAPPING_DIAGRAM__EDITOR_INPUT_EVENTS:
				getEditorInputEvents().clear();
				return;
			case MappingPackage.MAPPING_DIAGRAM__EDITOR_OUTPUT_EVENTS:
				getEditorOutputEvents().clear();
				return;
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_INPUT_EVENTS:
				getPlatformInputEvents().clear();
				return;
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_OUTPUT_EVENTS:
				getPlatformOutputEvents().clear();
				return;
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_IELEMENT_SETTERS:
				getPlatformIElementSetters().clear();
				return;
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_LELEMENT_OPERATIONS:
				getPlatformLElementOperations().clear();
				return;
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_OUTPUT_CONTROLL:
				setPlatformOutputControll((PlatformOutputControllCode)null);
				return;
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_INPUT_CONTROLL:
				setPlatformInputControll((PlatformInputControllCode)null);
				return;
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_BASE_CODE:
				setPlatformBaseCode((PlatformControllCode)null);
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
			case MappingPackage.MAPPING_DIAGRAM__EDITOR_INPUT_EVENTS:
				return editorInputEvents != null && !editorInputEvents.isEmpty();
			case MappingPackage.MAPPING_DIAGRAM__EDITOR_OUTPUT_EVENTS:
				return editorOutputEvents != null && !editorOutputEvents.isEmpty();
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_INPUT_EVENTS:
				return platformInputEvents != null && !platformInputEvents.isEmpty();
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_OUTPUT_EVENTS:
				return platformOutputEvents != null && !platformOutputEvents.isEmpty();
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_IELEMENT_SETTERS:
				return platformIElementSetters != null && !platformIElementSetters.isEmpty();
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_LELEMENT_OPERATIONS:
				return platformLElementOperations != null && !platformLElementOperations.isEmpty();
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_OUTPUT_CONTROLL:
				return platformOutputControll != null;
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_INPUT_CONTROLL:
				return platformInputControll != null;
			case MappingPackage.MAPPING_DIAGRAM__PLATFORM_BASE_CODE:
				return platformBaseCode != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingDiagramImpl
