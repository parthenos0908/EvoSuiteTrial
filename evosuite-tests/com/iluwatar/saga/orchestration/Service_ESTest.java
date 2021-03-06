/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 12:18:24 GMT 2021
 */

package com.iluwatar.saga.orchestration;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.saga.orchestration.ChapterResult;
import com.iluwatar.saga.orchestration.HotelBookingService;
import com.iluwatar.saga.orchestration.OrderService;
import com.iluwatar.saga.orchestration.WithdrawMoneyService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Service_ESTest extends Service_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WithdrawMoneyService withdrawMoneyService0 = new WithdrawMoneyService();
      ChapterResult<String> chapterResult0 = withdrawMoneyService0.rollback(";rmL?");
      assertTrue(chapterResult0.isSuccess());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HotelBookingService hotelBookingService0 = new HotelBookingService();
      ChapterResult<String> chapterResult0 = hotelBookingService0.rollback("crashed_order");
      assertFalse(chapterResult0.isSuccess());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WithdrawMoneyService withdrawMoneyService0 = new WithdrawMoneyService();
      ChapterResult<String> chapterResult0 = withdrawMoneyService0.process("bad_order");
      assertFalse(chapterResult0.isSuccess());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HotelBookingService hotelBookingService0 = new HotelBookingService();
      String string0 = hotelBookingService0.getName();
      assertEquals("booking a Hotel", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HotelBookingService hotelBookingService0 = new HotelBookingService();
      // Undeclared exception!
      try { 
        hotelBookingService0.rollback((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"String.equals(Object)\" because \"value\" is null
         //
         verifyException("com.iluwatar.saga.orchestration.HotelBookingService", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WithdrawMoneyService withdrawMoneyService0 = new WithdrawMoneyService();
      // Undeclared exception!
      try { 
        withdrawMoneyService0.process((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"String.equals(Object)\" because \"value\" is null
         //
         verifyException("com.iluwatar.saga.orchestration.WithdrawMoneyService", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OrderService orderService0 = new OrderService();
      ChapterResult<String> chapterResult0 = orderService0.process("booking a Hotel");
      assertTrue(chapterResult0.isSuccess());
  }
}
