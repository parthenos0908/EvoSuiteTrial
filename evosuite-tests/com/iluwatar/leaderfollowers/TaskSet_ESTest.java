/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 09:18:21 GMT 2021
 */

package com.iluwatar.leaderfollowers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.leaderfollowers.Task;
import com.iluwatar.leaderfollowers.TaskSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TaskSet_ESTest extends TaskSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TaskSet taskSet0 = new TaskSet();
      taskSet0.getSize();
      taskSet0.getSize();
      Task task0 = new Task(2033);
      task0.setFinished();
      task0.setFinished();
      task0.setFinished();
      taskSet0.getSize();
      taskSet0.addTask(task0);
      task0.setFinished();
      taskSet0.addTask(task0);
      taskSet0.getSize();
      task0.setFinished();
      taskSet0.addTask(task0);
      // Undeclared exception!
      try { 
        taskSet0.addTask((Task) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TaskSet taskSet0 = new TaskSet();
      Task task0 = new Task((-1605));
      task0.setFinished();
      taskSet0.addTask(task0);
      taskSet0.getSize();
      Task task1 = taskSet0.getTask();
      task1.setFinished();
      taskSet0.addTask(task1);
      Task task2 = taskSet0.getTask();
      taskSet0.addTask(task2);
      task2.setFinished();
      Task task3 = taskSet0.getTask();
      task3.setFinished();
      task2.setFinished();
      task3.setFinished();
      taskSet0.getSize();
      task3.setFinished();
      task3.setFinished();
      taskSet0.addTask(task3);
      taskSet0.addTask(task0);
      taskSet0.getSize();
      taskSet0.getSize();
      taskSet0.getSize();
      taskSet0.addTask(task2);
      taskSet0.getSize();
      taskSet0.getSize();
      taskSet0.getSize();
      taskSet0.addTask(task0);
      taskSet0.getSize();
      taskSet0.addTask(task2);
      taskSet0.addTask(task3);
      taskSet0.getTask();
      taskSet0.getSize();
      Task task4 = new Task(112);
      taskSet0.addTask(task4);
      assertEquals(112, task4.getTime());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TaskSet taskSet0 = new TaskSet();
      Task task0 = new Task(28);
      task0.setFinished();
      task0.setFinished();
      taskSet0.getSize();
      taskSet0.addTask(task0);
      taskSet0.addTask(task0);
      taskSet0.getSize();
      task0.setFinished();
      taskSet0.getTask();
      task0.setFinished();
      Task task1 = taskSet0.getTask();
      task0.setFinished();
      taskSet0.addTask(task0);
      taskSet0.addTask(task0);
      taskSet0.addTask(task0);
      taskSet0.addTask(task0);
      taskSet0.getTask();
      int int0 = taskSet0.getSize();
      taskSet0.addTask(task1);
      int int1 = taskSet0.getSize();
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TaskSet taskSet0 = new TaskSet();
      Task task0 = null;
      taskSet0.getSize();
      // Undeclared exception!
      try { 
        taskSet0.addTask((Task) null);
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
      TaskSet taskSet0 = new TaskSet();
      taskSet0.getSize();
      taskSet0.getSize();
      taskSet0.getSize();
      Task task0 = new Task(0);
      taskSet0.addTask(task0);
      taskSet0.addTask(task0);
      assertEquals(0, task0.getTime());
  }
}
