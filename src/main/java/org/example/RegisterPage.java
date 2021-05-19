package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;

public class RegisterPage extends Utils {
    LoadProperty loadProperty = new LoadProperty();

    private By _gender = By.xpath("//input[@value=\"F\"]");
    private By _firstName = By.id("FirstName");
    private By _lastname = By.id("LastName");
    private By _date_of_birth = By.name("DateOfBirthDay");
    private By _date_of_month = By.name("DateOfBirthMonth");
    private By _birth_year = By.name("DateOfBirthYear");
    private By _email = By.xpath("//input[@id=\"Email\"]");
    private By _company_name = By.xpath("//input[@id=\"Company\"]");
    private By _option = By.xpath("//input[@type=\"checkbox\"]");
    private By _password = By.xpath("//input[@id=\"Password\"]");
    private By _confirm_password = By.xpath("//input[@id=\"ConfirmPassword\"]");
    private By _register_button = By.xpath("//button[@id=\"register-button\"]");
    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());


    public void registration_Successfully() {
        //click on gender
        //waitForClickable(_gender, 15000);
        thread_Sleep();
        clickOnElement(_gender);

        //type first name
        //waitForClickable(_firstName, 25000);
        thread_Sleep();
        enterText(_firstName, loadProperty.getProperty("Firstname"));

        //type last name
        waitForClickable(_lastname, 5000);
        enterText(_lastname, loadProperty.getProperty("Lastname"));

        //enter date of birth
        waitForClickable(_date_of_birth, 5000);
        selectFromDropdownByVisibleText(_date_of_birth, loadProperty.getProperty("DateOfBirth"));

        //enter birth month
        selectFromDropdownByValue(_date_of_month, loadProperty.getProperty("DateOfMonth"));

        //enter birth of year
        //waitForClickable(_birth_year,5000);
        thread_Sleep();
        selectFromDropdownByVisibleText(_birth_year, loadProperty.getProperty("BirthYear"));

        //Type email with timestamp
        enterText(_email, loadProperty.getProperty("Email") + timestamp.getTime() +
                "@gmail.com");

       //company name
        enterText(_company_name, loadProperty.getProperty("CompanyName"));

        // Click on option
        clickOnElement(_option);

        //enter password
        enterText(_password, loadProperty.getProperty("Password"));

        //confirm password
        enterText(_confirm_password, loadProperty.getProperty("ConfirmPassword"));

        //click on register button
        clickOnElement(_register_button);


    }


}

