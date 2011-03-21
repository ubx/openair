/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.Point4#getLongD <em>Long D</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.Point4#getLatD <em>Lat D</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getPoint4()
 * @model
 * @generated
 */
public interface Point4 extends Point
{
  /**
   * Returns the value of the '<em><b>Long D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Long D</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Long D</em>' containment reference.
   * @see #setLongD(LongDec)
   * @see www.ubx.ch.openAir.OpenAirPackage#getPoint4_LongD()
   * @model containment="true"
   * @generated
   */
  LongDec getLongD();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Point4#getLongD <em>Long D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long D</em>' containment reference.
   * @see #getLongD()
   * @generated
   */
  void setLongD(LongDec value);

  /**
   * Returns the value of the '<em><b>Lat D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lat D</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lat D</em>' containment reference.
   * @see #setLatD(LatDec)
   * @see www.ubx.ch.openAir.OpenAirPackage#getPoint4_LatD()
   * @model containment="true"
   * @generated
   */
  LatDec getLatD();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Point4#getLatD <em>Lat D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lat D</em>' containment reference.
   * @see #getLatD()
   * @generated
   */
  void setLatD(LatDec value);

} // Point4
