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

import www.ubx.ch.openAir.DaParams;
import www.ubx.ch.openAir.OpenAirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.DaParamsImpl#getAngleStart <em>Angle Start</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.DaParamsImpl#getAngleEnd <em>Angle End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DaParamsImpl extends MinimalEObjectImpl.Container implements DaParams
{
  /**
   * The default value of the '{@link #getAngleStart() <em>Angle Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngleStart()
   * @generated
   * @ordered
   */
  protected static final int ANGLE_START_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAngleStart() <em>Angle Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngleStart()
   * @generated
   * @ordered
   */
  protected int angleStart = ANGLE_START_EDEFAULT;

  /**
   * The default value of the '{@link #getAngleEnd() <em>Angle End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngleEnd()
   * @generated
   * @ordered
   */
  protected static final int ANGLE_END_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAngleEnd() <em>Angle End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAngleEnd()
   * @generated
   * @ordered
   */
  protected int angleEnd = ANGLE_END_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DaParamsImpl()
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
    return OpenAirPackage.Literals.DA_PARAMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAngleStart()
  {
    return angleStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAngleStart(int newAngleStart)
  {
    int oldAngleStart = angleStart;
    angleStart = newAngleStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.DA_PARAMS__ANGLE_START, oldAngleStart, angleStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAngleEnd()
  {
    return angleEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAngleEnd(int newAngleEnd)
  {
    int oldAngleEnd = angleEnd;
    angleEnd = newAngleEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.DA_PARAMS__ANGLE_END, oldAngleEnd, angleEnd));
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
      case OpenAirPackage.DA_PARAMS__ANGLE_START:
        return getAngleStart();
      case OpenAirPackage.DA_PARAMS__ANGLE_END:
        return getAngleEnd();
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
      case OpenAirPackage.DA_PARAMS__ANGLE_START:
        setAngleStart((Integer)newValue);
        return;
      case OpenAirPackage.DA_PARAMS__ANGLE_END:
        setAngleEnd((Integer)newValue);
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
      case OpenAirPackage.DA_PARAMS__ANGLE_START:
        setAngleStart(ANGLE_START_EDEFAULT);
        return;
      case OpenAirPackage.DA_PARAMS__ANGLE_END:
        setAngleEnd(ANGLE_END_EDEFAULT);
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
      case OpenAirPackage.DA_PARAMS__ANGLE_START:
        return angleStart != ANGLE_START_EDEFAULT;
      case OpenAirPackage.DA_PARAMS__ANGLE_END:
        return angleEnd != ANGLE_END_EDEFAULT;
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
    result.append(" (angleStart: ");
    result.append(angleStart);
    result.append(", angleEnd: ");
    result.append(angleEnd);
    result.append(')');
    return result.toString();
  }

} //DaParamsImpl
