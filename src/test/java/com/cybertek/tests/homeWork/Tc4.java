package com.cybertek.tests.homeWork;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tc4 {

    public String url;
    public String xpathSelect;
    public WebDriver driver;
    public String attributeName;
    private List<WebElement> allOptions;
    private WebElement element1;
    private Select selectElement;

    public void getDrive(){
        WebDriver driver =WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(url);
    }
    public List<String> getSelectLocator(){
        element1 = driver.findElement(By.xpath(xpathSelect));
        selectElement = new Select(element1);
        List <String> list = new ArrayList<>();
        allOptions = selectElement.getOptions();
        for(int i = 0;i < allOptions.size();i++){
            selectElement.selectByIndex(i);
            System.out.println(allOptions.get(i).getAttribute(attributeName));
            list.add(allOptions.get(i).getText());
        }
        return list;
    }
    public boolean isAllDeselected(){

        List<WebElement> isDeselected = new ArrayList<>();
        for(int i = 1;i <allOptions.size();i++){
            selectElement.deselectByIndex(i);
            isDeselected.add(allOptions.get(i));
        }

        if(allOptions.size() == isDeselected.size()){
            return true;
        }else{
            return false;
        }

    }
    public void closeBrowsther(){
        driver.close();
    }
    }



