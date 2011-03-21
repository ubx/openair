/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HLimit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.HLimit#getHeighLimit <em>Heigh Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getHLimit()
 * @model
 * @generated
 */
public interface HLimit extends Limites
{
  /**
   * Returns the value of the '<em><b>Heigh Limit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Heigh Limit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Heigh Limit</em>' containment reference.
   * @see #setHeighLimit(HighLimit)
   * @see www.ubx.ch.openAir.OpenAirPackage#getHLimit_HeighLimit()
   * @model containment="true"
   * @generated
   */
  HighLimit getHeighLimit();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.HLimit#getHeighLimit <em>Heigh Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Heigh Limit</em>' containment reference.
   * @see #getHeighLimit()
   * @generated
   */
  void setHeighLimit(HighLimit value);

} // HLimit
