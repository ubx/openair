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

import www.ubx.ch.openAir.OpenAirPackage;
import www.ubx.ch.openAir.V;
import www.ubx.ch.openAir.Vsub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>V</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.VImpl#getVsub <em>Vsub</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VImpl extends TheGeomImpl implements V
{
  /**
   * The cached value of the '{@link #getVsub() <em>Vsub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVsub()
   * @generated
   * @ordered
   */
  protected Vsub vsub;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VImpl()
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
    return OpenAirPackage.Literals.V;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vsub getVsub()
  {
    return vsub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVsub(Vsub newVsub, NotificationChain msgs)
  {
    Vsub oldVsub = vsub;
    vsub = newVsub;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.V__VSUB, oldVsub, newVsub);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVsub(Vsub newVsub)
  {
    if (newVsub != vsub)
    {
      NotificationChain msgs = null;
      if (vsub != null)
        msgs = ((InternalEObject)vsub).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.V__VSUB, null, msgs);
      if (newVsub != null)
        msgs = ((InternalEObject)newVsub).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.V__VSUB, null, msgs);
      msgs = basicSetVsub(newVsub, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.V__VSUB, newVsub, newVsub));
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
      case OpenAirPackage.V__VSUB:
        return basicSetVsub(null, msgs);
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
      case OpenAirPackage.V__VSUB:
        return getVsub();
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
      case OpenAirPackage.V__VSUB:
        setVsub((Vsub)newValue);
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
      case OpenAirPackage.V__VSUB:
        setVsub((Vsub)null);
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
      case OpenAirPackage.V__VSUB:
        return vsub != null;
    }
    return super.eIsSet(featureID);
  }

} //VImpl
