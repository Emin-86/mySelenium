package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertTask2 {
    WebDriver driver;
       /*
    1.Open browser
    2.Go to website: http://practice.cybertekschool.com/javascript_alerts
    3.Click to “Click for JS Confirm” button
    4.Click to OK button from the alert
    5.Verify “You clicked: Ok” text is displayed.
     */

    @BeforeClass
    public void setDriver(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

       }
       @AfterClass
       public void teardown(){
        driver.close();
       }

       @Test (priority = 1)
    public void test2(){
           WebElement confirmButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
           confirmButton.click();
           Alert alert = driver.switchTo().alert();
           alert.accept();

           WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
           String expectedText = "You clicked: Ok";
           String actualTest = resultText.getText();

           System.out.println(resultText.isDisplayed());
           System.out.println("actualTest = " + actualTest);
       }
       @Test (priority = 2)
    public void test3(){
           WebElement promptButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()'] "));
           promptButton.click();
           Alert alert = driver.switchTo().alert();
           alert.sendKeys("hello");
           alert.accept();

           WebElement resultText3 = driver.findElement(By.xpath("//p[@id='result']"));
           String expectedText3 = "hello";
           String actualTest3= resultText3.getText();

           System.out.println(resultText3.isDisplayed());
           System.out.println("actualTest3 = " + actualTest3);
       }

       }
