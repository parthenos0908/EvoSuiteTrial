/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 09:33:40 GMT 2021
 */

package com.iluwatar.masterworker.system.systemmaster;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.masterworker.Input;
import com.iluwatar.masterworker.Result;
import com.iluwatar.masterworker.system.systemmaster.ArrayTransposeMaster;
import com.iluwatar.masterworker.system.systemworkers.ArrayTransposeWorker;
import com.iluwatar.masterworker.system.systemworkers.Worker;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Master_ESTest extends Master_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayTransposeMaster arrayTransposeMaster0 = new ArrayTransposeMaster(1874);
      Input<Integer> input0 = (Input<Integer>) mock(Input.class, new ViolatedAssumptionAnswer());
      List<Input<Integer>> list0 = List.of(input0, input0, input0, input0, input0, input0, input0, input0, input0);
      Input<Integer> input1 = (Input<Integer>) mock(Input.class, new ViolatedAssumptionAnswer());
      doReturn(list0).when(input1).divideData(anyInt());
      arrayTransposeMaster0.doWork(input1);
      Result<Object> result0 = (Result<Object>) mock(Result.class, new ViolatedAssumptionAnswer());
      ArrayTransposeWorker arrayTransposeWorker0 = new ArrayTransposeWorker(arrayTransposeMaster0, (-79));
      arrayTransposeMaster0.receiveData(result0, arrayTransposeWorker0);
      assertEquals((-79), arrayTransposeWorker0.getWorkerId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayTransposeMaster arrayTransposeMaster0 = new ArrayTransposeMaster(0);
      List<Worker> list0 = arrayTransposeMaster0.getWorkers();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayTransposeMaster arrayTransposeMaster0 = new ArrayTransposeMaster(1874);
      LinkedList<Input<Integer>> linkedList0 = new LinkedList<Input<Integer>>();
      Input<Integer> input0 = (Input<Integer>) mock(Input.class, new ViolatedAssumptionAnswer());
      linkedList0.add(input0);
      Input<Integer> input1 = (Input<Integer>) mock(Input.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(input1).divideData(anyInt());
      arrayTransposeMaster0.doWork(input1);
      int int0 = arrayTransposeMaster0.getExpectedNumResults();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayTransposeMaster arrayTransposeMaster0 = new ArrayTransposeMaster(1900);
      Hashtable<Integer, Result<?>> hashtable0 = arrayTransposeMaster0.getAllResultData();
      assertTrue(hashtable0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayTransposeMaster arrayTransposeMaster0 = new ArrayTransposeMaster(0);
      Result<Integer> result0 = (Result<Integer>) mock(Result.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(result0).toString();
      ArrayTransposeWorker arrayTransposeWorker0 = new ArrayTransposeWorker(arrayTransposeMaster0, 0);
      arrayTransposeMaster0.receiveData(result0, arrayTransposeWorker0);
      Hashtable<Integer, Result<?>> hashtable0 = arrayTransposeMaster0.getAllResultData();
      assertEquals(1, hashtable0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayTransposeMaster arrayTransposeMaster0 = new ArrayTransposeMaster(2);
      ArrayTransposeWorker arrayTransposeWorker0 = new ArrayTransposeWorker(arrayTransposeMaster0, 2);
      // Undeclared exception!
      try { 
        arrayTransposeMaster0.receiveData((Result<?>) null, arrayTransposeWorker0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayTransposeMaster arrayTransposeMaster0 = new ArrayTransposeMaster(2);
      Input<String> input0 = (Input<String>) mock(Input.class, new ViolatedAssumptionAnswer());
      List<Input<String>> list0 = List.of(input0, input0, input0);
      Input<String> input1 = (Input<String>) mock(Input.class, new ViolatedAssumptionAnswer());
      doReturn(list0).when(input1).divideData(anyInt());
      // Undeclared exception!
      try { 
        arrayTransposeMaster0.doWork(input1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayTransposeMaster arrayTransposeMaster0 = new ArrayTransposeMaster(1874);
      LinkedList<Input<Integer>> linkedList0 = new LinkedList<Input<Integer>>();
      Input<Integer> input0 = (Input<Integer>) mock(Input.class, new ViolatedAssumptionAnswer());
      linkedList0.add(input0);
      Input<Integer> input1 = (Input<Integer>) mock(Input.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(input1).divideData(anyInt());
      arrayTransposeMaster0.doWork(input1);
      Result<Object> result0 = (Result<Object>) mock(Result.class, new ViolatedAssumptionAnswer());
      doReturn("").when(result0).toString();
      ArrayTransposeWorker arrayTransposeWorker0 = new ArrayTransposeWorker(arrayTransposeMaster0, (-79));
      // Undeclared exception!
      try { 
        arrayTransposeMaster0.receiveData(result0, arrayTransposeWorker0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class com.iluwatar.masterworker.Result$MockitoMock$1981982855 cannot be cast to class com.iluwatar.masterworker.ArrayResult (com.iluwatar.masterworker.Result$MockitoMock$1981982855 and com.iluwatar.masterworker.ArrayResult are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @346035d5)
         //
         verifyException("com.iluwatar.masterworker.system.systemmaster.ArrayTransposeMaster", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayTransposeMaster arrayTransposeMaster0 = new ArrayTransposeMaster(0);
      Result<?> result0 = arrayTransposeMaster0.getFinalResult();
      assertNull(result0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayTransposeMaster arrayTransposeMaster0 = new ArrayTransposeMaster(1874);
      Input<String> input0 = (Input<String>) mock(Input.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(input0).divideData(anyInt());
      arrayTransposeMaster0.doWork(input0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayTransposeMaster arrayTransposeMaster0 = new ArrayTransposeMaster(1874);
      List<Worker> list0 = arrayTransposeMaster0.getWorkers();
      assertEquals(1874, list0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayTransposeMaster arrayTransposeMaster0 = new ArrayTransposeMaster(1874);
      int int0 = arrayTransposeMaster0.getExpectedNumResults();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayTransposeMaster arrayTransposeMaster0 = new ArrayTransposeMaster(3580);
      // Undeclared exception!
      try { 
        arrayTransposeMaster0.doWork((Input<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.masterworker.Input.divideData(int)\" because \"input\" is null
         //
         verifyException("com.iluwatar.masterworker.system.systemmaster.Master", e);
      }
  }
}
