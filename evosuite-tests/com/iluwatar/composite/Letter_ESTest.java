/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:52:41 GMT 2021
 */

package com.iluwatar.composite;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.composite.Letter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Letter_ESTest extends Letter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Letter letter0 = new Letter('P');
      letter0.printThisBefore();
      assertEquals(0, letter0.count());
  }
}