/*
 * Copyright 2024 PTC. All Rights Reserved.
 */

package com.ptc.PTCDriver.learn;

import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.BComponent;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

/**
 * BPTCDriverLearnDeviceEntry represents a learned device in the deviceManager learn
 * pane.  Add properties which should be displayed to user to identify device or are
 * need during the add/match step.
 *
 * @author PTC on 25 Jun 2024
 */
@NiagaraType
@NiagaraProperty(
  name = "address",
  type = "String",
  defaultValue = ""
)
public class BPTCDriverLearnDeviceEntry
  extends BComponent
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.PTCDriver.learn.BPTCDriverLearnDeviceEntry(3857199698)1.0$ @*/
/* Generated Tue Jun 25 17:22:59 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Property "address"

  /**
   * Slot for the {@code address} property.
   * @see #getAddress
   * @see #setAddress
   */
  public static final Property address = newProperty(0, "", null);

  /**
   * Get the {@code address} property.
   * @see #address
   */
  public String getAddress() { return getString(address); }

  /**
   * Set the {@code address} property.
   * @see #address
   */
  public void setAddress(String v) { setString(address, v, null); }

  //endregion Property "address"

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPTCDriverLearnDeviceEntry.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  public BPTCDriverLearnDeviceEntry()
  {
  }

  public BPTCDriverLearnDeviceEntry(String address)
  {
    setAddress(address);
  }
}
