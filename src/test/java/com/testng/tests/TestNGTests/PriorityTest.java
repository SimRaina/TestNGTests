package com.testng.tests.TestNGTests;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority = 1) 
	public void testMethodA() {         // third test to execute
	   System.out.println("Executing - testMethodA");
	} 
	@Test 
	public void testMethodB() {    // second test to execute as no priority/default priority given
	   System.out.println("Executing - testMethodB");
	}
	@Test(priority = 2) 
	public void testMethodC() {       // fourth test to execute
	   System.out.println("Executing - testMethodC");
	}
	
	@Test(priority = -1) 
	public void testMethodD() {       // first test to execute as negative priority
	   System.out.println("Executing - testMethodD");
	}

}
