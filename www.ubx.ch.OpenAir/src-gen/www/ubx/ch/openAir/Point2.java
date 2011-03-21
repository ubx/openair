/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.Point2#getLongD <em>Long D</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.Point2#getLongMf <em>Long Mf</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.Point2#getLatD <em>Lat D</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.Point2#getLatMf <em>Lat Mf</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getPoint2()
 * @model
 * @generated
 */
public interface Point2 extends Point
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
   * @see #setLongD(LongDegr)
   * @see www.ubx.ch.openAir.OpenAirPackage#getPoint2_LongD()
   * @model containment="true"
   * @generated
   */
  LongDegr getLongD();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Point2#getLongD <em>Long D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long D</em>' containment reference.
   * @see #getLongD()
   * @generated
   */
  void setLongD(LongDegr value);

  /**
   * Returns the value of the '<em><b>Long Mf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Long Mf</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Long Mf</em>' containment reference.
   * @see #setLongMf(MinDec)
   * @see www.ubx.ch.openAir.OpenAirPackage#getPoint2_LongMf()
   * @model containment="true"
   * @generated
   */
  MinDec getLongMf();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Point2#getLongMf <em>Long Mf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long Mf</em>' containment reference.
   * @see #getLongMf()
   * @generated
   */
  void setLongMf(MinDec value);

  /**
   * Returns the value of the '<em><b>Lat D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lat D</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lat D</em>' containment reference.
   * @see #setLatD(LatDegr)
   * @see www.ubx.ch.openAir.OpenAirPackage#getPoint2_LatD()
   * @model containment="true"
   * @generated
   */
  LatDegr getLatD();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Point2#getLatD <em>Lat D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lat D</em>' containment reference.
   * @see #getLatD()
   * @generated
   */
  void setLatD(LatDegr value);

  /**
   * Returns the value of the '<em><b>Lat Mf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lat Mf</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lat Mf</em>' containment reference.
   * @see #setLatMf(MinDec)
   * @see www.ubx.ch.openAir.OpenAirPackage#getPoint2_LatMf()
   * @model containment="true"
   * @generated
   */
  MinDec getLatMf();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Point2#getLatMf <em>Lat Mf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lat Mf</em>' containment reference.
   * @see #getLatMf()
   * @generated
   */
  void setLatMf(MinDec value);

} // Point2
