package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelectingDataOnDropdownAndVerifying {
    WebDriver driver;

    @BeforeClass
    public void setDriver() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
    }

    @Test
    public void findElement() {

        WebElement date = driver.findElement(By.xpath("//select[@id='year']"));
        date.click();
        Select year = new Select(date);
        year.selectByVisibleText("1922");
        date.click();


        WebElement date2 = driver.findElement(By.xpath("//select[@id='month']"));
        date2.click();
        Select month = new Select(date2);
        month.selectByValue("11");
        date2.click();


        WebElement date3 = driver.findElement(By.xpath("//select[@id='day']"));
        date3.click();
        Select day = new Select(date3);
        day.selectByIndex(0);
        date3.click();

        String expected = "December 1st, 1922";
        boolean actual = date.isSelected();
        boolean actual1 = date2.isSelected();
        boolean actual2 = date3.isSelected();

    }
}
