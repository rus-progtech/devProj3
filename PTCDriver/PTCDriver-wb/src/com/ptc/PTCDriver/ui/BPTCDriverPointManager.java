/*
 * Copyright 2024 PTC. All Rights Reserved.
 */

package com.ptc.PTCDriver.ui;

import javax.baja.sys.*;
import javax.baja.util.*;
import javax.baja.gx.*;
import javax.baja.ui.*;
import javax.baja.control.*;
import javax.baja.driver.*;
import javax.baja.driver.point.*;
import javax.baja.driver.ui.point.*;
import javax.baja.workbench.mgr.*;
import javax.baja.workbench.mgr.folder.*;
import javax.baja.nre.annotations.*;

import com.ptc.PTCDriver.*;
import com.ptc.PTCDriver.point.*;

/**
 * BPTCDriverPointManager provides the user interface to manage
 * proxy points in single device
 *
 * @author PTC on 25 Jun 2024
 */
@NiagaraType
public class BPTCDriverPointManager
  extends BPointManager
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.PTCDriver.ui.BPTCDriverPointManager(2979906276)1.0$ @*/
/* Generated Tue Jun 25 17:22:59 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPTCDriverPointManager.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
////////////////////////////////////////////////////////////////
// Constructor
////////////////////////////////////////////////////////////////

  public BPTCDriverPointManager()
  {
  }

////////////////////////////////////////////////////////////////
// Support
////////////////////////////////////////////////////////////////

  protected MgrModel makeModel()
  {
    return new Model(this);
  }

  protected MgrController makeController()
  {
    return new Controller(this);
  }

////////////////////////////////////////////////////////////////
// Model
////////////////////////////////////////////////////////////////

  class Model extends PointModel
  {
    Model(BPointManager manager)
    {
      super(manager);
    }

    protected MgrColumn[] makeColumns()
    {
      return cols;
    }
  }

////////////////////////////////////////////////////////////////
// Controller
////////////////////////////////////////////////////////////////

  class Controller extends PointController
  {
    Controller(BPointManager mgr)
    {
      super(mgr);
    }
  }

////////////////////////////////////////////////////////////////
// Attributes
////////////////////////////////////////////////////////////////

  static Lexicon lex = Lexicon.make(BPTCDriverPointManager.class);

  // base class columns
  MgrColumn colPath        = new MgrColumn.Path(MgrColumn.UNSEEN);
  MgrColumn colName        = new MgrColumn.Name();
  MgrColumn colType        = new MgrColumn.Type();
  MgrColumn colToString    = new MgrColumn.ToString("Out", 0);
  MgrColumn colEnabled     = new MgrColumn.PropPath(new Property[] {BControlPoint.proxyExt, BProxyExt.enabled}, MgrColumn.EDITABLE | MgrColumn.UNSEEN);
  MgrColumn colFacets      = new MgrColumn.PropPath(new Property[] {BControlPoint.facets},  MgrColumn.EDITABLE | MgrColumn.UNSEEN);
  MgrColumn colTuning      = new MgrColumn.PropPath(new Property[] {BControlPoint.proxyExt, BProxyExt.tuningPolicyName}, MgrColumn.EDITABLE);
  MgrColumn colDeviceFacets= new MgrColumn.PropPath(new Property[] {BControlPoint.proxyExt, BProxyExt.deviceFacets}, MgrColumn.EDITABLE | MgrColumn.UNSEEN);
  MgrColumn colConversion  = new MgrColumn.PropPath(new Property[] {BControlPoint.proxyExt, BProxyExt.conversion},   MgrColumn.EDITABLE | MgrColumn.UNSEEN);
  MgrColumn colFaultCause  = new MgrColumn.PropPath(new Property[] {BControlPoint.proxyExt, BProxyExt.faultCause},   MgrColumn.UNSEEN);
  MgrColumn colReadValue   = new MgrColumn.PropPath(new Property[] {BControlPoint.proxyExt, BProxyExt.readValue},    MgrColumn.UNSEEN);
  MgrColumn colWriteValue  = new MgrColumn.PropPath(new Property[] {BControlPoint.proxyExt, BProxyExt.writeValue},   MgrColumn.UNSEEN);

  // PTCDriverProxyExt specific columns
  MgrColumn[] cols =
  {
    colPath, colName, colType, colToString,
    colEnabled, colFacets, colTuning, colDeviceFacets, colConversion,
    colFaultCause, colReadValue, colWriteValue,
  };
}
