/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.DP#getDp <em>Dp</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getDP()
 * @model
 * @generated
 */
public interface DP extends TheGeom
{
  /**
   * Returns the value of the '<em><b>Dp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dp</em>' containment reference.
   * @see #setDp(Point)
   * @see www.ubx.ch.openAir.OpenAirPackage#getDP_Dp()
   * @model containment="true"
   * @generated
   */
  Point getDp();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.DP#getDp <em>Dp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dp</em>' containment reference.
   * @see #getDp()
   * @generated
   */
  void setDp(Point value);

} // DP
