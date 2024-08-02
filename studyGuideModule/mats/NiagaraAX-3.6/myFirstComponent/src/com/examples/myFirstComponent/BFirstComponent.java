package com.examples.myFirstComponent;

import javax.baja.sys.*;

/**
 * An example {@link BComponent} 
 *
 * @author		Tridium
 * @creation 	Jul 13, 2012
 *
 */
public class BFirstComponent
    extends BComponent
{

  /**
   * The Type information of the BObject. Type information must always
   * be declared BELOW property, action, and topic slot declarations.
   */
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BFirstComponent.class);



}
