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

import www.ubx.ch.openAir.Limit;
import www.ubx.ch.openAir.LowLimit;
import www.ubx.ch.openAir.OpenAirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Low Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.LowLimitImpl#getLl <em>Ll</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LowLimitImpl extends MinimalEObjectImpl.Container implements LowLimit
{
  /**
   * The cached value of the '{@link #getLl() <em>Ll</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLl()
   * @generated
   * @ordered
   */
  protected Limit ll;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LowLimitImpl()
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
    return OpenAirPackage.Literals.LOW_LIMIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Limit getLl()
  {
    return ll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLl(Limit newLl, NotificationChain msgs)
  {
    Limit oldLl = ll;
    ll = newLl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.LOW_LIMIT__LL, oldLl, newLl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLl(Limit newLl)
  {
    if (newLl != ll)
    {
      NotificationChain msgs = null;
      if (ll != null)
        msgs = ((InternalEObject)ll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.LOW_LIMIT__LL, null, msgs);
      if (newLl != null)
        msgs = ((InternalEObject)newLl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.LOW_LIMIT__LL, null, msgs);
      msgs = basicSetLl(newLl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.LOW_LIMIT__LL, newLl, newLl));
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
      case OpenAirPackage.LOW_LIMIT__LL:
        return basicSetLl(null, msgs);
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
      case OpenAirPackage.LOW_LIMIT__LL:
        return getLl();
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
      case OpenAirPackage.LOW_LIMIT__LL:
        setLl((Limit)newValue);
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
      case OpenAirPackage.LOW_LIMIT__LL:
        setLl((Limit)null);
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
      case OpenAirPackage.LOW_LIMIT__LL:
        return ll != null;
    }
    return super.eIsSet(featureID);
  }

} //LowLimitImpl
