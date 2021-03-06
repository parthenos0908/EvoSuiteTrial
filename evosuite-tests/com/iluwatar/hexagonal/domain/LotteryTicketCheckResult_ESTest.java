/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 08:12:23 GMT 2021
 */

package com.iluwatar.hexagonal.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.hexagonal.domain.LotteryTicketCheckResult;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LotteryTicketCheckResult_ESTest extends LotteryTicketCheckResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LotteryTicketCheckResult.CheckResult lotteryTicketCheckResult_CheckResult0 = LotteryTicketCheckResult.CheckResult.WIN_PRIZE;
      LotteryTicketCheckResult lotteryTicketCheckResult0 = new LotteryTicketCheckResult(lotteryTicketCheckResult_CheckResult0, (-2764));
      LotteryTicketCheckResult lotteryTicketCheckResult1 = new LotteryTicketCheckResult(lotteryTicketCheckResult_CheckResult0, 0);
      boolean boolean0 = lotteryTicketCheckResult0.equals(lotteryTicketCheckResult1);
      assertFalse(boolean0);
      assertFalse(lotteryTicketCheckResult1.equals((Object)lotteryTicketCheckResult0));
      assertEquals((-2764), lotteryTicketCheckResult0.getPrizeAmount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LotteryTicketCheckResult.CheckResult lotteryTicketCheckResult_CheckResult0 = LotteryTicketCheckResult.CheckResult.WIN_PRIZE;
      LotteryTicketCheckResult lotteryTicketCheckResult0 = new LotteryTicketCheckResult(lotteryTicketCheckResult_CheckResult0, (-2764));
      lotteryTicketCheckResult0.hashCode();
      assertEquals((-2764), lotteryTicketCheckResult0.getPrizeAmount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LotteryTicketCheckResult.CheckResult lotteryTicketCheckResult_CheckResult0 = LotteryTicketCheckResult.CheckResult.NO_PRIZE;
      LotteryTicketCheckResult lotteryTicketCheckResult0 = new LotteryTicketCheckResult(lotteryTicketCheckResult_CheckResult0);
      lotteryTicketCheckResult0.getResult();
      assertEquals(0, lotteryTicketCheckResult0.getPrizeAmount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LotteryTicketCheckResult.CheckResult lotteryTicketCheckResult_CheckResult0 = LotteryTicketCheckResult.CheckResult.WIN_PRIZE;
      LotteryTicketCheckResult lotteryTicketCheckResult0 = new LotteryTicketCheckResult(lotteryTicketCheckResult_CheckResult0, 1731);
      int int0 = lotteryTicketCheckResult0.getPrizeAmount();
      assertEquals(1731, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LotteryTicketCheckResult.CheckResult lotteryTicketCheckResult_CheckResult0 = LotteryTicketCheckResult.CheckResult.WIN_PRIZE;
      LotteryTicketCheckResult lotteryTicketCheckResult0 = new LotteryTicketCheckResult(lotteryTicketCheckResult_CheckResult0, (-2764));
      int int0 = lotteryTicketCheckResult0.getPrizeAmount();
      assertEquals((-2764), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LotteryTicketCheckResult.CheckResult lotteryTicketCheckResult_CheckResult0 = LotteryTicketCheckResult.CheckResult.NO_PRIZE;
      LotteryTicketCheckResult lotteryTicketCheckResult0 = new LotteryTicketCheckResult(lotteryTicketCheckResult_CheckResult0);
      LotteryTicketCheckResult lotteryTicketCheckResult1 = new LotteryTicketCheckResult(lotteryTicketCheckResult_CheckResult0, (-2199));
      boolean boolean0 = lotteryTicketCheckResult0.equals(lotteryTicketCheckResult1);
      assertFalse(lotteryTicketCheckResult1.equals((Object)lotteryTicketCheckResult0));
      assertEquals((-2199), lotteryTicketCheckResult1.getPrizeAmount());
      assertFalse(boolean0);
      assertEquals(0, lotteryTicketCheckResult0.getPrizeAmount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LotteryTicketCheckResult.CheckResult lotteryTicketCheckResult_CheckResult0 = LotteryTicketCheckResult.CheckResult.NO_PRIZE;
      LotteryTicketCheckResult lotteryTicketCheckResult0 = new LotteryTicketCheckResult((LotteryTicketCheckResult.CheckResult) null);
      LotteryTicketCheckResult lotteryTicketCheckResult1 = new LotteryTicketCheckResult(lotteryTicketCheckResult_CheckResult0, (-3635));
      boolean boolean0 = lotteryTicketCheckResult0.equals(lotteryTicketCheckResult1);
      assertEquals(0, lotteryTicketCheckResult0.getPrizeAmount());
      assertEquals((-3635), lotteryTicketCheckResult1.getPrizeAmount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LotteryTicketCheckResult.CheckResult lotteryTicketCheckResult_CheckResult0 = LotteryTicketCheckResult.CheckResult.NO_PRIZE;
      LotteryTicketCheckResult lotteryTicketCheckResult0 = new LotteryTicketCheckResult(lotteryTicketCheckResult_CheckResult0);
      Object object0 = new Object();
      boolean boolean0 = lotteryTicketCheckResult0.equals(object0);
      assertEquals(0, lotteryTicketCheckResult0.getPrizeAmount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LotteryTicketCheckResult.CheckResult lotteryTicketCheckResult_CheckResult0 = LotteryTicketCheckResult.CheckResult.NO_PRIZE;
      LotteryTicketCheckResult lotteryTicketCheckResult0 = new LotteryTicketCheckResult(lotteryTicketCheckResult_CheckResult0);
      LotteryTicketCheckResult lotteryTicketCheckResult1 = new LotteryTicketCheckResult(lotteryTicketCheckResult_CheckResult0);
      boolean boolean0 = lotteryTicketCheckResult0.equals(lotteryTicketCheckResult1);
      assertTrue(boolean0);
      assertEquals(0, lotteryTicketCheckResult1.getPrizeAmount());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LotteryTicketCheckResult.CheckResult lotteryTicketCheckResult_CheckResult0 = LotteryTicketCheckResult.CheckResult.TICKET_NOT_SUBMITTED;
      LotteryTicketCheckResult lotteryTicketCheckResult0 = new LotteryTicketCheckResult(lotteryTicketCheckResult_CheckResult0);
      boolean boolean0 = lotteryTicketCheckResult0.equals(lotteryTicketCheckResult0);
      assertTrue(boolean0);
      assertEquals(0, lotteryTicketCheckResult0.getPrizeAmount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LotteryTicketCheckResult.CheckResult lotteryTicketCheckResult_CheckResult0 = LotteryTicketCheckResult.CheckResult.NO_PRIZE;
      LotteryTicketCheckResult lotteryTicketCheckResult0 = new LotteryTicketCheckResult(lotteryTicketCheckResult_CheckResult0);
      boolean boolean0 = lotteryTicketCheckResult0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(0, lotteryTicketCheckResult0.getPrizeAmount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LotteryTicketCheckResult lotteryTicketCheckResult0 = new LotteryTicketCheckResult((LotteryTicketCheckResult.CheckResult) null);
      lotteryTicketCheckResult0.hashCode();
      assertEquals(0, lotteryTicketCheckResult0.getPrizeAmount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LotteryTicketCheckResult.CheckResult lotteryTicketCheckResult_CheckResult0 = LotteryTicketCheckResult.CheckResult.NO_PRIZE;
      LotteryTicketCheckResult lotteryTicketCheckResult0 = new LotteryTicketCheckResult(lotteryTicketCheckResult_CheckResult0);
      int int0 = lotteryTicketCheckResult0.getPrizeAmount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LotteryTicketCheckResult lotteryTicketCheckResult0 = new LotteryTicketCheckResult((LotteryTicketCheckResult.CheckResult) null);
      lotteryTicketCheckResult0.getResult();
      assertEquals(0, lotteryTicketCheckResult0.getPrizeAmount());
  }
}
