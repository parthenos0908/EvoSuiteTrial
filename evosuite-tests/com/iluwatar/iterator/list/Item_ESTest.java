/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 08:45:10 GMT 2021
 */

package com.iluwatar.iterator.list;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.iterator.list.Item;
import com.iluwatar.iterator.list.ItemType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Item_ESTest extends Item_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ItemType itemType0 = ItemType.ANY;
      Item item0 = new Item(itemType0, (String) null);
      String string0 = item0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ItemType itemType0 = ItemType.RING;
      Item item0 = new Item(itemType0, "com.iluwatar.iterator.list.Item");
      String string0 = item0.toString();
      assertEquals("com.iluwatar.iterator.list.Item", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ItemType itemType0 = ItemType.WEAPON;
      Item item0 = new Item(itemType0, "");
      item0.setType((ItemType) null);
      item0.getType();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ItemType itemType0 = ItemType.WEAPON;
      Item item0 = new Item(itemType0, "");
      String string0 = item0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ItemType itemType0 = ItemType.WEAPON;
      Item item0 = new Item(itemType0, "");
      ItemType itemType1 = item0.getType();
      assertSame(itemType1, itemType0);
  }
}