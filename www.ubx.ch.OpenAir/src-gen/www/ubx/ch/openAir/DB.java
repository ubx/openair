/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.DB#getDp0 <em>Dp0</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.DB#getDp1 <em>Dp1</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getDB()
 * @model
 * @generated
 */
public interface DB extends TheGeom
{
  /**
   * Returns the value of the '<em><b>Dp0</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dp0</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dp0</em>' containment reference.
   * @see #setDp0(Point)
   * @see www.ubx.ch.openAir.OpenAirPackage#getDB_Dp0()
   * @model containment="true"
   * @generated
   */
  Point getDp0();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.DB#getDp0 <em>Dp0</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dp0</em>' containment reference.
   * @see #getDp0()
   * @generated
   */
  void setDp0(Point value);

  /**
   * Returns the value of the '<em><b>Dp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dp1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dp1</em>' containment reference.
   * @see #setDp1(Point)
   * @see www.ubx.ch.openAir.OpenAirPackage#getDB_Dp1()
   * @model containment="true"
   * @generated
   */
  Point getDp1();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.DB#getDp1 <em>Dp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dp1</em>' containment reference.
   * @see #getDp1()
   * @generated
   */
  void setDp1(Point value);

} // DB
