/*
 * Copyright 2024 PTC. All Rights Reserved.
 */

package com.ptc.PTCDriver.message;

import com.tridium.ndriver.comm.IMessageFactory;
import com.tridium.ndriver.comm.LinkMessage;
import com.tridium.ndriver.comm.NMessage;

/**
 * PTCDriverMessageFactory implementation of IMessageFactory.
 *
 * @author PTC on 25 Jun 2024
 */
public class PTCDriverMessageFactory
  implements IMessageFactory
{
  public PTCDriverMessageFactory()
  {
  }

  public NMessage makeMessage(LinkMessage lm)
    throws Exception
  {
    //
    // TODO - convert linkMessage driver specific NMessage
    return null;
  }
}
