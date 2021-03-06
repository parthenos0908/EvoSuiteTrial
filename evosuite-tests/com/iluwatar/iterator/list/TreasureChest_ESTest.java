/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 08:46:20 GMT 2021
 */

package com.iluwatar.iterator.list;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.iterator.Iterator;
import com.iluwatar.iterator.list.Item;
import com.iluwatar.iterator.list.ItemType;
import com.iluwatar.iterator.list.TreasureChest;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TreasureChest_ESTest extends TreasureChest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreasureChest treasureChest0 = new TreasureChest();
      List<Item> list0 = treasureChest0.getItems();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TreasureChest treasureChest0 = new TreasureChest();
      ItemType itemType0 = ItemType.RING;
      Iterator<Item> iterator0 = treasureChest0.iterator(itemType0);
      assertTrue(iterator0.hasNext());
  }
}
