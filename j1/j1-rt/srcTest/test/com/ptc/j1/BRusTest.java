package test.com.ptc.j1;

import com.ptc.j1.BRus;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.baja.nre.annotations.NiagaraType;
import javax.baja.test.BTestNg;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

@NiagaraType
@Test(groups = "ci")

public class BRusTest
    extends BTestNg {
//region /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
//@formatter:off
/*@ $test.com.ptc.j1.BRusTest(2979906276)1.0$ @*/
/* Generated Wed Jun 26 14:30:34 ICT 2024 by Slot-o-Matic (c) Tridium, Inc. 2012-2024 */

  //region Type

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BRusTest.class);

  //endregion Type

//@formatter:on
//endregion /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    public void testRus(){
        BRus rus = new BRus();

        rus.setRus("rus");

        Assert.assertEquals(rus.getRus(), "rus");
    }
}
