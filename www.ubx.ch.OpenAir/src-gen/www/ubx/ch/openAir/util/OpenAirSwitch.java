/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import www.ubx.ch.openAir.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see www.ubx.ch.openAir.OpenAirPackage
 * @generated
 */
public class OpenAirSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OpenAirPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpenAirSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = OpenAirPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case OpenAirPackage.OPEN_AIR:
      {
        OpenAir openAir = (OpenAir)theEObject;
        T result = caseOpenAir(openAir);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.AIRSPACE:
      {
        Airspace airspace = (Airspace)theEObject;
        T result = caseAirspace(airspace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.THE_DEF:
      {
        TheDef theDef = (TheDef)theEObject;
        T result = caseTheDef(theDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.AS_CLASS:
      {
        AsClass asClass = (AsClass)theEObject;
        T result = caseAsClass(asClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.SP:
      {
        SP sp = (SP)theEObject;
        T result = caseSP(sp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.SB:
      {
        SB sb = (SB)theEObject;
        T result = caseSB(sb);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.AS_NAME:
      {
        AsName asName = (AsName)theEObject;
        T result = caseAsName(asName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.LIMITES:
      {
        Limites limites = (Limites)theEObject;
        T result = caseLimites(limites);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.LLIMIT:
      {
        LLimit lLimit = (LLimit)theEObject;
        T result = caseLLimit(lLimit);
        if (result == null) result = caseLimites(lLimit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.HLIMIT:
      {
        HLimit hLimit = (HLimit)theEObject;
        T result = caseHLimit(hLimit);
        if (result == null) result = caseLimites(hLimit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.THE_GEOM:
      {
        TheGeom theGeom = (TheGeom)theEObject;
        T result = caseTheGeom(theGeom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.LOW_LIMIT:
      {
        LowLimit lowLimit = (LowLimit)theEObject;
        T result = caseLowLimit(lowLimit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.HIGH_LIMIT:
      {
        HighLimit highLimit = (HighLimit)theEObject;
        T result = caseHighLimit(highLimit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.LIMIT:
      {
        Limit limit = (Limit)theEObject;
        T result = caseLimit(limit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.FL:
      {
        FL fl = (FL)theEObject;
        T result = caseFL(fl);
        if (result == null) result = caseLimit(fl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.SFC:
      {
        SFC sfc = (SFC)theEObject;
        T result = caseSFC(sfc);
        if (result == null) result = caseLimit(sfc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.GND:
      {
        GND gnd = (GND)theEObject;
        T result = caseGND(gnd);
        if (result == null) result = caseLimit(gnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.UNL:
      {
        UNL unl = (UNL)theEObject;
        T result = caseUNL(unl);
        if (result == null) result = caseLimit(unl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.VAL:
      {
        VAL val = (VAL)theEObject;
        T result = caseVAL(val);
        if (result == null) result = caseLimit(val);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.V:
      {
        V v = (V)theEObject;
        T result = caseV(v);
        if (result == null) result = caseTheGeom(v);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.VSUB:
      {
        Vsub vsub = (Vsub)theEObject;
        T result = caseVsub(vsub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.DC:
      {
        DC dc = (DC)theEObject;
        T result = caseDC(dc);
        if (result == null) result = caseTheGeom(dc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.DP:
      {
        DP dp = (DP)theEObject;
        T result = caseDP(dp);
        if (result == null) result = caseTheGeom(dp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.POINT:
      {
        Point point = (Point)theEObject;
        T result = casePoint(point);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.POINT1:
      {
        Point1 point1 = (Point1)theEObject;
        T result = casePoint1(point1);
        if (result == null) result = casePoint(point1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.POINT2:
      {
        Point2 point2 = (Point2)theEObject;
        T result = casePoint2(point2);
        if (result == null) result = casePoint(point2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.POINT3:
      {
        Point3 point3 = (Point3)theEObject;
        T result = casePoint3(point3);
        if (result == null) result = casePoint(point3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.POINT4:
      {
        Point4 point4 = (Point4)theEObject;
        T result = casePoint4(point4);
        if (result == null) result = casePoint(point4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.LONG_DEGR:
      {
        LongDegr longDegr = (LongDegr)theEObject;
        T result = caseLongDegr(longDegr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.LAT_DEGR:
      {
        LatDegr latDegr = (LatDegr)theEObject;
        T result = caseLatDegr(latDegr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.MIN_SEC:
      {
        MinSec minSec = (MinSec)theEObject;
        T result = caseMinSec(minSec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.SEC_DEC:
      {
        SecDec secDec = (SecDec)theEObject;
        T result = caseSecDec(secDec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.MIN_DEC:
      {
        MinDec minDec = (MinDec)theEObject;
        T result = caseMinDec(minDec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.LONG_DEC:
      {
        LongDec longDec = (LongDec)theEObject;
        T result = caseLongDec(longDec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.LAT_DEC:
      {
        LatDec latDec = (LatDec)theEObject;
        T result = caseLatDec(latDec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.DA:
      {
        DA da = (DA)theEObject;
        T result = caseDA(da);
        if (result == null) result = caseTheGeom(da);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.DA_PARAMS:
      {
        DaParams daParams = (DaParams)theEObject;
        T result = caseDaParams(daParams);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.DA_PARAMS1:
      {
        DaParams1 daParams1 = (DaParams1)theEObject;
        T result = caseDaParams1(daParams1);
        if (result == null) result = caseDaParams(daParams1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.DA_PARAMS2:
      {
        DaParams2 daParams2 = (DaParams2)theEObject;
        T result = caseDaParams2(daParams2);
        if (result == null) result = caseDaParams(daParams2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.DB:
      {
        DB db = (DB)theEObject;
        T result = caseDB(db);
        if (result == null) result = caseTheGeom(db);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OpenAirPackage.AT:
      {
        AT at = (AT)theEObject;
        T result = caseAT(at);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Open Air</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Open Air</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpenAir(OpenAir object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Airspace</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Airspace</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAirspace(Airspace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>The Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>The Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTheDef(TheDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>As Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>As Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAsClass(AsClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSP(SP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SB</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SB</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSB(SB object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>As Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>As Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAsName(AsName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Limites</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Limites</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLimites(Limites object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LLimit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LLimit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLLimit(LLimit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HLimit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HLimit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHLimit(HLimit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>The Geom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>The Geom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTheGeom(TheGeom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Low Limit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Low Limit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLowLimit(LowLimit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>High Limit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>High Limit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHighLimit(HighLimit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Limit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Limit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLimit(Limit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFL(FL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SFC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SFC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSFC(SFC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GND</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GND</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGND(GND object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UNL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UNL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUNL(UNL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VAL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VAL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVAL(VAL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>V</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>V</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseV(V object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vsub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vsub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVsub(Vsub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDC(DC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDP(DP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoint(Point object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoint1(Point1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoint2(Point2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoint3(Point3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoint4(Point4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Long Degr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Long Degr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLongDegr(LongDegr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lat Degr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lat Degr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLatDegr(LatDegr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Min Sec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Min Sec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinSec(MinSec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sec Dec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sec Dec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSecDec(SecDec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Min Dec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Min Dec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinDec(MinDec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Long Dec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Long Dec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLongDec(LongDec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lat Dec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lat Dec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLatDec(LatDec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DA</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DA</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDA(DA object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Da Params</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Da Params</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDaParams(DaParams object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Da Params1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Da Params1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDaParams1(DaParams1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Da Params2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Da Params2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDaParams2(DaParams2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DB</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DB</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDB(DB object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAT(AT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //OpenAirSwitch
