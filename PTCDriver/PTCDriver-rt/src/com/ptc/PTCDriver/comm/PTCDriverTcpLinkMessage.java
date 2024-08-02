/*
 * Copyright 2024 PTC. All Rights Reserved.
 */

package com.ptc.PTCDriver.comm;

import java.io.InputStream;

import com.tridium.ndriver.comm.LinkMessage;

/**
 * PTCDriverTcpLinkMessage streams data to and from a byte array representation.
 *
 * @author PTC on 25 Jun 2024
 */
public class PTCDriverTcpLinkMessage
  extends LinkMessage
{
  public PTCDriverTcpLinkMessage(int maxLen)
  {
    super(maxLen);
  }

  /**
   * Get byte data from inputStream.
   * @return true if complete message received
   */
  public boolean receive(InputStream in)
    throws Exception
  {
    //
    // TODO add code to detect beginning and end of message in serial stream.
    //
    // read characters from stream
    // after start byte detected write following bytes to buffer[] until
    //  end of message
    return false;
  }

////////////////////////////////////////////////////////////////
// Handle outgoing messages
////////////////////////////////////////////////////////////////

// TODO customize handling of outgoing messages if needed
//  /** Translate data from app message to link message representation */
//  public boolean setMessage(NMessage msg)
//    throws Exception
//  {
//
//  }
}
