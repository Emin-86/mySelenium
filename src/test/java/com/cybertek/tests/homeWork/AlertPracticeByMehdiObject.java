package com.cybertek.tests.homeWork;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertPracticeByMehdiObject {



    AlertPracticeByMehdi testObj = new AlertPracticeByMehdi();

    @BeforeClass
    public void setupClass() {
        testObj.url = "http://practice.cybertekschool.com/javascript_alerts";
        testObj.getDriver(15);
    }

    @AfterClass
    public void teardownClass() {
        testObj.driver.close();
    }

    @Test
    public void verification() {
        testObj.xpathOfClickButton = "//button[.='Click for JS Confirm']";
        testObj.xpathOfText = "//p[@id='result']";
        testObj.expectedPageText = "You clicked: Ok";
        String actualPageText = testObj.setClickConfirmButton();

        Assert.assertEquals(actualPageText, testObj.expectedPageText);
    }
}
