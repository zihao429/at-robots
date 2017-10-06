/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.computer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.arena.Arena;
import net.virtualinfinity.atrobots.computer.AtRobotsCommunicationsQueue;
import net.virtualinfinity.atrobots.computer.Computer;
import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Memory;
import net.virtualinfinity.atrobots.computer.MemoryCell;
import net.virtualinfinity.atrobots.computer.MemoryRegion;
import net.virtualinfinity.atrobots.hardware.transponder.Transponder;
import net.virtualinfinity.atrobots.interrupts.GetGameInfoInterrupt;
import net.virtualinfinity.atrobots.interrupts.GetIdInterrupt;
import net.virtualinfinity.atrobots.interrupts.GetQueueSizeInterrupt;
import net.virtualinfinity.atrobots.ports.CycleSource;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class InterruptHandlerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Memory memory0 = new Memory();
      DebugInfo debugInfo0 = new DebugInfo();
      Computer computer0 = new Computer(memory0, 0, 0, debugInfo0);
      MemoryCell memoryCell0 = memory0.getCell(0);
      AtRobotsCommunicationsQueue atRobotsCommunicationsQueue0 = new AtRobotsCommunicationsQueue((MemoryRegion) null, memoryCell0, (MemoryCell) null);
      GetQueueSizeInterrupt getQueueSizeInterrupt0 = new GetQueueSizeInterrupt(atRobotsCommunicationsQueue0, (MemoryCell) null);
      getQueueSizeInterrupt0.setCycleSource((CycleSource) computer0);
      assertEquals(false, computer0.isShutDown());
  }

  @Test
  public void test1()  throws Throwable  {
      Memory memory0 = new Memory();
      MemoryCell memoryCell0 = memory0.getCell(0);
      GetIdInterrupt getIdInterrupt0 = new GetIdInterrupt((Transponder) null, memoryCell0);
      // Undeclared exception!
      try {
        getIdInterrupt0.call();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Memory memory0 = new Memory();
      MemoryCell memoryCell0 = memory0.getCell(0);
      GetGameInfoInterrupt getGameInfoInterrupt0 = new GetGameInfoInterrupt((MemoryCell) null, memoryCell0, memoryCell0, 0, (-293), (Arena) null);
      GetGameInfoInterrupt getGameInfoInterrupt1 = (GetGameInfoInterrupt)getGameInfoInterrupt0.costs(0);
      assertSame(getGameInfoInterrupt1, getGameInfoInterrupt0);
  }
}