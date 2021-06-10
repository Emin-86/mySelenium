package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class iFramePractice {
WebDriver driver;
    @BeforeClass
    public void setDriver(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");

    }
    @AfterClass
    public void teardown(){
        //driver.close();
    }

    @Test
    public void test1(){
        driver.switchTo().frame("mce_0_ifr");
        WebElement contentGoeshere = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(contentGoeshere.isDisplayed());

        driver.switchTo().defaultContent();
        WebElement headerElement = driver.findElement(By.xpath("//h3"));
        String expectedHeader = "An iFrame containing the TinyMCE WYSIWYG Editor";

        Assert.assertTrue(headerElement.isDisplayed());
        System.out.println(expectedHeader);


    }
}
