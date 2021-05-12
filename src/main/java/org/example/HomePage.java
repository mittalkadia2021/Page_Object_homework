package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends Utils {
    public void clickOnRegisterButton() {
        //click on register button
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        clickOnElement(By.xpath("//a[@class=\"ico-register\"]"));
    }

    public void clickOnCurrency() {
        //print Euro currency
        System.out.println("Euro Currency");
        //click on Euro currency
        selectFromDropdownByIndex(By.xpath("//select[@id=\"customerCurrency\"]"), 1);
        //print name all Euro currency symbol product0
        compare_Product(By.xpath("//div[@class=\"item-box\"]//span[@class=\"price actual-price\"]"));

        //print US dollar currency
        System.out.println("US dollar Currency");
        //click on US dollar
        selectFromDropdownByIndex(By.xpath("//select[@name=\"customerCurrency\"]"), 0);
        //print name all US dollar symbol product
        compare_Product(By.xpath("//div[@class=\"item-box\"]//span[@class=\"price actual-price\"]"));

    }

    public void search_Product() {
        //enter text Nike on search bar
        enterText(By.xpath("//input[@type=\"text\"]"), "Nike");
        //click on search button
        clickOnElement(By.xpath("//button[@type=\"submit\"]"));

    }

    public void click_On_Computer_Product() {
        //click on computer category
        clickOnElement(By.xpath("(//a[@href=\"/computers\"])[1]"));
        //wait before next action
        waitForClickable(By.xpath("(//a[@href=\"/computers\"])[1]"), 50000);
    }

    public void click_on_Online_Store_Is_Open() {
        //click on online store is open
       // waitForClickable(By.xpath("(//input[@type='text'])[2]"),1000);
        clickOnElement(By.xpath("(//a[@class=\"news-title\"])[1]"));
    }
}



