package org.example;

import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BaseTest extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void openBrowser() {
        //open browser
        browserSelector.open_Browser();
        //open URL
        driver.get("https://demo.nopcommerce.com/");
    }




    @AfterMethod
    public void close_Browser(ITestResult result) {
        //taking screenshot when test case fail
        if (!result.isSuccess()) {
          captureScreenshot(result.getName()); }
        //close browser
         driver.quit();
    }
}
