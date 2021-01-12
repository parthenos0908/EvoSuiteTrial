/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 08:57:43 GMT 2021
 */

package com.iluwatar.lazy.loading;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.lazy.loading.Heavy;
import com.iluwatar.lazy.loading.HolderNaive;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HolderNaive_ESTest extends HolderNaive_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HolderNaive holderNaive0 = new HolderNaive();
      Heavy heavy0 = holderNaive0.getHeavy();
      Heavy heavy1 = holderNaive0.getHeavy();
      assertSame(heavy1, heavy0);
  }
}