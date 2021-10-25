/**
 */
package mapping.impl;

import java.util.Collection;

import mapping.CodeLine;
import mapping.MappingPackage;
import mapping.PlatformControllCode;

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
 * An implementation of the model object '<em><b>Platform Controll Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mapping.impl.PlatformControllCodeImpl#getHeatherCode <em>Heather Code</em>}</li>
 *   <li>{@link mapping.impl.PlatformControllCodeImpl#getFooterCode <em>Footer Code</em>}</li>
 *   <li>{@link mapping.impl.PlatformControllCodeImpl#getCodeSeperator <em>Code Seperator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformControllCodeImpl extends MinimalEObjectImpl.Container implements PlatformControllCode {
	/**
	 * The cached value of the '{@link #getHeatherCode() <em>Heather Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeatherCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeLine> heatherCode;

	/**
	 * The cached value of the '{@link #getFooterCode() <em>Footer Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFooterCode()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeLine> footerCode;

	/**
	 * The cached value of the '{@link #getCodeSeperator() <em>Code Seperator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSeperator()
	 * @generated
	 * @ordered
	 */
	protected CodeLine codeSeperator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformControllCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.PLATFORM_CONTROLL_CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeLine> getHeatherCode() {
		if (heatherCode == null) {
			heatherCode = new EObjectContainmentEList<CodeLine>(CodeLine.class, this, MappingPackage.PLATFORM_CONTROLL_CODE__HEATHER_CODE);
		}
		return heatherCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeLine> getFooterCode() {
		if (footerCode == null) {
			footerCode = new EObjectContainmentEList<CodeLine>(CodeLine.class, this, MappingPackage.PLATFORM_CONTROLL_CODE__FOOTER_CODE);
		}
		return footerCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeLine getCodeSeperator() {
		return codeSeperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeSeperator(CodeLine newCodeSeperator, NotificationChain msgs) {
		CodeLine oldCodeSeperator = codeSeperator;
		codeSeperator = newCodeSeperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingPackage.PLATFORM_CONTROLL_CODE__CODE_SEPERATOR, oldCodeSeperator, newCodeSeperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeSeperator(CodeLine newCodeSeperator) {
		if (newCodeSeperator != codeSeperator) {
			NotificationChain msgs = null;
			if (codeSeperator != null)
				msgs = ((InternalEObject)codeSeperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingPackage.PLATFORM_CONTROLL_CODE__CODE_SEPERATOR, null, msgs);
			if (newCodeSeperator != null)
				msgs = ((InternalEObject)newCodeSeperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingPackage.PLATFORM_CONTROLL_CODE__CODE_SEPERATOR, null, msgs);
			msgs = basicSetCodeSeperator(newCodeSeperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.PLATFORM_CONTROLL_CODE__CODE_SEPERATOR, newCodeSeperator, newCodeSeperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.PLATFORM_CONTROLL_CODE__HEATHER_CODE:
				return ((InternalEList<?>)getHeatherCode()).basicRemove(otherEnd, msgs);
			case MappingPackage.PLATFORM_CONTROLL_CODE__FOOTER_CODE:
				return ((InternalEList<?>)getFooterCode()).basicRemove(otherEnd, msgs);
			case MappingPackage.PLATFORM_CONTROLL_CODE__CODE_SEPERATOR:
				return basicSetCodeSeperator(null, msgs);
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
			case MappingPackage.PLATFORM_CONTROLL_CODE__HEATHER_CODE:
				return getHeatherCode();
			case MappingPackage.PLATFORM_CONTROLL_CODE__FOOTER_CODE:
				return getFooterCode();
			case MappingPackage.PLATFORM_CONTROLL_CODE__CODE_SEPERATOR:
				return getCodeSeperator();
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
			case MappingPackage.PLATFORM_CONTROLL_CODE__HEATHER_CODE:
				getHeatherCode().clear();
				getHeatherCode().addAll((Collection<? extends CodeLine>)newValue);
				return;
			case MappingPackage.PLATFORM_CONTROLL_CODE__FOOTER_CODE:
				getFooterCode().clear();
				getFooterCode().addAll((Collection<? extends CodeLine>)newValue);
				return;
			case MappingPackage.PLATFORM_CONTROLL_CODE__CODE_SEPERATOR:
				setCodeSeperator((CodeLine)newValue);
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
			case MappingPackage.PLATFORM_CONTROLL_CODE__HEATHER_CODE:
				getHeatherCode().clear();
				return;
			case MappingPackage.PLATFORM_CONTROLL_CODE__FOOTER_CODE:
				getFooterCode().clear();
				return;
			case MappingPackage.PLATFORM_CONTROLL_CODE__CODE_SEPERATOR:
				setCodeSeperator((CodeLine)null);
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
			case MappingPackage.PLATFORM_CONTROLL_CODE__HEATHER_CODE:
				return heatherCode != null && !heatherCode.isEmpty();
			case MappingPackage.PLATFORM_CONTROLL_CODE__FOOTER_CODE:
				return footerCode != null && !footerCode.isEmpty();
			case MappingPackage.PLATFORM_CONTROLL_CODE__CODE_SEPERATOR:
				return codeSeperator != null;
		}
		return super.eIsSet(featureID);
	}

} //PlatformControllCodeImpl
