package com.testng.tests.TestNGTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsTest {
	
	@Test
	public void testA() {
		System.out.println("Executing A");
	}
	
	@Test(dependsOnMethods="testA")
		public void testB() {
		System.out.println("Executing B");
		Assert.assertFalse(true);
	}
	
	@Test(dependsOnMethods= {"testA", "testB"})
	public void testC() {
		System.out.println("Executing C");	
	}
}
