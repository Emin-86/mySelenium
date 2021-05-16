package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_MultipleButtons {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.manage().window().maximize();

        WebElement Button1  = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/button[1]"));
        Button1.click();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        String expectedText = "Clicked on button one!";
        String actualText = resultText.getText();

        if(actualText.equals(expectedText)){
            System.out.println("Button one is displayed as expected");
        }else{
            System.out.println("It is not displayed as expected");
        }
    }
}
