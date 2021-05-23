package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.OutputStream;
import java.util.List;

public class FindelementsApple {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com");
        driver.manage().window().maximize();
        WebElement iphone = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
        iphone.click();

        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        int missingText = 0;
        int havetext = 0;
        int total = allLinks.size();

        for(WebElement each : allLinks){
            if (each.getText().isEmpty()){
                missingText++;
            }else {
                havetext++;
            }
            System.out.println(each.getText());
        }
        System.out.println("missingText " + missingText);
        System.out.println("have Text " + havetext);
        System.out.println("total Text " + total);

        driver.close();



    }
}
