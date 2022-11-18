package com.testng.tests.TestNGTests;

import org.testng.Assert;
import org.testng.annotations.*;

public class Test_ListenersFromXML {


    @Test
    public void test(){
        System.out.println("Test1");
        Assert.assertFalse(true);
    }

    @Test
    public void test1(){
        System.out.println("Test2");
    }
    
    @Test(dependsOnMethods="test")
    public void test2() {
    	System.out.println("Test3");
    }
}


