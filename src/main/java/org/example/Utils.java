package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Utils extends BasePage {
    //method for webDriver wait
    public static void waitForClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
     //method for wait webDriver selected
    public static void waitForElementToBeSelected(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);//variable assigned
        wait.until(ExpectedConditions.elementToBeSelected(by));//expected condition for the wait

    }
     //method for wait webDriver use thread sleep
    public static void thread_Sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // method for enter text
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    // method for click on element
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //method for select from dropDown by text
    public static void selectFromDropdownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    //method for select from dropDown by index
    public static void selectFromDropdownByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    //method for select from dropDown by
    public static void selectFromDropdownByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    //method for timestamp
    public static String timeStamp(By by) {
        return driver.findElement(by).getText();
    }

    //webElement list method
    public static void list_Of_Product(By by)
    {
        List<WebElement> compareProductList = driver.findElements(by);
        for (WebElement element : compareProductList)
        {
            System.out.println(element.getText());
        }
    }

    //method to  get text
    public static String get_Text_From_Element(By by) {
        return driver.findElement(by).getText();
    }

    //method get selected text from dropDown
    public static String getSelectedTextFromDropDown(By by) {
        Select select = new Select(driver.findElement(by));
        return select.getFirstSelectedOption().getText();

    }
    //method for currency symbol
    public String getCurrencySymbol(String currencyName) {

        String currencySymbol = null;
        switch (currencyName) {
            case "US Dollar":
                currencySymbol = "$";
                break;
            case "Euro":
                currencySymbol = "€";
                break;
            default:
                System.out.println("Currency is not available ");
        }
        return currencySymbol;
    }

    //method for dateStamp
      public static String dateStamp(){
      SimpleDateFormat format =new SimpleDateFormat("ddMMyyyyHHmmss");
      return format.format(new Date());

  }
  //method for capturing screenshot
   public static void captureScreenshot(String screenshotName){
       File screenshotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       try {
           FileUtils.copyFile(screenshotFile, new File("src\\test\\resources\\Screenshot" + screenshotName + dateStamp() + ".jpg"));
       }catch (IOException e){
           e.printStackTrace();
       }


   }
}





