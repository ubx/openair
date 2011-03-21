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

import www.ubx.ch.openAir.AT;
import www.ubx.ch.openAir.OpenAirPackage;
import www.ubx.ch.openAir.Point;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.ATImpl#getLp <em>Lp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ATImpl extends MinimalEObjectImpl.Container implements AT
{
  /**
   * The cached value of the '{@link #getLp() <em>Lp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLp()
   * @generated
   * @ordered
   */
  protected Point lp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ATImpl()
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
    return OpenAirPackage.Literals.AT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point getLp()
  {
    return lp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLp(Point newLp, NotificationChain msgs)
  {
    Point oldLp = lp;
    lp = newLp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.AT__LP, oldLp, newLp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLp(Point newLp)
  {
    if (newLp != lp)
    {
      NotificationChain msgs = null;
      if (lp != null)
        msgs = ((InternalEObject)lp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.AT__LP, null, msgs);
      if (newLp != null)
        msgs = ((InternalEObject)newLp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.AT__LP, null, msgs);
      msgs = basicSetLp(newLp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.AT__LP, newLp, newLp));
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
      case OpenAirPackage.AT__LP:
        return basicSetLp(null, msgs);
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
      case OpenAirPackage.AT__LP:
        return getLp();
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
      case OpenAirPackage.AT__LP:
        setLp((Point)newValue);
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
      case OpenAirPackage.AT__LP:
        setLp((Point)null);
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
      case OpenAirPackage.AT__LP:
        return lp != null;
    }
    return super.eIsSet(featureID);
  }

} //ATImpl
