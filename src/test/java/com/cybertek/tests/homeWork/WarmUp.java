package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class WarmUp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa3.vytrack.com/user/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

        String actualTitle = driver.getTitle();
        String expectedATitle  = "Login";


        String check = (actualTitle.equals(expectedATitle) ? "Passed: Actual Title matches expected" : "Fail ");
        System.out.println(check);

        WebElement userNameLoginPage = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userNameLoginPage.sendKeys("Storemanager201");

       WebElement passwordLoginpage = driver.findElement(By.xpath("//input[@type='password']"));
       passwordLoginpage.sendKeys("UserUser123");
       passwordLoginpage.submit();
       Thread.sleep(2000);
       String ActualTitle2 = driver.getTitle();
       System.out.println(driver.getTitle());;

       String ExpectedTitle = "Dashboard";

       String check2  =ActualTitle2.equals(expectedATitle) ? "passed" : "failed";
       System.out.println(check2);

       String checkLogVsDashboard = ActualTitle2.equals(actualTitle) ? "failed" : "passed";
       System.out.println(checkLogVsDashboard);

       String check3 = !actualTitle.equals(ActualTitle2) ? "Test Passed: Login page title doesn't match the Dashboard title" : "Test Failed: Login page title matches Dashboard page title";
        System.out.println(check3);



    }
}
