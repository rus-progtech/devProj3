package com.ptc.blackjackAdvisor;

import javax.baja.nre.annotations.*;
import javax.baja.sys.*;

@NiagaraType
@NiagaraProperty(
        name = "scoreInput",
        type = "int",
        defaultValue = "0",
        flags = Flags.SUMMARY | Flags.TRANSIENT
)
@NiagaraProperty(
        name = "recommendation",
        type = "boolean",
        defaultValue = "true",
        facets = {
                @Facet(name = "BFacets.TRUE_TEXT", value="BString.make(\"Hit\")"),
                @Facet(name = "BFacets.FALSE_TEXT", value="BString.make(\"Stand\")")
        },
        flags = Flags.READONLY | Flags.SUMMARY | Flags.TRANSIENT
)
@NiagaraProperty(
        name = "totalWins",
        type = "int",
        defaultValue = "0",
        flags = Flags.READONLY | Flags.SUMMARY | Flags.TRANSIENT
)
@NiagaraProperty(
        name = "totalLosses",
        type = "int",
        defaultValue = "0",
        flags = Flags.READONLY | Flags.SUMMARY | Flags.TRANSIENT
)

@NiagaraAction(
        name = "win",
        flags = Flags.SUMMARY
)
@NiagaraAction(
        name = "loss",
        flags = Flags.SUMMARY
)
@NiagaraTopic(
        name = "recommendHit",
        flags = Flags.SUMMARY
)
@NiagaraTopic(
        name = "recommendStand",
        flags = Flags.SUMMARY
)

public class BBlackjackAdvisor
    extends BComponent {
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.blackjackAdvisor.BBlackjackAdvisor(2167029997)1.0$ @*/
/* Generated Tue Jun 25 09:40:24 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Property "scoreInput"

  /**
   * Slot for the {@code scoreInput} property.
   * @see #getScoreInput
   * @see #setScoreInput
   */
  public static final Property scoreInput = newProperty(Flags.SUMMARY | Flags.TRANSIENT, 0, null);

  /**
   * Get the {@code scoreInput} property.
   * @see #scoreInput
   */
  public int getScoreInput() { return getInt(scoreInput); }

  /**
   * Set the {@code scoreInput} property.
   * @see #scoreInput
   */
  public void setScoreInput(int v) { setInt(scoreInput, v, null); }

  //endregion Property "scoreInput"

  //region Property "recommendation"

  /**
   * Slot for the {@code recommendation} property.
   * @see #getRecommendation
   * @see #setRecommendation
   */
  public static final Property recommendation = newProperty(Flags.READONLY | Flags.SUMMARY | Flags.TRANSIENT, true, BFacets.make(BFacets.make(BFacets.TRUE_TEXT, BString.make("Hit")), BFacets.make(BFacets.FALSE_TEXT, BString.make("Stand"))));

  /**
   * Get the {@code recommendation} property.
   * @see #recommendation
   */
  public boolean getRecommendation() { return getBoolean(recommendation); }

  /**
   * Set the {@code recommendation} property.
   * @see #recommendation
   */
  public void setRecommendation(boolean v) { setBoolean(recommendation, v, null); }

  //endregion Property "recommendation"

  //region Property "totalWins"

  /**
   * Slot for the {@code totalWins} property.
   * @see #getTotalWins
   * @see #setTotalWins
   */
  public static final Property totalWins = newProperty(Flags.READONLY | Flags.SUMMARY | Flags.TRANSIENT, 0, null);

  /**
   * Get the {@code totalWins} property.
   * @see #totalWins
   */
  public int getTotalWins() { return getInt(totalWins); }

  /**
   * Set the {@code totalWins} property.
   * @see #totalWins
   */
  public void setTotalWins(int v) { setInt(totalWins, v, null); }

  //endregion Property "totalWins"

  //region Property "totalLosses"

  /**
   * Slot for the {@code totalLosses} property.
   * @see #getTotalLosses
   * @see #setTotalLosses
   */
  public static final Property totalLosses = newProperty(Flags.READONLY | Flags.SUMMARY | Flags.TRANSIENT, 0, null);

  /**
   * Get the {@code totalLosses} property.
   * @see #totalLosses
   */
  public int getTotalLosses() { return getInt(totalLosses); }

  /**
   * Set the {@code totalLosses} property.
   * @see #totalLosses
   */
  public void setTotalLosses(int v) { setInt(totalLosses, v, null); }

  //endregion Property "totalLosses"

  //region Action "win"

  /**
   * Slot for the {@code win} action.
   * @see #win()
   */
  public static final Action win = newAction(Flags.SUMMARY, null);

  /**
   * Invoke the {@code win} action.
   * @see #win
   */
  public void win() { invoke(win, null, null); }

  //endregion Action "win"

  //region Action "loss"

  /**
   * Slot for the {@code loss} action.
   * @see #loss()
   */
  public static final Action loss = newAction(Flags.SUMMARY, null);

  /**
   * Invoke the {@code loss} action.
   * @see #loss
   */
  public void loss() { invoke(loss, null, null); }

  //endregion Action "loss"

  //region Topic "recommendHit"

  /**
   * Slot for the {@code recommendHit} topic.
   * @see #fireRecommendHit
   */
  public static final Topic recommendHit = newTopic(Flags.SUMMARY, null);

  /**
   * Fire an event for the {@code recommendHit} topic.
   * @see #recommendHit
   */
  public void fireRecommendHit(BValue event) { fire(recommendHit, event, null); }

  //endregion Topic "recommendHit"

  //region Topic "recommendStand"

  /**
   * Slot for the {@code recommendStand} topic.
   * @see #fireRecommendStand
   */
  public static final Topic recommendStand = newTopic(Flags.SUMMARY, null);

  /**
   * Fire an event for the {@code recommendStand} topic.
   * @see #recommendStand
   */
  public void fireRecommendStand(BValue event) { fire(recommendStand, event, null); }

  //endregion Topic "recommendStand"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BBlackjackAdvisor.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    /*
     * Callback when a property is modified on this component
     */
    @Override
    public void changed (Property prop, Context cx)
    {
        if (prop.equals(scoreInput))
        { // When the scoreInput changes, recompute the recommendation
            boolean advice = (getScoreInput() < 16);
            setRecommendation(advice);
            if (advice) // Fire the appropriate recommendation topic
                fireRecommendHit(null);
            else
                fireRecommendStand(null);
        }
    }

    /*
     * Callback when the win action is invoked
     */
    public void doWin()
    {
        int current = getTotalWins() + 1;
        setTotalWins(current); // increment the total wins property
    }

    /*
     * Callback when the loss action is invoked
     */
    public void doLoss()
    {
        int current = getTotalLosses() + 1;
        setTotalLosses(current); // increment the total losses property
    }
}
