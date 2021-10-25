/**
 */
package layout;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link layout.Constraint#getSource <em>Source</em>}</li>
 *   <li>{@link layout.Constraint#getTarget <em>Target</em>}</li>
 *   <li>{@link layout.Constraint#getType <em>Type</em>}</li>
 *   <li>{@link layout.Constraint#getAxis <em>Axis</em>}</li>
 *   <li>{@link layout.Constraint#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see layout.LayoutPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Anchor)
	 * @see layout.LayoutPackage#getConstraint_Source()
	 * @model
	 * @generated
	 */
	Anchor getSource();

	/**
	 * Sets the value of the '{@link layout.Constraint#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Anchor value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Anchor)
	 * @see layout.LayoutPackage#getConstraint_Target()
	 * @model
	 * @generated
	 */
	Anchor getTarget();

	/**
	 * Sets the value of the '{@link layout.Constraint#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Anchor value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link layout.ConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see layout.ConstraintType
	 * @see #setType(ConstraintType)
	 * @see layout.LayoutPackage#getConstraint_Type()
	 * @model
	 * @generated
	 */
	ConstraintType getType();

	/**
	 * Sets the value of the '{@link layout.Constraint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see layout.ConstraintType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConstraintType value);

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' attribute.
	 * The literals are from the enumeration {@link layout.ConstraintAxis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' attribute.
	 * @see layout.ConstraintAxis
	 * @see #setAxis(ConstraintAxis)
	 * @see layout.LayoutPackage#getConstraint_Axis()
	 * @model
	 * @generated
	 */
	ConstraintAxis getAxis();

	/**
	 * Sets the value of the '{@link layout.Constraint#getAxis <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' attribute.
	 * @see layout.ConstraintAxis
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(ConstraintAxis value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see layout.LayoutPackage#getConstraint_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link layout.Constraint#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // Constraint
