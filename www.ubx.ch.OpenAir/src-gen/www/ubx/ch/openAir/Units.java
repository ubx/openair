/**
 * <copyright>
 * </copyright>
 *
 */
package www.ubx.ch.openAir;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Units</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see www.ubx.ch.openAir.OpenAirPackage#getUnits()
 * @model
 * @generated
 */
public enum Units implements Enumerator
{
  /**
   * The '<em><b>Feed</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FEED_VALUE
   * @generated
   * @ordered
   */
  FEED(0, "feed", "ft"),

  /**
   * The '<em><b>Meter</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #METER_VALUE
   * @generated
   * @ordered
   */
  METER(1, "meter", "m"),

  /**
   * The '<em><b>Msl</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MSL_VALUE
   * @generated
   * @ordered
   */
  MSL(2, "msl", "MSL"),

  /**
   * The '<em><b>Mmsl</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MMSL_VALUE
   * @generated
   * @ordered
   */
  MMSL(3, "m_msl", "m MSL"),

  /**
   * The '<em><b>Ft msl</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FT_MSL_VALUE
   * @generated
   * @ordered
   */
  FT_MSL(4, "ft_msl", "ft MSL"),

  /**
   * The '<em><b>Agl</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AGL_VALUE
   * @generated
   * @ordered
   */
  AGL(5, "agl", "AGL"),

  /**
   * The '<em><b>Magl</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAGL_VALUE
   * @generated
   * @ordered
   */
  MAGL(6, "m_agl", "m AGL"),

  /**
   * The '<em><b>Ft AGL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FT_AGL_VALUE
   * @generated
   * @ordered
   */
  FT_AGL(7, "ft_AGL", "ft AGL"),

  /**
   * The '<em><b>AMSL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AMSL_VALUE
   * @generated
   * @ordered
   */
  AMSL(8, "AMSL", "AMSL"),

  /**
   * The '<em><b>MAMSL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAMSL_VALUE
   * @generated
   * @ordered
   */
  MAMSL(9, "m_AMSL", "m AMSL");

  /**
   * The '<em><b>Feed</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Feed</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FEED
   * @model name="feed" literal="ft"
   * @generated
   * @ordered
   */
  public static final int FEED_VALUE = 0;

  /**
   * The '<em><b>Meter</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Meter</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #METER
   * @model name="meter" literal="m"
   * @generated
   * @ordered
   */
  public static final int METER_VALUE = 1;

  /**
   * The '<em><b>Msl</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Msl</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MSL
   * @model name="msl" literal="MSL"
   * @generated
   * @ordered
   */
  public static final int MSL_VALUE = 2;

  /**
   * The '<em><b>Mmsl</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Mmsl</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MMSL
   * @model name="m_msl" literal="m MSL"
   * @generated
   * @ordered
   */
  public static final int MMSL_VALUE = 3;

  /**
   * The '<em><b>Ft msl</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ft msl</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FT_MSL
   * @model name="ft_msl" literal="ft MSL"
   * @generated
   * @ordered
   */
  public static final int FT_MSL_VALUE = 4;

  /**
   * The '<em><b>Agl</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Agl</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AGL
   * @model name="agl" literal="AGL"
   * @generated
   * @ordered
   */
  public static final int AGL_VALUE = 5;

  /**
   * The '<em><b>Magl</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Magl</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAGL
   * @model name="m_agl" literal="m AGL"
   * @generated
   * @ordered
   */
  public static final int MAGL_VALUE = 6;

  /**
   * The '<em><b>Ft AGL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ft AGL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FT_AGL
   * @model name="ft_AGL" literal="ft AGL"
   * @generated
   * @ordered
   */
  public static final int FT_AGL_VALUE = 7;

  /**
   * The '<em><b>AMSL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AMSL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AMSL
   * @model
   * @generated
   * @ordered
   */
  public static final int AMSL_VALUE = 8;

  /**
   * The '<em><b>MAMSL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MAMSL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAMSL
   * @model name="m_AMSL" literal="m AMSL"
   * @generated
   * @ordered
   */
  public static final int MAMSL_VALUE = 9;

  /**
   * An array of all the '<em><b>Units</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Units[] VALUES_ARRAY =
    new Units[]
    {
      FEED,
      METER,
      MSL,
      MMSL,
      FT_MSL,
      AGL,
      MAGL,
      FT_AGL,
      AMSL,
      MAMSL,
    };

  /**
   * A public read-only list of all the '<em><b>Units</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Units> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Units</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Units get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Units result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Units</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Units getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Units result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Units</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Units get(int value)
  {
    switch (value)
    {
      case FEED_VALUE: return FEED;
      case METER_VALUE: return METER;
      case MSL_VALUE: return MSL;
      case MMSL_VALUE: return MMSL;
      case FT_MSL_VALUE: return FT_MSL;
      case AGL_VALUE: return AGL;
      case MAGL_VALUE: return MAGL;
      case FT_AGL_VALUE: return FT_AGL;
      case AMSL_VALUE: return AMSL;
      case MAMSL_VALUE: return MAMSL;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Units(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Units
