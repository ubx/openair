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
 * A representation of the model object '<em><b>Airspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.Airspace#getThedef <em>Thedef</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.Airspace#getThegeom <em>Thegeom</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getAirspace()
 * @model
 * @generated
 */
public interface Airspace extends EObject
{
  /**
   * Returns the value of the '<em><b>Thedef</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thedef</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thedef</em>' containment reference.
   * @see #setThedef(TheDef)
   * @see www.ubx.ch.openAir.OpenAirPackage#getAirspace_Thedef()
   * @model containment="true"
   * @generated
   */
  TheDef getThedef();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Airspace#getThedef <em>Thedef</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thedef</em>' containment reference.
   * @see #getThedef()
   * @generated
   */
  void setThedef(TheDef value);

  /**
   * Returns the value of the '<em><b>Thegeom</b></em>' containment reference list.
   * The list contents are of type {@link www.ubx.ch.openAir.TheGeom}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thegeom</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thegeom</em>' containment reference list.
   * @see www.ubx.ch.openAir.OpenAirPackage#getAirspace_Thegeom()
   * @model containment="true"
   * @generated
   */
  EList<TheGeom> getThegeom();

} // Airspace
