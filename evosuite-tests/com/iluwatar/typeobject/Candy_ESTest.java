/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:53:56 GMT 2021
 */

package com.iluwatar.typeobject;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.typeobject.Candy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Candy_ESTest extends Candy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Candy.Type candy_Type0 = Candy.Type.CRUSHABLE_CANDY;
      Candy candy0 = new Candy("X}u6)K~s>!,_\"<", "X}u6)K~s>!,_\"<", candy_Type0, 231);
      Candy.Type candy_Type1 = candy0.getType();
      assertSame(candy_Type1, candy_Type0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Candy.Type candy_Type0 = Candy.Type.CRUSHABLE_CANDY;
      Candy candy0 = new Candy("CRUSHABLE_CANDY", "", candy_Type0, 1881);
      int int0 = candy0.getPoints();
      assertEquals(1881, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Candy.Type candy_Type0 = Candy.Type.CRUSHABLE_CANDY;
      Candy candy0 = new Candy("REWARD_FRUIT", "6", candy_Type0, 2);
      candy0.setPoints((-1));
      int int0 = candy0.getPoints();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Candy.Type candy_Type0 = Candy.Type.REWARD_FRUIT;
      Candy candy0 = new Candy("", "", candy_Type0, 0);
      int int0 = candy0.getPoints();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Candy candy0 = new Candy((String) null, "", (Candy.Type) null, (-1));
      candy0.getType();
  }
}
