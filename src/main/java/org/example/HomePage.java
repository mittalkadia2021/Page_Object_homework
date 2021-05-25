package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    SoftAssert softAssert = new SoftAssert();
    private By _register = By.xpath("//a[contains(text(),'Register')]");
    private By _selectCurrency = By.cssSelector("select#customerCurrency");
    private By _priceList = By.cssSelector("span.price.actual-price");
    private By _selectEuro = By.cssSelector("select[id$='Currency']");
    private By _searchItem = By.xpath("//input[starts-with(@class, 'search-box')]");
    private By _searchButton = By.cssSelector("button.button-1.search-box-button");
    private By _computer = By.xpath("(//a[contains(@href, 'computer')])[1]");
    private By _onlineStore = By.xpath("(//a[@class=\"news-title\"])[1]");
    private By _click_SearchButton =By.cssSelector("button.button-1.search-box-button");
    private By _click_On_Facebook=By.xpath("//a[contains(text(),'Facebook')]");



    public void clickOnRegisterButton() {
        //wait for click on register button
        waitForClickable(_register, 10);
        //Click on register
        clickOnElement(_register);
    }

    public void verify_Currency_Symbol_In_Each_Price(){
    //getting name of currency selected
      String currencyNameSelected =getSelectedTextFromDropDown(_selectCurrency);
      //getting currency symbol
      String expectedCurrencySymbol = getCurrencySymbol(currencyNameSelected);
      //list of product price
      List<WebElement> priceList = driver.findElements(_priceList);
      //item list
      for (WebElement element : priceList)
      {
          String actualCurrencySymbol = element.getText().substring(0,1);
          //asserting actual currency symbol with expected currency symbol
          Assert.assertEquals(actualCurrencySymbol,expectedCurrencySymbol,"Actual currency symbol not matching with expected currency symbol");
      }
      //printing output
      System.out.println("Currency Verified successfully:" + currencyNameSelected +" as " + expectedCurrencySymbol);
  }

    public void click_On_Currency_Field()
    {   //selecting currency
        selectFromDropdownByVisibleText(_selectEuro,loadProperty.getProperty("selectCurrency"));

    }


    public void search_Nike_Product() {
        //enter text Nike on search bar
        enterText(_searchItem, loadProperty.getProperty("SearchItemName"));
        //click on search button
        clickOnElement(_searchButton);

    }

    public void click_On_Computer_Product() {
        //click on computer category
        clickOnElement(_computer);
        //wait before next action
        waitForClickable(_computer, 20);
    }

    public void click_On_Online_Store_Is_Open() {
        //click on online store is open
        clickOnElement(_onlineStore);
    }
    public void click_On_Search_Button(){
        //click on search button
        clickOnElement(_click_SearchButton);
    }

     public void click_On_Facebook(){
        //click on facebook
        clickOnElement(_click_On_Facebook);
     }
}



