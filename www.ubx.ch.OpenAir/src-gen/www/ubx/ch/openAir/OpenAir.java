/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Air</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.OpenAir#getAirspaces <em>Airspaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getOpenAir()
 * @model
 * @generated
 */
public interface OpenAir extends EObject
{
  /**
   * Returns the value of the '<em><b>Airspaces</b></em>' containment reference list.
   * The list contents are of type {@link www.ubx.ch.openAir.Airspace}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Airspaces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Airspaces</em>' containment reference list.
   * @see www.ubx.ch.openAir.OpenAirPackage#getOpenAir_Airspaces()
   * @model containment="true"
   * @generated
   */
  EList<Airspace> getAirspaces();

} // OpenAir
