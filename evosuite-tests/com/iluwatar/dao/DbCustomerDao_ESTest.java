/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 04:12:30 GMT 2021
 */

package com.iluwatar.dao;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.dao.Customer;
import com.iluwatar.dao.DbCustomerDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;
import java.util.stream.Stream;
import javax.sql.DataSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DbCustomerDao_ESTest extends DbCustomerDao_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(preparedStatement0).executeUpdate();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn("h5").when(connection0).toString();
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      Customer customer0 = new Customer(0, "", "DELETE FROM CUSTOMERS WHERE ID = ?");
      boolean boolean0 = dbCustomerDao0.delete(customer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(preparedStatement0).executeUpdate();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn("Td;qDs{6").when(connection0).toString();
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      Customer customer0 = new Customer(0, "", "");
      boolean boolean0 = dbCustomerDao0.update(customer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSet0).getInt(anyString());
      doReturn((String) null, (String) null).when(resultSet0).getString(anyString());
      doReturn(true).when(resultSet0).next();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(preparedStatement0).executeQuery();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(connection0).toString();
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      Optional<Customer> optional0 = dbCustomerDao0.getById((-1122));
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(781).when(preparedStatement0).executeUpdate();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn("Us^yR?$SDf_}q|g\"8~n").when(connection0).toString();
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      Customer customer0 = new Customer(781, "Us^yR?$SDf_}q|g\"8~n", "Us^yR?$SDf_}q|g\"8~n");
      boolean boolean0 = dbCustomerDao0.delete(customer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn((-2270)).when(preparedStatement0).executeUpdate();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn("Us^yR?$SDf_}q|g\"8~n").when(connection0).toString();
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      Customer customer0 = new Customer((-2270), "Us^yR?$SDf_}q|g\"8~n", "Us^yR?$SDf_}q|g\"8~n");
      boolean boolean0 = dbCustomerDao0.delete(customer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn((Connection) null).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      Customer customer0 = new Customer(0, "", "");
      try { 
        dbCustomerDao0.delete(customer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"connection\" is null
         //
         verifyException("com.iluwatar.dao.DbCustomerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn("R4Lk!+p9Yl").when(connection0).toString();
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      try { 
        dbCustomerDao0.delete((Customer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.dao.Customer.getId()\" because \"customer\" is null
         //
         verifyException("com.iluwatar.dao.DbCustomerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(connection0).toString();
      doReturn((PreparedStatement) null).when(connection0).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      try { 
        dbCustomerDao0.delete((Customer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.dao.Customer.getId()\" because \"customer\" is null
         //
         verifyException("com.iluwatar.dao.DbCustomerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(781).when(preparedStatement0).executeUpdate();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn("Us^yR?$SDf_}q|g\"8~n").when(connection0).toString();
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      Customer customer0 = new Customer(781, "Us^yR?$SDf_}q|g\"8~n", "Us^yR?$SDf_}q|g\"8~n");
      boolean boolean0 = dbCustomerDao0.update(customer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn((-2270)).when(preparedStatement0).executeUpdate();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn("Us^yR?$SDf_}q|g\"8~n").when(connection0).toString();
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      Customer customer0 = new Customer((-2270), "Us^yR?$SDf_}q|g\"8~n", "Us^yR?$SDf_}q|g\"8~n");
      boolean boolean0 = dbCustomerDao0.update(customer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn((Connection) null).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      try { 
        dbCustomerDao0.update((Customer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"connection\" is null
         //
         verifyException("com.iluwatar.dao.DbCustomerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn("SELECT * FROM CUSTOMERS").when(connection0).toString();
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      try { 
        dbCustomerDao0.update((Customer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.dao.Customer.getFirstName()\" because \"customer\" is null
         //
         verifyException("com.iluwatar.dao.DbCustomerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(connection0).toString();
      doReturn((PreparedStatement) null).when(connection0).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      try { 
        dbCustomerDao0.update((Customer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.dao.Customer.getFirstName()\" because \"customer\" is null
         //
         verifyException("com.iluwatar.dao.DbCustomerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(resultSet0).next();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(preparedStatement0).executeQuery();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn("(Fx!{vzP~_t kAzMw").when(connection0).toString();
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0, (Connection) null).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      Customer customer0 = new Customer(0, "(Fx!{vzP~_t kAzMw", "(Fx!{vzP~_t kAzMw");
      try { 
        dbCustomerDao0.add(customer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"connection\" is null
         //
         verifyException("com.iluwatar.dao.DbCustomerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(resultSet0).next();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(preparedStatement0).executeQuery();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn("0z").when(connection0).toString();
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn("0z").when(connection1).toString();
      doReturn((PreparedStatement) null).when(connection1).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0, connection1).when(dataSource0).getConnection();
      Customer customer0 = new Customer((-719), "0z", "0z");
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      try { 
        dbCustomerDao0.add(customer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.sql.PreparedStatement.setInt(int, int)\" because \"statement\" is null
         //
         verifyException("com.iluwatar.dao.DbCustomerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(resultSet0).next();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(preparedStatement0).executeQuery();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(connection0).toString();
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0, (Connection) null).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      Customer customer0 = new Customer((-1122), (String) null, (String) null);
      try { 
        dbCustomerDao0.add(customer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"connection\" is null
         //
         verifyException("com.iluwatar.dao.DbCustomerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn((Connection) null).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      try { 
        dbCustomerDao0.getById((-116));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"connection\" is null
         //
         verifyException("com.iluwatar.dao.DbCustomerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSet) null).when(preparedStatement0).executeQuery();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn("").when(connection0).toString();
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      try { 
        dbCustomerDao0.getById(400);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.sql.ResultSet.next()\" because \"resultSet\" is null
         //
         verifyException("com.iluwatar.dao.DbCustomerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(connection0).toString();
      doReturn((PreparedStatement) null).when(connection0).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      try { 
        dbCustomerDao0.getById((-997));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.sql.PreparedStatement.setInt(int, int)\" because \"statement\" is null
         //
         verifyException("com.iluwatar.dao.DbCustomerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSet) null).when(preparedStatement0).executeQuery();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn("h5").when(connection0).toString();
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      Stream<Customer> stream0 = dbCustomerDao0.getAll();
      assertNotNull(stream0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao((DataSource) null);
      try { 
        dbCustomerDao0.getAll();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"javax.sql.DataSource.getConnection()\" because \"this.dataSource\" is null
         //
         verifyException("com.iluwatar.dao.DbCustomerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSet0).getInt(anyString());
      doReturn((String) null, (String) null).when(resultSet0).getString(anyString());
      doReturn(true).when(resultSet0).next();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(preparedStatement0).executeQuery();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn("").when(connection0).toString();
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      Customer customer0 = new Customer(400, "", "");
      boolean boolean0 = dbCustomerDao0.add(customer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(resultSet0).next();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(preparedStatement0).executeQuery();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(connection0).toString();
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn(connection0).when(dataSource0).getConnection();
      DbCustomerDao dbCustomerDao0 = new DbCustomerDao(dataSource0);
      Optional<Customer> optional0 = dbCustomerDao0.getById((-1122));
      assertNotNull(optional0);
  }
}