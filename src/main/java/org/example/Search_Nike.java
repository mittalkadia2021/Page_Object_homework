package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Search_Nike extends Utils
{
    LoadProperty loadProperty = new LoadProperty();
    private By _itemBox = By.cssSelector("item-box");
    private By _productName = By.cssSelector("h2.product-title");

    public void search_Nike_Word(){
    //finding number of items
        List<WebElement> webElementList = driver.findElements(_itemBox);

        int count =0;
        //item list
        for (WebElement element : webElementList)

        {   //checking condition if product title name contains Nike word
            if (element.findElement(_productName).getText().contains("Nike"))
            {   //print the product title when above condition becomes true
                System.out.println(element.findElement(_productName).getText());
                //counting with actual product title
                count++;
            } else
            {   //when product title does not contains Nike word
                System.out.println(loadProperty.getProperty("Nike_else_SOut_Message"));
            }
        }
        //asserting count of total product title which contains Nike word, with available product title.
        Assert.assertEquals(count, webElementList.size(), "Nike word should be present in " + webElementList.size() + " but it is present in " + count + "\n");

        //print output
        System.out.println(loadProperty.getProperty("Nike_Assert_SOut_Message"));
    }

}
