/*
 * Copyright 2024 PTC. All Rights Reserved.
 */

package com.ptc.PTCDriver.comm;

import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

import com.tridium.ndriver.comm.IMessageFactory;
import com.tridium.ndriver.comm.LinkMessage;
import com.tridium.ndriver.comm.NLinkMessageFactory;
import com.tridium.ndriver.datatypes.BTcpCommConfig;

import com.ptc.PTCDriver.message.PTCDriverMessageFactory;

/**
 * BPTCDriverTcpCommConfig Handles the tcp communication for the driver.
 *
 * @author PTC on 25 Jun 2024
 */
@NiagaraType
public class BPTCDriverTcpCommConfig
  extends BTcpCommConfig
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.PTCDriver.comm.BPTCDriverTcpCommConfig(2979906276)1.0$ @*/
/* Generated Tue Jun 25 17:22:59 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPTCDriverTcpCommConfig.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  /**
   * Empty constructor
   */
  public BPTCDriverTcpCommConfig()
  {
  }

//  /** Override to configure the maximum number of request messages that can
//   *  be outstanding at the same time.  Default implementation returns 32. */
//  public int getMaxOutstandingTransactions() { return 1; }

  /**
   * Provide custom LinkMessage factory.
   */
  protected NLinkMessageFactory makeLinkMessageFactory()
  {
    // link message factory must create
    return new NLinkMessageFactory(1024)
    {
      protected LinkMessage createLinkMessage()
      {
        return new PTCDriverTcpLinkMessage(1024);
      }
    };
  }

  /**
   * Provide custom Message factory.
   */
  protected IMessageFactory makeMessageFactory()
  {
    return new PTCDriverMessageFactory();
  }
}
