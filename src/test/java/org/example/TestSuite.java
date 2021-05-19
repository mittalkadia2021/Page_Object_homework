package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class TestSuite extends BaseTest{
    //object create for Homepage
    HomePage homePage = new HomePage();

    //object create for AssertPage
    AssertPage assertPage = new AssertPage();

    //object create for  RegisterPage
    RegisterPage registerPage = new RegisterPage();

    //object create for computer_category
    computer_category computerCategory = new computer_category();

    //object create for Online_Store_Page
    Online_Store_Page online_store_page=new Online_Store_Page();

    //object create for SoftwarePage
    SoftwarePage softwarePage=new SoftwarePage();

    //object create for Search_Nike
    Search_Nike search_nike=new Search_Nike();

    @Test
    public void user_Should_Be_Login_Successfully() {

        //call method from Homepage class
        homePage.clickOnRegisterButton();

        //call method from RegisterPage class
        registerPage.registration_Successfully();

        //call method from AssertPage class
        assertPage.registration_completed_Assert();


    }
@Test
    public void user_Should_Be_Able_To_Change_The_Currency(){
    //call method from Homepage class
    homePage.selectEuroCurrency();
    assertPage.verifyCurrencySymbolInEachPrice();

    homePage.selectUSDollarCurrency();
    assertPage.verifyCurrencySymbolInEachPrice();
    }
@Test
    public void user_Able_To_See_Search_Nike_Product(){
    //call method from Homepage class
        homePage.search_Product();

    //call method from Search_Nike class
        search_nike.search_Nike_Product();


}
    @Test
    public void verify_Add_To_Cart_Button_Should_Be_Present_All_Product(){
        //call method from Homepage class
        homePage.click_On_Computer_Product();

        //call method from computer_category class
        computerCategory.click_on_Software();

        //call method from SoftwarePage class
       softwarePage.verify_Add_To_Cart_Button_Present();


    }
@Test
    public void verify_message_Successfully_Add_Comment_And_title(){
        //call method from Homepage class
       homePage.click_on_Online_Store_Is_Open();

     //call method from Online_Store_Page class
     online_store_page.Type_Title_And_Comment();

     //call method from AssertPage class
     assertPage.verifyCommentAddSuccessfully();

     //call method from AssertPage class
     assertPage.comment_Present_Display();

     //call method from AssertPage class
     assertPage.your_Comments_At_Last();
    }

}
