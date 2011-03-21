/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>V</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.V#getVsub <em>Vsub</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getV()
 * @model
 * @generated
 */
public interface V extends TheGeom
{
  /**
   * Returns the value of the '<em><b>Vsub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vsub</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vsub</em>' containment reference.
   * @see #setVsub(Vsub)
   * @see www.ubx.ch.openAir.OpenAirPackage#getV_Vsub()
   * @model containment="true"
   * @generated
   */
  Vsub getVsub();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.V#getVsub <em>Vsub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vsub</em>' containment reference.
   * @see #getVsub()
   * @generated
   */
  void setVsub(Vsub value);

} // V
