package com.ptc.studyGuideModule;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Type;
import javax.baja.sys.Property;
import javax.baja.sys.Flags;
import javax.baja.sys.BComponent;
import javax.baja.sys.Sys;
import javax.baja.sys.BDouble;
import javax.baja.sys.Action;

@NiagaraType
@NiagaraProperty(
        name = "x",
        type = "baja:Double",
        defaultValue = "BDouble.make(5)",
        flags = Flags.SUMMARY
)

@NiagaraProperty(
        name = "m",
        type = "baja:Double",
        defaultValue = "BDouble.make(5)",
        flags = Flags.SUMMARY
)

@NiagaraProperty(
        name = "b",
        type = "baja:Double",
        defaultValue = "BDouble.make(5)",
        flags = Flags.SUMMARY
)

@NiagaraProperty(
        name = "Out",
        type = "baja:Double",
        defaultValue = "BDouble.make(5)",
        flags = Flags.SUMMARY
)

@NiagaraAction(
        name = "calculate",
        flags = Flags.SUMMARY
)

public class BFirstComponent
    extends BComponent {
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.studyGuideModule.BFirstComponent(1930483573)1.0$ @*/
/* Generated Fri Jun 28 11:24:07 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Property "x"

  /**
   * Slot for the {@code x} property.
   * @see #getX
   * @see #setX
   */
  public static final Property x = newProperty(Flags.SUMMARY, BDouble.make(5).as(BDouble.class).getDouble(), null);

  /**
   * Get the {@code x} property.
   * @see #x
   */
  public double getX() { return getDouble(x); }

  /**
   * Set the {@code x} property.
   * @see #x
   */
  public void setX(double v) { setDouble(x, v, null); }

  //endregion Property "x"

  //region Property "m"

  /**
   * Slot for the {@code m} property.
   * @see #getM
   * @see #setM
   */
  public static final Property m = newProperty(Flags.SUMMARY, BDouble.make(5).as(BDouble.class).getDouble(), null);

  /**
   * Get the {@code m} property.
   * @see #m
   */
  public double getM() { return getDouble(m); }

  /**
   * Set the {@code m} property.
   * @see #m
   */
  public void setM(double v) { setDouble(m, v, null); }

  //endregion Property "m"

  //region Property "b"

  /**
   * Slot for the {@code b} property.
   * @see #getB
   * @see #setB
   */
  public static final Property b = newProperty(Flags.SUMMARY, BDouble.make(5).as(BDouble.class).getDouble(), null);

  /**
   * Get the {@code b} property.
   * @see #b
   */
  public double getB() { return getDouble(b); }

  /**
   * Set the {@code b} property.
   * @see #b
   */
  public void setB(double v) { setDouble(b, v, null); }

  //endregion Property "b"

  //region Property "Out"

  /**
   * Slot for the {@code Out} property.
   * @see #getOut
   * @see #setOut
   */
  public static final Property Out = newProperty(Flags.SUMMARY, BDouble.make(5).as(BDouble.class).getDouble(), null);

  /**
   * Get the {@code Out} property.
   * @see #Out
   */
  public double getOut() { return getDouble(Out); }

  /**
   * Set the {@code Out} property.
   * @see #Out
   */
  public void setOut(double v) { setDouble(Out, v, null); }

  //endregion Property "Out"

  //region Action "calculate"

  /**
   * Slot for the {@code calculate} action.
   * @see #calculate()
   */
  public static final Action calculate = newAction(Flags.SUMMARY, null);

  /**
   * Invoke the {@code calculate} action.
   * @see #calculate
   */
  public void calculate() { invoke(calculate, null, null); }

  //endregion Action "calculate"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BFirstComponent.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  /*
    The callback made by the framework when our calculate Action is invoked.
    By using a callback pattern, the action can be invoked on the
    client side (workbench) and executed on the station side
   */

  // require and is called by the framework when action is invoked
  public void doCalculate()
  {
    double m = getM();
    double x = getX();
    double b = getB();

    double slopeIntercept = m * x + b;

    setOut(slopeIntercept);
  }
}
