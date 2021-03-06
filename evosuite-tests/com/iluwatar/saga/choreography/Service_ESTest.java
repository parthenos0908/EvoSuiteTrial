/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 12:08:18 GMT 2021
 */

package com.iluwatar.saga.choreography;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.saga.choreography.FlyBookingService;
import com.iluwatar.saga.choreography.HotelBookingService;
import com.iluwatar.saga.choreography.Saga;
import com.iluwatar.saga.choreography.ServiceDiscoveryService;
import com.iluwatar.saga.choreography.WithdrawMoneyService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Service_ESTest extends Service_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ServiceDiscoveryService serviceDiscoveryService0 = new ServiceDiscoveryService();
      Saga saga0 = Saga.create();
      Saga saga1 = saga0.chapter("booking a Hotel");
      HotelBookingService hotelBookingService0 = new HotelBookingService(serviceDiscoveryService0);
      Saga saga2 = hotelBookingService0.rollback(saga1);
      assertEquals(Saga.SagaResult.PROGRESS, saga2.getResult());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ServiceDiscoveryService serviceDiscoveryService0 = new ServiceDiscoveryService();
      FlyBookingService flyBookingService0 = new FlyBookingService(serviceDiscoveryService0);
      Saga saga0 = Saga.create();
      Saga saga1 = saga0.chapter("booking a Hotel");
      Saga saga2 = flyBookingService0.process(saga0);
      assertSame(saga2, saga1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ServiceDiscoveryService serviceDiscoveryService0 = new ServiceDiscoveryService();
      WithdrawMoneyService withdrawMoneyService0 = new WithdrawMoneyService(serviceDiscoveryService0);
      // Undeclared exception!
      try { 
        withdrawMoneyService0.rollback((Saga) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.saga.choreography.Saga.getCurrentValue()\" because \"saga\" is null
         //
         verifyException("com.iluwatar.saga.choreography.Service", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FlyBookingService flyBookingService0 = new FlyBookingService((ServiceDiscoveryService) null);
      // Undeclared exception!
      try { 
        flyBookingService0.process((Saga) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.saga.choreography.Saga.getCurrentValue()\" because \"saga\" is null
         //
         verifyException("com.iluwatar.saga.choreography.Service", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ServiceDiscoveryService serviceDiscoveryService0 = new ServiceDiscoveryService();
      WithdrawMoneyService withdrawMoneyService0 = new WithdrawMoneyService(serviceDiscoveryService0);
      // Undeclared exception!
      try { 
        withdrawMoneyService0.execute((Saga) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.saga.choreography.Saga.getCurrent()\"
         //
         verifyException("com.iluwatar.saga.choreography.Service", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ServiceDiscoveryService serviceDiscoveryService0 = new ServiceDiscoveryService();
      Saga saga0 = Saga.create();
      HotelBookingService hotelBookingService0 = new HotelBookingService(serviceDiscoveryService0);
      // Undeclared exception!
      try { 
        hotelBookingService0.execute(saga0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ServiceDiscoveryService serviceDiscoveryService0 = new ServiceDiscoveryService();
      Saga saga0 = Saga.create();
      Saga saga1 = saga0.chapter("booking a Hotel");
      HotelBookingService hotelBookingService0 = new HotelBookingService(serviceDiscoveryService0);
      saga1.chapter("booking a Hotel");
      // Undeclared exception!
      try { 
        hotelBookingService0.execute(saga0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // the service booking a Hotel has not been found
         //
         verifyException("com.iluwatar.saga.choreography.Service", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ServiceDiscoveryService serviceDiscoveryService0 = new ServiceDiscoveryService();
      Saga saga0 = Saga.create();
      Saga saga1 = saga0.chapter("booking a Hotel");
      HotelBookingService hotelBookingService0 = new HotelBookingService(serviceDiscoveryService0);
      Saga saga2 = hotelBookingService0.execute(saga1);
      saga2.back();
      hotelBookingService0.execute(saga2);
      assertEquals(Saga.SagaResult.ROLLBACKED, saga1.getResult());
      assertEquals(Saga.SagaResult.ROLLBACKED, saga0.getResult());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ServiceDiscoveryService serviceDiscoveryService0 = new ServiceDiscoveryService();
      Saga saga0 = Saga.create();
      FlyBookingService flyBookingService0 = new FlyBookingService(serviceDiscoveryService0);
      // Undeclared exception!
      try { 
        flyBookingService0.rollback(saga0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ServiceDiscoveryService serviceDiscoveryService0 = new ServiceDiscoveryService();
      Saga saga0 = Saga.create();
      Saga saga1 = saga0.chapter("");
      FlyBookingService flyBookingService0 = new FlyBookingService(serviceDiscoveryService0);
      // Undeclared exception!
      try { 
        flyBookingService0.execute(saga1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // the service  has not been found
         //
         verifyException("com.iluwatar.saga.choreography.Service", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ServiceDiscoveryService serviceDiscoveryService0 = new ServiceDiscoveryService();
      Saga saga0 = Saga.create();
      FlyBookingService flyBookingService0 = new FlyBookingService(serviceDiscoveryService0);
      // Undeclared exception!
      try { 
        flyBookingService0.process(saga0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }
}
