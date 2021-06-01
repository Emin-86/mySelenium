package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC2ConfirmationPractice {
    String url;
    WebDriver driver;
    String clickButton;
    String locationOfText;
    WebElement clickConfirmButton;
    String ExpectedPageText;
    WebElement actualPageText;
    Alert alert;



    public void getDriver(int waitTime){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
        driver.get(url);

    }
    @Test
    public void setConfirmation(){

    }

}
