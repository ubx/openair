/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.DA#getDa <em>Da</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getDA()
 * @model
 * @generated
 */
public interface DA extends TheGeom
{
  /**
   * Returns the value of the '<em><b>Da</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Da</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Da</em>' containment reference.
   * @see #setDa(DaParams)
   * @see www.ubx.ch.openAir.OpenAirPackage#getDA_Da()
   * @model containment="true"
   * @generated
   */
  DaParams getDa();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.DA#getDa <em>Da</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Da</em>' containment reference.
   * @see #getDa()
   * @generated
   */
  void setDa(DaParams value);

} // DA
