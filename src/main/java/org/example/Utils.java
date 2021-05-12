package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Utils extends BasePage {
    //create wait reusable method
    public static void waitForClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public  static void thread_Sleep(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //create sendKey reusable method
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //create  click reusable method
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //create selectByVisibleText reusable method
    public static void selectFromDropdownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    //create selectByIndex reusable method
    public static void selectFromDropdownByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);

    }

    //create selectByValue reusable method
    public static void selectFromDropdownByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    //create timestamp reusable method
    public static String timeStamp(By by) {
        return driver.findElement(by).getText();
    }
//create list reusable method
    public static void compare_Product(By by) {

        List<WebElement> compareProductList = driver.findElements(by);
        for (WebElement element : compareProductList) {
            System.out.println(element.getText());
        }
    }
//create get text reusable method
    public static String get_Text_From_Element(By by) {
        return driver.findElement(by).getText();

    }
}




