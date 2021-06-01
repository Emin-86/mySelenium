package com.cybertek.tests.homeWork;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC2ConfirmationPracticeTest {
    TC2ConfirmationPractice testObj = new TC2ConfirmationPractice();

    @BeforeClass
    public void setupClass() {
        testObj.url = "http://practice.cybertekschool.com/javascript_alerts";
        testObj.getDriver(10);


    }

    @AfterClass
    public void teardownClass() {
        testObj.driver.close();
        testObj.getDriver(15);
    }
    @Test
    public void verification(){

    }
}

