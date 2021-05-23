package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElements_Practice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //if a web element is not found, this will wait up to given second
        //if web element is located before given second, it will move on
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/forgot_password");

        //this will return all the links on the page
        List<WebElement> liftOfLinks = driver.findElements(By.xpath("//body//a"));


        for (WebElement each : liftOfLinks) {
            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));
        }

        System.out.println("---------------------------------------------------");

       int numberOfLinks = liftOfLinks.size();

        System.out.println("numberOfLinks = " + numberOfLinks);
        }

    }

