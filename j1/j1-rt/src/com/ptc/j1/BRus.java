package com.ptc.j1;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.BComponent;
import javax.baja.sys.BString;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

@NiagaraType
@NiagaraProperty(
        name = "rus",
        type = "baja:String",
        defaultValue = "BString.make(\"bar\")"
)

public class BRus
    extends BComponent {
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.j1.BRus(3519804878)1.0$ @*/
/* Generated Wed Jun 26 14:30:34 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Property "rus"

  /**
   * Slot for the {@code rus} property.
   * @see #getRus
   * @see #setRus
   */
  public static final Property rus = newProperty(0, BString.make("bar"), null);

  /**
   * Get the {@code rus} property.
   * @see #rus
   */
  public String getRus() { return getString(rus); }

  /**
   * Set the {@code rus} property.
   * @see #rus
   */
  public void setRus(String v) { setString(rus, v, null); }

  //endregion Property "rus"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BRus.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
}
