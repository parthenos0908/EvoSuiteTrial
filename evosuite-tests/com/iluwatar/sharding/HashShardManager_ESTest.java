/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 12:46:04 GMT 2021
 */

package com.iluwatar.sharding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.sharding.Data;
import com.iluwatar.sharding.HashShardManager;
import com.iluwatar.sharding.Shard;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HashShardManager_ESTest extends HashShardManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashShardManager hashShardManager0 = new HashShardManager();
      Shard shard0 = new Shard(960);
      hashShardManager0.addNewShard(shard0);
      Shard shard1 = new Shard(1);
      hashShardManager0.addNewShard(shard1);
      Data.DataType data_DataType0 = Data.DataType.TYPE_2;
      Data data0 = new Data(1, "", data_DataType0);
      int int0 = hashShardManager0.storeData(data0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashShardManager hashShardManager0 = new HashShardManager();
      Shard shard0 = new Shard(1);
      hashShardManager0.addNewShard(shard0);
      Data.DataType data_DataType0 = Data.DataType.TYPE_2;
      Data data0 = new Data(1, "", data_DataType0);
      int int0 = hashShardManager0.storeData(data0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashShardManager hashShardManager0 = new HashShardManager();
      Shard shard0 = new Shard(1);
      hashShardManager0.addNewShard(shard0);
      Data.DataType data_DataType0 = Data.DataType.TYPE_2;
      Shard shard1 = new Shard((-1));
      Data data0 = new Data((-1), "#5i=&(j]N$Uz", data_DataType0);
      hashShardManager0.addNewShard(shard1);
      int int0 = hashShardManager0.storeData(data0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashShardManager hashShardManager0 = new HashShardManager();
      Data.DataType data_DataType0 = Data.DataType.TYPE_3;
      Shard shard0 = new Shard(1700);
      hashShardManager0.addNewShard(shard0);
      Data data0 = new Data(2433, (String) null, data_DataType0);
      int int0 = hashShardManager0.allocateShard(data0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashShardManager hashShardManager0 = new HashShardManager();
      // Undeclared exception!
      try { 
        hashShardManager0.allocateShard((Data) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.sharding.Data.getKey()\" because \"data\" is null
         //
         verifyException("com.iluwatar.sharding.HashShardManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HashShardManager hashShardManager0 = new HashShardManager();
      Data.DataType data_DataType0 = Data.DataType.TYPE_2;
      Data data0 = new Data(1707, "", data_DataType0);
      // Undeclared exception!
      try { 
        hashShardManager0.allocateShard(data0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("com.iluwatar.sharding.HashShardManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HashShardManager hashShardManager0 = new HashShardManager();
      Shard shard0 = new Shard((-1012));
      hashShardManager0.addNewShard(shard0);
      Data.DataType data_DataType0 = Data.DataType.TYPE_2;
      Data data0 = new Data(2433, "", data_DataType0);
      // Undeclared exception!
      try { 
        hashShardManager0.storeData(data0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.sharding.Shard.storeData(com.iluwatar.sharding.Data)\" because \"shard\" is null
         //
         verifyException("com.iluwatar.sharding.HashShardManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HashShardManager hashShardManager0 = new HashShardManager();
      Shard shard0 = new Shard(1);
      hashShardManager0.addNewShard(shard0);
      Data.DataType data_DataType0 = Data.DataType.TYPE_2;
      Shard shard1 = new Shard((-1));
      Data data0 = new Data((-1), "#5i=&(j]N$Uz", data_DataType0);
      hashShardManager0.addNewShard(shard1);
      int int0 = hashShardManager0.allocateShard(data0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      HashShardManager hashShardManager0 = new HashShardManager();
      Data.DataType data_DataType0 = Data.DataType.TYPE_2;
      Data data0 = new Data((-1), "#5i=&(j]N$Uz", data_DataType0);
      // Undeclared exception!
      try { 
        hashShardManager0.storeData(data0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("com.iluwatar.sharding.HashShardManager", e);
      }
  }
}
