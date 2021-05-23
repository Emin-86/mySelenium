package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesManager139 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://qa3.vytrack.com/user/login");
        WebElement userName = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userName.sendKeys("salesmanager139");
        WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("UserUser123");
        WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginbutton.click();
        Thread.sleep(2000);

        String expectedTitle="Dashboard";
        String actualTitle = driver.getTitle();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());;

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("title verified");
        }else {
            System.out.println("title not verified");
        }
    }
}
