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

import www.ubx.ch.openAir.DA;
import www.ubx.ch.openAir.DaParams;
import www.ubx.ch.openAir.OpenAirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.DAImpl#getDa <em>Da</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DAImpl extends TheGeomImpl implements DA
{
  /**
   * The cached value of the '{@link #getDa() <em>Da</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDa()
   * @generated
   * @ordered
   */
  protected DaParams da;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DAImpl()
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
    return OpenAirPackage.Literals.DA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DaParams getDa()
  {
    return da;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDa(DaParams newDa, NotificationChain msgs)
  {
    DaParams oldDa = da;
    da = newDa;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.DA__DA, oldDa, newDa);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDa(DaParams newDa)
  {
    if (newDa != da)
    {
      NotificationChain msgs = null;
      if (da != null)
        msgs = ((InternalEObject)da).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.DA__DA, null, msgs);
      if (newDa != null)
        msgs = ((InternalEObject)newDa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.DA__DA, null, msgs);
      msgs = basicSetDa(newDa, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.DA__DA, newDa, newDa));
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
      case OpenAirPackage.DA__DA:
        return basicSetDa(null, msgs);
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
      case OpenAirPackage.DA__DA:
        return getDa();
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
      case OpenAirPackage.DA__DA:
        setDa((DaParams)newValue);
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
      case OpenAirPackage.DA__DA:
        setDa((DaParams)null);
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
      case OpenAirPackage.DA__DA:
        return da != null;
    }
    return super.eIsSet(featureID);
  }

} //DAImpl
