/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.Point3#getLongD <em>Long D</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.Point3#getLongM <em>Long M</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.Point3#getLongS <em>Long S</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.Point3#getLatD <em>Lat D</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.Point3#getLatM <em>Lat M</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.Point3#getLatS <em>Lat S</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getPoint3()
 * @model
 * @generated
 */
public interface Point3 extends Point
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
   * @see www.ubx.ch.openAir.OpenAirPackage#getPoint3_LongD()
   * @model containment="true"
   * @generated
   */
  LongDegr getLongD();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Point3#getLongD <em>Long D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long D</em>' containment reference.
   * @see #getLongD()
   * @generated
   */
  void setLongD(LongDegr value);

  /**
   * Returns the value of the '<em><b>Long M</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Long M</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Long M</em>' containment reference.
   * @see #setLongM(MinSec)
   * @see www.ubx.ch.openAir.OpenAirPackage#getPoint3_LongM()
   * @model containment="true"
   * @generated
   */
  MinSec getLongM();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Point3#getLongM <em>Long M</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long M</em>' containment reference.
   * @see #getLongM()
   * @generated
   */
  void setLongM(MinSec value);

  /**
   * Returns the value of the '<em><b>Long S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Long S</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Long S</em>' containment reference.
   * @see #setLongS(SecDec)
   * @see www.ubx.ch.openAir.OpenAirPackage#getPoint3_LongS()
   * @model containment="true"
   * @generated
   */
  SecDec getLongS();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Point3#getLongS <em>Long S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long S</em>' containment reference.
   * @see #getLongS()
   * @generated
   */
  void setLongS(SecDec value);

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
   * @see www.ubx.ch.openAir.OpenAirPackage#getPoint3_LatD()
   * @model containment="true"
   * @generated
   */
  LatDegr getLatD();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Point3#getLatD <em>Lat D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lat D</em>' containment reference.
   * @see #getLatD()
   * @generated
   */
  void setLatD(LatDegr value);

  /**
   * Returns the value of the '<em><b>Lat M</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lat M</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lat M</em>' containment reference.
   * @see #setLatM(MinSec)
   * @see www.ubx.ch.openAir.OpenAirPackage#getPoint3_LatM()
   * @model containment="true"
   * @generated
   */
  MinSec getLatM();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Point3#getLatM <em>Lat M</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lat M</em>' containment reference.
   * @see #getLatM()
   * @generated
   */
  void setLatM(MinSec value);

  /**
   * Returns the value of the '<em><b>Lat S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lat S</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lat S</em>' containment reference.
   * @see #setLatS(SecDec)
   * @see www.ubx.ch.openAir.OpenAirPackage#getPoint3_LatS()
   * @model containment="true"
   * @generated
   */
  SecDec getLatS();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Point3#getLatS <em>Lat S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lat S</em>' containment reference.
   * @see #getLatS()
   * @generated
   */
  void setLatS(SecDec value);

} // Point3
