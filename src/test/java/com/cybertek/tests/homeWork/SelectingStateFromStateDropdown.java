package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelectingStateFromStateDropdown {
    WebDriver driver;


    @BeforeClass
    public void setDriver() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();

    }

    @Test
    public void test2() {
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='state']"));
        dropdown.click();
        Select select = new Select(dropdown);
        select.selectByVisibleText("Illinois");
        select.selectByValue("VA");
        select.selectByIndex(5);
        dropdown.click();
        String expected = "California";
        String actual = select.getFirstSelectedOption().getText();
        if (actual.equals(expected)) {
            System.out.println("Verified");
        } else {
            System.out.println("Failed!");
        }
    }
}