/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import www.ubx.ch.openAir.Airspace;
import www.ubx.ch.openAir.OpenAirPackage;
import www.ubx.ch.openAir.TheDef;
import www.ubx.ch.openAir.TheGeom;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Airspace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.AirspaceImpl#getThedef <em>Thedef</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.AirspaceImpl#getThegeom <em>Thegeom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AirspaceImpl extends MinimalEObjectImpl.Container implements Airspace
{
  /**
   * The cached value of the '{@link #getThedef() <em>Thedef</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThedef()
   * @generated
   * @ordered
   */
  protected TheDef thedef;

  /**
   * The cached value of the '{@link #getThegeom() <em>Thegeom</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThegeom()
   * @generated
   * @ordered
   */
  protected EList<TheGeom> thegeom;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AirspaceImpl()
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
    return OpenAirPackage.Literals.AIRSPACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TheDef getThedef()
  {
    return thedef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThedef(TheDef newThedef, NotificationChain msgs)
  {
    TheDef oldThedef = thedef;
    thedef = newThedef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.AIRSPACE__THEDEF, oldThedef, newThedef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThedef(TheDef newThedef)
  {
    if (newThedef != thedef)
    {
      NotificationChain msgs = null;
      if (thedef != null)
        msgs = ((InternalEObject)thedef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.AIRSPACE__THEDEF, null, msgs);
      if (newThedef != null)
        msgs = ((InternalEObject)newThedef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.AIRSPACE__THEDEF, null, msgs);
      msgs = basicSetThedef(newThedef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.AIRSPACE__THEDEF, newThedef, newThedef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TheGeom> getThegeom()
  {
    if (thegeom == null)
    {
      thegeom = new EObjectContainmentEList<TheGeom>(TheGeom.class, this, OpenAirPackage.AIRSPACE__THEGEOM);
    }
    return thegeom;
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
      case OpenAirPackage.AIRSPACE__THEDEF:
        return basicSetThedef(null, msgs);
      case OpenAirPackage.AIRSPACE__THEGEOM:
        return ((InternalEList<?>)getThegeom()).basicRemove(otherEnd, msgs);
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
      case OpenAirPackage.AIRSPACE__THEDEF:
        return getThedef();
      case OpenAirPackage.AIRSPACE__THEGEOM:
        return getThegeom();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OpenAirPackage.AIRSPACE__THEDEF:
        setThedef((TheDef)newValue);
        return;
      case OpenAirPackage.AIRSPACE__THEGEOM:
        getThegeom().clear();
        getThegeom().addAll((Collection<? extends TheGeom>)newValue);
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
      case OpenAirPackage.AIRSPACE__THEDEF:
        setThedef((TheDef)null);
        return;
      case OpenAirPackage.AIRSPACE__THEGEOM:
        getThegeom().clear();
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
      case OpenAirPackage.AIRSPACE__THEDEF:
        return thedef != null;
      case OpenAirPackage.AIRSPACE__THEGEOM:
        return thegeom != null && !thegeom.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AirspaceImpl
