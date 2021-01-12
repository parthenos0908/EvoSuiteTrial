/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 09:34:47 GMT 2021
 */

package com.iluwatar.masterworker.system.systemworkers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.masterworker.Input;
import com.iluwatar.masterworker.system.systemmaster.ArrayTransposeMaster;
import com.iluwatar.masterworker.system.systemworkers.ArrayTransposeWorker;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ArrayTransposeWorker_ESTest extends ArrayTransposeWorker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayTransposeMaster arrayTransposeMaster0 = new ArrayTransposeMaster(0);
      ArrayTransposeWorker arrayTransposeWorker0 = new ArrayTransposeWorker(arrayTransposeMaster0, 0);
      Input<Integer> input0 = (Input<Integer>) mock(Input.class, new ViolatedAssumptionAnswer());
      arrayTransposeWorker0.setReceivedData(arrayTransposeMaster0, input0);
      // Undeclared exception!
      try { 
        arrayTransposeWorker0.executeOperation();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class com.iluwatar.masterworker.Input$MockitoMock$1567244427 cannot be cast to class com.iluwatar.masterworker.ArrayInput (com.iluwatar.masterworker.Input$MockitoMock$1567244427 and com.iluwatar.masterworker.ArrayInput are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @493b940c)
         //
         verifyException("com.iluwatar.masterworker.system.systemworkers.ArrayTransposeWorker", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayTransposeMaster arrayTransposeMaster0 = new ArrayTransposeMaster(1);
      ArrayTransposeWorker arrayTransposeWorker0 = new ArrayTransposeWorker(arrayTransposeMaster0, 1);
      // Undeclared exception!
      try { 
        arrayTransposeWorker0.executeOperation();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot read field \"data\" because \"arrayInput\" is null
         //
         verifyException("com.iluwatar.masterworker.system.systemworkers.ArrayTransposeWorker", e);
      }
  }
}
