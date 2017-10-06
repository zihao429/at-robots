/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.measures;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.measures.RelativeAngle;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RelativeAngleEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RelativeAngle relativeAngle0 = RelativeAngle.HALF_CIRCLE;
      double double0 = relativeAngle0.dividedBy(relativeAngle0);
      assertEquals(1.0, double0, 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      RelativeAngle relativeAngle0 = RelativeAngle.fromRadians((double) 839);
      byte byte0 = relativeAngle0.getSignedBygrees();
      assertEquals((byte) (-120), byte0);
      assertEquals(136, relativeAngle0.getBygrees());
  }

  @Test
  public void test2()  throws Throwable  {
      RelativeAngle relativeAngle0 = RelativeAngle.HALF_CIRCLE;
      int int0 = relativeAngle0.compareTo(relativeAngle0);
      assertEquals(0, int0);
      assertEquals("3.141592653589793r/128", relativeAngle0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      RelativeAngle relativeAngle0 = RelativeAngle.FULL_CIRCLE;
      RelativeAngle relativeAngle1 = relativeAngle0.times((-15.62171829661489));
      assertNotNull(relativeAngle1);
      
      double double0 = relativeAngle1.getDegrees();
      assertEquals((-5623.818586781361), double0, 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      RelativeAngle relativeAngle0 = RelativeAngle.fromBygrees((-30));
      assertNotNull(relativeAngle0);
      assertEquals(226, relativeAngle0.getBygrees());
  }

  @Test
  public void test5()  throws Throwable  {
      RelativeAngle relativeAngle0 = RelativeAngle.fromBygrees((-1303));
      assertNotNull(relativeAngle0);
      assertEquals((-74656.40070554627), relativeAngle0.getDegrees(), 0.01D);
      assertEquals(-23, relativeAngle0.getSignedBygrees());
      assertEquals("-31.980431465839846r/-1303", relativeAngle0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      RelativeAngle relativeAngle0 = RelativeAngle.FULL_CIRCLE;
      String string0 = relativeAngle0.toString();
      assertNotNull(string0);
      assertEquals("6.283185307179586r/256", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      RelativeAngle relativeAngle0 = RelativeAngle.FULL_CIRCLE;
      RelativeAngle relativeAngle1 = relativeAngle0.times((-15.62171829661489));
      RelativeAngle relativeAngle2 = relativeAngle1.normalize();
      assertNotNull(relativeAngle2);
      assertEquals(136.18141321863934, relativeAngle2.getDegrees(), 0.01D);
      assertEquals(97, relativeAngle1.getBygrees());
  }

  @Test
  public void test8()  throws Throwable  {
      RelativeAngle relativeAngle0 = RelativeAngle.fromBygrees(19);
      assertNotNull(relativeAngle0);
      
      RelativeAngle relativeAngle1 = relativeAngle0.plus(relativeAngle0);
      assertNotNull(relativeAngle1);
      assertEquals(38, relativeAngle1.getSignedBygrees());
      assertEquals(26.718749999999996, relativeAngle0.getDegrees(), 0.01D);
  }

  @Test
  public void test9()  throws Throwable  {
      RelativeAngle relativeAngle0 = RelativeAngle.fromBygrees(19);
      assertNotNull(relativeAngle0);
      
      RelativeAngle relativeAngle1 = relativeAngle0.dividedBy((double) 19);
      assertNotNull(relativeAngle1);
      
      boolean boolean0 = relativeAngle1.isExactBygrees();
      assertEquals(false, boolean0);
      assertEquals(26.718749999999996, relativeAngle0.getDegrees(), 0.01D);
      assertEquals(1.40625, relativeAngle1.getDegrees(), 0.01D);
  }

  @Test
  public void test10()  throws Throwable  {
      RelativeAngle relativeAngle0 = RelativeAngle.fromBygrees(19);
      assertNotNull(relativeAngle0);
      
      RelativeAngle relativeAngle1 = relativeAngle0.dividedBy((double) 19);
      RelativeAngle relativeAngle2 = relativeAngle1.times(19);
      assertNotNull(relativeAngle2);
      assertEquals(1, relativeAngle1.getBygrees());
      assertEquals(19, relativeAngle2.getSignedBygrees());
      assertEquals(26.718749999999996, relativeAngle0.getDegrees(), 0.01D);
  }

  @Test
  public void test11()  throws Throwable  {
      RelativeAngle relativeAngle0 = RelativeAngle.HALF_CIRCLE;
      boolean boolean0 = relativeAngle0.isExactBygrees();
      assertEquals(true, boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      RelativeAngle relativeAngle0 = RelativeAngle.FULL_CIRCLE;
      RelativeAngle relativeAngle1 = relativeAngle0.normalize();
      assertNotNull(relativeAngle1);
      assertEquals(0.0, relativeAngle1.getDegrees(), 0.01D);
  }

  @Test
  public void test13()  throws Throwable  {
      RelativeAngle relativeAngle0 = RelativeAngle.fromBygrees(19);
      assertNotNull(relativeAngle0);
      
      RelativeAngle relativeAngle1 = relativeAngle0.times(19);
      assertEquals(105, relativeAngle1.getSignedBygrees());
      assertEquals("8.860273030827463r/361", relativeAngle1.toString());
      assertEquals(20683.776404222717, relativeAngle1.getDegrees(), 0.01D);
      assertNotNull(relativeAngle1);
      assertEquals(26.718749999999996, relativeAngle0.getDegrees(), 0.01D);
  }

  @Test
  public void test14()  throws Throwable  {
      RelativeAngle relativeAngle0 = RelativeAngle.fromBygrees(19);
      assertNotNull(relativeAngle0);
      
      double double0 = relativeAngle0.getDegrees();
      assertEquals(26.718749999999996, double0, 0.01D);
  }

  @Test
  public void test15()  throws Throwable  {
      RelativeAngle relativeAngle0 = RelativeAngle.FULL_CIRCLE;
      byte byte0 = relativeAngle0.getSignedBygrees();
      assertEquals((byte)0, byte0);
  }

  @Test
  public void test16()  throws Throwable  {
      RelativeAngle relativeAngle0 = RelativeAngle.fromRadians((double) 839);
      RelativeAngle relativeAngle1 = relativeAngle0.normalize();
      assertEquals((-168.84098852393282), relativeAngle1.getDegrees(), 0.01D);
      assertNotNull(relativeAngle1);
      assertEquals(136, relativeAngle0.getBygrees());
  }

  @Test
  public void test17()  throws Throwable  {
      RelativeAngle relativeAngle0 = RelativeAngle.fromBygrees(19);
      assertNotNull(relativeAngle0);
      
      RelativeAngle relativeAngle1 = relativeAngle0.dividedBy((double) 19);
      RelativeAngle relativeAngle2 = relativeAngle1.normalize();
      assertSame(relativeAngle2, relativeAngle1);
      assertNotNull(relativeAngle2);
      assertEquals("0.02454369260617026r/1", relativeAngle1.toString());
      assertEquals(26.718749999999996, relativeAngle0.getDegrees(), 0.01D);
  }
}