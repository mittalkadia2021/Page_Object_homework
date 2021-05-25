package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class SoftwarePage extends Utils {
  private By _itemBoxes=By.xpath("//div[contains(@class, 'item-box')]");
  private By _addCartButton=By.cssSelector("button.button-2.product-box-add-to-cart-button");

  private By _productName=By.cssSelector("h2.product-title ");

SoftAssert softAssert=new SoftAssert();
    public void verify_Add_To_Cart_Button_Present(){
        //finding number of items
        List<WebElement> webElementList=driver.findElements(_itemBoxes);
      thread_Sleep();
        int count=0, noButton=0;
        //print output
        System.out.println("Total Product = " +" "+webElementList.size());

        //list of items
        for (WebElement element : webElementList){
            //applying condition
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
        //verify total add to cart button
    assertEquals( count, webElementList.size(),"Add to cart button should be"+ webElementList.size()+"but it is"+count+" ");

        //print output
      System.out.println("Add_To_Cart_SOut_Message");

    }

}

