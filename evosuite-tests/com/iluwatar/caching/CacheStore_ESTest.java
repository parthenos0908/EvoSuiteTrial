/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:03:22 GMT 2021
 */

package com.iluwatar.caching;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.caching.CacheStore;
import com.iluwatar.caching.UserAccount;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CacheStore_ESTest extends CacheStore_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CacheStore.initCapacity(1);
      UserAccount userAccount0 = new UserAccount("", "", "");
      UserAccount userAccount1 = new UserAccount("", "", "$set");
      CacheStore.writeBehind(userAccount1);
      userAccount0.setUserId("$set");
      // Undeclared exception!
      try { 
        CacheStore.writeBehind(userAccount0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/bson/conversions/Bson
         //
         verifyException("com.iluwatar.caching.CacheStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CacheStore.initCapacity(0);
      CacheStore.invalidate("");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CacheStore.initCapacity(1887);
      UserAccount userAccount0 = CacheStore.get((String) null);
      assertNull(userAccount0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CacheStore.initCapacity(1862);
      UserAccount userAccount0 = new UserAccount("1", "1", "1");
      CacheStore.writeBehind(userAccount0);
      UserAccount userAccount1 = CacheStore.get("1");
      assertEquals("1, 1, 1", userAccount1.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        CacheStore.writeThrough((UserAccount) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.caching.UserAccount.getUserId()\" because \"userAccount\" is null
         //
         verifyException("com.iluwatar.caching.CacheStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        CacheStore.writeAround((UserAccount) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.caching.UserAccount.getUserId()\" because \"userAccount\" is null
         //
         verifyException("com.iluwatar.caching.CacheStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        CacheStore.readThroughWithWriteBackPolicy("@");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.caching.LruCache.contains(String)\" because \"com.iluwatar.caching.CacheStore.cache\" is null
         //
         verifyException("com.iluwatar.caching.CacheStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        CacheStore.readThrough("$q$Y");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.caching.LruCache.contains(String)\" because \"com.iluwatar.caching.CacheStore.cache\" is null
         //
         verifyException("com.iluwatar.caching.CacheStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CacheStore.initCapacity(1887);
      CacheStore.set("# Cach9 Hit!", (UserAccount) null);
      // Undeclared exception!
      try { 
        CacheStore.print();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.caching.UserAccount.toString()\" because \"userAccount\" is null
         //
         verifyException("com.iluwatar.caching.CacheStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CacheStore.initCapacity(1887);
      CacheStore.clearCache();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CacheStore.clearCache();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CacheStore.initCapacity(1);
      UserAccount userAccount0 = new UserAccount("", "", "");
      CacheStore.writeBehind(userAccount0);
      CacheStore.writeBehind(userAccount0);
      assertEquals("", userAccount0.getAdditionalInfo());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CacheStore.initCapacity(0);
      // Undeclared exception!
      try { 
        CacheStore.writeBehind((UserAccount) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.caching.UserAccount.getUserId()\" because \"userAccount\" is null
         //
         verifyException("com.iluwatar.caching.CacheStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CacheStore.initCapacity(1876);
      UserAccount userAccount0 = new UserAccount("@1", "@1", "@1");
      CacheStore.writeBehind(userAccount0);
      UserAccount userAccount1 = CacheStore.readThroughWithWriteBackPolicy("@1");
      assertEquals("@1", userAccount1.getUserName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CacheStore.initCapacity(1887);
      // Undeclared exception!
      try { 
        CacheStore.readThroughWithWriteBackPolicy("4{>#K@MnH<");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/bson/conversions/Bson
         //
         verifyException("com.iluwatar.caching.CacheStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CacheStore.initCapacity(3227);
      UserAccount userAccount0 = new UserAccount("# Cache Hit!", "H7ye[q{v7!iN)GFB{wN", "user_accoun/ts");
      CacheStore.writeBehind(userAccount0);
      // Undeclared exception!
      try { 
        CacheStore.writeAround(userAccount0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/bson/conversions/Bson
         //
         verifyException("com.iluwatar.caching.CacheStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CacheStore.initCapacity((-34));
      UserAccount userAccount0 = new UserAccount("lke k%=b/", "lke k%=b/", "lke k%=b/");
      // Undeclared exception!
      try { 
        CacheStore.writeAround(userAccount0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/bson/conversions/Bson
         //
         verifyException("com.iluwatar.caching.CacheStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CacheStore.initCapacity(759);
      UserAccount userAccount0 = new UserAccount("1", "1", "1");
      CacheStore.writeBehind(userAccount0);
      // Undeclared exception!
      try { 
        CacheStore.writeThrough(userAccount0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/bson/conversions/Bson
         //
         verifyException("com.iluwatar.caching.CacheStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CacheStore.initCapacity(1887);
      UserAccount userAccount0 = new UserAccount("# Cache Hit!", "# Cache Hit!", "# Cache Hit!");
      // Undeclared exception!
      try { 
        CacheStore.writeThrough(userAccount0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/bson/conversions/Bson
         //
         verifyException("com.iluwatar.caching.CacheStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CacheStore.initCapacity(10);
      UserAccount userAccount0 = new UserAccount("1", "1", "1");
      CacheStore.writeBehind(userAccount0);
      UserAccount userAccount1 = CacheStore.readThrough("1");
      assertEquals("1, 1, 1", userAccount1.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CacheStore.initCapacity(1913);
      // Undeclared exception!
      try { 
        CacheStore.readThrough("");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/bson/conversions/Bson
         //
         verifyException("com.iluwatar.caching.CacheStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CacheStore.initCapacity(1862);
      CacheStore.initCapacity(1862);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        CacheStore.flushCache();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/bson/conversions/Bson
         //
         verifyException("com.iluwatar.caching.CacheStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        CacheStore.set("# Cach9 Hit!", (UserAccount) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.caching.LruCache.set(String, com.iluwatar.caching.UserAccount)\" because \"com.iluwatar.caching.CacheStore.cache\" is null
         //
         verifyException("com.iluwatar.caching.CacheStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = CacheStore.print();
      assertEquals("\n--CACHE CONTENT--\n----\n", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        CacheStore.get("1");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.caching.LruCache.get(String)\" because \"com.iluwatar.caching.CacheStore.cache\" is null
         //
         verifyException("com.iluwatar.caching.CacheStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        CacheStore.invalidate("# Cache is FULL! Removing {} from cache...");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.caching.LruCache.invalidate(String)\" because \"com.iluwatar.caching.CacheStore.cache\" is null
         //
         verifyException("com.iluwatar.caching.CacheStore", e);
      }
  }
}