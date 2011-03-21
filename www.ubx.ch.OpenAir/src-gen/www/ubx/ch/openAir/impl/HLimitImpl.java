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

import www.ubx.ch.openAir.HLimit;
import www.ubx.ch.openAir.HighLimit;
import www.ubx.ch.openAir.OpenAirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HLimit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.HLimitImpl#getHeighLimit <em>Heigh Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HLimitImpl extends LimitesImpl implements HLimit
{
  /**
   * The cached value of the '{@link #getHeighLimit() <em>Heigh Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeighLimit()
   * @generated
   * @ordered
   */
  protected HighLimit heighLimit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HLimitImpl()
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
    return OpenAirPackage.Literals.HLIMIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HighLimit getHeighLimit()
  {
    return heighLimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeighLimit(HighLimit newHeighLimit, NotificationChain msgs)
  {
    HighLimit oldHeighLimit = heighLimit;
    heighLimit = newHeighLimit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.HLIMIT__HEIGH_LIMIT, oldHeighLimit, newHeighLimit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeighLimit(HighLimit newHeighLimit)
  {
    if (newHeighLimit != heighLimit)
    {
      NotificationChain msgs = null;
      if (heighLimit != null)
        msgs = ((InternalEObject)heighLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.HLIMIT__HEIGH_LIMIT, null, msgs);
      if (newHeighLimit != null)
        msgs = ((InternalEObject)newHeighLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.HLIMIT__HEIGH_LIMIT, null, msgs);
      msgs = basicSetHeighLimit(newHeighLimit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.HLIMIT__HEIGH_LIMIT, newHeighLimit, newHeighLimit));
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
      case OpenAirPackage.HLIMIT__HEIGH_LIMIT:
        return basicSetHeighLimit(null, msgs);
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
      case OpenAirPackage.HLIMIT__HEIGH_LIMIT:
        return getHeighLimit();
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
      case OpenAirPackage.HLIMIT__HEIGH_LIMIT:
        setHeighLimit((HighLimit)newValue);
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
      case OpenAirPackage.HLIMIT__HEIGH_LIMIT:
        setHeighLimit((HighLimit)null);
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
      case OpenAirPackage.HLIMIT__HEIGH_LIMIT:
        return heighLimit != null;
    }
    return super.eIsSet(featureID);
  }

} //HLimitImpl
