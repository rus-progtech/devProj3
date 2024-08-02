/*
 * Copyright 2024 PTC. All Rights Reserved.
 */

package com.ptc.PTCDriver.ui;

import javax.baja.sys.*;
import javax.baja.util.*;
import javax.baja.gx.*;
import javax.baja.ui.*;
import javax.baja.job.*;
import javax.baja.driver.*;
import javax.baja.driver.ui.device.*;
import javax.baja.workbench.mgr.*;
import javax.baja.workbench.mgr.folder.*;
import javax.baja.nre.annotations.*;

import com.tridium.util.ArrayUtil;

import com.ptc.PTCDriver.*;
import com.ptc.PTCDriver.learn.*;

/**
 * BPTCDriverDeviceManager provides the user interface to manage
 * PTCDriver devices on a single network.
 *
 * @author PTC on 25 Jun 2024
 */
@NiagaraType
public class BPTCDriverDeviceManager
  extends BDeviceManager
{
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $com.ptc.PTCDriver.ui.BPTCDriverDeviceManager(2979906276)1.0$ @*/
/* Generated Tue Jun 25 17:22:59 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPTCDriverDeviceManager.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
////////////////////////////////////////////////////////////////
// Constructor
////////////////////////////////////////////////////////////////

  public BPTCDriverDeviceManager()
  {
  }

  /**
   * Gets ancestor network object.
   */
  public BPTCDriverNetwork getNetwork()
  {
    BObject owner = getCurrentValue();
    if (owner instanceof BPTCDriverDeviceFolder)
    {
      return (BPTCDriverNetwork) ((BPTCDriverDeviceFolder) owner).getNetwork();
    }
    else if (owner instanceof BPTCDriverNetwork)
    {
      return (BPTCDriverNetwork) owner;
    }
    else
    {
      return null;
    }
  }

  public void doLoadValue(BObject obj, Context cx)
  {
    super.doLoadValue(obj,cx);
    // Sets the discovery data from the pan table entries
    updateLearnData();
  }

  /**
   * This method is called by the doLoadValue method and when the learn job completes.
   */
  void updateLearnData()
  {
    BPTCDriverLearnDevicesJob learnJob = (BPTCDriverLearnDevicesJob) getLearn().getJob();
    if (learnJob != null)
    {
      getLearn().updateRoots(learnJob.getLearnedDevices().getChildren(BPTCDriverLearnDeviceEntry.class));
    }
  }

  public BPTCDriverDevice[] getSelectedDevices()
  {
    if (getModel() == null || getModel().getTable() == null)
    {
      return new BPTCDriverDevice[0];
    }
    else
    {
      BComponent[] selection = getModel().getTable().getSelectedComponents();
      BPTCDriverDevice[] devices = new BPTCDriverDevice[0];
      for (int i = 0; i < selection.length; i++)
      {
        if (selection[i].getType().is(BPTCDriverDevice.TYPE))
        {
          devices = ArrayUtil.addOne(devices, (BPTCDriverDevice) selection[i]);
        }
      }
      return devices;
    }
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

  protected MgrLearn makeLearn()
  {
    return new Learn(this);
  }

////////////////////////////////////////////////////////////////
// Model
////////////////////////////////////////////////////////////////

  class Model extends DeviceModel
  {
    Model(BDeviceManager manager)
    {
      super(manager);
    }

    protected MgrColumn[] makeColumns()
    {
      return cols;
    }
  }

/////////////////////////////////////////////////////////////
// Learn
//////////////////////////////////////////////////////////////

  /**
   * Override of base learn support object
   */
  class Learn extends MgrLearn
  {
    Learn(BDeviceManager manager)
    {
      super(manager);
    }

    /**
     * This is method is called to initialize the
     * columns used for the discovery table.
     */
    protected MgrColumn[] makeColumns()
    {
      return new MgrColumn[]{
          //
          // TODO - add discovery column entries
          //
      };
    }

    public BImage getIcon(Object dis)
    {
      return stationIcon;
    }

    public MgrTypeInfo[] toTypes(Object discovery)
    {
      return MgrTypeInfo.makeArray(getNetwork().getDeviceType());
    }

    public void toRow(Object discovery, MgrEditRow row)
    {
      BPTCDriverLearnDeviceEntry learnEntry = (BPTCDriverLearnDeviceEntry) discovery;
      //
      // TODO - add code to make changes to row based on discovery object
      //
    }

    /**
     * Allows the core to ask us if a discovered item is equivalent
     * to a given pre-existing item.
     */
    public boolean isExisting(Object dis, BComponent comp)
    {
      BPTCDriverLearnDeviceEntry learnEntry = (BPTCDriverLearnDeviceEntry) dis;
      BPTCDriverDevice d = (BPTCDriverDevice) comp;

      //
      // TODO - add code to check if learnEntry is for specified device
      //

      return false;
    }

    /**
     * This callback is automatically invoked when the
     * current job set via {@code setJob()} completes.
     */
    public void jobComplete(BJob job)
    {
      super.jobComplete(job);
      if (job instanceof BPTCDriverLearnDevicesJob)
      {
        updateLearnData();
      }
    }
  }

////////////////////////////////////////////////////////////////
// Controller
////////////////////////////////////////////////////////////////

  class Controller extends DeviceController
  {
    Controller(BDeviceManager mgr)
    {
      super(mgr);
    }
  }

////////////////////////////////////////////////////////////////
// Attributes
////////////////////////////////////////////////////////////////

  static Lexicon lex = Lexicon.make(BPTCDriverDeviceManager.class);
  static BImage stationIcon = BImage.make("module://icons/x16/device.png");

  // base class columns
  MgrColumn colName         = new MgrColumn.Name();
  MgrColumn colType         = new MgrColumn.Type();
  MgrColumn colDeviceExts   = new DeviceExtsColumn(new BPTCDriverDevice());
  MgrColumn colStatus       = new MgrColumn.Prop(BDevice.status);
  MgrColumn colEnabled      = new MgrColumn.Prop(BDevice.enabled, MgrColumn.EDITABLE | MgrColumn.UNSEEN);
  MgrColumn colHealth       = new MgrColumn.Prop(BDevice.health, 0);

  // PTCDriverDevice specific columns
  // TODO - add custom columns definitions and include in cols[]

  MgrColumn[] cols =
  {
    colName, colType, colDeviceExts,
    colStatus, colEnabled, colHealth,
  };

}
