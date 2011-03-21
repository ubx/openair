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

import www.ubx.ch.openAir.LatDec;
import www.ubx.ch.openAir.LongDec;
import www.ubx.ch.openAir.OpenAirPackage;
import www.ubx.ch.openAir.Point4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.Point4Impl#getLongD <em>Long D</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.Point4Impl#getLatD <em>Lat D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Point4Impl extends PointImpl implements Point4
{
  /**
   * The cached value of the '{@link #getLongD() <em>Long D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongD()
   * @generated
   * @ordered
   */
  protected LongDec longD;

  /**
   * The cached value of the '{@link #getLatD() <em>Lat D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLatD()
   * @generated
   * @ordered
   */
  protected LatDec latD;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Point4Impl()
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
    return OpenAirPackage.Literals.POINT4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LongDec getLongD()
  {
    return longD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLongD(LongDec newLongD, NotificationChain msgs)
  {
    LongDec oldLongD = longD;
    longD = newLongD;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT4__LONG_D, oldLongD, newLongD);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongD(LongDec newLongD)
  {
    if (newLongD != longD)
    {
      NotificationChain msgs = null;
      if (longD != null)
        msgs = ((InternalEObject)longD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT4__LONG_D, null, msgs);
      if (newLongD != null)
        msgs = ((InternalEObject)newLongD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT4__LONG_D, null, msgs);
      msgs = basicSetLongD(newLongD, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT4__LONG_D, newLongD, newLongD));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LatDec getLatD()
  {
    return latD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLatD(LatDec newLatD, NotificationChain msgs)
  {
    LatDec oldLatD = latD;
    latD = newLatD;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT4__LAT_D, oldLatD, newLatD);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLatD(LatDec newLatD)
  {
    if (newLatD != latD)
    {
      NotificationChain msgs = null;
      if (latD != null)
        msgs = ((InternalEObject)latD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT4__LAT_D, null, msgs);
      if (newLatD != null)
        msgs = ((InternalEObject)newLatD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT4__LAT_D, null, msgs);
      msgs = basicSetLatD(newLatD, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT4__LAT_D, newLatD, newLatD));
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
      case OpenAirPackage.POINT4__LONG_D:
        return basicSetLongD(null, msgs);
      case OpenAirPackage.POINT4__LAT_D:
        return basicSetLatD(null, msgs);
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
      case OpenAirPackage.POINT4__LONG_D:
        return getLongD();
      case OpenAirPackage.POINT4__LAT_D:
        return getLatD();
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
      case OpenAirPackage.POINT4__LONG_D:
        setLongD((LongDec)newValue);
        return;
      case OpenAirPackage.POINT4__LAT_D:
        setLatD((LatDec)newValue);
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
      case OpenAirPackage.POINT4__LONG_D:
        setLongD((LongDec)null);
        return;
      case OpenAirPackage.POINT4__LAT_D:
        setLatD((LatDec)null);
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
      case OpenAirPackage.POINT4__LONG_D:
        return longD != null;
      case OpenAirPackage.POINT4__LAT_D:
        return latD != null;
    }
    return super.eIsSet(featureID);
  }

} //Point4Impl
