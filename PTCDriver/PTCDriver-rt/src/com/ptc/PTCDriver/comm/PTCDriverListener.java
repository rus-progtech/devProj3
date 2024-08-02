/*
 * Copyright 2024 PTC. All Rights Reserved.
 */

package com.ptc.PTCDriver.comm;

import com.tridium.ndriver.comm.ICommListener;
import com.tridium.ndriver.comm.NMessage;
import com.tridium.ndriver.datatypes.BCommConfig;

/**
 * PTCDriverListener processes unsolicited messages.
 *
 * @author PTC on 25 Jun 2024
 */
public class PTCDriverListener
  implements ICommListener
{
  /**
   * Constructor
   */
  public PTCDriverListener(BCommConfig ccfg)
  {
  }

  /**
   * Customized to process the unsolicited message for this driver.
   *
   * @param nMsg message received from device
   */
  public void receiveMessage(NMessage nMsg)
  {
    // TODO
  }
}
