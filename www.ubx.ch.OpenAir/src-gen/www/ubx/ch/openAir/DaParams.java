/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.DaParams#getAngleStart <em>Angle Start</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.DaParams#getAngleEnd <em>Angle End</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getDaParams()
 * @model
 * @generated
 */
public interface DaParams extends EObject
{
  /**
   * Returns the value of the '<em><b>Angle Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Angle Start</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Angle Start</em>' attribute.
   * @see #setAngleStart(int)
   * @see www.ubx.ch.openAir.OpenAirPackage#getDaParams_AngleStart()
   * @model
   * @generated
   */
  int getAngleStart();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.DaParams#getAngleStart <em>Angle Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Angle Start</em>' attribute.
   * @see #getAngleStart()
   * @generated
   */
  void setAngleStart(int value);

  /**
   * Returns the value of the '<em><b>Angle End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Angle End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Angle End</em>' attribute.
   * @see #setAngleEnd(int)
   * @see www.ubx.ch.openAir.OpenAirPackage#getDaParams_AngleEnd()
   * @model
   * @generated
   */
  int getAngleEnd();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.DaParams#getAngleEnd <em>Angle End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Angle End</em>' attribute.
   * @see #getAngleEnd()
   * @generated
   */
  void setAngleEnd(int value);

} // DaParams
