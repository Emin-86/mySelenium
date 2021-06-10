package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBEarLogin {
    public static void smartLogin(WebDriver driver) {

        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

        WebElement passWord = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        passWord.sendKeys("test");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();
    }
}
