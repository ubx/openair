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

import www.ubx.ch.openAir.HighLimit;
import www.ubx.ch.openAir.LLimit;
import www.ubx.ch.openAir.OpenAirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LLimit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.LLimitImpl#getHighLimit <em>High Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LLimitImpl extends LimitesImpl implements LLimit
{
  /**
   * The cached value of the '{@link #getHighLimit() <em>High Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHighLimit()
   * @generated
   * @ordered
   */
  protected HighLimit highLimit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LLimitImpl()
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
    return OpenAirPackage.Literals.LLIMIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HighLimit getHighLimit()
  {
    return highLimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHighLimit(HighLimit newHighLimit, NotificationChain msgs)
  {
    HighLimit oldHighLimit = highLimit;
    highLimit = newHighLimit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.LLIMIT__HIGH_LIMIT, oldHighLimit, newHighLimit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHighLimit(HighLimit newHighLimit)
  {
    if (newHighLimit != highLimit)
    {
      NotificationChain msgs = null;
      if (highLimit != null)
        msgs = ((InternalEObject)highLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.LLIMIT__HIGH_LIMIT, null, msgs);
      if (newHighLimit != null)
        msgs = ((InternalEObject)newHighLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.LLIMIT__HIGH_LIMIT, null, msgs);
      msgs = basicSetHighLimit(newHighLimit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.LLIMIT__HIGH_LIMIT, newHighLimit, newHighLimit));
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
      case OpenAirPackage.LLIMIT__HIGH_LIMIT:
        return basicSetHighLimit(null, msgs);
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
      case OpenAirPackage.LLIMIT__HIGH_LIMIT:
        return getHighLimit();
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
      case OpenAirPackage.LLIMIT__HIGH_LIMIT:
        setHighLimit((HighLimit)newValue);
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
      case OpenAirPackage.LLIMIT__HIGH_LIMIT:
        setHighLimit((HighLimit)null);
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
      case OpenAirPackage.LLIMIT__HIGH_LIMIT:
        return highLimit != null;
    }
    return super.eIsSet(featureID);
  }

} //LLimitImpl
