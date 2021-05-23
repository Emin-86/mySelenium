package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AmazonPractice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //if a web element is not found, this will wait up to given second
        //if web element is located before given second, it will move on
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement any = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));

        String expectedCheckbox2 = "checked";
        WebElement actualCheckbox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));

        if(actualCheckbox2.equals(expectedCheckbox2)){
            System.out.println("selected");
        }else{
            System.out.println("false");
        }
    }
}
