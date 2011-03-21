/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>As Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.AsClass#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getAsClass()
 * @model
 * @generated
 */
public interface AsClass extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The literals are from the enumeration {@link www.ubx.ch.openAir.ClassType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see www.ubx.ch.openAir.ClassType
   * @see #setName(ClassType)
   * @see www.ubx.ch.openAir.OpenAirPackage#getAsClass_Name()
   * @model
   * @generated
   */
  ClassType getName();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.AsClass#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see www.ubx.ch.openAir.ClassType
   * @see #getName()
   * @generated
   */
  void setName(ClassType value);

} // AsClass
