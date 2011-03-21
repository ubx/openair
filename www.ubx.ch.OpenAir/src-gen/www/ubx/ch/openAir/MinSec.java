/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Sec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.MinSec#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getMinSec()
 * @model
 * @generated
 */
public interface MinSec extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see www.ubx.ch.openAir.OpenAirPackage#getMinSec_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.MinSec#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // MinSec
