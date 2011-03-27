/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radius</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.Radius#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.Radius#getReakValuer <em>Reak Valuer</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getRadius()
 * @model
 * @generated
 */
public interface Radius extends EObject
{
  /**
   * Returns the value of the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Value</em>' attribute.
   * @see #setIntValue(int)
   * @see www.ubx.ch.openAir.OpenAirPackage#getRadius_IntValue()
   * @model
   * @generated
   */
  int getIntValue();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Radius#getIntValue <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int Value</em>' attribute.
   * @see #getIntValue()
   * @generated
   */
  void setIntValue(int value);

  /**
   * Returns the value of the '<em><b>Reak Valuer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reak Valuer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reak Valuer</em>' attribute.
   * @see #setReakValuer(String)
   * @see www.ubx.ch.openAir.OpenAirPackage#getRadius_ReakValuer()
   * @model
   * @generated
   */
  String getReakValuer();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Radius#getReakValuer <em>Reak Valuer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reak Valuer</em>' attribute.
   * @see #getReakValuer()
   * @generated
   */
  void setReakValuer(String value);

} // Radius
