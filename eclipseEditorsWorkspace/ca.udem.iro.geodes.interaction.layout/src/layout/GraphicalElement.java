/**
 */
package layout;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphical Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link layout.GraphicalElement#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link layout.GraphicalElement#getForegroudColor <em>Foregroud Color</em>}</li>
 *   <li>{@link layout.GraphicalElement#getBorder <em>Border</em>}</li>
 *   <li>{@link layout.GraphicalElement#getBorderPattern <em>Border Pattern</em>}</li>
 *   <li>{@link layout.GraphicalElement#getHeight <em>Height</em>}</li>
 *   <li>{@link layout.GraphicalElement#getWith <em>With</em>}</li>
 * </ul>
 *
 * @see layout.LayoutPackage#getGraphicalElement()
 * @model
 * @generated
 */
public interface GraphicalElement extends Element {
	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see #setBackgroundColor(int)
	 * @see layout.LayoutPackage#getGraphicalElement_BackgroundColor()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getBackgroundColor();

	/**
	 * Sets the value of the '{@link layout.GraphicalElement#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(int value);

	/**
	 * Returns the value of the '<em><b>Foregroud Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foregroud Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foregroud Color</em>' attribute.
	 * @see #setForegroudColor(int)
	 * @see layout.LayoutPackage#getGraphicalElement_ForegroudColor()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getForegroudColor();

	/**
	 * Sets the value of the '{@link layout.GraphicalElement#getForegroudColor <em>Foregroud Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foregroud Color</em>' attribute.
	 * @see #getForegroudColor()
	 * @generated
	 */
	void setForegroudColor(int value);

	/**
	 * Returns the value of the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' attribute.
	 * @see #setBorder(int)
	 * @see layout.LayoutPackage#getGraphicalElement_Border()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getBorder();

	/**
	 * Sets the value of the '{@link layout.GraphicalElement#getBorder <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border</em>' attribute.
	 * @see #getBorder()
	 * @generated
	 */
	void setBorder(int value);

	/**
	 * Returns the value of the '<em><b>Border Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Pattern</em>' attribute.
	 * @see #setBorderPattern(String)
	 * @see layout.LayoutPackage#getGraphicalElement_BorderPattern()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getBorderPattern();

	/**
	 * Sets the value of the '{@link layout.GraphicalElement#getBorderPattern <em>Border Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Pattern</em>' attribute.
	 * @see #getBorderPattern()
	 * @generated
	 */
	void setBorderPattern(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see layout.LayoutPackage#getGraphicalElement_Height()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link layout.GraphicalElement#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With</em>' attribute.
	 * @see #setWith(int)
	 * @see layout.LayoutPackage#getGraphicalElement_With()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	int getWith();

	/**
	 * Sets the value of the '{@link layout.GraphicalElement#getWith <em>With</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With</em>' attribute.
	 * @see #getWith()
	 * @generated
	 */
	void setWith(int value);

} // GraphicalElement
