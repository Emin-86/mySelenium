package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelectingValueFromNonSelectDropdown {
    WebDriver driver;

    @BeforeClass
    public void setDriver() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void setUrl() {
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
    }

    @Test
    public void test1() {
        WebElement list = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        list.click();
        WebElement list2 = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
                list2.click();

        String exp = "Facebook - Log In or Sign Up";
        String actual = driver.getTitle();
        if (actual.contains(exp)){
            System.out.println("Pass!");
        }else{
            System.out.println("Fail!!");
        }







        }

    }
