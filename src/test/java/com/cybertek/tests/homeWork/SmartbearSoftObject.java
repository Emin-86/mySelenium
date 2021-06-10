package com.cybertek.tests.homeWork;

import com.cybertek.utilities.SmartBEarLogin;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SmartbearSoftObject {



    public static void driver(WebDriver driver){
        SmartBEarLogin.smartLogin(driver);

        WebElement orderClick = driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        orderClick.click();

        WebElement dropDown = driver.findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']"));

        Select any = new Select(dropDown);
        any.selectByValue("FamilyAlbum");

        WebElement quantity = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']"));
        quantity.sendKeys("2");

        WebElement calculator = driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculator.click();

        Faker faker = new Faker();
        String fullName = faker.name().name();
        System.out.println("name " + fullName);

        String street = faker.address().streetAddress();
        System.out.println("street " + street);

        String city = faker.address().cityName();
        System.out.println("city " + city);

        String state = faker.address().state();
        System.out.println("state " + state);

        String zipCode = faker.address().zipCode().replace("-","");
        System.out.println("zipcode " + zipCode);


        WebElement customerName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName']"));
        customerName.sendKeys(fullName);

        WebElement Customerstreet = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox2']"));
        Customerstreet.sendKeys(street);

        WebElement CustomerCity  = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox3']"));
        CustomerCity.sendKeys(city);

        WebElement CustomerState = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox4']"));
        CustomerState.sendKeys(state);

        WebElement CustomerZip = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox5']"));
        CustomerZip.sendKeys(zipCode);

        WebElement visa = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
        visa.click();

        String cardNumber = faker.finance().creditCard().replace("-","");
        System.out.println("card number " + cardNumber);

        WebElement creditcardNumber = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox6']"));
        creditcardNumber.sendKeys(cardNumber);

                    WebElement expDate = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox1']"));
               expDate.sendKeys("11/25");

        WebElement processButton = driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
        processButton.click();


        WebElement locaGetText = driver.findElement(By.xpath("//strong"));
        String expected = "New order has been successfully added.";
        String actual = locaGetText.getText();

        Assert.assertEquals(expected,actual);

        System.out.println(locaGetText.getText());

            }
    public static void clickallorder(WebDriver driver){
        WebElement viewwebElement = driver.findElement(By.xpath("//a[@href='Default.aspx']"));
        viewwebElement.click();

        WebElement susan = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_orderGrid_ctl06_OrderSelector']"));
        susan.click();

        WebElement susanverify= driver.findElement(By.xpath("//table[@class='SampleTable']//tbody//tr[6]/td[5]"));
        String expected = "01/05/2010";
        String actual = susanverify.getText();

        Assert.assertEquals(actual,expected);

            }



            }
