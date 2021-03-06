/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 04:40:08 GMT 2021
 */

package com.iluwatar.dirtyflag;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.dirtyflag.DataFetcher;
import java.io.UncheckedIOException;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DataFetcher_ESTest extends DataFetcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("C:\\Users\\disto\\gitrepos\\java-design-patterns\\dirty-flag\\target\\classes\\world.txt");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "4Ft");
      DataFetcher dataFetcher0 = new DataFetcher();
      // Undeclared exception!
      try { 
        dataFetcher0.fetch();
        fail("Expecting exception: UncheckedIOException");
      
      } catch(UncheckedIOException e) {
         //
         // java.io.IOException: Simulated IOException
         //
         verifyException("java.io.BufferedReader$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DataFetcher dataFetcher0 = new DataFetcher();
      dataFetcher0.fetch();
      List<String> list0 = dataFetcher0.fetch();
      assertTrue(list0.isEmpty());
  }
}
