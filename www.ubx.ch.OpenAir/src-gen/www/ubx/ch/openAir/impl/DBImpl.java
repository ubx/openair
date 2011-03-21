/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import www.ubx.ch.openAir.DB;
import www.ubx.ch.openAir.OpenAirPackage;
import www.ubx.ch.openAir.Point;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.DBImpl#getDp0 <em>Dp0</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.DBImpl#getDp1 <em>Dp1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DBImpl extends TheGeomImpl implements DB
{
  /**
   * The cached value of the '{@link #getDp0() <em>Dp0</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDp0()
   * @generated
   * @ordered
   */
  protected Point dp0;

  /**
   * The cached value of the '{@link #getDp1() <em>Dp1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDp1()
   * @generated
   * @ordered
   */
  protected Point dp1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DBImpl()
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
    return OpenAirPackage.Literals.DB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point getDp0()
  {
    return dp0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDp0(Point newDp0, NotificationChain msgs)
  {
    Point oldDp0 = dp0;
    dp0 = newDp0;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.DB__DP0, oldDp0, newDp0);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDp0(Point newDp0)
  {
    if (newDp0 != dp0)
    {
      NotificationChain msgs = null;
      if (dp0 != null)
        msgs = ((InternalEObject)dp0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.DB__DP0, null, msgs);
      if (newDp0 != null)
        msgs = ((InternalEObject)newDp0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.DB__DP0, null, msgs);
      msgs = basicSetDp0(newDp0, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.DB__DP0, newDp0, newDp0));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point getDp1()
  {
    return dp1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDp1(Point newDp1, NotificationChain msgs)
  {
    Point oldDp1 = dp1;
    dp1 = newDp1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.DB__DP1, oldDp1, newDp1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDp1(Point newDp1)
  {
    if (newDp1 != dp1)
    {
      NotificationChain msgs = null;
      if (dp1 != null)
        msgs = ((InternalEObject)dp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.DB__DP1, null, msgs);
      if (newDp1 != null)
        msgs = ((InternalEObject)newDp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.DB__DP1, null, msgs);
      msgs = basicSetDp1(newDp1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.DB__DP1, newDp1, newDp1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OpenAirPackage.DB__DP0:
        return basicSetDp0(null, msgs);
      case OpenAirPackage.DB__DP1:
        return basicSetDp1(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case OpenAirPackage.DB__DP0:
        return getDp0();
      case OpenAirPackage.DB__DP1:
        return getDp1();
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
      case OpenAirPackage.DB__DP0:
        setDp0((Point)newValue);
        return;
      case OpenAirPackage.DB__DP1:
        setDp1((Point)newValue);
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
      case OpenAirPackage.DB__DP0:
        setDp0((Point)null);
        return;
      case OpenAirPackage.DB__DP1:
        setDp1((Point)null);
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
      case OpenAirPackage.DB__DP0:
        return dp0 != null;
      case OpenAirPackage.DB__DP1:
        return dp1 != null;
    }
    return super.eIsSet(featureID);
  }

} //DBImpl
