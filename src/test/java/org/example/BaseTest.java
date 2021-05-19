package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
    @BeforeMethod
    public void openBrowser() {
        //setting up chromedriver path from your system
        System.setProperty("webdriver.chrome.driver",
                "src\\test\\resorces\\BrowserDriver\\chromedriver.exe");
        //creating object for driver
        driver = new ChromeDriver();
        //maximize the browser window
        driver.manage().window().maximize();
        //Apply implicitlyWait to driver object

        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        //open URL
        driver.get("https://demo.nopcommerce.com/");
        // WebDriverWait wait=new WebDriverWait(driver,120);

    }


    @AfterMethod
    public void close_Browser() {

        //it will be close all opened browser window
       // driver.quit();
    }




}
