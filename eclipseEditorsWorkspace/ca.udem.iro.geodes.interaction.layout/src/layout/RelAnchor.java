/**
 */
package layout;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rel Anchor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link layout.RelAnchor#getXAxis <em>XAxis</em>}</li>
 *   <li>{@link layout.RelAnchor#getYAxis <em>YAxis</em>}</li>
 * </ul>
 *
 * @see layout.LayoutPackage#getRelAnchor()
 * @model
 * @generated
 */
public interface RelAnchor extends Anchor {
	/**
	 * Returns the value of the '<em><b>XAxis</b></em>' attribute.
	 * The literals are from the enumeration {@link layout.XAlign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XAxis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAxis</em>' attribute.
	 * @see layout.XAlign
	 * @see #setXAxis(XAlign)
	 * @see layout.LayoutPackage#getRelAnchor_XAxis()
	 * @model
	 * @generated
	 */
	XAlign getXAxis();

	/**
	 * Sets the value of the '{@link layout.RelAnchor#getXAxis <em>XAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAxis</em>' attribute.
	 * @see layout.XAlign
	 * @see #getXAxis()
	 * @generated
	 */
	void setXAxis(XAlign value);

	/**
	 * Returns the value of the '<em><b>YAxis</b></em>' attribute.
	 * The literals are from the enumeration {@link layout.YAlign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YAxis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAxis</em>' attribute.
	 * @see layout.YAlign
	 * @see #setYAxis(YAlign)
	 * @see layout.LayoutPackage#getRelAnchor_YAxis()
	 * @model
	 * @generated
	 */
	YAlign getYAxis();

	/**
	 * Sets the value of the '{@link layout.RelAnchor#getYAxis <em>YAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAxis</em>' attribute.
	 * @see layout.YAlign
	 * @see #getYAxis()
	 * @generated
	 */
	void setYAxis(YAlign value);

} // RelAnchor
