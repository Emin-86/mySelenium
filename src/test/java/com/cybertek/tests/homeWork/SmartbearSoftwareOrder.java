package com.cybertek.tests.homeWork;

import com.cybertek.utilities.SmartBEarLogin;
import com.cybertek.utilities.TableUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmartbearSoftwareOrder {
    WebDriver driver;


    @BeforeClass
    public void setDriver() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }
    @BeforeMethod
    public void LoginToSmartBear(){
        SmartBEarLogin.smartLogin(driver);
    }


    @Test(priority = 1)
    public void test1() {
        SmartbearSoftObject.driver(driver);


    }

    @Test(priority = 2)
    public void ClickAllOrder2 () {
        SmartbearSoftObject.clickallorder(driver);


    }
    @Test
    public void task_verify_order_method(){
        TableUtils.verifyOrder(driver,"Paul Brown");
    }

//    @AfterClass
//    public void tearDown() {
//        driver.close();
//    }
}







