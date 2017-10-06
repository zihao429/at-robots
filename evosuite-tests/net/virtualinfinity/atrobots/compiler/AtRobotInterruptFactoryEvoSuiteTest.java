/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.compiler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Map;
import net.virtualinfinity.atrobots.arena.Arena;
import net.virtualinfinity.atrobots.arena.FrameBuilder;
import net.virtualinfinity.atrobots.arena.RoundState;
import net.virtualinfinity.atrobots.compiler.AtRobotInterruptFactory;
import net.virtualinfinity.atrobots.computer.Computer;
import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.InterruptHandler;
import net.virtualinfinity.atrobots.computer.Memory;
import net.virtualinfinity.atrobots.game.StandardRoundState;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.robot.RobotScore;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AtRobotInterruptFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AtRobotInterruptFactory atRobotInterruptFactory0 = new AtRobotInterruptFactory();
      Robot robot0 = new Robot("^:<qg+", 0, (RobotScore) null);
      Memory memory0 = new Memory();
      DebugInfo debugInfo0 = new DebugInfo();
      Computer computer0 = new Computer(memory0, 0, 0, debugInfo0);
      robot0.setComputer(computer0);
      FrameBuilder frameBuilder0 = new FrameBuilder();
      Arena arena0 = new Arena(frameBuilder0);
      StandardRoundState standardRoundState0 = new StandardRoundState(263, 0);
      Map<Integer, InterruptHandler> map0 = atRobotInterruptFactory0.createInterruptTable(robot0, arena0, (RoundState) standardRoundState0);
      assertNotNull(map0);
      assertEquals(20, map0.size());
  }
}