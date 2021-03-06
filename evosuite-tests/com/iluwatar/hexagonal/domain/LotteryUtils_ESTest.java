/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 08:14:37 GMT 2021
 */

package com.iluwatar.hexagonal.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.hexagonal.database.InMemoryTicketRepository;
import com.iluwatar.hexagonal.database.LotteryTicketRepository;
import com.iluwatar.hexagonal.domain.LotteryNumbers;
import com.iluwatar.hexagonal.domain.LotteryTicketCheckResult;
import com.iluwatar.hexagonal.domain.LotteryTicketId;
import com.iluwatar.hexagonal.domain.LotteryUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LotteryUtils_ESTest extends LotteryUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LotteryTicketId lotteryTicketId0 = new LotteryTicketId();
      // Undeclared exception!
      try { 
        LotteryUtils.checkTicketForPrize((LotteryTicketRepository) null, lotteryTicketId0, (LotteryNumbers) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.hexagonal.database.LotteryTicketRepository.findById(com.iluwatar.hexagonal.domain.LotteryTicketId)\" because \"repository\" is null
         //
         verifyException("com.iluwatar.hexagonal.domain.LotteryUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InMemoryTicketRepository inMemoryTicketRepository0 = new InMemoryTicketRepository();
      LotteryTicketId lotteryTicketId0 = new LotteryTicketId();
      LotteryTicketCheckResult lotteryTicketCheckResult0 = LotteryUtils.checkTicketForPrize(inMemoryTicketRepository0, lotteryTicketId0, (LotteryNumbers) null);
      assertEquals(0, lotteryTicketCheckResult0.getPrizeAmount());
  }
}
