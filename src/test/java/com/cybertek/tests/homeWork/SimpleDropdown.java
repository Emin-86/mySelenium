package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleDropdown {
    WebDriver driver;
    // 1.Open Chrome browser
    // 2.Go to http://practice.cybertekschool.com/dropdown
    // 3.Verify “Simple dropdown” default selected value is correctExpected: “Please select an option”
    // 4.Verify“State selection” default selected value is correctExpected: “Select a State”




    @BeforeClass
    public void setDriver(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();

    }
    @Test
    public void test1() {
        WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select element1 = new Select(dropdown1);
        String actual = element1.getFirstSelectedOption().getText();
        String expected = "Please select an option";
        Assert.assertEquals(actual, expected);
    }

@AfterMethod
        public void close(){
    driver.quit();
        }

    }

