/*
 * Copyright 2024 PTC. All Rights Reserved.
 */

package com.ptc.PTCDriver.point;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

import com.tridium.ndriver.discover.*;
import com.tridium.ndriver.point.*;

import com.ptc.PTCDriver.*;

/**
 * BPTCDriverPointDeviceExt is a container for PTCDriver proxy points.
 *
 * @author PTC on 25 Jun 2024
 */
@NiagaraType
@NiagaraProperty(
  name = "discoveryPreferences",
  type = "BPTCDriverPointDiscoveryPreferences",
  defaultValue = "new BPTCDriverPointDiscoveryPreferences()",
  override = true
)
public class BPTCDriverPointDeviceExt
  extends BNPointDeviceExt
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.PTCDriver.point.BPTCDriverPointDeviceExt(313680538)1.0$ @*/
/* Generated Tue Jun 25 17:22:59 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Property "discoveryPreferences"

  /**
   * Slot for the {@code discoveryPreferences} property.
   * @see #getDiscoveryPreferences
   * @see #setDiscoveryPreferences
   */
  public static final Property discoveryPreferences = newProperty(0, new BPTCDriverPointDiscoveryPreferences(), null);

  //endregion Property "discoveryPreferences"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPTCDriverPointDeviceExt.class);

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

////////////////////////////////////////////////////////////////
// PointDeviceExt
////////////////////////////////////////////////////////////////

  /**
   * @return the Device type.
   */
  public Type getDeviceType()
  {
    return BPTCDriverDevice.TYPE;
  }

  /**
   * @return the PointFolder type.
   */
  public Type getPointFolderType()
  {
    return BPTCDriverPointFolder.TYPE;
  }

  /**
   * @return the ProxyExt type.
   */
  public Type getProxyExtType()
  {
    return BPTCDriverProxyExt.TYPE;
  }

////////////////////////////////////////////////////////////////
//BINDiscoveryHost
////////////////////////////////////////////////////////////////

  /**
   * Call back for discoveryJob to get an array of discovery objects.
   * Override point for driver specific discovery.
   */
  public BINDiscoveryObject[] getDiscoveryObjects(BNDiscoveryPreferences prefs)
    throws Exception
  {
    //
    // TODO  get array of discovery objects
    //
//    Array<??> a = new Array<>(??.class);
//    for(??)
//     a.add(new BPTCDriverPointDiscoveryLeaf(??));
//    return a.trim();
    return null;
  }
}
