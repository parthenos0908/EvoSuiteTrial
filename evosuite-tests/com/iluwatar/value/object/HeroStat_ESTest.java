/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 14:04:49 GMT 2021
 */

package com.iluwatar.value.object;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.value.object.HeroStat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HeroStat_ESTest extends HeroStat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf(0, 0, (-2503));
      HeroStat heroStat1 = HeroStat.valueOf((-2503), 0, (-2503));
      boolean boolean0 = heroStat0.equals(heroStat1);
      assertFalse(boolean0);
      assertEquals((-2503), heroStat0.getLuck());
      assertFalse(heroStat1.equals((Object)heroStat0));
      assertEquals("HeroStat [strength=-2503, intelligence=0, luck=-2503]", heroStat1.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf(1, 1, 2381);
      HeroStat heroStat1 = HeroStat.valueOf(2381, 1, 1);
      boolean boolean0 = heroStat0.equals(heroStat1);
      assertEquals("HeroStat [strength=1, intelligence=1, luck=2381]", heroStat0.toString());
      assertEquals("HeroStat [strength=2381, intelligence=1, luck=1]", heroStat1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf(0, 0, 0);
      HeroStat heroStat1 = HeroStat.valueOf((-2503), 1235, (-2503));
      boolean boolean0 = heroStat1.equals(heroStat0);
      assertEquals("HeroStat [strength=-2503, intelligence=1235, luck=-2503]", heroStat1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf(0, 0, 0);
      heroStat0.hashCode();
      assertEquals("HeroStat [strength=0, intelligence=0, luck=0]", heroStat0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf(0, 0, 0);
      int int0 = heroStat0.getStrength();
      assertEquals(0, int0);
      assertEquals("HeroStat [strength=0, intelligence=0, luck=0]", heroStat0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf(652, (-18), (-18));
      int int0 = heroStat0.getStrength();
      assertEquals("HeroStat [strength=652, intelligence=-18, luck=-18]", heroStat0.toString());
      assertEquals(652, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf((-1119), 126, 1042);
      int int0 = heroStat0.getLuck();
      assertEquals("HeroStat [strength=-1119, intelligence=126, luck=1042]", heroStat0.toString());
      assertEquals(1042, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf(0, 0, (-2503));
      int int0 = heroStat0.getLuck();
      assertEquals("HeroStat [strength=0, intelligence=0, luck=-2503]", heroStat0.toString());
      assertEquals((-2503), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf((-2503), 1235, (-2503));
      int int0 = heroStat0.getIntelligence();
      assertEquals("HeroStat [strength=-2503, intelligence=1235, luck=-2503]", heroStat0.toString());
      assertEquals(1235, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf(0, (-691), 31);
      int int0 = heroStat0.getIntelligence();
      assertEquals("HeroStat [strength=0, intelligence=-691, luck=31]", heroStat0.toString());
      assertEquals((-691), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf((-18), (-18), (-18));
      HeroStat heroStat1 = HeroStat.valueOf(652, (-18), (-18));
      boolean boolean0 = heroStat0.equals(heroStat1);
      assertEquals("HeroStat [strength=652, intelligence=-18, luck=-18]", heroStat1.toString());
      assertFalse(heroStat1.equals((Object)heroStat0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf(27, 0, 4832);
      HeroStat heroStat1 = HeroStat.valueOf(4714, 0, (-1));
      boolean boolean0 = heroStat1.equals(heroStat0);
      assertEquals("HeroStat [strength=4714, intelligence=0, luck=-1]", heroStat1.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf(0, 0, 0);
      HeroStat heroStat1 = HeroStat.valueOf(0, (-2503), 0);
      boolean boolean0 = heroStat1.equals(heroStat0);
      assertFalse(heroStat0.equals((Object)heroStat1));
      assertFalse(boolean0);
      assertEquals("HeroStat [strength=0, intelligence=-2503, luck=0]", heroStat1.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf((-18), (-18), (-18));
      boolean boolean0 = heroStat0.equals("HeroStat [strength=-18, intelligence=-18, luck=-18]");
      assertEquals("HeroStat [strength=-18, intelligence=-18, luck=-18]", heroStat0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf((-1077), (-1077), (-1077));
      boolean boolean0 = heroStat0.equals((Object) null);
      assertEquals("HeroStat [strength=-1077, intelligence=-1077, luck=-1077]", heroStat0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf((-1077), (-1077), (-1077));
      boolean boolean0 = heroStat0.equals(heroStat0);
      assertEquals("HeroStat [strength=-1077, intelligence=-1077, luck=-1077]", heroStat0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf((-18), (-18), (-18));
      HeroStat heroStat1 = HeroStat.valueOf((-18), (-18), (-18));
      boolean boolean0 = heroStat1.equals(heroStat0);
      assertTrue(boolean0);
      assertEquals("HeroStat [strength=-18, intelligence=-18, luck=-18]", heroStat1.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf((-18), (-18), (-18));
      String string0 = heroStat0.toString();
      assertEquals("HeroStat [strength=-18, intelligence=-18, luck=-18]", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf(0, 0, 0);
      int int0 = heroStat0.getIntelligence();
      assertEquals("HeroStat [strength=0, intelligence=0, luck=0]", heroStat0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf((-18), (-18), (-18));
      int int0 = heroStat0.getStrength();
      assertEquals("HeroStat [strength=-18, intelligence=-18, luck=-18]", heroStat0.toString());
      assertEquals((-18), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf(0, 0, 0);
      int int0 = heroStat0.getLuck();
      assertEquals(0, int0);
      assertEquals("HeroStat [strength=0, intelligence=0, luck=0]", heroStat0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HeroStat heroStat0 = HeroStat.valueOf((-18), (-18), (-18));
      heroStat0.hashCode();
      assertEquals("HeroStat [strength=-18, intelligence=-18, luck=-18]", heroStat0.toString());
  }
}