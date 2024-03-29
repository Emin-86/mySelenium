package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ZeroBankAccountPractice {
    WebDriver driver;

    @BeforeClass
    public void setupClass() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://zero.webappsecurity.com/login.html");

        //login

        driver.findElement(By.cssSelector("[id*='user_login']")).sendKeys("username");
        driver.findElement(By.cssSelector("[id*='user_pass']")).sendKeys("password");
        driver.findElement(By.cssSelector("[type*='submit']")).click();
        driver.findElement(By.cssSelector("[id*='primary-button']")).click();
    }

    @Test
    public void test1() {
        driver.findElement(By.cssSelector("[id*='account_activity_link']")).click();
        String expectedTitle = "Zero - Account Activity";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "verify Title");

        List<String> expectedOptions = new ArrayList<>(Arrays.asList("Savings", "Checking", "Loan", "Credit Card", "Brokerage"));

        Select accountDropDown = new Select(driver.findElement(By.cssSelector("[id*='aa']")));

        List<WebElement> actualOptions = accountDropDown.getOptions();
        List<String> actualOptionsTesxt = new ArrayList<>();
        for (WebElement each : actualOptions) {
           // actualOptionsTesxt.add()

        }


    }

    @AfterClass
    public void tearDownClass() {
        driver.quit();
    }

}
