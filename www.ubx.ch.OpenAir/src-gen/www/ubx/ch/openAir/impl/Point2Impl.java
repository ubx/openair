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

import www.ubx.ch.openAir.LatDegr;
import www.ubx.ch.openAir.LongDegr;
import www.ubx.ch.openAir.MinDec;
import www.ubx.ch.openAir.OpenAirPackage;
import www.ubx.ch.openAir.Point2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.Point2Impl#getLongD <em>Long D</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.Point2Impl#getLongMf <em>Long Mf</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.Point2Impl#getLatD <em>Lat D</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.Point2Impl#getLatMf <em>Lat Mf</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Point2Impl extends PointImpl implements Point2
{
  /**
   * The cached value of the '{@link #getLongD() <em>Long D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongD()
   * @generated
   * @ordered
   */
  protected LongDegr longD;

  /**
   * The cached value of the '{@link #getLongMf() <em>Long Mf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongMf()
   * @generated
   * @ordered
   */
  protected MinDec longMf;

  /**
   * The cached value of the '{@link #getLatD() <em>Lat D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLatD()
   * @generated
   * @ordered
   */
  protected LatDegr latD;

  /**
   * The cached value of the '{@link #getLatMf() <em>Lat Mf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLatMf()
   * @generated
   * @ordered
   */
  protected MinDec latMf;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Point2Impl()
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
    return OpenAirPackage.Literals.POINT2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LongDegr getLongD()
  {
    return longD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLongD(LongDegr newLongD, NotificationChain msgs)
  {
    LongDegr oldLongD = longD;
    longD = newLongD;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT2__LONG_D, oldLongD, newLongD);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongD(LongDegr newLongD)
  {
    if (newLongD != longD)
    {
      NotificationChain msgs = null;
      if (longD != null)
        msgs = ((InternalEObject)longD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT2__LONG_D, null, msgs);
      if (newLongD != null)
        msgs = ((InternalEObject)newLongD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT2__LONG_D, null, msgs);
      msgs = basicSetLongD(newLongD, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT2__LONG_D, newLongD, newLongD));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinDec getLongMf()
  {
    return longMf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLongMf(MinDec newLongMf, NotificationChain msgs)
  {
    MinDec oldLongMf = longMf;
    longMf = newLongMf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT2__LONG_MF, oldLongMf, newLongMf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongMf(MinDec newLongMf)
  {
    if (newLongMf != longMf)
    {
      NotificationChain msgs = null;
      if (longMf != null)
        msgs = ((InternalEObject)longMf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT2__LONG_MF, null, msgs);
      if (newLongMf != null)
        msgs = ((InternalEObject)newLongMf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT2__LONG_MF, null, msgs);
      msgs = basicSetLongMf(newLongMf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT2__LONG_MF, newLongMf, newLongMf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LatDegr getLatD()
  {
    return latD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLatD(LatDegr newLatD, NotificationChain msgs)
  {
    LatDegr oldLatD = latD;
    latD = newLatD;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT2__LAT_D, oldLatD, newLatD);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLatD(LatDegr newLatD)
  {
    if (newLatD != latD)
    {
      NotificationChain msgs = null;
      if (latD != null)
        msgs = ((InternalEObject)latD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT2__LAT_D, null, msgs);
      if (newLatD != null)
        msgs = ((InternalEObject)newLatD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT2__LAT_D, null, msgs);
      msgs = basicSetLatD(newLatD, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT2__LAT_D, newLatD, newLatD));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinDec getLatMf()
  {
    return latMf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLatMf(MinDec newLatMf, NotificationChain msgs)
  {
    MinDec oldLatMf = latMf;
    latMf = newLatMf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT2__LAT_MF, oldLatMf, newLatMf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLatMf(MinDec newLatMf)
  {
    if (newLatMf != latMf)
    {
      NotificationChain msgs = null;
      if (latMf != null)
        msgs = ((InternalEObject)latMf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT2__LAT_MF, null, msgs);
      if (newLatMf != null)
        msgs = ((InternalEObject)newLatMf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT2__LAT_MF, null, msgs);
      msgs = basicSetLatMf(newLatMf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT2__LAT_MF, newLatMf, newLatMf));
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
      case OpenAirPackage.POINT2__LONG_D:
        return basicSetLongD(null, msgs);
      case OpenAirPackage.POINT2__LONG_MF:
        return basicSetLongMf(null, msgs);
      case OpenAirPackage.POINT2__LAT_D:
        return basicSetLatD(null, msgs);
      case OpenAirPackage.POINT2__LAT_MF:
        return basicSetLatMf(null, msgs);
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
      case OpenAirPackage.POINT2__LONG_D:
        return getLongD();
      case OpenAirPackage.POINT2__LONG_MF:
        return getLongMf();
      case OpenAirPackage.POINT2__LAT_D:
        return getLatD();
      case OpenAirPackage.POINT2__LAT_MF:
        return getLatMf();
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
      case OpenAirPackage.POINT2__LONG_D:
        setLongD((LongDegr)newValue);
        return;
      case OpenAirPackage.POINT2__LONG_MF:
        setLongMf((MinDec)newValue);
        return;
      case OpenAirPackage.POINT2__LAT_D:
        setLatD((LatDegr)newValue);
        return;
      case OpenAirPackage.POINT2__LAT_MF:
        setLatMf((MinDec)newValue);
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
      case OpenAirPackage.POINT2__LONG_D:
        setLongD((LongDegr)null);
        return;
      case OpenAirPackage.POINT2__LONG_MF:
        setLongMf((MinDec)null);
        return;
      case OpenAirPackage.POINT2__LAT_D:
        setLatD((LatDegr)null);
        return;
      case OpenAirPackage.POINT2__LAT_MF:
        setLatMf((MinDec)null);
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
      case OpenAirPackage.POINT2__LONG_D:
        return longD != null;
      case OpenAirPackage.POINT2__LONG_MF:
        return longMf != null;
      case OpenAirPackage.POINT2__LAT_D:
        return latD != null;
      case OpenAirPackage.POINT2__LAT_MF:
        return latMf != null;
    }
    return super.eIsSet(featureID);
  }

} //Point2Impl
