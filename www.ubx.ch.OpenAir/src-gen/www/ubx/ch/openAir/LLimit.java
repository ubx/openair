/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LLimit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.LLimit#getHighLimit <em>High Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getLLimit()
 * @model
 * @generated
 */
public interface LLimit extends Limites
{
  /**
   * Returns the value of the '<em><b>High Limit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>High Limit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>High Limit</em>' containment reference.
   * @see #setHighLimit(HighLimit)
   * @see www.ubx.ch.openAir.OpenAirPackage#getLLimit_HighLimit()
   * @model containment="true"
   * @generated
   */
  HighLimit getHighLimit();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.LLimit#getHighLimit <em>High Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>High Limit</em>' containment reference.
   * @see #getHighLimit()
   * @generated
   */
  void setHighLimit(HighLimit value);

} // LLimit
