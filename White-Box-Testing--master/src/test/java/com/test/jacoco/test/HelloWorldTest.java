package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
        int a = hw.Method3(6, -1, 1);
        a = hw.Method3(6, -1, -3);
        a = hw.Method3(3, 1, -3);
        a = hw.Method3(6, 1, 1);
        a = hw.Method3(6, 1, -1);
        a = hw.Method3(3, -1, -2);
    	
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testMethod4() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
        int a = hw.Method4(0, 1, 2, 3, (float)4.0);
        a = hw.Method4(1, 1, 2, 3, (float)4.0);
        a = hw.Method4(5, 1, 2, 2, (float)4.0);
        a = hw.Method4(4, 1, 2, 2, (float)4.0);
        a = hw.Method4(4, 4, 2, 2, (float)4.0);
        a = hw.Method4(4, 2, 2, 3, (float)4.0);
    }

    @Test
    public void testisTriangle() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
        boolean a = hw.isTriangle(3, 4, 5);
        a = hw.isTriangle(1, 2, 3);
        a = hw.isTriangle(1, 2, 4);
        a = hw.isTriangle(3, 1, 1);
        a = hw.isTriangle(1, 3, 1);
    }
    @Test
    public void testminiCalculator() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
        double c = hw.miniCalculator(1, 2, '+');
        c = hw.miniCalculator(1, 2, '-');
        c = hw.miniCalculator(1, 2, '*');
        c = hw.miniCalculator(3, 1, '/');
    }
    @Test
    public void testisBirthday() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
        boolean a = hw.isBirthday(1000, 2, 1);
        a = hw.isBirthday(3000, 2, 1);
        a = hw.isBirthday(1990, 0, 32);
        a = hw.isBirthday(1990, 13, 32);
        a = hw.isBirthday(1990, 1, 0);
        a = hw.isBirthday(1990, 1, 31);
        a = hw.isBirthday(1990, 3, 31);
        a = hw.isBirthday(1990, 5, 31);
        a = hw.isBirthday(1990, 7, 31);
        a = hw.isBirthday(1990, 8, 31);
        a = hw.isBirthday(1990, 10, 31);
        a = hw.isBirthday(1990, 12, 31);
        a = hw.isBirthday(1990, 3, 32);
        a = hw.isBirthday(1996, 2, 28);
        a = hw.isBirthday(1996, 2, 30);
        a = hw.isBirthday(2000, 2, 28);
        a = hw.isBirthday(2000, 2, 30);
        a = hw.isBirthday(2000, 4, 31);
        a = hw.isBirthday(2000, 4, 30);
        a = hw.isBirthday(1997, 2, 28);
    }
}
