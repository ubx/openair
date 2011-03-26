/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import www.ubx.ch.openAir.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenAirFactoryImpl extends EFactoryImpl implements OpenAirFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OpenAirFactory init()
  {
    try
    {
      OpenAirFactory theOpenAirFactory = (OpenAirFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ubx.www/ch/OpenAir"); 
      if (theOpenAirFactory != null)
      {
        return theOpenAirFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OpenAirFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpenAirFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case OpenAirPackage.OPEN_AIR: return createOpenAir();
      case OpenAirPackage.AIRSPACE: return createAirspace();
      case OpenAirPackage.THE_DEF: return createTheDef();
      case OpenAirPackage.AS_CLASS: return createAsClass();
      case OpenAirPackage.SP: return createSP();
      case OpenAirPackage.SB: return createSB();
      case OpenAirPackage.AS_NAME: return createAsName();
      case OpenAirPackage.LIMITES: return createLimites();
      case OpenAirPackage.THE_GEOM: return createTheGeom();
      case OpenAirPackage.LOW_LIMIT: return createLowLimit();
      case OpenAirPackage.HIGH_LIMIT: return createHighLimit();
      case OpenAirPackage.LIMIT: return createLimit();
      case OpenAirPackage.FL: return createFL();
      case OpenAirPackage.SFC: return createSFC();
      case OpenAirPackage.GND: return createGND();
      case OpenAirPackage.UNL: return createUNL();
      case OpenAirPackage.VAL: return createVAL();
      case OpenAirPackage.V: return createV();
      case OpenAirPackage.VSUB: return createVsub();
      case OpenAirPackage.DIR: return createDir();
      case OpenAirPackage.PLUS: return createPlus();
      case OpenAirPackage.MINUS: return createMinus();
      case OpenAirPackage.DC: return createDC();
      case OpenAirPackage.RADIUS: return createRadius();
      case OpenAirPackage.DP: return createDP();
      case OpenAirPackage.POINT: return createPoint();
      case OpenAirPackage.POINT1: return createPoint1();
      case OpenAirPackage.POINT2: return createPoint2();
      case OpenAirPackage.POINT3: return createPoint3();
      case OpenAirPackage.POINT4: return createPoint4();
      case OpenAirPackage.LONG_DEGR: return createLongDegr();
      case OpenAirPackage.LAT_DEGR: return createLatDegr();
      case OpenAirPackage.MIN_SEC: return createMinSec();
      case OpenAirPackage.SEC_DEC: return createSecDec();
      case OpenAirPackage.MIN_DEC: return createMinDec();
      case OpenAirPackage.LONG_DEC: return createLongDec();
      case OpenAirPackage.LAT_DEC: return createLatDec();
      case OpenAirPackage.DA: return createDA();
      case OpenAirPackage.DA_PARAMS: return createDaParams();
      case OpenAirPackage.DA_PARAMS1: return createDaParams1();
      case OpenAirPackage.DA_PARAMS2: return createDaParams2();
      case OpenAirPackage.DB: return createDB();
      case OpenAirPackage.AT: return createAT();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case OpenAirPackage.CLASS_TYPE:
        return createClassTypeFromString(eDataType, initialValue);
      case OpenAirPackage.UNITS:
        return createUnitsFromString(eDataType, initialValue);
      case OpenAirPackage.WE:
        return createWEFromString(eDataType, initialValue);
      case OpenAirPackage.NS:
        return createNSFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case OpenAirPackage.CLASS_TYPE:
        return convertClassTypeToString(eDataType, instanceValue);
      case OpenAirPackage.UNITS:
        return convertUnitsToString(eDataType, instanceValue);
      case OpenAirPackage.WE:
        return convertWEToString(eDataType, instanceValue);
      case OpenAirPackage.NS:
        return convertNSToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpenAir createOpenAir()
  {
    OpenAirImpl openAir = new OpenAirImpl();
    return openAir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Airspace createAirspace()
  {
    AirspaceImpl airspace = new AirspaceImpl();
    return airspace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TheDef createTheDef()
  {
    TheDefImpl theDef = new TheDefImpl();
    return theDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AsClass createAsClass()
  {
    AsClassImpl asClass = new AsClassImpl();
    return asClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SP createSP()
  {
    SPImpl sp = new SPImpl();
    return sp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SB createSB()
  {
    SBImpl sb = new SBImpl();
    return sb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AsName createAsName()
  {
    AsNameImpl asName = new AsNameImpl();
    return asName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Limites createLimites()
  {
    LimitesImpl limites = new LimitesImpl();
    return limites;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TheGeom createTheGeom()
  {
    TheGeomImpl theGeom = new TheGeomImpl();
    return theGeom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LowLimit createLowLimit()
  {
    LowLimitImpl lowLimit = new LowLimitImpl();
    return lowLimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HighLimit createHighLimit()
  {
    HighLimitImpl highLimit = new HighLimitImpl();
    return highLimit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Limit createLimit()
  {
    LimitImpl limit = new LimitImpl();
    return limit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FL createFL()
  {
    FLImpl fl = new FLImpl();
    return fl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SFC createSFC()
  {
    SFCImpl sfc = new SFCImpl();
    return sfc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GND createGND()
  {
    GNDImpl gnd = new GNDImpl();
    return gnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UNL createUNL()
  {
    UNLImpl unl = new UNLImpl();
    return unl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VAL createVAL()
  {
    VALImpl val = new VALImpl();
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public V createV()
  {
    VImpl v = new VImpl();
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vsub createVsub()
  {
    VsubImpl vsub = new VsubImpl();
    return vsub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dir createDir()
  {
    DirImpl dir = new DirImpl();
    return dir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DC createDC()
  {
    DCImpl dc = new DCImpl();
    return dc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Radius createRadius()
  {
    RadiusImpl radius = new RadiusImpl();
    return radius;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DP createDP()
  {
    DPImpl dp = new DPImpl();
    return dp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point createPoint()
  {
    PointImpl point = new PointImpl();
    return point;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point1 createPoint1()
  {
    Point1Impl point1 = new Point1Impl();
    return point1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point2 createPoint2()
  {
    Point2Impl point2 = new Point2Impl();
    return point2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point3 createPoint3()
  {
    Point3Impl point3 = new Point3Impl();
    return point3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Point4 createPoint4()
  {
    Point4Impl point4 = new Point4Impl();
    return point4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LongDegr createLongDegr()
  {
    LongDegrImpl longDegr = new LongDegrImpl();
    return longDegr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LatDegr createLatDegr()
  {
    LatDegrImpl latDegr = new LatDegrImpl();
    return latDegr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinSec createMinSec()
  {
    MinSecImpl minSec = new MinSecImpl();
    return minSec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecDec createSecDec()
  {
    SecDecImpl secDec = new SecDecImpl();
    return secDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinDec createMinDec()
  {
    MinDecImpl minDec = new MinDecImpl();
    return minDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LongDec createLongDec()
  {
    LongDecImpl longDec = new LongDecImpl();
    return longDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LatDec createLatDec()
  {
    LatDecImpl latDec = new LatDecImpl();
    return latDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DA createDA()
  {
    DAImpl da = new DAImpl();
    return da;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DaParams createDaParams()
  {
    DaParamsImpl daParams = new DaParamsImpl();
    return daParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DaParams1 createDaParams1()
  {
    DaParams1Impl daParams1 = new DaParams1Impl();
    return daParams1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DaParams2 createDaParams2()
  {
    DaParams2Impl daParams2 = new DaParams2Impl();
    return daParams2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DB createDB()
  {
    DBImpl db = new DBImpl();
    return db;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AT createAT()
  {
    ATImpl at = new ATImpl();
    return at;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassType createClassTypeFromString(EDataType eDataType, String initialValue)
  {
    ClassType result = ClassType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertClassTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Units createUnitsFromString(EDataType eDataType, String initialValue)
  {
    Units result = Units.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnitsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WE createWEFromString(EDataType eDataType, String initialValue)
  {
    WE result = WE.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertWEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NS createNSFromString(EDataType eDataType, String initialValue)
  {
    NS result = NS.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNSToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpenAirPackage getOpenAirPackage()
  {
    return (OpenAirPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OpenAirPackage getPackage()
  {
    return OpenAirPackage.eINSTANCE;
  }

} //OpenAirFactoryImpl
