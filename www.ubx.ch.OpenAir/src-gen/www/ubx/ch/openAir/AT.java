/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.AT#getLp <em>Lp</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getAT()
 * @model
 * @generated
 */
public interface AT extends EObject
{
  /**
   * Returns the value of the '<em><b>Lp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lp</em>' containment reference.
   * @see #setLp(Point)
   * @see www.ubx.ch.openAir.OpenAirPackage#getAT_Lp()
   * @model containment="true"
   * @generated
   */
  Point getLp();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.AT#getLp <em>Lp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lp</em>' containment reference.
   * @see #getLp()
   * @generated
   */
  void setLp(Point value);

} // AT
