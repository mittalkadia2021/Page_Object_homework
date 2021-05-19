package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Search_Nike extends Utils{

    private By _productTitle=By.xpath("//h2[@class=\"product-title\"]");
    private By _itemBox=By.cssSelector("item-box");
    private By _productName=By.cssSelector("h2.product-title");

    public void search_Nike_Product(){
    //print all nike product
       // list_Of_Product(_productTitle);
        List<WebElement> webElementList=driver.findElements(_itemBox);
        int count=0;
        //item list
        for (WebElement element : webElementList){
           //checking all product title have Nike word
           if (element.findElement(_productName).getText().contains("Nike")){
               System.out.println(element.findElement(_productName).getText());
               count++;
           }
        else {
               System.out.println("No match");
           }
        }

        Assert.assertEquals(count, webElementList.size(),"Nike word should be present in"
        +webElementList.size()+"but it is present in"+count+" \n");
        System.out.println("Nike word is present in all product title");
    }


}
