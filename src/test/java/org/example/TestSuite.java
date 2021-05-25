package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSuite extends BaseTest{
    //creating object
    HomePage homePage = new HomePage();
    AssertPage assertPage = new AssertPage();
    RegisterPage registerPage = new RegisterPage();
    computer_category computerCategory = new computer_category();
    Online_Store_Page online_store_page=new Online_Store_Page();
    SoftwarePage softwarePage=new SoftwarePage();
    Search_Nike search_nike=new Search_Nike();
    Facebook_Page facebook_page = new Facebook_Page();

    @Test
    public void user_Should_Be_Able_To_Register_Successfully() {
        //click register button
        homePage.clickOnRegisterButton();
        //enter register details
        registerPage.registration_Successfully();
        //verify register successfully message
        assertPage.registration_Completed_Assert();

    }
     @Test
    public void user_Should_Be_Able_To_Change_The_Currency(){
        //verify currency symbol
        homePage.verify_Currency_Symbol_In_Each_Price();
        //click on currency
         homePage.click_On_Currency_Field();
         //verify currency symbol
         homePage.verify_Currency_Symbol_In_Each_Price();
    }

    @Test
    public void user_Able_To_See_Search_Nike_Product(){
       //enter name in search bar
        homePage.search_Nike_Product();
       //after enter click on search
        search_nike.search_Nike_Word();
    }

    @Test
    public void verify_Add_To_Cart_Button_Should_Be_Present_All_Product(){
        //click on computer
         homePage.click_On_Computer_Product();
        //click on software
         computerCategory.click_On_Software();
        //verify add to cart button present in all product
        softwarePage.verify_Add_To_Cart_Button_Present();
    }

    @Test
    public void verify_Comment_And_Title_Successfully_Added(){
        //click on new on line store is open
        homePage.click_On_Online_Store_Is_Open();
        //enter title and comment
         online_store_page.enter_Title_And_Comment();
         //check your title and comment added successfully
        assertPage.verify_Comment_Successfully_Added();
        //check your title and comment di display
        assertPage.verify_Comment_Present_In_Comment_List();
        //check your title and comment is display at last
        assertPage.verify_Your_Comment_Last_In_List();
    }

    @Test
    public void search_Button_verification(){
        //click on search button
        homePage.click_On_Search_Button();
        //verify assert message
        assertPage.alert_Message_Verification();
    }

    @Test
    public void facebook_Login_Button_Verification(){
        //click on facebook
        homePage.click_On_Facebook();
        //verify login button
        facebook_page.verify_LogIn_Button();
    }
}
