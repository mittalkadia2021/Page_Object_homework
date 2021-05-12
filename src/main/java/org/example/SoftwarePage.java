package org.example;

import org.openqa.selenium.By;

public class SoftwarePage extends Utils {

    public void software_Add_To_Cart(){
     compare_Product(By.xpath("//h2[@class='product-title']"));
     if (get_Text_From_Element(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']")).contains("Add to cart")){

     }
else {
    System.out.println(get_Text_From_Element(By.xpath("//h2[@class='product-title']")).contains("Add to cart"));
}
    }
//    //print all product on software page
//    Boolean item_name  = driver.findElement(By.xpath("//h2[@class=\"product-title\"]")).isDisplayed();
//        if (get_Text_From_Element(By.xpath("//div[@class=\"buttons\"]")).contains("Add to cart")) {
//        //compare_Product(By.xpath("//h2[@class='product-title']"));
//
//        System.out.println("Element displayed is :" + item_name);
//    } else {
//        System.out.println(get_Text_From_Element(By.xpath("//h2[@class='product-title']")).contains("Add to cart"));
//        //compare_Product(By.xpath("//h2[@class='product-title']"));
//        System.out.println("Element is Present :" + item_name);
//    }
}

