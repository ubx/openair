/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Limites</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.Limites#getLowLimit <em>Low Limit</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.Limites#getHighLimit <em>High Limit</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.Limites#getHeighLimit <em>Heigh Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getLimites()
 * @model
 * @generated
 */
public interface Limites extends EObject
{
  /**
   * Returns the value of the '<em><b>Low Limit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Low Limit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Low Limit</em>' containment reference.
   * @see #setLowLimit(LowLimit)
   * @see www.ubx.ch.openAir.OpenAirPackage#getLimites_LowLimit()
   * @model containment="true"
   * @generated
   */
  LowLimit getLowLimit();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Limites#getLowLimit <em>Low Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Low Limit</em>' containment reference.
   * @see #getLowLimit()
   * @generated
   */
  void setLowLimit(LowLimit value);

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
   * @see www.ubx.ch.openAir.OpenAirPackage#getLimites_HighLimit()
   * @model containment="true"
   * @generated
   */
  HighLimit getHighLimit();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Limites#getHighLimit <em>High Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>High Limit</em>' containment reference.
   * @see #getHighLimit()
   * @generated
   */
  void setHighLimit(HighLimit value);

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
   * @see www.ubx.ch.openAir.OpenAirPackage#getLimites_HeighLimit()
   * @model containment="true"
   * @generated
   */
  HighLimit getHeighLimit();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Limites#getHeighLimit <em>Heigh Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Heigh Limit</em>' containment reference.
   * @see #getHeighLimit()
   * @generated
   */
  void setHeighLimit(HighLimit value);

} // Limites
