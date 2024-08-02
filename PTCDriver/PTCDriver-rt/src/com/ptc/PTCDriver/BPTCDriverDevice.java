/*
 * Copyright 2024 PTC. All Rights Reserved.
 */

package com.ptc.PTCDriver;

import javax.baja.driver.util.BPollFrequency;
import javax.baja.nre.annotations.Facet;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.status.BStatus;
import javax.baja.sys.Flags;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

import com.tridium.ndriver.BNDevice;
import com.tridium.ndriver.poll.BINPollable;
import com.tridium.ndriver.util.SfUtil;

import com.ptc.PTCDriver.point.*;

/**
 * BPTCDriverDevice models a single device
 *
 * @author PTC on 25 Jun 2024
 */
@NiagaraType
@NiagaraProperty(
  name = "pollFrequency",
  type = "BPollFrequency",
  defaultValue = "BPollFrequency.normal"
)
// Add facet to include following in auto manager view
@NiagaraProperty(
  name = "status",
  type = "BStatus",
  defaultValue = "BStatus.ok",
  flags = Flags.TRANSIENT | Flags.READONLY | Flags.SUMMARY | Flags.DEFAULT_ON_CLONE,
  facets = @Facet("SfUtil.incl(SfUtil.MGR_EDIT_READONLY)"),
  override = true
)
@NiagaraProperty(
  name = "points",
  type = "BPTCDriverPointDeviceExt",
  defaultValue = "new BPTCDriverPointDeviceExt()"
)
public class BPTCDriverDevice
  extends BNDevice
  implements BINPollable
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.PTCDriver.BPTCDriverDevice(893163025)1.0$ @*/
/* Generated Tue Jun 25 17:22:59 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Property "pollFrequency"

  /**
   * Slot for the {@code pollFrequency} property.
   * @see #getPollFrequency
   * @see #setPollFrequency
   */
  public static final Property pollFrequency = newProperty(0, BPollFrequency.normal, null);

  /**
   * Get the {@code pollFrequency} property.
   * @see #pollFrequency
   */
  public BPollFrequency getPollFrequency() { return (BPollFrequency)get(pollFrequency); }

  /**
   * Set the {@code pollFrequency} property.
   * @see #pollFrequency
   */
  public void setPollFrequency(BPollFrequency v) { set(pollFrequency, v, null); }

  //endregion Property "pollFrequency"

  //region Property "status"

  /**
   * Slot for the {@code status} property.
   *  Add facet to include following in auto manager view
   * @see #getStatus
   * @see #setStatus
   */
  public static final Property status = newProperty(Flags.TRANSIENT | Flags.READONLY | Flags.SUMMARY | Flags.DEFAULT_ON_CLONE, BStatus.ok, SfUtil.incl(SfUtil.MGR_EDIT_READONLY));

  //endregion Property "status"

  //region Property "points"

  /**
   * Slot for the {@code points} property.
   * @see #getPoints
   * @see #setPoints
   */
  public static final Property points = newProperty(0, new BPTCDriverPointDeviceExt(), null);

  /**
   * Get the {@code points} property.
   * @see #points
   */
  public BPTCDriverPointDeviceExt getPoints() { return (BPTCDriverPointDeviceExt)get(points); }

  /**
   * Set the {@code points} property.
   * @see #points
   */
  public void setPoints(BPTCDriverPointDeviceExt v) { set(points, v, null); }

  //endregion Property "points"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPTCDriverDevice.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
////////////////////////////////////////////////////////////////
// Overrides
////////////////////////////////////////////////////////////////

  /**
   * Returns the network type that the device runs on.
   *
   * @return Type object representing the network
   */
  @Override
  public Type getNetworkType()
  {
    return BPTCDriverNetwork.TYPE;
  }

  /**
   * Override started
   */
  @Override
  public void started()
    throws Exception
  {
    super.started();

    // register device with poll scheduler
    getPTCDriverNetwork().getPollScheduler().subscribe(this);
  }

  /**
   * Override stopped
   */
  @Override
  public void stopped()
    throws Exception
  {
    // unregister device with poll scheduler
    getPTCDriverNetwork().getPollScheduler().unsubscribe(this);
    super.stopped();
  }


////////////////////////////////////////////////////////////////
// Implementation
////////////////////////////////////////////////////////////////

  /**
   *
   */
  public void doPing()
  {
    // TODO - add ping implementation
    // if()
    pingOk();
    // else
    //  pingFail("not receiving response from device ");
  }


////////////////////////////////////////////////////////////////
// Polling support
////////////////////////////////////////////////////////////////

  /**
   * The poll() callback method called from BPollScheduler
   * when it is time to poll this object.
   */
  public void doPoll()
  {
    // TODO add poll support
  }

////////////////////////////////////////////////////////////////
// Utilities
////////////////////////////////////////////////////////////////

  /**
   * Get the network cast to a BPTCDriverNetwork.
   *
   * @return network as a BPTCDriverNetwork.
   */
  public final BPTCDriverNetwork getPTCDriverNetwork()
  {
    return (BPTCDriverNetwork) getNetwork();
  }
}
