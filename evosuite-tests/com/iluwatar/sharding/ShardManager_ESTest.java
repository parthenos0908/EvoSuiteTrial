/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 12:49:32 GMT 2021
 */

package com.iluwatar.sharding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.sharding.Data;
import com.iluwatar.sharding.HashShardManager;
import com.iluwatar.sharding.LookupShardManager;
import com.iluwatar.sharding.RangeShardManager;
import com.iluwatar.sharding.Shard;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ShardManager_ESTest extends ShardManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Shard shard0 = new Shard(1);
      RangeShardManager rangeShardManager0 = new RangeShardManager();
      rangeShardManager0.addNewShard(shard0);
      Data.DataType data_DataType0 = Data.DataType.TYPE_1;
      Data data0 = new Data((-2439), "deY", data_DataType0);
      int int0 = rangeShardManager0.storeData(data0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LookupShardManager lookupShardManager0 = new LookupShardManager();
      Shard shard0 = new Shard(0);
      lookupShardManager0.addNewShard(shard0);
      Shard shard1 = lookupShardManager0.getShardById(0);
      assertSame(shard1, shard0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LookupShardManager lookupShardManager0 = new LookupShardManager();
      Shard shard0 = new Shard(1);
      lookupShardManager0.addNewShard(shard0);
      Shard shard1 = lookupShardManager0.getShardById(1);
      assertSame(shard1, shard0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LookupShardManager lookupShardManager0 = new LookupShardManager();
      Shard shard0 = new Shard((-2847));
      lookupShardManager0.addNewShard(shard0);
      Shard shard1 = lookupShardManager0.getShardById((-2847));
      assertSame(shard1, shard0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LookupShardManager lookupShardManager0 = new LookupShardManager();
      // Undeclared exception!
      try { 
        lookupShardManager0.storeData((Data) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.sharding.Data.getKey()\" because \"data\" is null
         //
         verifyException("com.iluwatar.sharding.LookupShardManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashShardManager hashShardManager0 = new HashShardManager();
      Data.DataType data_DataType0 = Data.DataType.TYPE_3;
      Data data0 = new Data((-1550), "", data_DataType0);
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

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashShardManager hashShardManager0 = new HashShardManager();
      hashShardManager0.shardMap = null;
      // Undeclared exception!
      try { 
        hashShardManager0.removeShardById((-1073741823));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LookupShardManager lookupShardManager0 = new LookupShardManager();
      lookupShardManager0.shardMap = null;
      // Undeclared exception!
      try { 
        lookupShardManager0.getShardById((-553));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.util.Map.get(Object)\" because \"this.shardMap\" is null
         //
         verifyException("com.iluwatar.sharding.ShardManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LookupShardManager lookupShardManager0 = new LookupShardManager();
      // Undeclared exception!
      try { 
        lookupShardManager0.addNewShard((Shard) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.sharding.Shard.getId()\" because \"shard\" is null
         //
         verifyException("com.iluwatar.sharding.ShardManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashShardManager hashShardManager0 = new HashShardManager();
      Shard shard0 = new Shard(965);
      boolean boolean0 = hashShardManager0.addNewShard(shard0);
      assertTrue(boolean0);
      
      boolean boolean1 = hashShardManager0.removeShardById(965);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashShardManager hashShardManager0 = new HashShardManager();
      boolean boolean0 = hashShardManager0.removeShardById(965);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashShardManager hashShardManager0 = new HashShardManager();
      Shard shard0 = new Shard(965);
      boolean boolean0 = hashShardManager0.addNewShard(shard0);
      assertTrue(boolean0);
      
      boolean boolean1 = hashShardManager0.addNewShard(shard0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LookupShardManager lookupShardManager0 = new LookupShardManager();
      Shard shard0 = lookupShardManager0.getShardById(0);
      assertNull(shard0);
  }
}
