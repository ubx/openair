/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VAL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.VAL#getValue <em>Value</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.VAL#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see www.ubx.ch.openAir.OpenAirPackage#getVAL()
 * @model
 * @generated
 */
public interface VAL extends Limit
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
   * @see www.ubx.ch.openAir.OpenAirPackage#getVAL_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.VAL#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * The literals are from the enumeration {@link www.ubx.ch.openAir.Units}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see www.ubx.ch.openAir.Units
   * @see #setUnit(Units)
   * @see www.ubx.ch.openAir.OpenAirPackage#getVAL_Unit()
   * @model
   * @generated
   */
  Units getUnit();

  /**
   * Sets the value of the '{@link www.ubx.ch.openAir.VAL#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see www.ubx.ch.openAir.Units
   * @see #getUnit()
   * @generated
   */
  void setUnit(Units value);

} // VAL
