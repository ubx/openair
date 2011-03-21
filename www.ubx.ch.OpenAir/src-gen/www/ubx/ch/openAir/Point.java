/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.Point#getNs <em>Ns</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.Point#getWe <em>We</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends EObject
{
  /**
   * Returns the value of the '<em><b>Ns</b></em>' attribute.
   * The literals are from the enumeration {@link www.ubx.ch.openAir.NS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ns</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ns</em>' attribute.
   * @see www.ubx.ch.openAir.NS
   * @see #setNs(NS)
   * @see www.ubx.ch.openAir.OpenAirPackage#getPoint_Ns()
   * @model
   * @generated
   */
  NS getNs();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Point#getNs <em>Ns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ns</em>' attribute.
   * @see www.ubx.ch.openAir.NS
   * @see #getNs()
   * @generated
   */
  void setNs(NS value);

  /**
   * Returns the value of the '<em><b>We</b></em>' attribute.
   * The literals are from the enumeration {@link www.ubx.ch.openAir.WE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>We</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>We</em>' attribute.
   * @see www.ubx.ch.openAir.WE
   * @see #setWe(WE)
   * @see www.ubx.ch.openAir.OpenAirPackage#getPoint_We()
   * @model
   * @generated
   */
  WE getWe();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.Point#getWe <em>We</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>We</em>' attribute.
   * @see www.ubx.ch.openAir.WE
   * @see #getWe()
   * @generated
   */
  void setWe(WE value);

} // Point
