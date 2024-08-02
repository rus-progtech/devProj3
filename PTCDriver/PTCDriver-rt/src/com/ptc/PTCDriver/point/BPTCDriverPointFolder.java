/*
 * Copyright 2024 PTC. All Rights Reserved.
 */

package com.ptc.PTCDriver.point;

import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

import com.tridium.ndriver.point.BNPointFolder;

import com.ptc.PTCDriver.*;

/**
 * BPTCDriverPointFolder
 *
 * @author   PTC on 25 Jun 2024
 */
@NiagaraType
public class BPTCDriverPointFolder
  extends BNPointFolder
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.PTCDriver.point.BPTCDriverPointFolder(2979906276)1.0$ @*/
/* Generated Tue Jun 25 17:22:59 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPTCDriverPointFolder.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
////////////////////////////////////////////////////////////////
// Access
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

  /**
   * Get the device cast to a BPTCDriverDevice.
   *
   * @return device as a BPTCDriverDevice.
   */
  public final BPTCDriverDevice getPTCDriverDevice()
  {
    return (BPTCDriverDevice) getDevice();
  }
}
