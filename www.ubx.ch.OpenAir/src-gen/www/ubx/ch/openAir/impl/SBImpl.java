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
import www.ubx.ch.openAir.SB;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.SBImpl#getSbVal1 <em>Sb Val1</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.SBImpl#getSbVal2 <em>Sb Val2</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.SBImpl#getSbVal3 <em>Sb Val3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SBImpl extends MinimalEObjectImpl.Container implements SB
{
  /**
   * The default value of the '{@link #getSbVal1() <em>Sb Val1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSbVal1()
   * @generated
   * @ordered
   */
  protected static final int SB_VAL1_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSbVal1() <em>Sb Val1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSbVal1()
   * @generated
   * @ordered
   */
  protected int sbVal1 = SB_VAL1_EDEFAULT;

  /**
   * The default value of the '{@link #getSbVal2() <em>Sb Val2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSbVal2()
   * @generated
   * @ordered
   */
  protected static final int SB_VAL2_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSbVal2() <em>Sb Val2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSbVal2()
   * @generated
   * @ordered
   */
  protected int sbVal2 = SB_VAL2_EDEFAULT;

  /**
   * The default value of the '{@link #getSbVal3() <em>Sb Val3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSbVal3()
   * @generated
   * @ordered
   */
  protected static final int SB_VAL3_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSbVal3() <em>Sb Val3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSbVal3()
   * @generated
   * @ordered
   */
  protected int sbVal3 = SB_VAL3_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SBImpl()
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
    return OpenAirPackage.Literals.SB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSbVal1()
  {
    return sbVal1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSbVal1(int newSbVal1)
  {
    int oldSbVal1 = sbVal1;
    sbVal1 = newSbVal1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.SB__SB_VAL1, oldSbVal1, sbVal1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSbVal2()
  {
    return sbVal2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSbVal2(int newSbVal2)
  {
    int oldSbVal2 = sbVal2;
    sbVal2 = newSbVal2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.SB__SB_VAL2, oldSbVal2, sbVal2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSbVal3()
  {
    return sbVal3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSbVal3(int newSbVal3)
  {
    int oldSbVal3 = sbVal3;
    sbVal3 = newSbVal3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.SB__SB_VAL3, oldSbVal3, sbVal3));
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
      case OpenAirPackage.SB__SB_VAL1:
        return getSbVal1();
      case OpenAirPackage.SB__SB_VAL2:
        return getSbVal2();
      case OpenAirPackage.SB__SB_VAL3:
        return getSbVal3();
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
      case OpenAirPackage.SB__SB_VAL1:
        setSbVal1((Integer)newValue);
        return;
      case OpenAirPackage.SB__SB_VAL2:
        setSbVal2((Integer)newValue);
        return;
      case OpenAirPackage.SB__SB_VAL3:
        setSbVal3((Integer)newValue);
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
      case OpenAirPackage.SB__SB_VAL1:
        setSbVal1(SB_VAL1_EDEFAULT);
        return;
      case OpenAirPackage.SB__SB_VAL2:
        setSbVal2(SB_VAL2_EDEFAULT);
        return;
      case OpenAirPackage.SB__SB_VAL3:
        setSbVal3(SB_VAL3_EDEFAULT);
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
      case OpenAirPackage.SB__SB_VAL1:
        return sbVal1 != SB_VAL1_EDEFAULT;
      case OpenAirPackage.SB__SB_VAL2:
        return sbVal2 != SB_VAL2_EDEFAULT;
      case OpenAirPackage.SB__SB_VAL3:
        return sbVal3 != SB_VAL3_EDEFAULT;
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
    result.append(" (sbVal1: ");
    result.append(sbVal1);
    result.append(", sbVal2: ");
    result.append(sbVal2);
    result.append(", sbVal3: ");
    result.append(sbVal3);
    result.append(')');
    return result.toString();
  }

} //SBImpl
