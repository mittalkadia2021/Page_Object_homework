package org.example;


import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class Facebook_Page extends Utils {

    private By _Cookies_Accept = By.xpath("(//button[contains(@value,'1')])[9]");
    private By _Login_Button = By.xpath("//input[contains(@value, 'Log In')]");


    public void verify_LogIn_Button() {

        String MainWindow = driver.getWindowHandle();
        //to handle all new opened window
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase(ChildWindow))
            {//switching to child window
                driver.switchTo().window(ChildWindow);
                driver.findElement(_Cookies_Accept).click();
                Assert.assertTrue(driver.findElement(_Login_Button).isDisplayed(), "Log in button is missing");
                //print output
                System.out.println("Log In" + " " + " button is present");
                //closing child window
                driver.close();
            }
        }
        //switching to parent window
        driver.switchTo().window(MainWindow);


    }

}
