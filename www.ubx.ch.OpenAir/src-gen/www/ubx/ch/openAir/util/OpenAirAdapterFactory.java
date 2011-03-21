/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import www.ubx.ch.openAir.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see www.ubx.ch.openAir.OpenAirPackage
 * @generated
 */
public class OpenAirAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OpenAirPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpenAirAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = OpenAirPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OpenAirSwitch<Adapter> modelSwitch =
    new OpenAirSwitch<Adapter>()
    {
      @Override
      public Adapter caseOpenAir(OpenAir object)
      {
        return createOpenAirAdapter();
      }
      @Override
      public Adapter caseAirspace(Airspace object)
      {
        return createAirspaceAdapter();
      }
      @Override
      public Adapter caseTheDef(TheDef object)
      {
        return createTheDefAdapter();
      }
      @Override
      public Adapter caseAsClass(AsClass object)
      {
        return createAsClassAdapter();
      }
      @Override
      public Adapter caseSP(SP object)
      {
        return createSPAdapter();
      }
      @Override
      public Adapter caseSB(SB object)
      {
        return createSBAdapter();
      }
      @Override
      public Adapter caseAsName(AsName object)
      {
        return createAsNameAdapter();
      }
      @Override
      public Adapter caseLimites(Limites object)
      {
        return createLimitesAdapter();
      }
      @Override
      public Adapter caseLLimit(LLimit object)
      {
        return createLLimitAdapter();
      }
      @Override
      public Adapter caseHLimit(HLimit object)
      {
        return createHLimitAdapter();
      }
      @Override
      public Adapter caseTheGeom(TheGeom object)
      {
        return createTheGeomAdapter();
      }
      @Override
      public Adapter caseLowLimit(LowLimit object)
      {
        return createLowLimitAdapter();
      }
      @Override
      public Adapter caseHighLimit(HighLimit object)
      {
        return createHighLimitAdapter();
      }
      @Override
      public Adapter caseLimit(Limit object)
      {
        return createLimitAdapter();
      }
      @Override
      public Adapter caseFL(FL object)
      {
        return createFLAdapter();
      }
      @Override
      public Adapter caseSFC(SFC object)
      {
        return createSFCAdapter();
      }
      @Override
      public Adapter caseGND(GND object)
      {
        return createGNDAdapter();
      }
      @Override
      public Adapter caseUNL(UNL object)
      {
        return createUNLAdapter();
      }
      @Override
      public Adapter caseVAL(VAL object)
      {
        return createVALAdapter();
      }
      @Override
      public Adapter caseV(V object)
      {
        return createVAdapter();
      }
      @Override
      public Adapter caseVsub(Vsub object)
      {
        return createVsubAdapter();
      }
      @Override
      public Adapter caseDC(DC object)
      {
        return createDCAdapter();
      }
      @Override
      public Adapter caseDP(DP object)
      {
        return createDPAdapter();
      }
      @Override
      public Adapter casePoint(Point object)
      {
        return createPointAdapter();
      }
      @Override
      public Adapter casePoint1(Point1 object)
      {
        return createPoint1Adapter();
      }
      @Override
      public Adapter casePoint2(Point2 object)
      {
        return createPoint2Adapter();
      }
      @Override
      public Adapter casePoint3(Point3 object)
      {
        return createPoint3Adapter();
      }
      @Override
      public Adapter casePoint4(Point4 object)
      {
        return createPoint4Adapter();
      }
      @Override
      public Adapter caseLongDegr(LongDegr object)
      {
        return createLongDegrAdapter();
      }
      @Override
      public Adapter caseLatDegr(LatDegr object)
      {
        return createLatDegrAdapter();
      }
      @Override
      public Adapter caseMinSec(MinSec object)
      {
        return createMinSecAdapter();
      }
      @Override
      public Adapter caseSecDec(SecDec object)
      {
        return createSecDecAdapter();
      }
      @Override
      public Adapter caseMinDec(MinDec object)
      {
        return createMinDecAdapter();
      }
      @Override
      public Adapter caseLongDec(LongDec object)
      {
        return createLongDecAdapter();
      }
      @Override
      public Adapter caseLatDec(LatDec object)
      {
        return createLatDecAdapter();
      }
      @Override
      public Adapter caseDA(DA object)
      {
        return createDAAdapter();
      }
      @Override
      public Adapter caseDaParams(DaParams object)
      {
        return createDaParamsAdapter();
      }
      @Override
      public Adapter caseDaParams1(DaParams1 object)
      {
        return createDaParams1Adapter();
      }
      @Override
      public Adapter caseDaParams2(DaParams2 object)
      {
        return createDaParams2Adapter();
      }
      @Override
      public Adapter caseDB(DB object)
      {
        return createDBAdapter();
      }
      @Override
      public Adapter caseAT(AT object)
      {
        return createATAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.OpenAir <em>Open Air</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.OpenAir
   * @generated
   */
  public Adapter createOpenAirAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.Airspace <em>Airspace</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.Airspace
   * @generated
   */
  public Adapter createAirspaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.TheDef <em>The Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.TheDef
   * @generated
   */
  public Adapter createTheDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.AsClass <em>As Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.AsClass
   * @generated
   */
  public Adapter createAsClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.SP <em>SP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.SP
   * @generated
   */
  public Adapter createSPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.SB <em>SB</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.SB
   * @generated
   */
  public Adapter createSBAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.AsName <em>As Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.AsName
   * @generated
   */
  public Adapter createAsNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.Limites <em>Limites</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.Limites
   * @generated
   */
  public Adapter createLimitesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.LLimit <em>LLimit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.LLimit
   * @generated
   */
  public Adapter createLLimitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.HLimit <em>HLimit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.HLimit
   * @generated
   */
  public Adapter createHLimitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.TheGeom <em>The Geom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.TheGeom
   * @generated
   */
  public Adapter createTheGeomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.LowLimit <em>Low Limit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.LowLimit
   * @generated
   */
  public Adapter createLowLimitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.HighLimit <em>High Limit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.HighLimit
   * @generated
   */
  public Adapter createHighLimitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.Limit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.Limit
   * @generated
   */
  public Adapter createLimitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.FL <em>FL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.FL
   * @generated
   */
  public Adapter createFLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.SFC <em>SFC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.SFC
   * @generated
   */
  public Adapter createSFCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.GND <em>GND</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.GND
   * @generated
   */
  public Adapter createGNDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.UNL <em>UNL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.UNL
   * @generated
   */
  public Adapter createUNLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.VAL <em>VAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.VAL
   * @generated
   */
  public Adapter createVALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.V <em>V</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.V
   * @generated
   */
  public Adapter createVAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.Vsub <em>Vsub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.Vsub
   * @generated
   */
  public Adapter createVsubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.DC <em>DC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.DC
   * @generated
   */
  public Adapter createDCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.DP <em>DP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.DP
   * @generated
   */
  public Adapter createDPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.Point
   * @generated
   */
  public Adapter createPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.Point1 <em>Point1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.Point1
   * @generated
   */
  public Adapter createPoint1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.Point2 <em>Point2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.Point2
   * @generated
   */
  public Adapter createPoint2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.Point3 <em>Point3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.Point3
   * @generated
   */
  public Adapter createPoint3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.Point4 <em>Point4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.Point4
   * @generated
   */
  public Adapter createPoint4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.LongDegr <em>Long Degr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.LongDegr
   * @generated
   */
  public Adapter createLongDegrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.LatDegr <em>Lat Degr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.LatDegr
   * @generated
   */
  public Adapter createLatDegrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.MinSec <em>Min Sec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.MinSec
   * @generated
   */
  public Adapter createMinSecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.SecDec <em>Sec Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.SecDec
   * @generated
   */
  public Adapter createSecDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.MinDec <em>Min Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.MinDec
   * @generated
   */
  public Adapter createMinDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.LongDec <em>Long Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.LongDec
   * @generated
   */
  public Adapter createLongDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.LatDec <em>Lat Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.LatDec
   * @generated
   */
  public Adapter createLatDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.DA <em>DA</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.DA
   * @generated
   */
  public Adapter createDAAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.DaParams <em>Da Params</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.DaParams
   * @generated
   */
  public Adapter createDaParamsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.DaParams1 <em>Da Params1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.DaParams1
   * @generated
   */
  public Adapter createDaParams1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.DaParams2 <em>Da Params2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.DaParams2
   * @generated
   */
  public Adapter createDaParams2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.DB <em>DB</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.DB
   * @generated
   */
  public Adapter createDBAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link www.ubx.ch.openAir.AT <em>AT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see www.ubx.ch.openAir.AT
   * @generated
   */
  public Adapter createATAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //OpenAirAdapterFactory
