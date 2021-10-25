/**
 */
package layoutRel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link layoutRel.VisualElement#getXSize <em>XSize</em>}</li>
 *   <li>{@link layoutRel.VisualElement#getYSize <em>YSize</em>}</li>
 *   <li>{@link layoutRel.VisualElement#getForegroundColour <em>Foreground Colour</em>}</li>
 *   <li>{@link layoutRel.VisualElement#getBackgroundColour <em>Background Colour</em>}</li>
 *   <li>{@link layoutRel.VisualElement#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see layoutRel.LayoutRelPackage#getVisualElement()
 * @model abstract="true"
 * @generated
 */
public interface VisualElement extends Element {
	/**
	 * Returns the value of the '<em><b>XSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSize</em>' attribute.
	 * @see #setXSize(int)
	 * @see layoutRel.LayoutRelPackage#getVisualElement_XSize()
	 * @model
	 * @generated
	 */
	int getXSize();

	/**
	 * Sets the value of the '{@link layoutRel.VisualElement#getXSize <em>XSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XSize</em>' attribute.
	 * @see #getXSize()
	 * @generated
	 */
	void setXSize(int value);

	/**
	 * Returns the value of the '<em><b>YSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YSize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YSize</em>' attribute.
	 * @see #setYSize(int)
	 * @see layoutRel.LayoutRelPackage#getVisualElement_YSize()
	 * @model
	 * @generated
	 */
	int getYSize();

	/**
	 * Sets the value of the '{@link layoutRel.VisualElement#getYSize <em>YSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YSize</em>' attribute.
	 * @see #getYSize()
	 * @generated
	 */
	void setYSize(int value);

	/**
	 * Returns the value of the '<em><b>Foreground Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreground Colour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreground Colour</em>' attribute.
	 * @see #setForegroundColour(String)
	 * @see layoutRel.LayoutRelPackage#getVisualElement_ForegroundColour()
	 * @model
	 * @generated
	 */
	String getForegroundColour();

	/**
	 * Sets the value of the '{@link layoutRel.VisualElement#getForegroundColour <em>Foreground Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreground Colour</em>' attribute.
	 * @see #getForegroundColour()
	 * @generated
	 */
	void setForegroundColour(String value);

	/**
	 * Returns the value of the '<em><b>Background Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Colour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Colour</em>' attribute.
	 * @see #setBackgroundColour(String)
	 * @see layoutRel.LayoutRelPackage#getVisualElement_BackgroundColour()
	 * @model
	 * @generated
	 */
	String getBackgroundColour();

	/**
	 * Sets the value of the '{@link layoutRel.VisualElement#getBackgroundColour <em>Background Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Colour</em>' attribute.
	 * @see #getBackgroundColour()
	 * @generated
	 */
	void setBackgroundColour(String value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see layoutRel.LayoutRelPackage#getVisualElement_Ref()
	 * @model
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link layoutRel.VisualElement#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

} // VisualElement
