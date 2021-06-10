package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartbearSoftLinkVerification {
//    TC #1: Smartbear software link verification
//    1.Open browser
//    2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//    3.Enter username: “Tester”
//    4.Enter password: “test”
//    5.Click to Login button
//    6.Print out count of all the links on landing page
//    7.Print out each link text on this page

    WebDriver driver;
    @BeforeClass
    public void setDriver(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }

    @Test
    public void test1(){
        loginToSmartBear.driver(driver);


       List<WebElement> links = driver.findElements(By.xpath("//body//a"));

        System.out.println(links.size());

        for (WebElement each : links) {
            System.out.println(each.getText());
        }

        }
        }







