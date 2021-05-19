package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    private By _register = By.xpath("//a[@class=\"ico-register\"]");
    private By _computer = By.xpath("(//a[@href=\"/computers\"])[1]");
    private By _searchItem = By.xpath("//input[@type=\"text\"]");
    private By _searchButton = By.xpath("//button[@type=\"submit\"]");
    private By _onlineStore = By.xpath("(//a[@class=\"news-title\"])[1]");
    private By _euroCurrency=By.xpath("//select[@id=\"customerCurrency\"]");
    private By _usDollarCurrency=By.xpath("//select[@id=\"customerCurrency\"]");



    public void clickOnRegisterButton() {
        //click on register button
        // driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        waitForClickable(_register, 15000);
        clickOnElement(_register);


    }

    public  void selectEuroCurrency(){
       // click on Euro currency
        selectFromDropdownByIndex(_euroCurrency,1);

    }
    public  void selectUSDollarCurrency(){
        // click on USDollar currency
        selectFromDropdownByIndex(_usDollarCurrency, 0);

    }




//        //print Euro currency
//        System.out.println("Euro Currency");
//        //click on Euro currency
//        selectFromDropdownByIndex(By.xpath("//select[@id=\"customerCurrency\"]"), 1);
//        //print name all Euro currency symbol product0
//        compare_Product(By.xpath("//div[@class=\"item-box\"]//span[@class=\"price actual-price\"]"));
//
//        //print US dollar currency
//        System.out.println("US dollar Currency");
//        //click on US dollar
//        selectFromDropdownByIndex(By.xpath("//select[@name=\"customerCurrency\"]"), 0);
//        //print name all US dollar symbol product
//        compare_Product(By.xpath("//div[@class=\"item-box\"]//span[@class=\"price actual-price\"]"));
    //}




    public void search_Product() {
        //enter text Nike on search bar
        enterText(_searchItem, loadProperty.getProperty("SearchItemName"));
        //click on search button
        clickOnElement(_searchButton);

    }

    public void click_On_Computer_Product() {
        //click on computer category
        clickOnElement(_computer);
        //wait before next action
        waitForClickable(_computer, 50000);
    }

    public void click_on_Online_Store_Is_Open() {
        //click on online store is open
        //waitForClickable(_onlineStore,1000);
        clickOnElement(_onlineStore);
    }
}



