package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.sql.Timestamp;
import java.util.List;
import java.util.Scanner;

public class AssertPage extends Utils {
    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private By _registrationConfirmMessage = By.xpath("//div[@class='result']");
    private By _commentAddMessage = By.xpath("//div[@class='result']");
    private By _commentPresentOnDisplay = By.xpath("//div[@class=\"comment-content\"]");
    private By _commentLast = By.xpath("//div[@class=\"comment-list\"]");
    private By _customer_Currency = By.id("customerCurrency");
    private By _currency_Price = By.xpath("//span[@class=\"price actual-price\"]");
    private By _productTitle = By.xpath("//h2[@class=\"product-title\"]");
    SoftAssert softAssert=new SoftAssert();

    public void registration_completed_Assert() {
        Assert.assertEquals(get_Text_From_Element(_registrationConfirmMessage), "Your registration completed", "Register not complete");
        System.out.println("Your registration completed");
    }

    public void verifyCurrencySymbolInEachPrice() {

        String currencyNameSelected = getSelectedTextFromDropDown(_customer_Currency);
        String expectedCurrencySymbol = getCurrencySymbol(currencyNameSelected);

        List<WebElement> priceList = driver.findElements(_currency_Price);
        for (WebElement element : priceList) {
            Assert.assertTrue(element.getText().contains(expectedCurrencySymbol));
            String priceSymbolActual = element.getText().substring(0, 1);
            Assert.assertEquals(priceSymbolActual, expectedCurrencySymbol);

        }

        System.out.println("Currency Verified successfully  : " + currencyNameSelected + "as" + expectedCurrencySymbol);
    }


    public void verifyCommentAddSuccessfully() {

        Assert.assertEquals(get_Text_From_Element(_commentAddMessage), "News comment is successfully added.", "Comment is not add");
        System.out.println("News comment is successfully added.");
    }

    public void comment_Present_Display() {
        waitForClickable(_commentPresentOnDisplay, 15000);
        boolean productDisplay = driver.findElement(_commentPresentOnDisplay).isDisplayed();
        Assert.assertTrue(productDisplay, "Comments are not display");
        System.out.println("Comments are display");

    }

    public void your_Comments_At_Last() {

        boolean commentLast = driver.findElement(_commentLast).isDisplayed();
        Assert.assertTrue(commentLast, "Your comments are not last");
        System.out.println("Your comments at last");

    }
}


