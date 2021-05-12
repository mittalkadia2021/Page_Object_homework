package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;

public class RegisterPage extends Utils {

    public void registration_Successfully() {




        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        //click on gender
        waitForClickable(By.xpath("//input[@id=\"gender-female\"]"),2000);
        clickOnElement(By.xpath("//input[@id=\"gender-female\"]"));

        //type first name
        waitForClickable(By.id("FirstName"),2000);
        enterText(By.id("FirstName"), "Mittal");

        //type last name
        //waitForClickable(By.id("LastName"), 2000);
        enterText(By.id("LastName"), "Kadia");

        //enter date of birth
        waitForClickable(By.xpath("//select[@name=\"DateOfBirthDay\"]"),2000);
       selectFromDropdownByVisibleText(By.xpath("//select[@name=\"DateOfBirthDay\"]"), "22");

        //enter birth month
       selectFromDropdownByValue(By.name("DateOfBirthMonth"), "2");

        //enter birth of year
       selectFromDropdownByVisibleText(By.xpath("//select[@name=\"DateOfBirthYear\"]"), "1988");

        //Type email with timestamp
        enterText(By.xpath("//input[@id=\"Email\"]"),"mittal" + timestamp.getTime() +
               "@gmail.com");

        //company name
       enterText((By.xpath("//input[@id=\"Company\"]")),"Primark");

        // Click on option
        clickOnElement((By.xpath("//input[@type=\"checkbox\"]")));

        //enter password
        enterText(By.xpath("//input[@id=\"Password\"]"),"mitu14");

        //confirm password
        enterText(By.xpath("//input[@id=\"ConfirmPassword\"]"),"mitu14");

        //click on register button
        clickOnElement((By.xpath("//button[@id=\"register-button\"]")));



    }

}

