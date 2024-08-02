/*
 * Copyright 2024 PTC. All Rights Reserved.
 */

package com.ptc.PTCDriver;

import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Context;
import javax.baja.sys.Flags;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;
import javax.baja.util.Lexicon;

import com.tridium.ndriver.BNNetwork;
import com.tridium.ndriver.comm.*;
import com.tridium.ndriver.comm.http.*;
import com.tridium.ndriver.datatypes.*;
import com.tridium.ndriver.discover.*;
import com.tridium.ndriver.poll.*;

import com.ptc.PTCDriver.comm.PTCDriverListener;
import com.ptc.PTCDriver.comm.BPTCDriverSerialCommConfig;
import com.ptc.PTCDriver.comm.BPTCDriverTcpCommConfig;

/**
 * BPTCDriverNetwork models a network of devices
 *
 * @author PTC on 25 Jun 2024
 */
@NiagaraType
@NiagaraProperty(
  name = "pollScheduler",
  type = "BNPollScheduler",
  defaultValue = "new BNPollScheduler()"
)
@NiagaraProperty(
  name = "httpConfig",
  type = "BHttpCommConfig",
  defaultValue = "new BHttpCommConfig()"
)
@NiagaraProperty(
  name = "tcpConfig",
  type = "BPTCDriverTcpCommConfig",
  defaultValue = "new BPTCDriverTcpCommConfig()"
)
@NiagaraProperty(
  name = "udpConfig",
  type = "BUdpCommConfig",
  defaultValue = "new BUdpCommConfig()"
)
@NiagaraProperty(
  name = "serialConfig",
  type = "BPTCDriverSerialCommConfig",
  defaultValue = "new BPTCDriverSerialCommConfig()"
)
public class BPTCDriverNetwork
  extends BNNetwork
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.PTCDriver.BPTCDriverNetwork(872202871)1.0$ @*/
/* Generated Tue Jun 25 17:22:59 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Property "pollScheduler"

  /**
   * Slot for the {@code pollScheduler} property.
   * @see #getPollScheduler
   * @see #setPollScheduler
   */
  public static final Property pollScheduler = newProperty(0, new BNPollScheduler(), null);

  /**
   * Get the {@code pollScheduler} property.
   * @see #pollScheduler
   */
  public BNPollScheduler getPollScheduler() { return (BNPollScheduler)get(pollScheduler); }

  /**
   * Set the {@code pollScheduler} property.
   * @see #pollScheduler
   */
  public void setPollScheduler(BNPollScheduler v) { set(pollScheduler, v, null); }

  //endregion Property "pollScheduler"

  //region Property "httpConfig"

  /**
   * Slot for the {@code httpConfig} property.
   * @see #getHttpConfig
   * @see #setHttpConfig
   */
  public static final Property httpConfig = newProperty(0, new BHttpCommConfig(), null);

  /**
   * Get the {@code httpConfig} property.
   * @see #httpConfig
   */
  public BHttpCommConfig getHttpConfig() { return (BHttpCommConfig)get(httpConfig); }

  /**
   * Set the {@code httpConfig} property.
   * @see #httpConfig
   */
  public void setHttpConfig(BHttpCommConfig v) { set(httpConfig, v, null); }

  //endregion Property "httpConfig"

  //region Property "tcpConfig"

  /**
   * Slot for the {@code tcpConfig} property.
   * @see #getTcpConfig
   * @see #setTcpConfig
   */
  public static final Property tcpConfig = newProperty(0, new BPTCDriverTcpCommConfig(), null);

  /**
   * Get the {@code tcpConfig} property.
   * @see #tcpConfig
   */
  public BPTCDriverTcpCommConfig getTcpConfig() { return (BPTCDriverTcpCommConfig)get(tcpConfig); }

  /**
   * Set the {@code tcpConfig} property.
   * @see #tcpConfig
   */
  public void setTcpConfig(BPTCDriverTcpCommConfig v) { set(tcpConfig, v, null); }

  //endregion Property "tcpConfig"

  //region Property "udpConfig"

  /**
   * Slot for the {@code udpConfig} property.
   * @see #getUdpConfig
   * @see #setUdpConfig
   */
  public static final Property udpConfig = newProperty(0, new BUdpCommConfig(), null);

  /**
   * Get the {@code udpConfig} property.
   * @see #udpConfig
   */
  public BUdpCommConfig getUdpConfig() { return (BUdpCommConfig)get(udpConfig); }

  /**
   * Set the {@code udpConfig} property.
   * @see #udpConfig
   */
  public void setUdpConfig(BUdpCommConfig v) { set(udpConfig, v, null); }

  //endregion Property "udpConfig"

  //region Property "serialConfig"

  /**
   * Slot for the {@code serialConfig} property.
   * @see #getSerialConfig
   * @see #setSerialConfig
   */
  public static final Property serialConfig = newProperty(0, new BPTCDriverSerialCommConfig(), null);

  /**
   * Get the {@code serialConfig} property.
   * @see #serialConfig
   */
  public BPTCDriverSerialCommConfig getSerialConfig() { return (BPTCDriverSerialCommConfig)get(serialConfig); }

  /**
   * Set the {@code serialConfig} property.
   * @see #serialConfig
   */
  public void setSerialConfig(BPTCDriverSerialCommConfig v) { set(serialConfig, v, null); }

  //endregion Property "serialConfig"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPTCDriverNetwork.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  @Override
  public void started()
    throws Exception
  {
    super.started();
    getHttpConfig().setDefaultListener(new PTCDriverListener(getHttpConfig()));
    getTcpConfig().setDefaultListener(new PTCDriverListener(getTcpConfig()));
    getUdpConfig().setDefaultListener(new PTCDriverListener(getUdpConfig()));
    getSerialConfig().setDefaultListener(new PTCDriverListener(getSerialConfig()));
  }

  /**
   * Specify name for network resources.
   */
  public String getNetworkName()
  {
    return "PTCDriverNetwork";
  }

  /**
   * return device folder type
   */
  @Override
  public Type getDeviceFolderType()
  {
    return BPTCDriverDeviceFolder.TYPE;
  }

  /**
   * return device type
   */
  @Override
  public Type getDeviceType()
  {
    return BPTCDriverDevice.TYPE;
  }

  /* TODO - Add license check if needed
  @Override
  public final Feature getLicenseFeature()
  {
    return Sys.getLicenseManager().getFeature("?? vendor", "?? feature");
  }
  */

  @Override
  public void changed(Property p, Context cx)
  {
    super.changed(p, cx);
    if (!isRunning())
    {
      return;
    }

    if (p == status)
    {
      // Give any comms opportunity to respond to status changes
      getHttpConfig().statusUpdate();
      getTcpConfig().statusUpdate();
      getUdpConfig().statusUpdate();
      getSerialConfig().statusUpdate();
    }
  }
////////////////////////////////////////////////////////////////
//Utilities
////////////////////////////////////////////////////////////////

  /**
   * Access the http comm stack
   */
  public HttpComm hcomm()
  {
    return (HttpComm) getHttpConfig().comm();
  }

  /**
   * Access the tcp comm stack
   */
  public NComm tcomm()
  {
    return (NComm) getTcpConfig().comm();
  }

  /**
   * Access the udp comm stack
   */
  public NComm ucomm()
  {
    return (NComm) getUdpConfig().comm();
  }

  /**
   * Access the serial comm stack
   */
  public NComm scomm()
  {
    return (NComm) getSerialConfig().comm();
  }

  public static Lexicon LEX = Lexicon.make(BPTCDriverNetwork.class);
}
