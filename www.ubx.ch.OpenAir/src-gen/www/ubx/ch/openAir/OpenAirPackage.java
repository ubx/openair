/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see www.ubx.ch.openAir.OpenAirFactory
 * @model kind="package"
 * @generated
 */
public interface OpenAirPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "openAir";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ubx.www/ch/OpenAir";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "openAir";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OpenAirPackage eINSTANCE = www.ubx.ch.openAir.impl.OpenAirPackageImpl.init();

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.OpenAirImpl <em>Open Air</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.OpenAirImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getOpenAir()
   * @generated
   */
  int OPEN_AIR = 0;

  /**
   * The feature id for the '<em><b>Airspaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_AIR__AIRSPACES = 0;

  /**
   * The number of structural features of the '<em>Open Air</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_AIR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.AirspaceImpl <em>Airspace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.AirspaceImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getAirspace()
   * @generated
   */
  int AIRSPACE = 1;

  /**
   * The feature id for the '<em><b>Thedef</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIRSPACE__THEDEF = 0;

  /**
   * The feature id for the '<em><b>Thegeom</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIRSPACE__THEGEOM = 1;

  /**
   * The number of structural features of the '<em>Airspace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIRSPACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.TheDefImpl <em>The Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.TheDefImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getTheDef()
   * @generated
   */
  int THE_DEF = 2;

  /**
   * The feature id for the '<em><b>Asclass</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THE_DEF__ASCLASS = 0;

  /**
   * The feature id for the '<em><b>Sp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THE_DEF__SP = 1;

  /**
   * The feature id for the '<em><b>Sb</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THE_DEF__SB = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THE_DEF__NAME = 3;

  /**
   * The feature id for the '<em><b>At</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THE_DEF__AT = 4;

  /**
   * The feature id for the '<em><b>Limit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THE_DEF__LIMIT = 5;

  /**
   * The number of structural features of the '<em>The Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THE_DEF_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.AsClassImpl <em>As Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.AsClassImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getAsClass()
   * @generated
   */
  int AS_CLASS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AS_CLASS__NAME = 0;

  /**
   * The number of structural features of the '<em>As Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AS_CLASS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.SPImpl <em>SP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.SPImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getSP()
   * @generated
   */
  int SP = 4;

  /**
   * The feature id for the '<em><b>Sp0</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP__SP0 = 0;

  /**
   * The feature id for the '<em><b>Sp1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP__SP1 = 1;

  /**
   * The feature id for the '<em><b>Sp2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP__SP2 = 2;

  /**
   * The feature id for the '<em><b>Sp3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP__SP3 = 3;

  /**
   * The feature id for the '<em><b>Sp4</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP__SP4 = 4;

  /**
   * The number of structural features of the '<em>SP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.SBImpl <em>SB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.SBImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getSB()
   * @generated
   */
  int SB = 5;

  /**
   * The feature id for the '<em><b>Sb Val1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SB__SB_VAL1 = 0;

  /**
   * The feature id for the '<em><b>Sb Val2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SB__SB_VAL2 = 1;

  /**
   * The feature id for the '<em><b>Sb Val3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SB__SB_VAL3 = 2;

  /**
   * The number of structural features of the '<em>SB</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SB_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.AsNameImpl <em>As Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.AsNameImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getAsName()
   * @generated
   */
  int AS_NAME = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AS_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>As Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AS_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.LimitesImpl <em>Limites</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.LimitesImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getLimites()
   * @generated
   */
  int LIMITES = 7;

  /**
   * The feature id for the '<em><b>Low Limit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMITES__LOW_LIMIT = 0;

  /**
   * The feature id for the '<em><b>High Limit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMITES__HIGH_LIMIT = 1;

  /**
   * The feature id for the '<em><b>Heigh Limit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMITES__HEIGH_LIMIT = 2;

  /**
   * The number of structural features of the '<em>Limites</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMITES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.TheGeomImpl <em>The Geom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.TheGeomImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getTheGeom()
   * @generated
   */
  int THE_GEOM = 8;

  /**
   * The number of structural features of the '<em>The Geom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THE_GEOM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.LowLimitImpl <em>Low Limit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.LowLimitImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getLowLimit()
   * @generated
   */
  int LOW_LIMIT = 9;

  /**
   * The feature id for the '<em><b>Ll</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOW_LIMIT__LL = 0;

  /**
   * The number of structural features of the '<em>Low Limit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOW_LIMIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.HighLimitImpl <em>High Limit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.HighLimitImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getHighLimit()
   * @generated
   */
  int HIGH_LIMIT = 10;

  /**
   * The feature id for the '<em><b>Hl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGH_LIMIT__HL = 0;

  /**
   * The number of structural features of the '<em>High Limit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HIGH_LIMIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.LimitImpl <em>Limit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.LimitImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getLimit()
   * @generated
   */
  int LIMIT = 11;

  /**
   * The number of structural features of the '<em>Limit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.FLImpl <em>FL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.FLImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getFL()
   * @generated
   */
  int FL = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FL__VALUE = LIMIT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>FL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FL_FEATURE_COUNT = LIMIT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.SFCImpl <em>SFC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.SFCImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getSFC()
   * @generated
   */
  int SFC = 13;

  /**
   * The number of structural features of the '<em>SFC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SFC_FEATURE_COUNT = LIMIT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.GNDImpl <em>GND</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.GNDImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getGND()
   * @generated
   */
  int GND = 14;

  /**
   * The number of structural features of the '<em>GND</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GND_FEATURE_COUNT = LIMIT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.UNLImpl <em>UNL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.UNLImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getUNL()
   * @generated
   */
  int UNL = 15;

  /**
   * The number of structural features of the '<em>UNL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNL_FEATURE_COUNT = LIMIT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.VALImpl <em>VAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.VALImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getVAL()
   * @generated
   */
  int VAL = 16;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAL__VALUE = LIMIT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAL__UNIT = LIMIT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>VAL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAL_FEATURE_COUNT = LIMIT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.VImpl <em>V</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.VImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getV()
   * @generated
   */
  int V = 17;

  /**
   * The feature id for the '<em><b>Vsub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int V__VSUB = THE_GEOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>V</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int V_FEATURE_COUNT = THE_GEOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.VsubImpl <em>Vsub</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.VsubImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getVsub()
   * @generated
   */
  int VSUB = 18;

  /**
   * The feature id for the '<em><b>X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VSUB__X = 0;

  /**
   * The feature id for the '<em><b>D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VSUB__D = 1;

  /**
   * The number of structural features of the '<em>Vsub</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VSUB_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.DirImpl <em>Dir</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.DirImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getDir()
   * @generated
   */
  int DIR = 19;

  /**
   * The number of structural features of the '<em>Dir</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.PlusImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 20;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = DIR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.MinusImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 21;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = DIR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.DCImpl <em>DC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.DCImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getDC()
   * @generated
   */
  int DC = 22;

  /**
   * The feature id for the '<em><b>Radius</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC__RADIUS = THE_GEOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_FEATURE_COUNT = THE_GEOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.RadiusImpl <em>Radius</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.RadiusImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getRadius()
   * @generated
   */
  int RADIUS = 23;

  /**
   * The feature id for the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIUS__INT_VALUE = 0;

  /**
   * The feature id for the '<em><b>Reak Valuer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIUS__REAK_VALUER = 1;

  /**
   * The number of structural features of the '<em>Radius</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIUS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.DPImpl <em>DP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.DPImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getDP()
   * @generated
   */
  int DP = 24;

  /**
   * The feature id for the '<em><b>Dp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DP__DP = THE_GEOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DP_FEATURE_COUNT = THE_GEOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.PointImpl <em>Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.PointImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getPoint()
   * @generated
   */
  int POINT = 25;

  /**
   * The feature id for the '<em><b>Ns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__NS = 0;

  /**
   * The feature id for the '<em><b>We</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__WE = 1;

  /**
   * The number of structural features of the '<em>Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.Point1Impl <em>Point1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.Point1Impl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getPoint1()
   * @generated
   */
  int POINT1 = 26;

  /**
   * The feature id for the '<em><b>Ns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT1__NS = POINT__NS;

  /**
   * The feature id for the '<em><b>We</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT1__WE = POINT__WE;

  /**
   * The feature id for the '<em><b>Long D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT1__LONG_D = POINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Long M</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT1__LONG_M = POINT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Long S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT1__LONG_S = POINT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Lat D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT1__LAT_D = POINT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Lat M</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT1__LAT_M = POINT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Lat S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT1__LAT_S = POINT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Point1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT1_FEATURE_COUNT = POINT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.Point2Impl <em>Point2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.Point2Impl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getPoint2()
   * @generated
   */
  int POINT2 = 27;

  /**
   * The feature id for the '<em><b>Ns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT2__NS = POINT__NS;

  /**
   * The feature id for the '<em><b>We</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT2__WE = POINT__WE;

  /**
   * The feature id for the '<em><b>Long D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT2__LONG_D = POINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Long Mf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT2__LONG_MF = POINT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Lat D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT2__LAT_D = POINT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Lat Mf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT2__LAT_MF = POINT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Point2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT2_FEATURE_COUNT = POINT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.Point3Impl <em>Point3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.Point3Impl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getPoint3()
   * @generated
   */
  int POINT3 = 28;

  /**
   * The feature id for the '<em><b>Ns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT3__NS = POINT__NS;

  /**
   * The feature id for the '<em><b>We</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT3__WE = POINT__WE;

  /**
   * The feature id for the '<em><b>Long D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT3__LONG_D = POINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Long M</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT3__LONG_M = POINT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Long S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT3__LONG_S = POINT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Lat D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT3__LAT_D = POINT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Lat M</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT3__LAT_M = POINT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Lat S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT3__LAT_S = POINT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Point3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT3_FEATURE_COUNT = POINT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.Point4Impl <em>Point4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.Point4Impl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getPoint4()
   * @generated
   */
  int POINT4 = 29;

  /**
   * The feature id for the '<em><b>Ns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT4__NS = POINT__NS;

  /**
   * The feature id for the '<em><b>We</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT4__WE = POINT__WE;

  /**
   * The feature id for the '<em><b>Long D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT4__LONG_D = POINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lat D</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT4__LAT_D = POINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Point4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT4_FEATURE_COUNT = POINT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.LongDegrImpl <em>Long Degr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.LongDegrImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getLongDegr()
   * @generated
   */
  int LONG_DEGR = 30;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_DEGR__VALUE = 0;

  /**
   * The number of structural features of the '<em>Long Degr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_DEGR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.LatDegrImpl <em>Lat Degr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.LatDegrImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getLatDegr()
   * @generated
   */
  int LAT_DEGR = 31;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAT_DEGR__VALUE = 0;

  /**
   * The number of structural features of the '<em>Lat Degr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAT_DEGR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.MinSecImpl <em>Min Sec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.MinSecImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getMinSec()
   * @generated
   */
  int MIN_SEC = 32;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_SEC__VALUE = 0;

  /**
   * The number of structural features of the '<em>Min Sec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_SEC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.SecDecImpl <em>Sec Dec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.SecDecImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getSecDec()
   * @generated
   */
  int SEC_DEC = 33;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_DEC__VALUE = 0;

  /**
   * The number of structural features of the '<em>Sec Dec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_DEC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.MinDecImpl <em>Min Dec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.MinDecImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getMinDec()
   * @generated
   */
  int MIN_DEC = 34;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_DEC__VALUE = 0;

  /**
   * The number of structural features of the '<em>Min Dec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_DEC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.LongDecImpl <em>Long Dec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.LongDecImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getLongDec()
   * @generated
   */
  int LONG_DEC = 35;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_DEC__VALUE = 0;

  /**
   * The number of structural features of the '<em>Long Dec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_DEC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.LatDecImpl <em>Lat Dec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.LatDecImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getLatDec()
   * @generated
   */
  int LAT_DEC = 36;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAT_DEC__VALUE = 0;

  /**
   * The number of structural features of the '<em>Lat Dec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAT_DEC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.DAImpl <em>DA</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.DAImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getDA()
   * @generated
   */
  int DA = 37;

  /**
   * The feature id for the '<em><b>Da</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA__DA = THE_GEOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DA</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_FEATURE_COUNT = THE_GEOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.DaParamsImpl <em>Da Params</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.DaParamsImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getDaParams()
   * @generated
   */
  int DA_PARAMS = 38;

  /**
   * The feature id for the '<em><b>Angle Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_PARAMS__ANGLE_START = 0;

  /**
   * The feature id for the '<em><b>Angle End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_PARAMS__ANGLE_END = 1;

  /**
   * The number of structural features of the '<em>Da Params</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_PARAMS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.DaParams1Impl <em>Da Params1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.DaParams1Impl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getDaParams1()
   * @generated
   */
  int DA_PARAMS1 = 39;

  /**
   * The feature id for the '<em><b>Angle Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_PARAMS1__ANGLE_START = DA_PARAMS__ANGLE_START;

  /**
   * The feature id for the '<em><b>Angle End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_PARAMS1__ANGLE_END = DA_PARAMS__ANGLE_END;

  /**
   * The feature id for the '<em><b>Radius</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_PARAMS1__RADIUS = DA_PARAMS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Da Params1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_PARAMS1_FEATURE_COUNT = DA_PARAMS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.DaParams2Impl <em>Da Params2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.DaParams2Impl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getDaParams2()
   * @generated
   */
  int DA_PARAMS2 = 40;

  /**
   * The feature id for the '<em><b>Angle Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_PARAMS2__ANGLE_START = DA_PARAMS__ANGLE_START;

  /**
   * The feature id for the '<em><b>Angle End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_PARAMS2__ANGLE_END = DA_PARAMS__ANGLE_END;

  /**
   * The feature id for the '<em><b>Radius</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_PARAMS2__RADIUS = DA_PARAMS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Da Params2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_PARAMS2_FEATURE_COUNT = DA_PARAMS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.DBImpl <em>DB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.DBImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getDB()
   * @generated
   */
  int DB = 41;

  /**
   * The feature id for the '<em><b>Dp0</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB__DP0 = THE_GEOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB__DP1 = THE_GEOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DB</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DB_FEATURE_COUNT = THE_GEOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.impl.ATImpl <em>AT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.impl.ATImpl
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getAT()
   * @generated
   */
  int AT = 42;

  /**
   * The feature id for the '<em><b>Lp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT__LP = 0;

  /**
   * The number of structural features of the '<em>AT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.ClassType <em>Class Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.ClassType
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getClassType()
   * @generated
   */
  int CLASS_TYPE = 43;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.Units <em>Units</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.Units
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getUnits()
   * @generated
   */
  int UNITS = 44;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.WE <em>WE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.WE
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getWE()
   * @generated
   */
  int WE = 45;

  /**
   * The meta object id for the '{@link www.ubx.ch.openAir.NS <em>NS</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see www.ubx.ch.openAir.NS
   * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getNS()
   * @generated
   */
  int NS = 46;


  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.OpenAir <em>Open Air</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Open Air</em>'.
   * @see www.ubx.ch.openAir.OpenAir
   * @generated
   */
  EClass getOpenAir();

  /**
   * Returns the meta object for the containment reference list '{@link www.ubx.ch.openAir.OpenAir#getAirspaces <em>Airspaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Airspaces</em>'.
   * @see www.ubx.ch.openAir.OpenAir#getAirspaces()
   * @see #getOpenAir()
   * @generated
   */
  EReference getOpenAir_Airspaces();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.Airspace <em>Airspace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Airspace</em>'.
   * @see www.ubx.ch.openAir.Airspace
   * @generated
   */
  EClass getAirspace();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Airspace#getThedef <em>Thedef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Thedef</em>'.
   * @see www.ubx.ch.openAir.Airspace#getThedef()
   * @see #getAirspace()
   * @generated
   */
  EReference getAirspace_Thedef();

  /**
   * Returns the meta object for the containment reference list '{@link www.ubx.ch.openAir.Airspace#getThegeom <em>Thegeom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Thegeom</em>'.
   * @see www.ubx.ch.openAir.Airspace#getThegeom()
   * @see #getAirspace()
   * @generated
   */
  EReference getAirspace_Thegeom();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.TheDef <em>The Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>The Def</em>'.
   * @see www.ubx.ch.openAir.TheDef
   * @generated
   */
  EClass getTheDef();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.TheDef#getAsclass <em>Asclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Asclass</em>'.
   * @see www.ubx.ch.openAir.TheDef#getAsclass()
   * @see #getTheDef()
   * @generated
   */
  EReference getTheDef_Asclass();

  /**
   * Returns the meta object for the containment reference list '{@link www.ubx.ch.openAir.TheDef#getSp <em>Sp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sp</em>'.
   * @see www.ubx.ch.openAir.TheDef#getSp()
   * @see #getTheDef()
   * @generated
   */
  EReference getTheDef_Sp();

  /**
   * Returns the meta object for the containment reference list '{@link www.ubx.ch.openAir.TheDef#getSb <em>Sb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sb</em>'.
   * @see www.ubx.ch.openAir.TheDef#getSb()
   * @see #getTheDef()
   * @generated
   */
  EReference getTheDef_Sb();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.TheDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see www.ubx.ch.openAir.TheDef#getName()
   * @see #getTheDef()
   * @generated
   */
  EReference getTheDef_Name();

  /**
   * Returns the meta object for the containment reference list '{@link www.ubx.ch.openAir.TheDef#getAt <em>At</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>At</em>'.
   * @see www.ubx.ch.openAir.TheDef#getAt()
   * @see #getTheDef()
   * @generated
   */
  EReference getTheDef_At();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.TheDef#getLimit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Limit</em>'.
   * @see www.ubx.ch.openAir.TheDef#getLimit()
   * @see #getTheDef()
   * @generated
   */
  EReference getTheDef_Limit();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.AsClass <em>As Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>As Class</em>'.
   * @see www.ubx.ch.openAir.AsClass
   * @generated
   */
  EClass getAsClass();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.AsClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see www.ubx.ch.openAir.AsClass#getName()
   * @see #getAsClass()
   * @generated
   */
  EAttribute getAsClass_Name();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.SP <em>SP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SP</em>'.
   * @see www.ubx.ch.openAir.SP
   * @generated
   */
  EClass getSP();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.SP#getSp0 <em>Sp0</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sp0</em>'.
   * @see www.ubx.ch.openAir.SP#getSp0()
   * @see #getSP()
   * @generated
   */
  EAttribute getSP_Sp0();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.SP#getSp1 <em>Sp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sp1</em>'.
   * @see www.ubx.ch.openAir.SP#getSp1()
   * @see #getSP()
   * @generated
   */
  EAttribute getSP_Sp1();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.SP#getSp2 <em>Sp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sp2</em>'.
   * @see www.ubx.ch.openAir.SP#getSp2()
   * @see #getSP()
   * @generated
   */
  EAttribute getSP_Sp2();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.SP#getSp3 <em>Sp3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sp3</em>'.
   * @see www.ubx.ch.openAir.SP#getSp3()
   * @see #getSP()
   * @generated
   */
  EAttribute getSP_Sp3();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.SP#getSp4 <em>Sp4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sp4</em>'.
   * @see www.ubx.ch.openAir.SP#getSp4()
   * @see #getSP()
   * @generated
   */
  EAttribute getSP_Sp4();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.SB <em>SB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SB</em>'.
   * @see www.ubx.ch.openAir.SB
   * @generated
   */
  EClass getSB();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.SB#getSbVal1 <em>Sb Val1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sb Val1</em>'.
   * @see www.ubx.ch.openAir.SB#getSbVal1()
   * @see #getSB()
   * @generated
   */
  EAttribute getSB_SbVal1();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.SB#getSbVal2 <em>Sb Val2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sb Val2</em>'.
   * @see www.ubx.ch.openAir.SB#getSbVal2()
   * @see #getSB()
   * @generated
   */
  EAttribute getSB_SbVal2();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.SB#getSbVal3 <em>Sb Val3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sb Val3</em>'.
   * @see www.ubx.ch.openAir.SB#getSbVal3()
   * @see #getSB()
   * @generated
   */
  EAttribute getSB_SbVal3();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.AsName <em>As Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>As Name</em>'.
   * @see www.ubx.ch.openAir.AsName
   * @generated
   */
  EClass getAsName();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.AsName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see www.ubx.ch.openAir.AsName#getName()
   * @see #getAsName()
   * @generated
   */
  EAttribute getAsName_Name();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.Limites <em>Limites</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Limites</em>'.
   * @see www.ubx.ch.openAir.Limites
   * @generated
   */
  EClass getLimites();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Limites#getLowLimit <em>Low Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Low Limit</em>'.
   * @see www.ubx.ch.openAir.Limites#getLowLimit()
   * @see #getLimites()
   * @generated
   */
  EReference getLimites_LowLimit();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Limites#getHighLimit <em>High Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>High Limit</em>'.
   * @see www.ubx.ch.openAir.Limites#getHighLimit()
   * @see #getLimites()
   * @generated
   */
  EReference getLimites_HighLimit();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Limites#getHeighLimit <em>Heigh Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Heigh Limit</em>'.
   * @see www.ubx.ch.openAir.Limites#getHeighLimit()
   * @see #getLimites()
   * @generated
   */
  EReference getLimites_HeighLimit();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.TheGeom <em>The Geom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>The Geom</em>'.
   * @see www.ubx.ch.openAir.TheGeom
   * @generated
   */
  EClass getTheGeom();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.LowLimit <em>Low Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Low Limit</em>'.
   * @see www.ubx.ch.openAir.LowLimit
   * @generated
   */
  EClass getLowLimit();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.LowLimit#getLl <em>Ll</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ll</em>'.
   * @see www.ubx.ch.openAir.LowLimit#getLl()
   * @see #getLowLimit()
   * @generated
   */
  EReference getLowLimit_Ll();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.HighLimit <em>High Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>High Limit</em>'.
   * @see www.ubx.ch.openAir.HighLimit
   * @generated
   */
  EClass getHighLimit();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.HighLimit#getHl <em>Hl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hl</em>'.
   * @see www.ubx.ch.openAir.HighLimit#getHl()
   * @see #getHighLimit()
   * @generated
   */
  EReference getHighLimit_Hl();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.Limit <em>Limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Limit</em>'.
   * @see www.ubx.ch.openAir.Limit
   * @generated
   */
  EClass getLimit();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.FL <em>FL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FL</em>'.
   * @see www.ubx.ch.openAir.FL
   * @generated
   */
  EClass getFL();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.FL#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see www.ubx.ch.openAir.FL#getValue()
   * @see #getFL()
   * @generated
   */
  EAttribute getFL_Value();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.SFC <em>SFC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SFC</em>'.
   * @see www.ubx.ch.openAir.SFC
   * @generated
   */
  EClass getSFC();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.GND <em>GND</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GND</em>'.
   * @see www.ubx.ch.openAir.GND
   * @generated
   */
  EClass getGND();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.UNL <em>UNL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UNL</em>'.
   * @see www.ubx.ch.openAir.UNL
   * @generated
   */
  EClass getUNL();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.VAL <em>VAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VAL</em>'.
   * @see www.ubx.ch.openAir.VAL
   * @generated
   */
  EClass getVAL();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.VAL#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see www.ubx.ch.openAir.VAL#getValue()
   * @see #getVAL()
   * @generated
   */
  EAttribute getVAL_Value();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.VAL#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see www.ubx.ch.openAir.VAL#getUnit()
   * @see #getVAL()
   * @generated
   */
  EAttribute getVAL_Unit();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.V <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>V</em>'.
   * @see www.ubx.ch.openAir.V
   * @generated
   */
  EClass getV();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.V#getVsub <em>Vsub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vsub</em>'.
   * @see www.ubx.ch.openAir.V#getVsub()
   * @see #getV()
   * @generated
   */
  EReference getV_Vsub();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.Vsub <em>Vsub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vsub</em>'.
   * @see www.ubx.ch.openAir.Vsub
   * @generated
   */
  EClass getVsub();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Vsub#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>X</em>'.
   * @see www.ubx.ch.openAir.Vsub#getX()
   * @see #getVsub()
   * @generated
   */
  EReference getVsub_X();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Vsub#getD <em>D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>D</em>'.
   * @see www.ubx.ch.openAir.Vsub#getD()
   * @see #getVsub()
   * @generated
   */
  EReference getVsub_D();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.Dir <em>Dir</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dir</em>'.
   * @see www.ubx.ch.openAir.Dir
   * @generated
   */
  EClass getDir();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see www.ubx.ch.openAir.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see www.ubx.ch.openAir.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.DC <em>DC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DC</em>'.
   * @see www.ubx.ch.openAir.DC
   * @generated
   */
  EClass getDC();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.DC#getRadius <em>Radius</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Radius</em>'.
   * @see www.ubx.ch.openAir.DC#getRadius()
   * @see #getDC()
   * @generated
   */
  EReference getDC_Radius();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.Radius <em>Radius</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Radius</em>'.
   * @see www.ubx.ch.openAir.Radius
   * @generated
   */
  EClass getRadius();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.Radius#getIntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Value</em>'.
   * @see www.ubx.ch.openAir.Radius#getIntValue()
   * @see #getRadius()
   * @generated
   */
  EAttribute getRadius_IntValue();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.Radius#getReakValuer <em>Reak Valuer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reak Valuer</em>'.
   * @see www.ubx.ch.openAir.Radius#getReakValuer()
   * @see #getRadius()
   * @generated
   */
  EAttribute getRadius_ReakValuer();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.DP <em>DP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DP</em>'.
   * @see www.ubx.ch.openAir.DP
   * @generated
   */
  EClass getDP();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.DP#getDp <em>Dp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dp</em>'.
   * @see www.ubx.ch.openAir.DP#getDp()
   * @see #getDP()
   * @generated
   */
  EReference getDP_Dp();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point</em>'.
   * @see www.ubx.ch.openAir.Point
   * @generated
   */
  EClass getPoint();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.Point#getNs <em>Ns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ns</em>'.
   * @see www.ubx.ch.openAir.Point#getNs()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_Ns();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.Point#getWe <em>We</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>We</em>'.
   * @see www.ubx.ch.openAir.Point#getWe()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_We();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.Point1 <em>Point1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point1</em>'.
   * @see www.ubx.ch.openAir.Point1
   * @generated
   */
  EClass getPoint1();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Point1#getLongD <em>Long D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Long D</em>'.
   * @see www.ubx.ch.openAir.Point1#getLongD()
   * @see #getPoint1()
   * @generated
   */
  EReference getPoint1_LongD();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Point1#getLongM <em>Long M</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Long M</em>'.
   * @see www.ubx.ch.openAir.Point1#getLongM()
   * @see #getPoint1()
   * @generated
   */
  EReference getPoint1_LongM();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Point1#getLongS <em>Long S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Long S</em>'.
   * @see www.ubx.ch.openAir.Point1#getLongS()
   * @see #getPoint1()
   * @generated
   */
  EReference getPoint1_LongS();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Point1#getLatD <em>Lat D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lat D</em>'.
   * @see www.ubx.ch.openAir.Point1#getLatD()
   * @see #getPoint1()
   * @generated
   */
  EReference getPoint1_LatD();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Point1#getLatM <em>Lat M</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lat M</em>'.
   * @see www.ubx.ch.openAir.Point1#getLatM()
   * @see #getPoint1()
   * @generated
   */
  EReference getPoint1_LatM();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Point1#getLatS <em>Lat S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lat S</em>'.
   * @see www.ubx.ch.openAir.Point1#getLatS()
   * @see #getPoint1()
   * @generated
   */
  EReference getPoint1_LatS();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.Point2 <em>Point2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point2</em>'.
   * @see www.ubx.ch.openAir.Point2
   * @generated
   */
  EClass getPoint2();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Point2#getLongD <em>Long D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Long D</em>'.
   * @see www.ubx.ch.openAir.Point2#getLongD()
   * @see #getPoint2()
   * @generated
   */
  EReference getPoint2_LongD();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Point2#getLongMf <em>Long Mf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Long Mf</em>'.
   * @see www.ubx.ch.openAir.Point2#getLongMf()
   * @see #getPoint2()
   * @generated
   */
  EReference getPoint2_LongMf();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Point2#getLatD <em>Lat D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lat D</em>'.
   * @see www.ubx.ch.openAir.Point2#getLatD()
   * @see #getPoint2()
   * @generated
   */
  EReference getPoint2_LatD();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Point2#getLatMf <em>Lat Mf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lat Mf</em>'.
   * @see www.ubx.ch.openAir.Point2#getLatMf()
   * @see #getPoint2()
   * @generated
   */
  EReference getPoint2_LatMf();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.Point3 <em>Point3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point3</em>'.
   * @see www.ubx.ch.openAir.Point3
   * @generated
   */
  EClass getPoint3();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Point3#getLongD <em>Long D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Long D</em>'.
   * @see www.ubx.ch.openAir.Point3#getLongD()
   * @see #getPoint3()
   * @generated
   */
  EReference getPoint3_LongD();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Point3#getLongM <em>Long M</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Long M</em>'.
   * @see www.ubx.ch.openAir.Point3#getLongM()
   * @see #getPoint3()
   * @generated
   */
  EReference getPoint3_LongM();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Point3#getLongS <em>Long S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Long S</em>'.
   * @see www.ubx.ch.openAir.Point3#getLongS()
   * @see #getPoint3()
   * @generated
   */
  EReference getPoint3_LongS();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Point3#getLatD <em>Lat D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lat D</em>'.
   * @see www.ubx.ch.openAir.Point3#getLatD()
   * @see #getPoint3()
   * @generated
   */
  EReference getPoint3_LatD();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Point3#getLatM <em>Lat M</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lat M</em>'.
   * @see www.ubx.ch.openAir.Point3#getLatM()
   * @see #getPoint3()
   * @generated
   */
  EReference getPoint3_LatM();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Point3#getLatS <em>Lat S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lat S</em>'.
   * @see www.ubx.ch.openAir.Point3#getLatS()
   * @see #getPoint3()
   * @generated
   */
  EReference getPoint3_LatS();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.Point4 <em>Point4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point4</em>'.
   * @see www.ubx.ch.openAir.Point4
   * @generated
   */
  EClass getPoint4();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Point4#getLongD <em>Long D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Long D</em>'.
   * @see www.ubx.ch.openAir.Point4#getLongD()
   * @see #getPoint4()
   * @generated
   */
  EReference getPoint4_LongD();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.Point4#getLatD <em>Lat D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lat D</em>'.
   * @see www.ubx.ch.openAir.Point4#getLatD()
   * @see #getPoint4()
   * @generated
   */
  EReference getPoint4_LatD();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.LongDegr <em>Long Degr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Long Degr</em>'.
   * @see www.ubx.ch.openAir.LongDegr
   * @generated
   */
  EClass getLongDegr();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.LongDegr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see www.ubx.ch.openAir.LongDegr#getValue()
   * @see #getLongDegr()
   * @generated
   */
  EAttribute getLongDegr_Value();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.LatDegr <em>Lat Degr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lat Degr</em>'.
   * @see www.ubx.ch.openAir.LatDegr
   * @generated
   */
  EClass getLatDegr();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.LatDegr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see www.ubx.ch.openAir.LatDegr#getValue()
   * @see #getLatDegr()
   * @generated
   */
  EAttribute getLatDegr_Value();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.MinSec <em>Min Sec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Min Sec</em>'.
   * @see www.ubx.ch.openAir.MinSec
   * @generated
   */
  EClass getMinSec();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.MinSec#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see www.ubx.ch.openAir.MinSec#getValue()
   * @see #getMinSec()
   * @generated
   */
  EAttribute getMinSec_Value();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.SecDec <em>Sec Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sec Dec</em>'.
   * @see www.ubx.ch.openAir.SecDec
   * @generated
   */
  EClass getSecDec();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.SecDec#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see www.ubx.ch.openAir.SecDec#getValue()
   * @see #getSecDec()
   * @generated
   */
  EAttribute getSecDec_Value();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.MinDec <em>Min Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Min Dec</em>'.
   * @see www.ubx.ch.openAir.MinDec
   * @generated
   */
  EClass getMinDec();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.MinDec#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see www.ubx.ch.openAir.MinDec#getValue()
   * @see #getMinDec()
   * @generated
   */
  EAttribute getMinDec_Value();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.LongDec <em>Long Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Long Dec</em>'.
   * @see www.ubx.ch.openAir.LongDec
   * @generated
   */
  EClass getLongDec();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.LongDec#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see www.ubx.ch.openAir.LongDec#getValue()
   * @see #getLongDec()
   * @generated
   */
  EAttribute getLongDec_Value();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.LatDec <em>Lat Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lat Dec</em>'.
   * @see www.ubx.ch.openAir.LatDec
   * @generated
   */
  EClass getLatDec();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.LatDec#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see www.ubx.ch.openAir.LatDec#getValue()
   * @see #getLatDec()
   * @generated
   */
  EAttribute getLatDec_Value();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.DA <em>DA</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DA</em>'.
   * @see www.ubx.ch.openAir.DA
   * @generated
   */
  EClass getDA();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.DA#getDa <em>Da</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Da</em>'.
   * @see www.ubx.ch.openAir.DA#getDa()
   * @see #getDA()
   * @generated
   */
  EReference getDA_Da();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.DaParams <em>Da Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Da Params</em>'.
   * @see www.ubx.ch.openAir.DaParams
   * @generated
   */
  EClass getDaParams();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.DaParams#getAngleStart <em>Angle Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Angle Start</em>'.
   * @see www.ubx.ch.openAir.DaParams#getAngleStart()
   * @see #getDaParams()
   * @generated
   */
  EAttribute getDaParams_AngleStart();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.DaParams#getAngleEnd <em>Angle End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Angle End</em>'.
   * @see www.ubx.ch.openAir.DaParams#getAngleEnd()
   * @see #getDaParams()
   * @generated
   */
  EAttribute getDaParams_AngleEnd();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.DaParams1 <em>Da Params1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Da Params1</em>'.
   * @see www.ubx.ch.openAir.DaParams1
   * @generated
   */
  EClass getDaParams1();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.DaParams1#getRadius <em>Radius</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Radius</em>'.
   * @see www.ubx.ch.openAir.DaParams1#getRadius()
   * @see #getDaParams1()
   * @generated
   */
  EAttribute getDaParams1_Radius();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.DaParams2 <em>Da Params2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Da Params2</em>'.
   * @see www.ubx.ch.openAir.DaParams2
   * @generated
   */
  EClass getDaParams2();

  /**
   * Returns the meta object for the attribute '{@link www.ubx.ch.openAir.DaParams2#getRadius <em>Radius</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Radius</em>'.
   * @see www.ubx.ch.openAir.DaParams2#getRadius()
   * @see #getDaParams2()
   * @generated
   */
  EAttribute getDaParams2_Radius();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.DB <em>DB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DB</em>'.
   * @see www.ubx.ch.openAir.DB
   * @generated
   */
  EClass getDB();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.DB#getDp0 <em>Dp0</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dp0</em>'.
   * @see www.ubx.ch.openAir.DB#getDp0()
   * @see #getDB()
   * @generated
   */
  EReference getDB_Dp0();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.DB#getDp1 <em>Dp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dp1</em>'.
   * @see www.ubx.ch.openAir.DB#getDp1()
   * @see #getDB()
   * @generated
   */
  EReference getDB_Dp1();

  /**
   * Returns the meta object for class '{@link www.ubx.ch.openAir.AT <em>AT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>AT</em>'.
   * @see www.ubx.ch.openAir.AT
   * @generated
   */
  EClass getAT();

  /**
   * Returns the meta object for the containment reference '{@link www.ubx.ch.openAir.AT#getLp <em>Lp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lp</em>'.
   * @see www.ubx.ch.openAir.AT#getLp()
   * @see #getAT()
   * @generated
   */
  EReference getAT_Lp();

  /**
   * Returns the meta object for enum '{@link www.ubx.ch.openAir.ClassType <em>Class Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Class Type</em>'.
   * @see www.ubx.ch.openAir.ClassType
   * @generated
   */
  EEnum getClassType();

  /**
   * Returns the meta object for enum '{@link www.ubx.ch.openAir.Units <em>Units</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Units</em>'.
   * @see www.ubx.ch.openAir.Units
   * @generated
   */
  EEnum getUnits();

  /**
   * Returns the meta object for enum '{@link www.ubx.ch.openAir.WE <em>WE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>WE</em>'.
   * @see www.ubx.ch.openAir.WE
   * @generated
   */
  EEnum getWE();

  /**
   * Returns the meta object for enum '{@link www.ubx.ch.openAir.NS <em>NS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>NS</em>'.
   * @see www.ubx.ch.openAir.NS
   * @generated
   */
  EEnum getNS();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OpenAirFactory getOpenAirFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.OpenAirImpl <em>Open Air</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.OpenAirImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getOpenAir()
     * @generated
     */
    EClass OPEN_AIR = eINSTANCE.getOpenAir();

    /**
     * The meta object literal for the '<em><b>Airspaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPEN_AIR__AIRSPACES = eINSTANCE.getOpenAir_Airspaces();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.AirspaceImpl <em>Airspace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.AirspaceImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getAirspace()
     * @generated
     */
    EClass AIRSPACE = eINSTANCE.getAirspace();

    /**
     * The meta object literal for the '<em><b>Thedef</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AIRSPACE__THEDEF = eINSTANCE.getAirspace_Thedef();

    /**
     * The meta object literal for the '<em><b>Thegeom</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AIRSPACE__THEGEOM = eINSTANCE.getAirspace_Thegeom();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.TheDefImpl <em>The Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.TheDefImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getTheDef()
     * @generated
     */
    EClass THE_DEF = eINSTANCE.getTheDef();

    /**
     * The meta object literal for the '<em><b>Asclass</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THE_DEF__ASCLASS = eINSTANCE.getTheDef_Asclass();

    /**
     * The meta object literal for the '<em><b>Sp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THE_DEF__SP = eINSTANCE.getTheDef_Sp();

    /**
     * The meta object literal for the '<em><b>Sb</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THE_DEF__SB = eINSTANCE.getTheDef_Sb();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THE_DEF__NAME = eINSTANCE.getTheDef_Name();

    /**
     * The meta object literal for the '<em><b>At</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THE_DEF__AT = eINSTANCE.getTheDef_At();

    /**
     * The meta object literal for the '<em><b>Limit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THE_DEF__LIMIT = eINSTANCE.getTheDef_Limit();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.AsClassImpl <em>As Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.AsClassImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getAsClass()
     * @generated
     */
    EClass AS_CLASS = eINSTANCE.getAsClass();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AS_CLASS__NAME = eINSTANCE.getAsClass_Name();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.SPImpl <em>SP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.SPImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getSP()
     * @generated
     */
    EClass SP = eINSTANCE.getSP();

    /**
     * The meta object literal for the '<em><b>Sp0</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP__SP0 = eINSTANCE.getSP_Sp0();

    /**
     * The meta object literal for the '<em><b>Sp1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP__SP1 = eINSTANCE.getSP_Sp1();

    /**
     * The meta object literal for the '<em><b>Sp2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP__SP2 = eINSTANCE.getSP_Sp2();

    /**
     * The meta object literal for the '<em><b>Sp3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP__SP3 = eINSTANCE.getSP_Sp3();

    /**
     * The meta object literal for the '<em><b>Sp4</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP__SP4 = eINSTANCE.getSP_Sp4();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.SBImpl <em>SB</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.SBImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getSB()
     * @generated
     */
    EClass SB = eINSTANCE.getSB();

    /**
     * The meta object literal for the '<em><b>Sb Val1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SB__SB_VAL1 = eINSTANCE.getSB_SbVal1();

    /**
     * The meta object literal for the '<em><b>Sb Val2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SB__SB_VAL2 = eINSTANCE.getSB_SbVal2();

    /**
     * The meta object literal for the '<em><b>Sb Val3</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SB__SB_VAL3 = eINSTANCE.getSB_SbVal3();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.AsNameImpl <em>As Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.AsNameImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getAsName()
     * @generated
     */
    EClass AS_NAME = eINSTANCE.getAsName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AS_NAME__NAME = eINSTANCE.getAsName_Name();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.LimitesImpl <em>Limites</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.LimitesImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getLimites()
     * @generated
     */
    EClass LIMITES = eINSTANCE.getLimites();

    /**
     * The meta object literal for the '<em><b>Low Limit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIMITES__LOW_LIMIT = eINSTANCE.getLimites_LowLimit();

    /**
     * The meta object literal for the '<em><b>High Limit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIMITES__HIGH_LIMIT = eINSTANCE.getLimites_HighLimit();

    /**
     * The meta object literal for the '<em><b>Heigh Limit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIMITES__HEIGH_LIMIT = eINSTANCE.getLimites_HeighLimit();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.TheGeomImpl <em>The Geom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.TheGeomImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getTheGeom()
     * @generated
     */
    EClass THE_GEOM = eINSTANCE.getTheGeom();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.LowLimitImpl <em>Low Limit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.LowLimitImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getLowLimit()
     * @generated
     */
    EClass LOW_LIMIT = eINSTANCE.getLowLimit();

    /**
     * The meta object literal for the '<em><b>Ll</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOW_LIMIT__LL = eINSTANCE.getLowLimit_Ll();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.HighLimitImpl <em>High Limit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.HighLimitImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getHighLimit()
     * @generated
     */
    EClass HIGH_LIMIT = eINSTANCE.getHighLimit();

    /**
     * The meta object literal for the '<em><b>Hl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HIGH_LIMIT__HL = eINSTANCE.getHighLimit_Hl();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.LimitImpl <em>Limit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.LimitImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getLimit()
     * @generated
     */
    EClass LIMIT = eINSTANCE.getLimit();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.FLImpl <em>FL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.FLImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getFL()
     * @generated
     */
    EClass FL = eINSTANCE.getFL();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FL__VALUE = eINSTANCE.getFL_Value();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.SFCImpl <em>SFC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.SFCImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getSFC()
     * @generated
     */
    EClass SFC = eINSTANCE.getSFC();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.GNDImpl <em>GND</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.GNDImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getGND()
     * @generated
     */
    EClass GND = eINSTANCE.getGND();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.UNLImpl <em>UNL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.UNLImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getUNL()
     * @generated
     */
    EClass UNL = eINSTANCE.getUNL();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.VALImpl <em>VAL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.VALImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getVAL()
     * @generated
     */
    EClass VAL = eINSTANCE.getVAL();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAL__VALUE = eINSTANCE.getVAL_Value();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAL__UNIT = eINSTANCE.getVAL_Unit();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.VImpl <em>V</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.VImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getV()
     * @generated
     */
    EClass V = eINSTANCE.getV();

    /**
     * The meta object literal for the '<em><b>Vsub</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference V__VSUB = eINSTANCE.getV_Vsub();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.VsubImpl <em>Vsub</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.VsubImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getVsub()
     * @generated
     */
    EClass VSUB = eINSTANCE.getVsub();

    /**
     * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VSUB__X = eINSTANCE.getVsub_X();

    /**
     * The meta object literal for the '<em><b>D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VSUB__D = eINSTANCE.getVsub_D();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.DirImpl <em>Dir</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.DirImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getDir()
     * @generated
     */
    EClass DIR = eINSTANCE.getDir();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.PlusImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.MinusImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.DCImpl <em>DC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.DCImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getDC()
     * @generated
     */
    EClass DC = eINSTANCE.getDC();

    /**
     * The meta object literal for the '<em><b>Radius</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC__RADIUS = eINSTANCE.getDC_Radius();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.RadiusImpl <em>Radius</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.RadiusImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getRadius()
     * @generated
     */
    EClass RADIUS = eINSTANCE.getRadius();

    /**
     * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RADIUS__INT_VALUE = eINSTANCE.getRadius_IntValue();

    /**
     * The meta object literal for the '<em><b>Reak Valuer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RADIUS__REAK_VALUER = eINSTANCE.getRadius_ReakValuer();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.DPImpl <em>DP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.DPImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getDP()
     * @generated
     */
    EClass DP = eINSTANCE.getDP();

    /**
     * The meta object literal for the '<em><b>Dp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DP__DP = eINSTANCE.getDP_Dp();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.PointImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getPoint()
     * @generated
     */
    EClass POINT = eINSTANCE.getPoint();

    /**
     * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__NS = eINSTANCE.getPoint_Ns();

    /**
     * The meta object literal for the '<em><b>We</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__WE = eINSTANCE.getPoint_We();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.Point1Impl <em>Point1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.Point1Impl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getPoint1()
     * @generated
     */
    EClass POINT1 = eINSTANCE.getPoint1();

    /**
     * The meta object literal for the '<em><b>Long D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT1__LONG_D = eINSTANCE.getPoint1_LongD();

    /**
     * The meta object literal for the '<em><b>Long M</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT1__LONG_M = eINSTANCE.getPoint1_LongM();

    /**
     * The meta object literal for the '<em><b>Long S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT1__LONG_S = eINSTANCE.getPoint1_LongS();

    /**
     * The meta object literal for the '<em><b>Lat D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT1__LAT_D = eINSTANCE.getPoint1_LatD();

    /**
     * The meta object literal for the '<em><b>Lat M</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT1__LAT_M = eINSTANCE.getPoint1_LatM();

    /**
     * The meta object literal for the '<em><b>Lat S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT1__LAT_S = eINSTANCE.getPoint1_LatS();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.Point2Impl <em>Point2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.Point2Impl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getPoint2()
     * @generated
     */
    EClass POINT2 = eINSTANCE.getPoint2();

    /**
     * The meta object literal for the '<em><b>Long D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT2__LONG_D = eINSTANCE.getPoint2_LongD();

    /**
     * The meta object literal for the '<em><b>Long Mf</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT2__LONG_MF = eINSTANCE.getPoint2_LongMf();

    /**
     * The meta object literal for the '<em><b>Lat D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT2__LAT_D = eINSTANCE.getPoint2_LatD();

    /**
     * The meta object literal for the '<em><b>Lat Mf</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT2__LAT_MF = eINSTANCE.getPoint2_LatMf();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.Point3Impl <em>Point3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.Point3Impl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getPoint3()
     * @generated
     */
    EClass POINT3 = eINSTANCE.getPoint3();

    /**
     * The meta object literal for the '<em><b>Long D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT3__LONG_D = eINSTANCE.getPoint3_LongD();

    /**
     * The meta object literal for the '<em><b>Long M</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT3__LONG_M = eINSTANCE.getPoint3_LongM();

    /**
     * The meta object literal for the '<em><b>Long S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT3__LONG_S = eINSTANCE.getPoint3_LongS();

    /**
     * The meta object literal for the '<em><b>Lat D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT3__LAT_D = eINSTANCE.getPoint3_LatD();

    /**
     * The meta object literal for the '<em><b>Lat M</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT3__LAT_M = eINSTANCE.getPoint3_LatM();

    /**
     * The meta object literal for the '<em><b>Lat S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT3__LAT_S = eINSTANCE.getPoint3_LatS();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.Point4Impl <em>Point4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.Point4Impl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getPoint4()
     * @generated
     */
    EClass POINT4 = eINSTANCE.getPoint4();

    /**
     * The meta object literal for the '<em><b>Long D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT4__LONG_D = eINSTANCE.getPoint4_LongD();

    /**
     * The meta object literal for the '<em><b>Lat D</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT4__LAT_D = eINSTANCE.getPoint4_LatD();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.LongDegrImpl <em>Long Degr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.LongDegrImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getLongDegr()
     * @generated
     */
    EClass LONG_DEGR = eINSTANCE.getLongDegr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LONG_DEGR__VALUE = eINSTANCE.getLongDegr_Value();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.LatDegrImpl <em>Lat Degr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.LatDegrImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getLatDegr()
     * @generated
     */
    EClass LAT_DEGR = eINSTANCE.getLatDegr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAT_DEGR__VALUE = eINSTANCE.getLatDegr_Value();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.MinSecImpl <em>Min Sec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.MinSecImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getMinSec()
     * @generated
     */
    EClass MIN_SEC = eINSTANCE.getMinSec();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MIN_SEC__VALUE = eINSTANCE.getMinSec_Value();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.SecDecImpl <em>Sec Dec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.SecDecImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getSecDec()
     * @generated
     */
    EClass SEC_DEC = eINSTANCE.getSecDec();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEC_DEC__VALUE = eINSTANCE.getSecDec_Value();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.MinDecImpl <em>Min Dec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.MinDecImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getMinDec()
     * @generated
     */
    EClass MIN_DEC = eINSTANCE.getMinDec();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MIN_DEC__VALUE = eINSTANCE.getMinDec_Value();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.LongDecImpl <em>Long Dec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.LongDecImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getLongDec()
     * @generated
     */
    EClass LONG_DEC = eINSTANCE.getLongDec();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LONG_DEC__VALUE = eINSTANCE.getLongDec_Value();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.LatDecImpl <em>Lat Dec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.LatDecImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getLatDec()
     * @generated
     */
    EClass LAT_DEC = eINSTANCE.getLatDec();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAT_DEC__VALUE = eINSTANCE.getLatDec_Value();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.DAImpl <em>DA</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.DAImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getDA()
     * @generated
     */
    EClass DA = eINSTANCE.getDA();

    /**
     * The meta object literal for the '<em><b>Da</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DA__DA = eINSTANCE.getDA_Da();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.DaParamsImpl <em>Da Params</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.DaParamsImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getDaParams()
     * @generated
     */
    EClass DA_PARAMS = eINSTANCE.getDaParams();

    /**
     * The meta object literal for the '<em><b>Angle Start</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DA_PARAMS__ANGLE_START = eINSTANCE.getDaParams_AngleStart();

    /**
     * The meta object literal for the '<em><b>Angle End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DA_PARAMS__ANGLE_END = eINSTANCE.getDaParams_AngleEnd();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.DaParams1Impl <em>Da Params1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.DaParams1Impl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getDaParams1()
     * @generated
     */
    EClass DA_PARAMS1 = eINSTANCE.getDaParams1();

    /**
     * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DA_PARAMS1__RADIUS = eINSTANCE.getDaParams1_Radius();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.DaParams2Impl <em>Da Params2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.DaParams2Impl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getDaParams2()
     * @generated
     */
    EClass DA_PARAMS2 = eINSTANCE.getDaParams2();

    /**
     * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DA_PARAMS2__RADIUS = eINSTANCE.getDaParams2_Radius();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.DBImpl <em>DB</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.DBImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getDB()
     * @generated
     */
    EClass DB = eINSTANCE.getDB();

    /**
     * The meta object literal for the '<em><b>Dp0</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DB__DP0 = eINSTANCE.getDB_Dp0();

    /**
     * The meta object literal for the '<em><b>Dp1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DB__DP1 = eINSTANCE.getDB_Dp1();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.impl.ATImpl <em>AT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.impl.ATImpl
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getAT()
     * @generated
     */
    EClass AT = eINSTANCE.getAT();

    /**
     * The meta object literal for the '<em><b>Lp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AT__LP = eINSTANCE.getAT_Lp();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.ClassType <em>Class Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.ClassType
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getClassType()
     * @generated
     */
    EEnum CLASS_TYPE = eINSTANCE.getClassType();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.Units <em>Units</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.Units
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getUnits()
     * @generated
     */
    EEnum UNITS = eINSTANCE.getUnits();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.WE <em>WE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.WE
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getWE()
     * @generated
     */
    EEnum WE = eINSTANCE.getWE();

    /**
     * The meta object literal for the '{@link www.ubx.ch.openAir.NS <em>NS</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see www.ubx.ch.openAir.NS
     * @see www.ubx.ch.openAir.impl.OpenAirPackageImpl#getNS()
     * @generated
     */
    EEnum NS = eINSTANCE.getNS();

  }

} //OpenAirPackage
