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

import www.ubx.ch.openAir.AT;
import www.ubx.ch.openAir.AsClass;
import www.ubx.ch.openAir.AsName;
import www.ubx.ch.openAir.Limites;
import www.ubx.ch.openAir.OpenAirPackage;
import www.ubx.ch.openAir.SB;
import www.ubx.ch.openAir.SP;
import www.ubx.ch.openAir.TheDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>The Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.TheDefImpl#getAsclass <em>Asclass</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.TheDefImpl#getSp <em>Sp</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.TheDefImpl#getSb <em>Sb</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.TheDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.TheDefImpl#getAt <em>At</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.TheDefImpl#getLimit <em>Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TheDefImpl extends MinimalEObjectImpl.Container implements TheDef
{
  /**
   * The cached value of the '{@link #getAsclass() <em>Asclass</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsclass()
   * @generated
   * @ordered
   */
  protected AsClass asclass;

  /**
   * The cached value of the '{@link #getSp() <em>Sp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSp()
   * @generated
   * @ordered
   */
  protected EList<SP> sp;

  /**
   * The cached value of the '{@link #getSb() <em>Sb</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSb()
   * @generated
   * @ordered
   */
  protected EList<SB> sb;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected AsName name;

  /**
   * The cached value of the '{@link #getAt() <em>At</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAt()
   * @generated
   * @ordered
   */
  protected EList<AT> at;

  /**
   * The cached value of the '{@link #getLimit() <em>Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLimit()
   * @generated
   * @ordered
   */
  protected Limites limit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TheDefImpl()
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
    return OpenAirPackage.Literals.THE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AsClass getAsclass()
  {
    return asclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAsclass(AsClass newAsclass, NotificationChain msgs)
  {
    AsClass oldAsclass = asclass;
    asclass = newAsclass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.THE_DEF__ASCLASS, oldAsclass, newAsclass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAsclass(AsClass newAsclass)
  {
    if (newAsclass != asclass)
    {
      NotificationChain msgs = null;
      if (asclass != null)
        msgs = ((InternalEObject)asclass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.THE_DEF__ASCLASS, null, msgs);
      if (newAsclass != null)
        msgs = ((InternalEObject)newAsclass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.THE_DEF__ASCLASS, null, msgs);
      msgs = basicSetAsclass(newAsclass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.THE_DEF__ASCLASS, newAsclass, newAsclass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SP> getSp()
  {
    if (sp == null)
    {
      sp = new EObjectContainmentEList<SP>(SP.class, this, OpenAirPackage.THE_DEF__SP);
    }
    return sp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SB> getSb()
  {
    if (sb == null)
    {
      sb = new EObjectContainmentEList<SB>(SB.class, this, OpenAirPackage.THE_DEF__SB);
    }
    return sb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AsName getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(AsName newName, NotificationChain msgs)
  {
    AsName oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.THE_DEF__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(AsName newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.THE_DEF__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.THE_DEF__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.THE_DEF__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AT> getAt()
  {
    if (at == null)
    {
      at = new EObjectContainmentEList<AT>(AT.class, this, OpenAirPackage.THE_DEF__AT);
    }
    return at;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Limites getLimit()
  {
    return limit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLimit(Limites newLimit, NotificationChain msgs)
  {
    Limites oldLimit = limit;
    limit = newLimit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.THE_DEF__LIMIT, oldLimit, newLimit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLimit(Limites newLimit)
  {
    if (newLimit != limit)
    {
      NotificationChain msgs = null;
      if (limit != null)
        msgs = ((InternalEObject)limit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.THE_DEF__LIMIT, null, msgs);
      if (newLimit != null)
        msgs = ((InternalEObject)newLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.THE_DEF__LIMIT, null, msgs);
      msgs = basicSetLimit(newLimit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.THE_DEF__LIMIT, newLimit, newLimit));
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
      case OpenAirPackage.THE_DEF__ASCLASS:
        return basicSetAsclass(null, msgs);
      case OpenAirPackage.THE_DEF__SP:
        return ((InternalEList<?>)getSp()).basicRemove(otherEnd, msgs);
      case OpenAirPackage.THE_DEF__SB:
        return ((InternalEList<?>)getSb()).basicRemove(otherEnd, msgs);
      case OpenAirPackage.THE_DEF__NAME:
        return basicSetName(null, msgs);
      case OpenAirPackage.THE_DEF__AT:
        return ((InternalEList<?>)getAt()).basicRemove(otherEnd, msgs);
      case OpenAirPackage.THE_DEF__LIMIT:
        return basicSetLimit(null, msgs);
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
      case OpenAirPackage.THE_DEF__ASCLASS:
        return getAsclass();
      case OpenAirPackage.THE_DEF__SP:
        return getSp();
      case OpenAirPackage.THE_DEF__SB:
        return getSb();
      case OpenAirPackage.THE_DEF__NAME:
        return getName();
      case OpenAirPackage.THE_DEF__AT:
        return getAt();
      case OpenAirPackage.THE_DEF__LIMIT:
        return getLimit();
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
      case OpenAirPackage.THE_DEF__ASCLASS:
        setAsclass((AsClass)newValue);
        return;
      case OpenAirPackage.THE_DEF__SP:
        getSp().clear();
        getSp().addAll((Collection<? extends SP>)newValue);
        return;
      case OpenAirPackage.THE_DEF__SB:
        getSb().clear();
        getSb().addAll((Collection<? extends SB>)newValue);
        return;
      case OpenAirPackage.THE_DEF__NAME:
        setName((AsName)newValue);
        return;
      case OpenAirPackage.THE_DEF__AT:
        getAt().clear();
        getAt().addAll((Collection<? extends AT>)newValue);
        return;
      case OpenAirPackage.THE_DEF__LIMIT:
        setLimit((Limites)newValue);
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
      case OpenAirPackage.THE_DEF__ASCLASS:
        setAsclass((AsClass)null);
        return;
      case OpenAirPackage.THE_DEF__SP:
        getSp().clear();
        return;
      case OpenAirPackage.THE_DEF__SB:
        getSb().clear();
        return;
      case OpenAirPackage.THE_DEF__NAME:
        setName((AsName)null);
        return;
      case OpenAirPackage.THE_DEF__AT:
        getAt().clear();
        return;
      case OpenAirPackage.THE_DEF__LIMIT:
        setLimit((Limites)null);
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
      case OpenAirPackage.THE_DEF__ASCLASS:
        return asclass != null;
      case OpenAirPackage.THE_DEF__SP:
        return sp != null && !sp.isEmpty();
      case OpenAirPackage.THE_DEF__SB:
        return sb != null && !sb.isEmpty();
      case OpenAirPackage.THE_DEF__NAME:
        return name != null;
      case OpenAirPackage.THE_DEF__AT:
        return at != null && !at.isEmpty();
      case OpenAirPackage.THE_DEF__LIMIT:
        return limit != null;
    }
    return super.eIsSet(featureID);
  }

} //TheDefImpl
