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
 * A representation of the model object '<em><b>The Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.TheDef#getAsclass <em>Asclass</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.TheDef#getSp <em>Sp</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.TheDef#getSb <em>Sb</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.TheDef#getName <em>Name</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.TheDef#getAt <em>At</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.TheDef#getLimit <em>Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getTheDef()
 * @model
 * @generated
 */
public interface TheDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Asclass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asclass</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asclass</em>' containment reference.
   * @see #setAsclass(AsClass)
   * @see www.ubx.ch.openAir.OpenAirPackage#getTheDef_Asclass()
   * @model containment="true"
   * @generated
   */
  AsClass getAsclass();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.TheDef#getAsclass <em>Asclass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asclass</em>' containment reference.
   * @see #getAsclass()
   * @generated
   */
  void setAsclass(AsClass value);

  /**
   * Returns the value of the '<em><b>Sp</b></em>' containment reference list.
   * The list contents are of type {@link www.ubx.ch.openAir.SP}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sp</em>' containment reference list.
   * @see www.ubx.ch.openAir.OpenAirPackage#getTheDef_Sp()
   * @model containment="true"
   * @generated
   */
  EList<SP> getSp();

  /**
   * Returns the value of the '<em><b>Sb</b></em>' containment reference list.
   * The list contents are of type {@link www.ubx.ch.openAir.SB}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sb</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sb</em>' containment reference list.
   * @see www.ubx.ch.openAir.OpenAirPackage#getTheDef_Sb()
   * @model containment="true"
   * @generated
   */
  EList<SB> getSb();

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(AsName)
   * @see www.ubx.ch.openAir.OpenAirPackage#getTheDef_Name()
   * @model containment="true"
   * @generated
   */
  AsName getName();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.TheDef#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(AsName value);

  /**
   * Returns the value of the '<em><b>At</b></em>' containment reference list.
   * The list contents are of type {@link www.ubx.ch.openAir.AT}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>At</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>At</em>' containment reference list.
   * @see www.ubx.ch.openAir.OpenAirPackage#getTheDef_At()
   * @model containment="true"
   * @generated
   */
  EList<AT> getAt();

  /**
   * Returns the value of the '<em><b>Limit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Limit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limit</em>' containment reference.
   * @see #setLimit(Limites)
   * @see www.ubx.ch.openAir.OpenAirPackage#getTheDef_Limit()
   * @model containment="true"
   * @generated
   */
  Limites getLimit();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.TheDef#getLimit <em>Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limit</em>' containment reference.
   * @see #getLimit()
   * @generated
   */
  void setLimit(Limites value);

} // TheDef
