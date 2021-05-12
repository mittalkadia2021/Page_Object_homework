package org.example;

import org.openqa.selenium.By;

public class Search_Nike extends Utils{
    public void search_Nike_Product(){
    //print all nike product
        compare_Product(By.xpath("//h2[@class=\"product-title\"]"));

    }


}
