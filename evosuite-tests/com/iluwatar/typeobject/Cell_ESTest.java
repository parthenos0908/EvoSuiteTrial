/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:56:21 GMT 2021
 */

package com.iluwatar.typeobject;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.typeobject.Candy;
import com.iluwatar.typeobject.Cell;
import com.iluwatar.typeobject.CellPool;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Cell_ESTest extends Cell_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Candy.Type candy_Type0 = Candy.Type.CRUSHABLE_CANDY;
      Candy candy0 = new Candy("orange gum", "IeGM\"#dM#'\"j", candy_Type0, 1488);
      Cell cell0 = new Cell(candy0, (-36), 0);
      Cell cell1 = new Cell(candy0, 1, (-1961));
      // Undeclared exception!
      try { 
        cell0.interact(cell1, (CellPool) null, (Cell[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.typeobject.CellPool.addNewCell(com.iluwatar.typeobject.Cell)\" because \"pool\" is null
         //
         verifyException("com.iluwatar.typeobject.Cell", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Cell cell0 = new Cell();
      Cell[][] cellArray0 = new Cell[2][4];
      Cell[] cellArray1 = new Cell[5];
      cellArray1[2] = cell0;
      cellArray1[2].positionY = 1;
      // Undeclared exception!
      try { 
        cell0.fillThisSpace((CellPool) null, cellArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot assign field \"positionY\" because \"cellMatrix[...][...]\" is null
         //
         verifyException("com.iluwatar.typeobject.Cell", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Candy.Type candy_Type0 = Candy.Type.REWARD_FRUIT;
      Candy candy0 = new Candy("F>qb", "F>qb", candy_Type0, 0);
      Cell cell0 = new Cell(candy0, 0, (-756));
      Cell[][] cellArray0 = new Cell[3][5];
      // Undeclared exception!
      try { 
        cell0.fillThisSpace((CellPool) null, cellArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.typeobject.CellPool.getNewCell()\" because \"pool\" is null
         //
         verifyException("com.iluwatar.typeobject.Cell", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Candy.Type candy_Type0 = Candy.Type.CRUSHABLE_CANDY;
      Candy candy0 = new Candy("", "", candy_Type0, 2838);
      Cell cell0 = new Cell(candy0, (-1), 657);
      // Undeclared exception!
      try { 
        cell0.crush((CellPool) null, (Cell[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.typeobject.CellPool.addNewCell(com.iluwatar.typeobject.Cell)\" because \"pool\" is null
         //
         verifyException("com.iluwatar.typeobject.Cell", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Candy.Type candy_Type0 = Candy.Type.CRUSHABLE_CANDY;
      Candy candy0 = new Candy("n", "n", candy_Type0, 2);
      Cell cell0 = new Cell(candy0, 2, 2);
      Candy candy1 = new Candy("m", "n", candy_Type0, 2);
      Cell cell1 = new Cell(candy1, 2, 2);
      int int0 = cell1.interact(cell0, (CellPool) null, (Cell[][]) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Candy.Type candy_Type0 = Candy.Type.CRUSHABLE_CANDY;
      Candy candy0 = new Candy("n", "n", candy_Type0, 657);
      Cell cell0 = new Cell(candy0, 657, 657);
      Candy.Type candy_Type1 = Candy.Type.REWARD_FRUIT;
      Candy candy1 = new Candy("m", "n", candy_Type1, 657);
      Cell cell1 = new Cell(candy1, 657, 657);
      int int0 = cell0.interact(cell1, (CellPool) null, (Cell[][]) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Candy.Type candy_Type0 = Candy.Type.REWARD_FRUIT;
      Candy candy0 = new Candy("", "", candy_Type0, 0);
      Cell cell0 = new Cell(candy0, 0, 0);
      int int0 = cell0.interact(cell0, (CellPool) null, (Cell[][]) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Candy.Type candy_Type0 = Candy.Type.REWARD_FRUIT;
      Candy candy0 = new Candy("F>qb", ";>-[", candy_Type0, 0);
      Cell cell0 = new Cell(candy0, 0, (-756));
      Cell cell1 = new Cell(candy0, (-756), 210);
      Cell[][] cellArray0 = new Cell[8][9];
      // Undeclared exception!
      try { 
        cell0.handleCrush(cell1, (CellPool) null, cellArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.typeobject.CellPool.addNewCell(com.iluwatar.typeobject.Cell)\" because \"pool\" is null
         //
         verifyException("com.iluwatar.typeobject.Cell", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Candy.Type candy_Type0 = Candy.Type.CRUSHABLE_CANDY;
      Candy candy0 = new Candy("W>", "W>", candy_Type0, 0);
      Cell cell0 = new Cell(candy0, 0, 0);
      // Undeclared exception!
      try { 
        cell0.interact(cell0, (CellPool) null, (Cell[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.typeobject.CellPool.addNewCell(com.iluwatar.typeobject.Cell)\" because \"pool\" is null
         //
         verifyException("com.iluwatar.typeobject.Cell", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Cell cell0 = new Cell();
      cell0.positionY = 11;
      Cell[][] cellArray0 = new Cell[11][9];
      // Undeclared exception!
      try { 
        cell0.fillThisSpace((CellPool) null, cellArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 11 out of bounds for length 11
         //
         verifyException("com.iluwatar.typeobject.Cell", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Candy.Type candy_Type0 = Candy.Type.CRUSHABLE_CANDY;
      Candy candy0 = new Candy("n", "n", candy_Type0, 2);
      Cell cell0 = new Cell(candy0, 2, 2);
      Cell[][] cellArray0 = new Cell[5][2];
      Cell[] cellArray1 = new Cell[6];
      cellArray1[2] = cell0;
      cellArray0[0] = cellArray1;
      cellArray0[1] = cellArray1;
      cellArray0[2] = cellArray0[0];
      // Undeclared exception!
      try { 
        cell0.fillThisSpace((CellPool) null, cellArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.typeobject.CellPool.getNewCell()\" because \"pool\" is null
         //
         verifyException("com.iluwatar.typeobject.Cell", e);
      }
  }
}