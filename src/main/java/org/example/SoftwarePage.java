package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class SoftwarePage extends Utils {
  private By _itemBoxes=By.className("item-box");
  private By _addCartButton=By.cssSelector("button.button-2.product-box-add-to-cart-button");
   // private By _addCartButton=By.cssSelector("html>body>div:nth-of-type(7)");
  private By _productName=By.cssSelector("h2.product-title > a");

SoftAssert softAssert=new SoftAssert();
    public void verify_Add_To_Cart_Button_Present(){

        List<WebElement> webElementList=driver.findElements(_itemBoxes);

        int count=0, noButton=0;
        for (WebElement element : webElementList){

           if (element.findElements(_addCartButton).size() == 1)
           {
               count++;
           }
           if (element.findElements(_addCartButton).size()!= 1)
           {
                noButton++;
               System.out.println(element.findElement(_productName).getText()+ ">>>>> NO ADD TO CART BUTTON");
            }
        }
     assertEquals( count, webElementList.size(),"Add to cart button should be"+ webElementList.size()+"but it is"+count+" ");
      System.out.println("Add to cart button present in each product on this page");
        //softAssert.assertAll();
    }

}

