/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import www.ubx.ch.openAir.NS;
import www.ubx.ch.openAir.OpenAirPackage;
import www.ubx.ch.openAir.Point;
import www.ubx.ch.openAir.WE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.PointImpl#getNs <em>Ns</em>}</li>
 *   <li>{@link www.ubx.ch.openAir.impl.PointImpl#getWe <em>We</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointImpl extends MinimalEObjectImpl.Container implements Point
{
  /**
   * The default value of the '{@link #getNs() <em>Ns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNs()
   * @generated
   * @ordered
   */
  protected static final NS NS_EDEFAULT = NS.N;

  /**
   * The cached value of the '{@link #getNs() <em>Ns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNs()
   * @generated
   * @ordered
   */
  protected NS ns = NS_EDEFAULT;

  /**
   * The default value of the '{@link #getWe() <em>We</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWe()
   * @generated
   * @ordered
   */
  protected static final WE WE_EDEFAULT = WE.W;

  /**
   * The cached value of the '{@link #getWe() <em>We</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWe()
   * @generated
   * @ordered
   */
  protected WE we = WE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PointImpl()
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
    return OpenAirPackage.Literals.POINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NS getNs()
  {
    return ns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNs(NS newNs)
  {
    NS oldNs = ns;
    ns = newNs == null ? NS_EDEFAULT : newNs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT__NS, oldNs, ns));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WE getWe()
  {
    return we;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWe(WE newWe)
  {
    WE oldWe = we;
    we = newWe == null ? WE_EDEFAULT : newWe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.POINT__WE, oldWe, we));
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
      case OpenAirPackage.POINT__NS:
        return getNs();
      case OpenAirPackage.POINT__WE:
        return getWe();
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
      case OpenAirPackage.POINT__NS:
        setNs((NS)newValue);
        return;
      case OpenAirPackage.POINT__WE:
        setWe((WE)newValue);
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
      case OpenAirPackage.POINT__NS:
        setNs(NS_EDEFAULT);
        return;
      case OpenAirPackage.POINT__WE:
        setWe(WE_EDEFAULT);
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
      case OpenAirPackage.POINT__NS:
        return ns != NS_EDEFAULT;
      case OpenAirPackage.POINT__WE:
        return we != WE_EDEFAULT;
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
    result.append(" (ns: ");
    result.append(ns);
    result.append(", we: ");
    result.append(we);
    result.append(')');
    return result.toString();
  }

} //PointImpl
