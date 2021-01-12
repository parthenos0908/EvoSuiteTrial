/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:47:35 GMT 2021
 */

package com.iluwatar.commander.queue;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.commander.Order;
import com.iluwatar.commander.queue.QueueDatabase;
import com.iluwatar.commander.queue.QueueTask;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QueueDatabase_ESTest extends QueueDatabase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Exception[] exceptionArray0 = new Exception[0];
      QueueDatabase queueDatabase0 = new QueueDatabase(exceptionArray0);
      queueDatabase0.add((QueueTask) null);
      QueueTask queueTask0 = queueDatabase0.peek();
      assertNull(queueTask0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Exception[] exceptionArray0 = new Exception[7];
      MockThrowable mockThrowable0 = new MockThrowable("4x'q%,y;VEI6b%");
      MockException mockException0 = new MockException("4x'q%,y;VEI6b%", mockThrowable0);
      exceptionArray0[0] = (Exception) mockException0;
      exceptionArray0[1] = (Exception) mockException0;
      exceptionArray0[2] = (Exception) mockException0;
      exceptionArray0[3] = (Exception) mockException0;
      exceptionArray0[4] = (Exception) mockException0;
      exceptionArray0[5] = (Exception) mockException0;
      exceptionArray0[6] = (Exception) mockException0;
      QueueDatabase queueDatabase0 = new QueueDatabase(exceptionArray0);
      Order order0 = mock(Order.class, new ViolatedAssumptionAnswer());
      QueueTask.TaskType queueTask_TaskType0 = QueueTask.TaskType.EMPLOYEE_DB;
      QueueTask queueTask0 = new QueueTask(order0, queueTask_TaskType0, 1056);
      queueDatabase0.add(queueTask0);
      QueueTask queueTask1 = queueDatabase0.peek();
      assertSame(queueTask1, queueTask0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Exception[] exceptionArray0 = new Exception[7];
      MockThrowable mockThrowable0 = new MockThrowable("4x'q%,y;VEI6b%");
      MockException mockException0 = new MockException("4x'q%,y;VEI6b%", mockThrowable0);
      exceptionArray0[0] = (Exception) mockException0;
      exceptionArray0[1] = (Exception) mockException0;
      exceptionArray0[2] = (Exception) mockException0;
      exceptionArray0[3] = (Exception) mockException0;
      exceptionArray0[4] = (Exception) mockException0;
      exceptionArray0[5] = (Exception) mockException0;
      exceptionArray0[6] = (Exception) mockException0;
      QueueDatabase queueDatabase0 = new QueueDatabase(exceptionArray0);
      Order order0 = mock(Order.class, new ViolatedAssumptionAnswer());
      QueueTask.TaskType queueTask_TaskType0 = QueueTask.TaskType.EMPLOYEE_DB;
      QueueTask queueTask0 = new QueueTask(order0, queueTask_TaskType0, 1056);
      QueueTask queueTask1 = queueDatabase0.add(queueTask0);
      QueueTask queueTask2 = queueDatabase0.dequeue();
      assertSame(queueTask2, queueTask1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Exception[] exceptionArray0 = new Exception[9];
      QueueDatabase queueDatabase0 = null;
      try {
        queueDatabase0 = new QueueDatabase(exceptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Exception[] exceptionArray0 = new Exception[0];
      QueueDatabase queueDatabase0 = new QueueDatabase(exceptionArray0);
      queueDatabase0.add((QueueTask) null);
      QueueTask queueTask0 = queueDatabase0.dequeue();
      assertNull(queueTask0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Exception[] exceptionArray0 = new Exception[0];
      QueueDatabase queueDatabase0 = new QueueDatabase(exceptionArray0);
      try { 
        queueDatabase0.dequeue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.commander.queue.Queue", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Exception[] exceptionArray0 = new Exception[0];
      QueueDatabase queueDatabase0 = new QueueDatabase(exceptionArray0);
      try { 
        queueDatabase0.peek();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.iluwatar.commander.queue.Queue", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Exception[] exceptionArray0 = new Exception[0];
      QueueDatabase queueDatabase0 = new QueueDatabase(exceptionArray0);
      QueueTask queueTask0 = queueDatabase0.get("");
      assertNull(queueTask0);
  }
}