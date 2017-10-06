/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.debugger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import net.virtualinfinity.atrobots.computer.Computer;
import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Memory;
import net.virtualinfinity.atrobots.debugger.Console;
import net.virtualinfinity.atrobots.debugger.DebugConsole;
import net.virtualinfinity.atrobots.debugger.Debugger;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DebugConsoleEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DebugConsole debugConsole0 = DebugConsole.create((Console) null);
      // Undeclared exception!
      try {
        debugConsole0.readline();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      DebugConsole debugConsole0 = DebugConsole.create((Console) null);
      Debugger debugger0 = debugConsole0.getDebugger();
      assertEquals(false, debugger0.hasDefaultEntrant());
  }

  @Test
  public void test2()  throws Throwable  {
      DebugConsole debugConsole0 = DebugConsole.create((Console) null);
      // Undeclared exception!
      try {
        debugConsole0.println((Computer) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      DebugConsole debugConsole0 = DebugConsole.create((Console) null);
      Memory memory0 = new Memory();
      DebugInfo debugInfo0 = new DebugInfo();
      Computer computer0 = new Computer(memory0, 1398, 1398, debugInfo0);
      // Undeclared exception!
      try {
        debugConsole0.println(computer0, computer0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}