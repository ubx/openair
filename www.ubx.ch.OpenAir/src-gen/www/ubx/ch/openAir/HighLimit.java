/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>High Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.HighLimit#getHl <em>Hl</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getHighLimit()
 * @model
 * @generated
 */
public interface HighLimit extends EObject
{
  /**
   * Returns the value of the '<em><b>Hl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hl</em>' containment reference.
   * @see #setHl(Limit)
   * @see www.ubx.ch.openAir.OpenAirPackage#getHighLimit_Hl()
   * @model containment="true"
   * @generated
   */
  Limit getHl();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.HighLimit#getHl <em>Hl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hl</em>' containment reference.
   * @see #getHl()
   * @generated
   */
  void setHl(Limit value);

} // HighLimit
