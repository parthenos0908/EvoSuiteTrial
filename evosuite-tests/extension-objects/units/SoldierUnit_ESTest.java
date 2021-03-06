/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:17:14 GMT 2021
 */

package units;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import abstractextensions.UnitExtension;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import units.SoldierUnit;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SoldierUnit_ESTest extends SoldierUnit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SoldierUnit soldierUnit0 = new SoldierUnit((String) null);
      // Undeclared exception!
      try { 
        soldierUnit0.getUnitExtension((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SoldierUnit soldierUnit0 = new SoldierUnit("SoldierExtension");
      UnitExtension unitExtension0 = soldierUnit0.getUnitExtension("SoldierExtension");
      assertNotNull(unitExtension0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SoldierUnit soldierUnit0 = new SoldierUnit("SoldierExtension");
      UnitExtension unitExtension0 = soldierUnit0.getUnitExtension("");
      assertNull(unitExtension0);
  }
}
