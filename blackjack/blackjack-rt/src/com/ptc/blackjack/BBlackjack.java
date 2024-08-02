package com.ptc.blackjack;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraTopic;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.*;

@NiagaraType
@NiagaraProperty(
        name = "state",
        type = "baja:String",
        defaultValue = "BString.make(\"\")",
        flags = Flags.READONLY | Flags.TRANSIENT | Flags.SUMMARY
)

@NiagaraProperty(
        name = "yourTotal",
        type = "baja:Integer",
        defaultValue = "BInteger.make(0)",
        flags = Flags.READONLY | Flags.TRANSIENT | Flags.SUMMARY
)

@NiagaraProperty(
        name = "dealerTotal",
        type = "baja:Integer",
        defaultValue = "BInteger.make(0)",
        flags = Flags.READONLY | Flags.TRANSIENT | Flags.SUMMARY
)
//
//@NiagaraAction(
//        name = "newGame",
//        flags = Flags.SUMMARY
//)
//
//@NiagaraAction(
//        name = "hit",
//        flags = Flags.SUMMARY
//)
//
//@NiagaraAction(
//        name = "stand",
//        flags = Flags.SUMMARY
//)
//
//@NiagaraTopic(
//        name = "youWin",
//        flags = Flags.SUMMARY
//)
//
//@NiagaraTopic(
//        name = "youLose",
//        flags = Flags.SUMMARY
//)
//
//@NiagaraTopic(
//        name = "push",
//        flags = Flags.SUMMARY
//)

public class BBlackjack
    extends BComponent {
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.blackjack.BBlackjack(3956431034)1.0$ @*/
/* Generated Mon Jul 01 13:49:38 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Property "state"

  /**
   * Slot for the {@code state} property.
   * @see #getState
   * @see #setState
   */
  public static final Property state = newProperty(Flags.READONLY | Flags.TRANSIENT | Flags.SUMMARY, BString.make(""), null);

  /**
   * Get the {@code state} property.
   * @see #state
   */
  public String getState() { return getString(state); }

  /**
   * Set the {@code state} property.
   * @see #state
   */
  public void setState(String v) { setString(state, v, null); }

  //endregion Property "state"

  //region Property "yourTotal"

  /**
   * Slot for the {@code yourTotal} property.
   * @see #getYourTotal
   * @see #setYourTotal
   */
  public static final Property yourTotal = newProperty(Flags.READONLY | Flags.TRANSIENT | Flags.SUMMARY, BInteger.make(0).as(BInteger.class).getInt(), null);

  /**
   * Get the {@code yourTotal} property.
   * @see #yourTotal
   */
  public int getYourTotal() { return getInt(yourTotal); }

  /**
   * Set the {@code yourTotal} property.
   * @see #yourTotal
   */
  public void setYourTotal(int v) { setInt(yourTotal, v, null); }

  //endregion Property "yourTotal"

  //region Property "dealerTotal"

  /**
   * Slot for the {@code dealerTotal} property.
   * @see #getDealerTotal
   * @see #setDealerTotal
   */
  public static final Property dealerTotal = newProperty(Flags.READONLY | Flags.TRANSIENT | Flags.SUMMARY, BInteger.make(0).as(BInteger.class).getInt(), null);

  /**
   * Get the {@code dealerTotal} property.
   * @see #dealerTotal
   */
  public int getDealerTotal() { return getInt(dealerTotal); }

  /**
   * Set the {@code dealerTotal} property.
   * @see #dealerTotal
   */
  public void setDealerTotal(int v) { setInt(dealerTotal, v, null); }

  //endregion Property "dealerTotal"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BBlackjack.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}
