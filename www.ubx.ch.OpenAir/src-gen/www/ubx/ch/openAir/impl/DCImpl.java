/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import www.ubx.ch.openAir.DC;
import www.ubx.ch.openAir.OpenAirPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link www.ubx.ch.openAir.impl.DCImpl#getRadius <em>Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DCImpl extends TheGeomImpl implements DC
{
  /**
   * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadius()
   * @generated
   * @ordered
   */
  protected static final String RADIUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadius()
   * @generated
   * @ordered
   */
  protected String radius = RADIUS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DCImpl()
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
    return OpenAirPackage.Literals.DC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRadius()
  {
    return radius;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRadius(String newRadius)
  {
    String oldRadius = radius;
    radius = newRadius;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenAirPackage.DC__RADIUS, oldRadius, radius));
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
      case OpenAirPackage.DC__RADIUS:
        return getRadius();
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
      case OpenAirPackage.DC__RADIUS:
        setRadius((String)newValue);
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
      case OpenAirPackage.DC__RADIUS:
        setRadius(RADIUS_EDEFAULT);
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
      case OpenAirPackage.DC__RADIUS:
        return RADIUS_EDEFAULT == null ? radius != null : !RADIUS_EDEFAULT.equals(radius);
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
    result.append(" (radius: ");
    result.append(radius);
    result.append(')');
    return result.toString();
  }

} //DCImpl
