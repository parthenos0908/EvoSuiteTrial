/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 10:56:12 GMT 2021
 */

package com.iluwatar.producer.consumer;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.producer.consumer.Item;
import com.iluwatar.producer.consumer.ItemQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ItemQueue_ESTest extends ItemQueue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ItemQueue itemQueue0 = new ItemQueue();
      Item item0 = new Item((String) null, 0);
      itemQueue0.put(item0);
      Item item1 = itemQueue0.take();
      assertNull(item1.getProducer());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ItemQueue itemQueue0 = new ItemQueue();
      Item item0 = new Item("dA1^D|D|e_|rKl", 5);
      itemQueue0.put(item0);
      Item item1 = itemQueue0.take();
      assertEquals(5, item1.getId());
  }
}