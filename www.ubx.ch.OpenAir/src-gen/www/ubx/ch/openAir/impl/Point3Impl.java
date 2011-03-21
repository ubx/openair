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
import www.ubx.ch.openAir.MinSec;
import www.ubx.ch.openAir.OpenAirPackage;
import www.ubx.ch.openAir.Point3;
import www.ubx.ch.openAir.SecDec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.Point3Impl#getLongD <em>Long D</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.Point3Impl#getLongM <em>Long M</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.Point3Impl#getLongS <em>Long S</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.Point3Impl#getLatD <em>Lat D</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.Point3Impl#getLatM <em>Lat M</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.Point3Impl#getLatS <em>Lat S</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Point3Impl extends PointImpl implements Point3
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
   * The cached value of the '{@link #getLongM() <em>Long M</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongM()
   * @generated
   * @ordered
   */
  protected MinSec longM;

  /**
   * The cached value of the '{@link #getLongS() <em>Long S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongS()
   * @generated
   * @ordered
   */
  protected SecDec longS;

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
   * The cached value of the '{@link #getLatM() <em>Lat M</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLatM()
   * @generated
   * @ordered
   */
  protected MinSec latM;

  /**
   * The cached value of the '{@link #getLatS() <em>Lat S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLatS()
   * @generated
   * @ordered
   */
  protected SecDec latS;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Point3Impl()
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
    return OpenAirPackage.Literals.POINT3;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT3__LONG_D, oldLongD, newLongD);
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
        msgs = ((InternalEObject)longD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT3__LONG_D, null, msgs);
      if (newLongD != null)
        msgs = ((InternalEObject)newLongD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT3__LONG_D, null, msgs);
      msgs = basicSetLongD(newLongD, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT3__LONG_D, newLongD, newLongD));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinSec getLongM()
  {
    return longM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLongM(MinSec newLongM, NotificationChain msgs)
  {
    MinSec oldLongM = longM;
    longM = newLongM;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT3__LONG_M, oldLongM, newLongM);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongM(MinSec newLongM)
  {
    if (newLongM != longM)
    {
      NotificationChain msgs = null;
      if (longM != null)
        msgs = ((InternalEObject)longM).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT3__LONG_M, null, msgs);
      if (newLongM != null)
        msgs = ((InternalEObject)newLongM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT3__LONG_M, null, msgs);
      msgs = basicSetLongM(newLongM, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT3__LONG_M, newLongM, newLongM));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecDec getLongS()
  {
    return longS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLongS(SecDec newLongS, NotificationChain msgs)
  {
    SecDec oldLongS = longS;
    longS = newLongS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT3__LONG_S, oldLongS, newLongS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongS(SecDec newLongS)
  {
    if (newLongS != longS)
    {
      NotificationChain msgs = null;
      if (longS != null)
        msgs = ((InternalEObject)longS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT3__LONG_S, null, msgs);
      if (newLongS != null)
        msgs = ((InternalEObject)newLongS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT3__LONG_S, null, msgs);
      msgs = basicSetLongS(newLongS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT3__LONG_S, newLongS, newLongS));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT3__LAT_D, oldLatD, newLatD);
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
        msgs = ((InternalEObject)latD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT3__LAT_D, null, msgs);
      if (newLatD != null)
        msgs = ((InternalEObject)newLatD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT3__LAT_D, null, msgs);
      msgs = basicSetLatD(newLatD, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT3__LAT_D, newLatD, newLatD));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinSec getLatM()
  {
    return latM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLatM(MinSec newLatM, NotificationChain msgs)
  {
    MinSec oldLatM = latM;
    latM = newLatM;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT3__LAT_M, oldLatM, newLatM);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLatM(MinSec newLatM)
  {
    if (newLatM != latM)
    {
      NotificationChain msgs = null;
      if (latM != null)
        msgs = ((InternalEObject)latM).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT3__LAT_M, null, msgs);
      if (newLatM != null)
        msgs = ((InternalEObject)newLatM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT3__LAT_M, null, msgs);
      msgs = basicSetLatM(newLatM, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT3__LAT_M, newLatM, newLatM));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecDec getLatS()
  {
    return latS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLatS(SecDec newLatS, NotificationChain msgs)
  {
    SecDec oldLatS = latS;
    latS = newLatS;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT3__LAT_S, oldLatS, newLatS);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLatS(SecDec newLatS)
  {
    if (newLatS != latS)
    {
      NotificationChain msgs = null;
      if (latS != null)
        msgs = ((InternalEObject)latS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT3__LAT_S, null, msgs);
      if (newLatS != null)
        msgs = ((InternalEObject)newLatS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.POINT3__LAT_S, null, msgs);
      msgs = basicSetLatS(newLatS, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT3__LAT_S, newLatS, newLatS));
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
      case OpenAirPackage.POINT3__LONG_D:
        return basicSetLongD(null, msgs);
      case OpenAirPackage.POINT3__LONG_M:
        return basicSetLongM(null, msgs);
      case OpenAirPackage.POINT3__LONG_S:
        return basicSetLongS(null, msgs);
      case OpenAirPackage.POINT3__LAT_D:
        return basicSetLatD(null, msgs);
      case OpenAirPackage.POINT3__LAT_M:
        return basicSetLatM(null, msgs);
      case OpenAirPackage.POINT3__LAT_S:
        return basicSetLatS(null, msgs);
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
      case OpenAirPackage.POINT3__LONG_D:
        return getLongD();
      case OpenAirPackage.POINT3__LONG_M:
        return getLongM();
      case OpenAirPackage.POINT3__LONG_S:
        return getLongS();
      case OpenAirPackage.POINT3__LAT_D:
        return getLatD();
      case OpenAirPackage.POINT3__LAT_M:
        return getLatM();
      case OpenAirPackage.POINT3__LAT_S:
        return getLatS();
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
      case OpenAirPackage.POINT3__LONG_D:
        setLongD((LongDegr)newValue);
        return;
      case OpenAirPackage.POINT3__LONG_M:
        setLongM((MinSec)newValue);
        return;
      case OpenAirPackage.POINT3__LONG_S:
        setLongS((SecDec)newValue);
        return;
      case OpenAirPackage.POINT3__LAT_D:
        setLatD((LatDegr)newValue);
        return;
      case OpenAirPackage.POINT3__LAT_M:
        setLatM((MinSec)newValue);
        return;
      case OpenAirPackage.POINT3__LAT_S:
        setLatS((SecDec)newValue);
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
      case OpenAirPackage.POINT3__LONG_D:
        setLongD((LongDegr)null);
        return;
      case OpenAirPackage.POINT3__LONG_M:
        setLongM((MinSec)null);
        return;
      case OpenAirPackage.POINT3__LONG_S:
        setLongS((SecDec)null);
        return;
      case OpenAirPackage.POINT3__LAT_D:
        setLatD((LatDegr)null);
        return;
      case OpenAirPackage.POINT3__LAT_M:
        setLatM((MinSec)null);
        return;
      case OpenAirPackage.POINT3__LAT_S:
        setLatS((SecDec)null);
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
      case OpenAirPackage.POINT3__LONG_D:
        return longD != null;
      case OpenAirPackage.POINT3__LONG_M:
        return longM != null;
      case OpenAirPackage.POINT3__LONG_S:
        return longS != null;
      case OpenAirPackage.POINT3__LAT_D:
        return latD != null;
      case OpenAirPackage.POINT3__LAT_M:
        return latM != null;
      case OpenAirPackage.POINT3__LAT_S:
        return latS != null;
    }
    return super.eIsSet(featureID);
  }

} //Point3Impl
