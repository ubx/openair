/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Low Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.LowLimit#getLl <em>Ll</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getLowLimit()
 * @model
 * @generated
 */
public interface LowLimit extends EObject
{
  /**
   * Returns the value of the '<em><b>Ll</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ll</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ll</em>' containment reference.
   * @see #setLl(Limit)
   * @see www.ubx.ch.openAir.OpenAirPackage#getLowLimit_Ll()
   * @model containment="true"
   * @generated
   */
  Limit getLl();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.LowLimit#getLl <em>Ll</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ll</em>' containment reference.
   * @see #getLl()
   * @generated
   */
  void setLl(Limit value);

} // LowLimit
