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

public class WindowHandlePractice {
    WebDriver driver;

    @BeforeClass
    public void setDriver() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");

    }

    @AfterClass
    public void teardown() {
        //driver.close();
    }

    @Test
    public void test1() {
        String handleTitle = driver.getTitle();
        String expectedTitle = "Practice";
        Assert.assertEquals(handleTitle, expectedTitle);
        System.out.println("expectedTitle = " + expectedTitle);

        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("CURRENT TITLE WHILE SWITCHING: " + driver.getTitle());
        }



        String actualTitleAfterClick = driver.getTitle();

        System.out.println("actualTitleAfterClick = " + actualTitleAfterClick);

        Assert.assertTrue(actualTitleAfterClick.equals(actualTitleAfterClick));

    }
}
