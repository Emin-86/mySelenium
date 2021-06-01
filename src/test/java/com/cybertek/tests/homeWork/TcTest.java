package com.cybertek.tests.homeWork;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TcTest {
    Tc4 object = new Tc4();

    @BeforeClass
    public void setDrive() {

        //1.Open Chrome browser
        //2.Go to http://practice.cybertekschool.com/dropdown
        object.url = "http://practice.cybertekschool.com/dropdown";
        object.getDrive();
    }

    @Test
    public void test1() {
        //3.Select all the options from multiple select dropdown.
        //4.Print out all selected values.
        object.xpathSelect = "//select[@name='Languages']";
        object.attributeName = "value";
        List<String> actual = object.getSelectLocator();
        List<String> expected = new ArrayList<>(Arrays.asList("Java", "JavaScript", "C#",
                "Python", "Ruby", "C"));
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        //5.Deselect all values.
        // Verify if all deselected
        boolean checkIsAllDeselected = object.isAllDeselected();
        Assert.assertTrue(checkIsAllDeselected);
    }
    @AfterClass
    public void tearDown(){
        object.closeBrowsther();
    }
}
