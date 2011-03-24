/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import www.ubx.ch.openAir.Airspace;
import www.ubx.ch.openAir.AsClass;
import www.ubx.ch.openAir.AsName;
import www.ubx.ch.openAir.ClassType;
import www.ubx.ch.openAir.DaParams;
import www.ubx.ch.openAir.DaParams1;
import www.ubx.ch.openAir.DaParams2;
import www.ubx.ch.openAir.Dir;
import www.ubx.ch.openAir.HighLimit;
import www.ubx.ch.openAir.LatDec;
import www.ubx.ch.openAir.LatDegr;
import www.ubx.ch.openAir.Limit;
import www.ubx.ch.openAir.Limites;
import www.ubx.ch.openAir.LongDec;
import www.ubx.ch.openAir.LongDegr;
import www.ubx.ch.openAir.LowLimit;
import www.ubx.ch.openAir.MinDec;
import www.ubx.ch.openAir.MinSec;
import www.ubx.ch.openAir.Minus;
import www.ubx.ch.openAir.OpenAir;
import www.ubx.ch.openAir.OpenAirFactory;
import www.ubx.ch.openAir.OpenAirPackage;
import www.ubx.ch.openAir.Plus;
import www.ubx.ch.openAir.Point;
import www.ubx.ch.openAir.Point1;
import www.ubx.ch.openAir.Point2;
import www.ubx.ch.openAir.Point3;
import www.ubx.ch.openAir.Point4;
import www.ubx.ch.openAir.SecDec;
import www.ubx.ch.openAir.TheDef;
import www.ubx.ch.openAir.TheGeom;
import www.ubx.ch.openAir.Units;
import www.ubx.ch.openAir.Vsub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenAirPackageImpl extends EPackageImpl implements OpenAirPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass openAirEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass airspaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass theDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sbEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass limitesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass theGeomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lowLimitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass highLimitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass limitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sfcEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vsubEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dirEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dcEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass point1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass point2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass point3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass point4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass longDegrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass latDegrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minSecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass secDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass longDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass latDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass daEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass daParamsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass daParams1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass daParams2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dbEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum classTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum unitsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum weEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum nsEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see www.ubx.ch.openAir.OpenAirPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OpenAirPackageImpl()
  {
    super(eNS_URI, OpenAirFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link OpenAirPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static OpenAirPackage init()
  {
    if (isInited) return (OpenAirPackage)EPackage.Registry.INSTANCE.getEPackage(OpenAirPackage.eNS_URI);

    // Obtain or create and register package
    OpenAirPackageImpl theOpenAirPackage = (OpenAirPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OpenAirPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OpenAirPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theOpenAirPackage.createPackageContents();

    // Initialize created meta-data
    theOpenAirPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOpenAirPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(OpenAirPackage.eNS_URI, theOpenAirPackage);
    return theOpenAirPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOpenAir()
  {
    return openAirEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOpenAir_Airspaces()
  {
    return (EReference)openAirEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAirspace()
  {
    return airspaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAirspace_Thedef()
  {
    return (EReference)airspaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAirspace_Thegeom()
  {
    return (EReference)airspaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTheDef()
  {
    return theDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTheDef_Asclass()
  {
    return (EReference)theDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTheDef_Sp()
  {
    return (EReference)theDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTheDef_Sb()
  {
    return (EReference)theDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTheDef_Name()
  {
    return (EReference)theDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTheDef_At()
  {
    return (EReference)theDefEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTheDef_Limit()
  {
    return (EReference)theDefEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAsClass()
  {
    return asClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAsClass_Name()
  {
    return (EAttribute)asClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSP()
  {
    return spEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSP_Sp0()
  {
    return (EAttribute)spEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSP_Sp1()
  {
    return (EAttribute)spEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSP_Sp2()
  {
    return (EAttribute)spEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSP_Sp3()
  {
    return (EAttribute)spEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSP_Sp4()
  {
    return (EAttribute)spEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSB()
  {
    return sbEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSB_SbVal1()
  {
    return (EAttribute)sbEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSB_SbVal2()
  {
    return (EAttribute)sbEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSB_SbVal3()
  {
    return (EAttribute)sbEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAsName()
  {
    return asNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAsName_Name()
  {
    return (EAttribute)asNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLimites()
  {
    return limitesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLimites_LowLimit()
  {
    return (EReference)limitesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLimites_HighLimit()
  {
    return (EReference)limitesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLimites_HeighLimit()
  {
    return (EReference)limitesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTheGeom()
  {
    return theGeomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLowLimit()
  {
    return lowLimitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLowLimit_Ll()
  {
    return (EReference)lowLimitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHighLimit()
  {
    return highLimitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHighLimit_Hl()
  {
    return (EReference)highLimitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLimit()
  {
    return limitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFL()
  {
    return flEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFL_Value()
  {
    return (EAttribute)flEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSFC()
  {
    return sfcEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGND()
  {
    return gndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUNL()
  {
    return unlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVAL()
  {
    return valEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVAL_Value()
  {
    return (EAttribute)valEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVAL_Unit()
  {
    return (EAttribute)valEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getV()
  {
    return vEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getV_Vsub()
  {
    return (EReference)vEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVsub()
  {
    return vsubEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVsub_X()
  {
    return (EReference)vsubEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVsub_D()
  {
    return (EReference)vsubEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDir()
  {
    return dirEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlus()
  {
    return plusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinus()
  {
    return minusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDC()
  {
    return dcEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDC_Radius()
  {
    return (EAttribute)dcEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDP()
  {
    return dpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDP_Dp()
  {
    return (EReference)dpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPoint()
  {
    return pointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoint_Ns()
  {
    return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoint_We()
  {
    return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPoint1()
  {
    return point1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoint1_LongD()
  {
    return (EReference)point1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoint1_LongM()
  {
    return (EReference)point1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoint1_LongS()
  {
    return (EReference)point1EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoint1_LatD()
  {
    return (EReference)point1EClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoint1_LatM()
  {
    return (EReference)point1EClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoint1_LatS()
  {
    return (EReference)point1EClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPoint2()
  {
    return point2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoint2_LongD()
  {
    return (EReference)point2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoint2_LongMf()
  {
    return (EReference)point2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoint2_LatD()
  {
    return (EReference)point2EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoint2_LatMf()
  {
    return (EReference)point2EClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPoint3()
  {
    return point3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoint3_LongD()
  {
    return (EReference)point3EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoint3_LongM()
  {
    return (EReference)point3EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoint3_LongS()
  {
    return (EReference)point3EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoint3_LatD()
  {
    return (EReference)point3EClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoint3_LatM()
  {
    return (EReference)point3EClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoint3_LatS()
  {
    return (EReference)point3EClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPoint4()
  {
    return point4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoint4_LongD()
  {
    return (EReference)point4EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoint4_LatD()
  {
    return (EReference)point4EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLongDegr()
  {
    return longDegrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLongDegr_Value()
  {
    return (EAttribute)longDegrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLatDegr()
  {
    return latDegrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLatDegr_Value()
  {
    return (EAttribute)latDegrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinSec()
  {
    return minSecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMinSec_Value()
  {
    return (EAttribute)minSecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSecDec()
  {
    return secDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSecDec_Value()
  {
    return (EAttribute)secDecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinDec()
  {
    return minDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMinDec_Value()
  {
    return (EAttribute)minDecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLongDec()
  {
    return longDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLongDec_Value()
  {
    return (EAttribute)longDecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLatDec()
  {
    return latDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLatDec_Value()
  {
    return (EAttribute)latDecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDA()
  {
    return daEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDA_Da()
  {
    return (EReference)daEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDaParams()
  {
    return daParamsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDaParams_AngleStart()
  {
    return (EAttribute)daParamsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDaParams_AngleEnd()
  {
    return (EAttribute)daParamsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDaParams1()
  {
    return daParams1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDaParams1_Radius()
  {
    return (EAttribute)daParams1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDaParams2()
  {
    return daParams2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDaParams2_Radius()
  {
    return (EAttribute)daParams2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDB()
  {
    return dbEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDB_Dp0()
  {
    return (EReference)dbEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDB_Dp1()
  {
    return (EReference)dbEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAT()
  {
    return atEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAT_Lp()
  {
    return (EReference)atEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getClassType()
  {
    return classTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUnits()
  {
    return unitsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getWE()
  {
    return weEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getNS()
  {
    return nsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpenAirFactory getOpenAirFactory()
  {
    return (OpenAirFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    openAirEClass = createEClass(OPEN_AIR);
    createEReference(openAirEClass, OPEN_AIR__AIRSPACES);

    airspaceEClass = createEClass(AIRSPACE);
    createEReference(airspaceEClass, AIRSPACE__THEDEF);
    createEReference(airspaceEClass, AIRSPACE__THEGEOM);

    theDefEClass = createEClass(THE_DEF);
    createEReference(theDefEClass, THE_DEF__ASCLASS);
    createEReference(theDefEClass, THE_DEF__SP);
    createEReference(theDefEClass, THE_DEF__SB);
    createEReference(theDefEClass, THE_DEF__NAME);
    createEReference(theDefEClass, THE_DEF__AT);
    createEReference(theDefEClass, THE_DEF__LIMIT);

    asClassEClass = createEClass(AS_CLASS);
    createEAttribute(asClassEClass, AS_CLASS__NAME);

    spEClass = createEClass(SP);
    createEAttribute(spEClass, SP__SP0);
    createEAttribute(spEClass, SP__SP1);
    createEAttribute(spEClass, SP__SP2);
    createEAttribute(spEClass, SP__SP3);
    createEAttribute(spEClass, SP__SP4);

    sbEClass = createEClass(SB);
    createEAttribute(sbEClass, SB__SB_VAL1);
    createEAttribute(sbEClass, SB__SB_VAL2);
    createEAttribute(sbEClass, SB__SB_VAL3);

    asNameEClass = createEClass(AS_NAME);
    createEAttribute(asNameEClass, AS_NAME__NAME);

    limitesEClass = createEClass(LIMITES);
    createEReference(limitesEClass, LIMITES__LOW_LIMIT);
    createEReference(limitesEClass, LIMITES__HIGH_LIMIT);
    createEReference(limitesEClass, LIMITES__HEIGH_LIMIT);

    theGeomEClass = createEClass(THE_GEOM);

    lowLimitEClass = createEClass(LOW_LIMIT);
    createEReference(lowLimitEClass, LOW_LIMIT__LL);

    highLimitEClass = createEClass(HIGH_LIMIT);
    createEReference(highLimitEClass, HIGH_LIMIT__HL);

    limitEClass = createEClass(LIMIT);

    flEClass = createEClass(FL);
    createEAttribute(flEClass, FL__VALUE);

    sfcEClass = createEClass(SFC);

    gndEClass = createEClass(GND);

    unlEClass = createEClass(UNL);

    valEClass = createEClass(VAL);
    createEAttribute(valEClass, VAL__VALUE);
    createEAttribute(valEClass, VAL__UNIT);

    vEClass = createEClass(V);
    createEReference(vEClass, V__VSUB);

    vsubEClass = createEClass(VSUB);
    createEReference(vsubEClass, VSUB__X);
    createEReference(vsubEClass, VSUB__D);

    dirEClass = createEClass(DIR);

    plusEClass = createEClass(PLUS);

    minusEClass = createEClass(MINUS);

    dcEClass = createEClass(DC);
    createEAttribute(dcEClass, DC__RADIUS);

    dpEClass = createEClass(DP);
    createEReference(dpEClass, DP__DP);

    pointEClass = createEClass(POINT);
    createEAttribute(pointEClass, POINT__NS);
    createEAttribute(pointEClass, POINT__WE);

    point1EClass = createEClass(POINT1);
    createEReference(point1EClass, POINT1__LONG_D);
    createEReference(point1EClass, POINT1__LONG_M);
    createEReference(point1EClass, POINT1__LONG_S);
    createEReference(point1EClass, POINT1__LAT_D);
    createEReference(point1EClass, POINT1__LAT_M);
    createEReference(point1EClass, POINT1__LAT_S);

    point2EClass = createEClass(POINT2);
    createEReference(point2EClass, POINT2__LONG_D);
    createEReference(point2EClass, POINT2__LONG_MF);
    createEReference(point2EClass, POINT2__LAT_D);
    createEReference(point2EClass, POINT2__LAT_MF);

    point3EClass = createEClass(POINT3);
    createEReference(point3EClass, POINT3__LONG_D);
    createEReference(point3EClass, POINT3__LONG_M);
    createEReference(point3EClass, POINT3__LONG_S);
    createEReference(point3EClass, POINT3__LAT_D);
    createEReference(point3EClass, POINT3__LAT_M);
    createEReference(point3EClass, POINT3__LAT_S);

    point4EClass = createEClass(POINT4);
    createEReference(point4EClass, POINT4__LONG_D);
    createEReference(point4EClass, POINT4__LAT_D);

    longDegrEClass = createEClass(LONG_DEGR);
    createEAttribute(longDegrEClass, LONG_DEGR__VALUE);

    latDegrEClass = createEClass(LAT_DEGR);
    createEAttribute(latDegrEClass, LAT_DEGR__VALUE);

    minSecEClass = createEClass(MIN_SEC);
    createEAttribute(minSecEClass, MIN_SEC__VALUE);

    secDecEClass = createEClass(SEC_DEC);
    createEAttribute(secDecEClass, SEC_DEC__VALUE);

    minDecEClass = createEClass(MIN_DEC);
    createEAttribute(minDecEClass, MIN_DEC__VALUE);

    longDecEClass = createEClass(LONG_DEC);
    createEAttribute(longDecEClass, LONG_DEC__VALUE);

    latDecEClass = createEClass(LAT_DEC);
    createEAttribute(latDecEClass, LAT_DEC__VALUE);

    daEClass = createEClass(DA);
    createEReference(daEClass, DA__DA);

    daParamsEClass = createEClass(DA_PARAMS);
    createEAttribute(daParamsEClass, DA_PARAMS__ANGLE_START);
    createEAttribute(daParamsEClass, DA_PARAMS__ANGLE_END);

    daParams1EClass = createEClass(DA_PARAMS1);
    createEAttribute(daParams1EClass, DA_PARAMS1__RADIUS);

    daParams2EClass = createEClass(DA_PARAMS2);
    createEAttribute(daParams2EClass, DA_PARAMS2__RADIUS);

    dbEClass = createEClass(DB);
    createEReference(dbEClass, DB__DP0);
    createEReference(dbEClass, DB__DP1);

    atEClass = createEClass(AT);
    createEReference(atEClass, AT__LP);

    // Create enums
    classTypeEEnum = createEEnum(CLASS_TYPE);
    unitsEEnum = createEEnum(UNITS);
    weEEnum = createEEnum(WE);
    nsEEnum = createEEnum(NS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    flEClass.getESuperTypes().add(this.getLimit());
    sfcEClass.getESuperTypes().add(this.getLimit());
    gndEClass.getESuperTypes().add(this.getLimit());
    unlEClass.getESuperTypes().add(this.getLimit());
    valEClass.getESuperTypes().add(this.getLimit());
    vEClass.getESuperTypes().add(this.getTheGeom());
    plusEClass.getESuperTypes().add(this.getDir());
    minusEClass.getESuperTypes().add(this.getDir());
    dcEClass.getESuperTypes().add(this.getTheGeom());
    dpEClass.getESuperTypes().add(this.getTheGeom());
    point1EClass.getESuperTypes().add(this.getPoint());
    point2EClass.getESuperTypes().add(this.getPoint());
    point3EClass.getESuperTypes().add(this.getPoint());
    point4EClass.getESuperTypes().add(this.getPoint());
    daEClass.getESuperTypes().add(this.getTheGeom());
    daParams1EClass.getESuperTypes().add(this.getDaParams());
    daParams2EClass.getESuperTypes().add(this.getDaParams());
    dbEClass.getESuperTypes().add(this.getTheGeom());

    // Initialize classes and features; add operations and parameters
    initEClass(openAirEClass, OpenAir.class, "OpenAir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOpenAir_Airspaces(), this.getAirspace(), null, "airspaces", null, 0, -1, OpenAir.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(airspaceEClass, Airspace.class, "Airspace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAirspace_Thedef(), this.getTheDef(), null, "thedef", null, 0, 1, Airspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAirspace_Thegeom(), this.getTheGeom(), null, "thegeom", null, 0, -1, Airspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(theDefEClass, TheDef.class, "TheDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTheDef_Asclass(), this.getAsClass(), null, "asclass", null, 0, 1, TheDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTheDef_Sp(), this.getSP(), null, "sp", null, 0, -1, TheDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTheDef_Sb(), this.getSB(), null, "sb", null, 0, -1, TheDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTheDef_Name(), this.getAsName(), null, "name", null, 0, 1, TheDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTheDef_At(), this.getAT(), null, "at", null, 0, -1, TheDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTheDef_Limit(), this.getLimites(), null, "limit", null, 0, 1, TheDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(asClassEClass, AsClass.class, "AsClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAsClass_Name(), this.getClassType(), "name", null, 0, 1, AsClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spEClass, www.ubx.ch.openAir.SP.class, "SP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSP_Sp0(), ecorePackage.getEInt(), "sp0", null, 0, 1, www.ubx.ch.openAir.SP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSP_Sp1(), ecorePackage.getEInt(), "sp1", null, 0, 1, www.ubx.ch.openAir.SP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSP_Sp2(), ecorePackage.getEInt(), "sp2", null, 0, 1, www.ubx.ch.openAir.SP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSP_Sp3(), ecorePackage.getEInt(), "sp3", null, 0, 1, www.ubx.ch.openAir.SP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSP_Sp4(), ecorePackage.getEInt(), "sp4", null, 0, 1, www.ubx.ch.openAir.SP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sbEClass, www.ubx.ch.openAir.SB.class, "SB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSB_SbVal1(), ecorePackage.getEInt(), "sbVal1", null, 0, 1, www.ubx.ch.openAir.SB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSB_SbVal2(), ecorePackage.getEInt(), "sbVal2", null, 0, 1, www.ubx.ch.openAir.SB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSB_SbVal3(), ecorePackage.getEInt(), "sbVal3", null, 0, 1, www.ubx.ch.openAir.SB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(asNameEClass, AsName.class, "AsName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAsName_Name(), ecorePackage.getEString(), "name", null, 0, 1, AsName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(limitesEClass, Limites.class, "Limites", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLimites_LowLimit(), this.getLowLimit(), null, "lowLimit", null, 0, 1, Limites.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLimites_HighLimit(), this.getHighLimit(), null, "highLimit", null, 0, 1, Limites.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLimites_HeighLimit(), this.getHighLimit(), null, "heighLimit", null, 0, 1, Limites.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(theGeomEClass, TheGeom.class, "TheGeom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lowLimitEClass, LowLimit.class, "LowLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLowLimit_Ll(), this.getLimit(), null, "ll", null, 0, 1, LowLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(highLimitEClass, HighLimit.class, "HighLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHighLimit_Hl(), this.getLimit(), null, "hl", null, 0, 1, HighLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(limitEClass, Limit.class, "Limit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(flEClass, www.ubx.ch.openAir.FL.class, "FL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFL_Value(), ecorePackage.getEInt(), "value", null, 0, 1, www.ubx.ch.openAir.FL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sfcEClass, www.ubx.ch.openAir.SFC.class, "SFC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(gndEClass, www.ubx.ch.openAir.GND.class, "GND", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unlEClass, www.ubx.ch.openAir.UNL.class, "UNL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(valEClass, www.ubx.ch.openAir.VAL.class, "VAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVAL_Value(), ecorePackage.getEInt(), "value", null, 0, 1, www.ubx.ch.openAir.VAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVAL_Unit(), this.getUnits(), "unit", null, 0, 1, www.ubx.ch.openAir.VAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vEClass, www.ubx.ch.openAir.V.class, "V", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getV_Vsub(), this.getVsub(), null, "vsub", null, 0, 1, www.ubx.ch.openAir.V.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vsubEClass, Vsub.class, "Vsub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVsub_X(), this.getPoint(), null, "x", null, 0, 1, Vsub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVsub_D(), this.getDir(), null, "d", null, 0, 1, Vsub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dirEClass, Dir.class, "Dir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dcEClass, www.ubx.ch.openAir.DC.class, "DC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDC_Radius(), ecorePackage.getEString(), "radius", null, 0, 1, www.ubx.ch.openAir.DC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dpEClass, www.ubx.ch.openAir.DP.class, "DP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDP_Dp(), this.getPoint(), null, "dp", null, 0, 1, www.ubx.ch.openAir.DP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPoint_Ns(), this.getNS(), "ns", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPoint_We(), this.getWE(), "we", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(point1EClass, Point1.class, "Point1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPoint1_LongD(), this.getLongDegr(), null, "longD", null, 0, 1, Point1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPoint1_LongM(), this.getMinSec(), null, "longM", null, 0, 1, Point1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPoint1_LongS(), this.getMinSec(), null, "longS", null, 0, 1, Point1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPoint1_LatD(), this.getLatDegr(), null, "latD", null, 0, 1, Point1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPoint1_LatM(), this.getMinSec(), null, "latM", null, 0, 1, Point1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPoint1_LatS(), this.getMinSec(), null, "latS", null, 0, 1, Point1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(point2EClass, Point2.class, "Point2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPoint2_LongD(), this.getLongDegr(), null, "longD", null, 0, 1, Point2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPoint2_LongMf(), this.getMinDec(), null, "longMf", null, 0, 1, Point2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPoint2_LatD(), this.getLatDegr(), null, "latD", null, 0, 1, Point2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPoint2_LatMf(), this.getMinDec(), null, "latMf", null, 0, 1, Point2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(point3EClass, Point3.class, "Point3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPoint3_LongD(), this.getLongDegr(), null, "longD", null, 0, 1, Point3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPoint3_LongM(), this.getMinSec(), null, "longM", null, 0, 1, Point3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPoint3_LongS(), this.getSecDec(), null, "longS", null, 0, 1, Point3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPoint3_LatD(), this.getLatDegr(), null, "latD", null, 0, 1, Point3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPoint3_LatM(), this.getMinSec(), null, "latM", null, 0, 1, Point3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPoint3_LatS(), this.getSecDec(), null, "latS", null, 0, 1, Point3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(point4EClass, Point4.class, "Point4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPoint4_LongD(), this.getLongDec(), null, "longD", null, 0, 1, Point4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPoint4_LatD(), this.getLatDec(), null, "latD", null, 0, 1, Point4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(longDegrEClass, LongDegr.class, "LongDegr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLongDegr_Value(), ecorePackage.getEInt(), "value", null, 0, 1, LongDegr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(latDegrEClass, LatDegr.class, "LatDegr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLatDegr_Value(), ecorePackage.getEInt(), "value", null, 0, 1, LatDegr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(minSecEClass, MinSec.class, "MinSec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMinSec_Value(), ecorePackage.getEInt(), "value", null, 0, 1, MinSec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(secDecEClass, SecDec.class, "SecDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSecDec_Value(), ecorePackage.getEString(), "value", null, 0, 1, SecDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(minDecEClass, MinDec.class, "MinDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMinDec_Value(), ecorePackage.getEString(), "value", null, 0, 1, MinDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(longDecEClass, LongDec.class, "LongDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLongDec_Value(), ecorePackage.getEString(), "value", null, 0, 1, LongDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(latDecEClass, LatDec.class, "LatDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLatDec_Value(), ecorePackage.getEString(), "value", null, 0, 1, LatDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(daEClass, www.ubx.ch.openAir.DA.class, "DA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDA_Da(), this.getDaParams(), null, "da", null, 0, 1, www.ubx.ch.openAir.DA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(daParamsEClass, DaParams.class, "DaParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDaParams_AngleStart(), ecorePackage.getEInt(), "angleStart", null, 0, 1, DaParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDaParams_AngleEnd(), ecorePackage.getEInt(), "angleEnd", null, 0, 1, DaParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(daParams1EClass, DaParams1.class, "DaParams1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDaParams1_Radius(), ecorePackage.getEString(), "radius", null, 0, 1, DaParams1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(daParams2EClass, DaParams2.class, "DaParams2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDaParams2_Radius(), ecorePackage.getEInt(), "radius", null, 0, 1, DaParams2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dbEClass, www.ubx.ch.openAir.DB.class, "DB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDB_Dp0(), this.getPoint(), null, "dp0", null, 0, 1, www.ubx.ch.openAir.DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDB_Dp1(), this.getPoint(), null, "dp1", null, 0, 1, www.ubx.ch.openAir.DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atEClass, www.ubx.ch.openAir.AT.class, "AT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAT_Lp(), this.getPoint(), null, "lp", null, 0, 1, www.ubx.ch.openAir.AT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(classTypeEEnum, ClassType.class, "ClassType");
    addEEnumLiteral(classTypeEEnum, ClassType.A);
    addEEnumLiteral(classTypeEEnum, ClassType.B);
    addEEnumLiteral(classTypeEEnum, ClassType.C);
    addEEnumLiteral(classTypeEEnum, ClassType.D);
    addEEnumLiteral(classTypeEEnum, ClassType.E);
    addEEnumLiteral(classTypeEEnum, ClassType.F);
    addEEnumLiteral(classTypeEEnum, ClassType.G);
    addEEnumLiteral(classTypeEEnum, ClassType.Q);
    addEEnumLiteral(classTypeEEnum, ClassType.R);
    addEEnumLiteral(classTypeEEnum, ClassType.W);
    addEEnumLiteral(classTypeEEnum, ClassType.P);
    addEEnumLiteral(classTypeEEnum, ClassType.GP);
    addEEnumLiteral(classTypeEEnum, ClassType.TMZ);
    addEEnumLiteral(classTypeEEnum, ClassType.CTR);
    addEEnumLiteral(classTypeEEnum, ClassType.RESTRICTED);
    addEEnumLiteral(classTypeEEnum, ClassType.UKN);

    initEEnum(unitsEEnum, Units.class, "Units");
    addEEnumLiteral(unitsEEnum, Units.FEED);
    addEEnumLiteral(unitsEEnum, Units.METER);
    addEEnumLiteral(unitsEEnum, Units.MSL);
    addEEnumLiteral(unitsEEnum, Units.MMSL);
    addEEnumLiteral(unitsEEnum, Units.FT_MSL);
    addEEnumLiteral(unitsEEnum, Units.AGL);
    addEEnumLiteral(unitsEEnum, Units.MAGL);
    addEEnumLiteral(unitsEEnum, Units.FT_AGL);
    addEEnumLiteral(unitsEEnum, Units.AMSL);
    addEEnumLiteral(unitsEEnum, Units.MAMSL);

    initEEnum(weEEnum, www.ubx.ch.openAir.WE.class, "WE");
    addEEnumLiteral(weEEnum, www.ubx.ch.openAir.WE.W);
    addEEnumLiteral(weEEnum, www.ubx.ch.openAir.WE.E);

    initEEnum(nsEEnum, www.ubx.ch.openAir.NS.class, "NS");
    addEEnumLiteral(nsEEnum, www.ubx.ch.openAir.NS.N);
    addEEnumLiteral(nsEEnum, www.ubx.ch.openAir.NS.S);

    // Create resource
    createResource(eNS_URI);
  }

} //OpenAirPackageImpl
