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

import www.ubx.ch.openAir.OpenAirPackage;
import www.ubx.ch.openAir.Point;
import www.ubx.ch.openAir.Vsub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vsub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.VsubImpl#getX <em>X</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.VsubImpl#getD <em>D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VsubImpl extends MinimalEObjectImpl.Container implements Vsub
{
  /**
   * The cached value of the '{@link #getX() <em>X</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected Point x;

  /**
   * The default value of the '{@link #getD() <em>D</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected static final String D_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getD() <em>D</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected String d = D_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VsubImpl()
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
    return OpenAirPackage.Literals.VSUB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetX(Point newX, NotificationChain msgs)
  {
    Point oldX = x;
    x = newX;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAirPackage.VSUB__X, oldX, newX);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX(Point newX)
  {
    if (newX != x)
    {
      NotificationChain msgs = null;
      if (x != null)
        msgs = ((InternalEObject)x).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.VSUB__X, null, msgs);
      if (newX != null)
        msgs = ((InternalEObject)newX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAirPackage.VSUB__X, null, msgs);
      msgs = basicSetX(newX, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.VSUB__X, newX, newX));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getD()
  {
    return d;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setD(String newD)
  {
    String oldD = d;
    d = newD;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.VSUB__D, oldD, d));
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
      case OpenAirPackage.VSUB__X:
        return basicSetX(null, msgs);
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
      case OpenAirPackage.VSUB__X:
        return getX();
      case OpenAirPackage.VSUB__D:
        return getD();
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
      case OpenAirPackage.VSUB__X:
        setX((Point)newValue);
        return;
      case OpenAirPackage.VSUB__D:
        setD((String)newValue);
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
      case OpenAirPackage.VSUB__X:
        setX((Point)null);
        return;
      case OpenAirPackage.VSUB__D:
        setD(D_EDEFAULT);
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
      case OpenAirPackage.VSUB__X:
        return x != null;
      case OpenAirPackage.VSUB__D:
        return D_EDEFAULT == null ? d != null : !D_EDEFAULT.equals(d);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (d: ");
    result.append(d);
    result.append(')');
    return result.toString();
  }

} //VsubImpl
