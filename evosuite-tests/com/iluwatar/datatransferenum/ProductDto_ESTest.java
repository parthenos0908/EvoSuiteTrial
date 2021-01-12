/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 04:28:30 GMT 2021
 */

package com.iluwatar.datatransferenum;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.datatransferenum.ProductDto;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ProductDto_ESTest extends ProductDto_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Double double0 = new Double((-1851.0));
      ProductDto.Response.Private productDto_Response_Private0 = new ProductDto.Response.Private();
      ProductDto.Response.Private productDto_Response_Private1 = productDto_Response_Private0.setPrice(double0);
      assertNull(productDto_Response_Private1.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ProductDto.Response.Private productDto_Response_Private0 = new ProductDto.Response.Private();
      ProductDto.Response.Private productDto_Response_Private1 = productDto_Response_Private0.setName("com.iluwatar.datatransferenum.ProductDto$Response");
      assertNull(productDto_Response_Private1.getCost());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ProductDto.Response.Private productDto_Response_Private0 = new ProductDto.Response.Private();
      String string0 = productDto_Response_Private0.toString();
      assertEquals("Private{id=null, name='null', price=null, cost=null}", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ProductDto.Response.Private productDto_Response_Private0 = new ProductDto.Response.Private();
      Double double0 = productDto_Response_Private0.getCost();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ProductDto.Response.Private productDto_Response_Private0 = new ProductDto.Response.Private();
      Long long0 = new Long((-494L));
      ProductDto.Response.Private productDto_Response_Private1 = productDto_Response_Private0.setId(long0);
      assertEquals("Private{id=-494, name='null', price=null, cost=null}", productDto_Response_Private1.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ProductDto.Response.Private productDto_Response_Private0 = new ProductDto.Response.Private();
      ProductDto.Response.Private productDto_Response_Private1 = productDto_Response_Private0.setCost((Double) null);
      assertNull(productDto_Response_Private1.getPrice());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ProductDto.Response.Private productDto_Response_Private0 = new ProductDto.Response.Private();
      Double double0 = productDto_Response_Private0.getPrice();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ProductDto.Response.Private productDto_Response_Private0 = new ProductDto.Response.Private();
      String string0 = productDto_Response_Private0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ProductDto.Response.Private productDto_Response_Private0 = new ProductDto.Response.Private();
      Long long0 = productDto_Response_Private0.getId();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ProductDto.Response.Public productDto_Response_Public0 = new ProductDto.Response.Public();
      String string0 = productDto_Response_Public0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ProductDto.Response.Public productDto_Response_Public0 = new ProductDto.Response.Public();
      Long long0 = new Long(0L);
      ProductDto.Response.Public productDto_Response_Public1 = productDto_Response_Public0.setId(long0);
      assertNull(productDto_Response_Public1.getPrice());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ProductDto.Response.Public productDto_Response_Public0 = new ProductDto.Response.Public();
      String string0 = productDto_Response_Public0.toString();
      assertEquals("Public{id=null, name='null', price=null}", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ProductDto.Response.Public productDto_Response_Public0 = new ProductDto.Response.Public();
      Long long0 = productDto_Response_Public0.getId();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ProductDto.Response.Public productDto_Response_Public0 = new ProductDto.Response.Public();
      ProductDto.Response.Public productDto_Response_Public1 = productDto_Response_Public0.setName("com.iluwatar.datatransferenum.ProductDto$Request");
      assertNull(productDto_Response_Public1.getId());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ProductDto.Response.Public productDto_Response_Public0 = new ProductDto.Response.Public();
      Double double0 = new Double((-1851.0));
      ProductDto.Response.Public productDto_Response_Public1 = productDto_Response_Public0.setPrice(double0);
      assertEquals((-1851.0), productDto_Response_Public1.getPrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ProductDto.Response.Public productDto_Response_Public0 = new ProductDto.Response.Public();
      Double double0 = productDto_Response_Public0.getPrice();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ProductDto.Request.Create productDto_Request_Create0 = new ProductDto.Request.Create();
      Double double0 = productDto_Request_Create0.getPrice();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ProductDto.Request.Create productDto_Request_Create0 = new ProductDto.Request.Create();
      Double double0 = productDto_Request_Create0.getCost();
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ProductDto.Request.Create productDto_Request_Create0 = new ProductDto.Request.Create();
      Double double0 = new Double((-1028.58));
      ProductDto.Request.Create productDto_Request_Create1 = productDto_Request_Create0.setCost(double0);
      assertEquals((-1028.58), productDto_Request_Create1.getCost(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ProductDto.Request.Create productDto_Request_Create0 = new ProductDto.Request.Create();
      String string0 = productDto_Request_Create0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ProductDto.Request.Create productDto_Request_Create0 = new ProductDto.Request.Create();
      Double double0 = new Double(0.0);
      ProductDto.Request.Create productDto_Request_Create1 = productDto_Request_Create0.setPrice(double0);
      assertEquals(0.0, productDto_Request_Create1.getPrice(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ProductDto.Request.Create productDto_Request_Create0 = new ProductDto.Request.Create();
      ProductDto.Request.Create productDto_Request_Create1 = productDto_Request_Create0.setName("]GT'0C");
      assertSame(productDto_Request_Create0, productDto_Request_Create1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ProductDto.Request.Create productDto_Request_Create0 = new ProductDto.Request.Create();
      String string0 = productDto_Request_Create0.getSupplier();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ProductDto.Request.Create productDto_Request_Create0 = new ProductDto.Request.Create();
      ProductDto.Request.Create productDto_Request_Create1 = productDto_Request_Create0.setSupplier("]GT'0C");
      assertNull(productDto_Request_Create1.getName());
  }
}
