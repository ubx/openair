/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vsub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.Vsub#getX <em>X</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.Vsub#getD <em>D</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getVsub()
 * @model
 * @generated
 */
public interface Vsub extends EObject
{
  /**
   * Returns the value of the '<em><b>X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' containment reference.
   * @see #setX(Point)
   * @see www.ubx.ch.openAir.OpenAirPackage#getVsub_X()
   * @model containment="true"
   * @generated
   */
  Point getX();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Vsub#getX <em>X</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' containment reference.
   * @see #getX()
   * @generated
   */
  void setX(Point value);

  /**
   * Returns the value of the '<em><b>D</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D</em>' attribute.
   * @see #setD(String)
   * @see www.ubx.ch.openAir.OpenAirPackage#getVsub_D()
   * @model
   * @generated
   */
  String getD();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Vsub#getD <em>D</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D</em>' attribute.
   * @see #getD()
   * @generated
   */
  void setD(String value);

} // Vsub
