package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class RahibTask {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);


        WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
        search.sendKeys("wooden spoon" + Keys.ENTER);

        String actualTitle = driver.getTitle();
    String expectedATitle  = "Amazon.com : wooden spoon";
    if(actualTitle.equals(expectedATitle)){
        System.out.println("title verified");
    }else {
        System.out.println("title not verified");
    }
    }
}
