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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import www.ubx.ch.openAir.Limites;
import www.ubx.ch.openAir.LowLimit;
import www.ubx.ch.openAir.OpenAirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Limites</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.LimitesImpl#getLowLimit <em>Low Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LimitesImpl extends MinimalEObjectImpl.Container implements Limites
{
  /**
   * The cached value of the '{@link #getLowLimit() <em>Low Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowLimit()
   * @generated
   * @ordered
   */
  protected LowLimit lowLimit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LimitesImpl()
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
    return OpenAirPackage.Literals.LIMITES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LowLimit getLowLimit()
  {
    return lowLimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLowLimit(LowLimit newLowLimit, NotificationChain msgs)
  {
    LowLimit oldLowLimit = lowLimit;
    lowLimit = newLowLimit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.LIMITES__LOW_LIMIT, oldLowLimit, newLowLimit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowLimit(LowLimit newLowLimit)
  {
    if (newLowLimit != lowLimit)
    {
      NotificationChain msgs = null;
      if (lowLimit != null)
        msgs = ((InternalEObject)lowLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.LIMITES__LOW_LIMIT, null, msgs);
      if (newLowLimit != null)
        msgs = ((InternalEObject)newLowLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.LIMITES__LOW_LIMIT, null, msgs);
      msgs = basicSetLowLimit(newLowLimit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.LIMITES__LOW_LIMIT, newLowLimit, newLowLimit));
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
      case OpenAirPackage.LIMITES__LOW_LIMIT:
        return basicSetLowLimit(null, msgs);
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
      case OpenAirPackage.LIMITES__LOW_LIMIT:
        return getLowLimit();
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
      case OpenAirPackage.LIMITES__LOW_LIMIT:
        setLowLimit((LowLimit)newValue);
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
      case OpenAirPackage.LIMITES__LOW_LIMIT:
        setLowLimit((LowLimit)null);
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
      case OpenAirPackage.LIMITES__LOW_LIMIT:
        return lowLimit != null;
    }
    return super.eIsSet(featureID);
  }

} //LimitesImpl
