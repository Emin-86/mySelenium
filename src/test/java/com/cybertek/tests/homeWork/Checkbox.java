package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        // Practice: Cybertek Checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //1. Go to http://practice.cybertekschool.com/checkboxes
        driver.get("http://practice.cybertekschool.com/checkboxes");
        //2. Confirm checkbox #1 is NOT selected by default
        WebElement checkbox1 = driver.findElement(By.xpath("//label[@id='checkbox1']/input"));
        Thread.sleep(2000);
        if (checkbox1.isSelected()) {
            System.out.println("Checkbox #1 is selected by default");
        } else {
            System.out.println("Checkbox #1 is NOT selected by default");
        }


        //3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkbox2 = driver.findElement(By.xpath("//label[@id='checkbox2']/input"));
        if (checkbox2.isSelected()) {
            System.out.println("Checkbox #2 is selected by default");
        } else {
            System.out.println("Checkbox #2 is NOT selected by default");
        }
        //label[@id='checkbox1']/span
        //4. Click checkbox #1 to select it.
        WebElement checkbox1button = driver.findElement(By.xpath("//label[@id='checkbox1']/span"));
        checkbox1button.click();
        Thread.sleep(2000);


        //5. Click checkbox #2 to deselect it.
        WebElement checkbox2button = driver.findElement(By.xpath("//label[@id='checkbox2']/span"));
        checkbox2button.click();
        Thread.sleep(2000);


        //6. Confirm checkbox #1 is SELECTED.
        if (checkbox1.isSelected()) {
            System.out.println("Checkbox #1 is selected by default");
        } else {
            System.out.println("Checkbox #1 is NOT selected by default");
        }

//        7. Confirm checkbox #2 is NOT selected.
        if (checkbox2.isSelected()) {
            System.out.println("Checkbox #2 is selected by default");
        } else {
            System.out.println("Checkbox #2 is NOT selected by default");
        }
    }

    }

