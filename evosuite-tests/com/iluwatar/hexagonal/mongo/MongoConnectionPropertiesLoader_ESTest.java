/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 08:17:10 GMT 2021
 */

package com.iluwatar.hexagonal.mongo;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.hexagonal.mongo.MongoConnectionPropertiesLoader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MongoConnectionPropertiesLoader_ESTest extends MongoConnectionPropertiesLoader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MongoConnectionPropertiesLoader.load();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MongoConnectionPropertiesLoader mongoConnectionPropertiesLoader0 = new MongoConnectionPropertiesLoader();
  }
}