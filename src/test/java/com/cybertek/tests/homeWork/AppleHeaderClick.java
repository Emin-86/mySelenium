package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AppleHeaderClick{
    WebDriver driver;



    @BeforeClass
    public void setDriver() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get("http://apple.com/");

    }

    @AfterClass
    public void teardown() {
        // driver.close();
    }

    @Test(priority = 1)
    public void test1() {
        String [] allofheader = {"Mac","iPad","iPhone","Watch","TV","Music","Support"};
        for(int i = 0; i < allofheader.length;i++){
            int numbers = 0;
            int nnumb=0;
            driver.findElement(By.xpath("//a[contains(@class,'"+allofheader[i].toLowerCase() +"')]")).click();
            System.out.println(driver.getTitle());
            List<WebElement> links = driver.findElements(By.xpath("//body//a"));
            int total = links.size();
            System.out.println("Total Links - " + total);
            System.out.println("links are = " + allofheader[i] + " = " + links.size());

            for (WebElement each : links) {
                if (each.getText().isEmpty()) {
                    numbers++;
                } else {
                    nnumb++;
                }
            }
            System.out.println("links missing = " + numbers);
            System.out.println("links with text = " + nnumb);
        }


    }








}
