/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 04:46:59 GMT 2021
 */

package com.iluwatar.doublechecked.locking;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.doublechecked.locking.Inventory;
import com.iluwatar.doublechecked.locking.Item;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Inventory_ESTest extends Inventory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Inventory inventory0 = new Inventory(1);
      inventory0.addItem((Item) null);
      // Undeclared exception!
      try { 
        inventory0.getItems();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Inventory inventory0 = null;
      try {
        inventory0 = new Inventory((-2));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -2
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Inventory inventory0 = new Inventory(1);
      Item item0 = new Item();
      boolean boolean0 = inventory0.addItem(item0);
      assertTrue(boolean0);
      
      boolean boolean1 = inventory0.addItem((Item) null);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Inventory inventory0 = new Inventory(1);
      List<Item> list0 = inventory0.getItems();
      assertEquals(0, list0.size());
  }
}