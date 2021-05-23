package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MerriamWebster {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.merriam-webster.com/");
        driver.manage().window().maximize();
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        for(WebElement link : allLinks){
//            System.out.println(link.getText() + " - " + link.getAttribute("href"));
//            System.out.println(link.getSize());

//            System.out.println("****************************");

            List <WebElement> linksWithText = driver.findElements(By.xpath("//li[@class='active']/a"));
            String text = driver.findElement(By.id("Text")).getText();
            System.out.println(text);

        }


    }
}
