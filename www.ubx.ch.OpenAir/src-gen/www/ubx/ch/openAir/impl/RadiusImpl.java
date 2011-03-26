/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import www.ubx.ch.openAir.OpenAirPackage;
import www.ubx.ch.openAir.Radius;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radius</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.RadiusImpl#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.RadiusImpl#getReakValuer <em>Reak Valuer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadiusImpl extends MinimalEObjectImpl.Container implements Radius
{
  /**
   * The default value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected static final int INT_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected int intValue = INT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getReakValuer() <em>Reak Valuer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReakValuer()
   * @generated
   * @ordered
   */
  protected static final String REAK_VALUER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReakValuer() <em>Reak Valuer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReakValuer()
   * @generated
   * @ordered
   */
  protected String reakValuer = REAK_VALUER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RadiusImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OpenAirPackage.Literals.RADIUS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIntValue()
  {
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntValue(int newIntValue)
  {
    int oldIntValue = intValue;
    intValue = newIntValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.RADIUS__INT_VALUE, oldIntValue, intValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReakValuer()
  {
    return reakValuer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReakValuer(String newReakValuer)
  {
    String oldReakValuer = reakValuer;
    reakValuer = newReakValuer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.RADIUS__REAK_VALUER, oldReakValuer, reakValuer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OpenAirPackage.RADIUS__INT_VALUE:
        return getIntValue();
      case OpenAirPackage.RADIUS__REAK_VALUER:
        return getReakValuer();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OpenAirPackage.RADIUS__INT_VALUE:
        setIntValue((Integer)newValue);
        return;
      case OpenAirPackage.RADIUS__REAK_VALUER:
        setReakValuer((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OpenAirPackage.RADIUS__INT_VALUE:
        setIntValue(INT_VALUE_EDEFAULT);
        return;
      case OpenAirPackage.RADIUS__REAK_VALUER:
        setReakValuer(REAK_VALUER_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OpenAirPackage.RADIUS__INT_VALUE:
        return intValue != INT_VALUE_EDEFAULT;
      case OpenAirPackage.RADIUS__REAK_VALUER:
        return REAK_VALUER_EDEFAULT == null ? reakValuer != null : !REAK_VALUER_EDEFAULT.equals(reakValuer);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (intValue: ");
    result.append(intValue);
    result.append(", reakValuer: ");
    result.append(reakValuer);
    result.append(')');
    return result.toString();
  }

} //RadiusImpl
