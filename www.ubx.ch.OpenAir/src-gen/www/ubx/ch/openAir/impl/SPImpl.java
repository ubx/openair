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
import www.ubx.ch.openAir.SP;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.SPImpl#getSp0 <em>Sp0</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.SPImpl#getSp1 <em>Sp1</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.SPImpl#getSp2 <em>Sp2</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.SPImpl#getSp3 <em>Sp3</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.SPImpl#getSp4 <em>Sp4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SPImpl extends MinimalEObjectImpl.Container implements SP
{
  /**
   * The default value of the '{@link #getSp0() <em>Sp0</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSp0()
   * @generated
   * @ordered
   */
  protected static final int SP0_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSp0() <em>Sp0</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSp0()
   * @generated
   * @ordered
   */
  protected int sp0 = SP0_EDEFAULT;

  /**
   * The default value of the '{@link #getSp1() <em>Sp1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSp1()
   * @generated
   * @ordered
   */
  protected static final int SP1_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSp1() <em>Sp1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSp1()
   * @generated
   * @ordered
   */
  protected int sp1 = SP1_EDEFAULT;

  /**
   * The default value of the '{@link #getSp2() <em>Sp2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSp2()
   * @generated
   * @ordered
   */
  protected static final int SP2_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSp2() <em>Sp2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSp2()
   * @generated
   * @ordered
   */
  protected int sp2 = SP2_EDEFAULT;

  /**
   * The default value of the '{@link #getSp3() <em>Sp3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSp3()
   * @generated
   * @ordered
   */
  protected static final int SP3_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSp3() <em>Sp3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSp3()
   * @generated
   * @ordered
   */
  protected int sp3 = SP3_EDEFAULT;

  /**
   * The default value of the '{@link #getSp4() <em>Sp4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSp4()
   * @generated
   * @ordered
   */
  protected static final int SP4_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSp4() <em>Sp4</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSp4()
   * @generated
   * @ordered
   */
  protected int sp4 = SP4_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SPImpl()
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
    return OpenAirPackage.Literals.SP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSp0()
  {
    return sp0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSp0(int newSp0)
  {
    int oldSp0 = sp0;
    sp0 = newSp0;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.SP__SP0, oldSp0, sp0));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSp1()
  {
    return sp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSp1(int newSp1)
  {
    int oldSp1 = sp1;
    sp1 = newSp1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.SP__SP1, oldSp1, sp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSp2()
  {
    return sp2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSp2(int newSp2)
  {
    int oldSp2 = sp2;
    sp2 = newSp2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.SP__SP2, oldSp2, sp2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSp3()
  {
    return sp3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSp3(int newSp3)
  {
    int oldSp3 = sp3;
    sp3 = newSp3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.SP__SP3, oldSp3, sp3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSp4()
  {
    return sp4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSp4(int newSp4)
  {
    int oldSp4 = sp4;
    sp4 = newSp4;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.SP__SP4, oldSp4, sp4));
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
      case OpenAirPackage.SP__SP0:
        return getSp0();
      case OpenAirPackage.SP__SP1:
        return getSp1();
      case OpenAirPackage.SP__SP2:
        return getSp2();
      case OpenAirPackage.SP__SP3:
        return getSp3();
      case OpenAirPackage.SP__SP4:
        return getSp4();
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
      case OpenAirPackage.SP__SP0:
        setSp0((Integer)newValue);
        return;
      case OpenAirPackage.SP__SP1:
        setSp1((Integer)newValue);
        return;
      case OpenAirPackage.SP__SP2:
        setSp2((Integer)newValue);
        return;
      case OpenAirPackage.SP__SP3:
        setSp3((Integer)newValue);
        return;
      case OpenAirPackage.SP__SP4:
        setSp4((Integer)newValue);
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
      case OpenAirPackage.SP__SP0:
        setSp0(SP0_EDEFAULT);
        return;
      case OpenAirPackage.SP__SP1:
        setSp1(SP1_EDEFAULT);
        return;
      case OpenAirPackage.SP__SP2:
        setSp2(SP2_EDEFAULT);
        return;
      case OpenAirPackage.SP__SP3:
        setSp3(SP3_EDEFAULT);
        return;
      case OpenAirPackage.SP__SP4:
        setSp4(SP4_EDEFAULT);
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
      case OpenAirPackage.SP__SP0:
        return sp0 != SP0_EDEFAULT;
      case OpenAirPackage.SP__SP1:
        return sp1 != SP1_EDEFAULT;
      case OpenAirPackage.SP__SP2:
        return sp2 != SP2_EDEFAULT;
      case OpenAirPackage.SP__SP3:
        return sp3 != SP3_EDEFAULT;
      case OpenAirPackage.SP__SP4:
        return sp4 != SP4_EDEFAULT;
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
    result.append(" (sp0: ");
    result.append(sp0);
    result.append(", sp1: ");
    result.append(sp1);
    result.append(", sp2: ");
    result.append(sp2);
    result.append(", sp3: ");
    result.append(sp3);
    result.append(", sp4: ");
    result.append(sp4);
    result.append(')');
    return result.toString();
  }

} //SPImpl
