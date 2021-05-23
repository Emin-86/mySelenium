package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class P03_Apple {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.apple.com");

        String[] product = {"Mac", "iPad", "iPhone", "Watch", "TV", "Music", "Support"};

        int positive = 0;
        int negative = 0;


        for (int i = 0; i < product.length; i++) {
            driver.findElement(By.xpath("//a[contains(@class,'" + product[i].toLowerCase() + "')]")).click();
            System.out.println(driver.getTitle());
            List<WebElement> links = driver.findElements(By.xpath("//body//a"));
            System.out.println("links are = " + product[i] + " = " + links.size());
            int total = links.size();
            System.out.println(driver.getTitle());

            for (WebElement each : links) {
                if (each.getText().isEmpty()) {
                    positive++;
                } else {
                    negative++;
                }

            }
        }
        System.out.println("links missing = " + positive);
        System.out.println("links with text = " + negative);
    }
}
