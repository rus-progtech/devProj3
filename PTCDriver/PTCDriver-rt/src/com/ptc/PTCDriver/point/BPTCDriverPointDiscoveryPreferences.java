/*
 * Copyright 2024 PTC. All Rights Reserved.
 */

package com.ptc.PTCDriver.point;

import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

import com.tridium.ndriver.discover.BNDiscoveryPreferences;

/**
 * BPTCDriverPointDiscoveryPreferences controls the type of discovery leafs using during
 * point discovery for PTCDriver
 *
 * @author PTC on 25 Jun 2024
 */
@NiagaraType
public class BPTCDriverPointDiscoveryPreferences
  extends BNDiscoveryPreferences
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.PTCDriver.point.BPTCDriverPointDiscoveryPreferences(2979906276)1.0$ @*/
/* Generated Tue Jun 25 17:22:59 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPTCDriverPointDiscoveryPreferences.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  public BPTCDriverPointDiscoveryPreferences()
  {
  }

  public Type getDiscoveryLeafType()
  {
    return BPTCDriverPointDiscoveryLeaf.TYPE;
  }
}
