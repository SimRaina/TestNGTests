package com.testng.tests.TestNGTests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_Parameter {


    @Parameters({"browser", "user"})
    @Test
    public void test(String abc, String user){

        System.out.println("Test is: " + abc);
        System.out.println("User is: " + user);
    }
}
