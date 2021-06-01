package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AlertPracticeByMehdi {
    WebDriver driver;
    String url;
    WebElement clickConfirmButton;
    String xpathOfClickButton;
    String xpathOfText;
    String expectedPageText;
    WebElement actualPageTextElement;
    Alert alert;


    public void getDriver(int waitTime) {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
        driver.get(url);
    }

    public String setClickConfirmButton() {
        clickConfirmButton = driver.findElement(By.xpath(xpathOfClickButton));
        clickConfirmButton.click();
        alert = driver.switchTo().alert();
        alert.accept();
        actualPageTextElement = driver.findElement(By.xpath(xpathOfText));
        String actualPageText = actualPageTextElement.getText();

        return actualPageText;
    }
}
