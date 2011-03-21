/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.DC#getRadius <em>Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getDC()
 * @model
 * @generated
 */
public interface DC extends TheGeom
{
  /**
   * Returns the value of the '<em><b>Radius</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Radius</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Radius</em>' attribute.
   * @see #setRadius(String)
   * @see www.ubx.ch.openAir.OpenAirPackage#getDC_Radius()
   * @model
   * @generated
   */
  String getRadius();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.DC#getRadius <em>Radius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Radius</em>' attribute.
   * @see #getRadius()
   * @generated
   */
  void setRadius(String value);

} // DC
