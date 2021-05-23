package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class RahibTask2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
        search.sendKeys("Blue - One Love");
        Thread.sleep(3000);
        search.submit();
        WebElement search2 = driver.findElement(By.xpath("//div[@id='mouseover-overlay']" + Keys.ENTER));
        search2.submit();

    }
}
