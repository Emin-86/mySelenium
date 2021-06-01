package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1_InformationAlertPractice {

    WebDriver driver;

    @BeforeClass
    public void setupClass() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

    }
@Test
    public void test1(){
    WebElement alertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
    alertButton.click();
    Alert alert = driver.switchTo().alert();
    alert.accept();

    WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

    String expectedText= "You successfuly clicked an alert";
    String actualText = resultText.getText();

    Assert.assertEquals(actualText,expectedText);
}
@AfterClass
    public void closeBrowser(){
        driver.close();
}
}
