/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:46:28 GMT 2021
 */

package com.iluwatar.commander.queue;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.commander.queue.Queue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Queue_ESTest extends Queue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Queue.Node<String> queue_Node0 = new Queue.Node<String>("O=@fBX17}b8G6sxbF", (Queue.Node<String>) null);
      Queue.Node<String> queue_Node1 = new Queue.Node<String>("O=@fBX17}b8G6sxbF", queue_Node0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Queue<String> queue0 = new Queue<String>();
      queue0.enqueue((String) null);
      Object object0 = queue0.peek();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Queue<String> queue0 = new Queue<String>();
      queue0.enqueue("");
      boolean boolean0 = queue0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Queue<String> queue0 = new Queue<String>();
      queue0.enqueue((String) null);
      String string0 = queue0.dequeue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Queue<String> queue0 = new Queue<String>();
      try { 
        queue0.peek();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.commander.queue.Queue", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Queue<String> queue0 = new Queue<String>();
      queue0.enqueue("E");
      String string0 = queue0.peek();
      assertEquals("E", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Queue<Object> queue0 = new Queue<Object>();
      Object object0 = new Object();
      queue0.enqueue(object0);
      queue0.enqueue("ZOnNNL2%yn");
      queue0.dequeue();
      Object object1 = queue0.dequeue();
      assertNotNull(object1);
      
      boolean boolean0 = queue0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Queue<Object> queue0 = new Queue<Object>();
      try { 
        queue0.dequeue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.commander.queue.Queue", e);
      }
  }
}
