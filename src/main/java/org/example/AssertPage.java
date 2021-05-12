package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AssertPage extends Utils {
    public void registration_completed_Assert() {
        Assert.assertEquals(get_Text_From_Element(By.xpath("//div[@class='result']")), "Your registration completed", "Register not complete");
        System.out.println("Your registration completed");
    }

    //    public void nike_Product_Assert() {
//        String actualResult = driver.findElement(By.xpath("//h2[@class=\"product-title\"]")).getText();
//        String expectedResult = "Nike";
//        Assert.assertEquals(actualResult,expectedResult);
    // }
    public void verifyCommentAddSuccessfully() {

        Assert.assertEquals(get_Text_From_Element(By.xpath("//div[@class='result']")), "News comment is successfully added.", "Comment is not add");
        System.out.println("News comment is successfully added.");
    }

    public void comment_Present_Display() {
        waitForClickable(By.xpath("//div[@class=\"comment-content\"]"), 15000);
        boolean productDisplay = driver.findElement(By.xpath("//div[@class=\"comment-content\"]")).isDisplayed();
        Assert.assertTrue(productDisplay, "Comments are not display");
        System.out.println("Comments are display");

    }

    public void your_Comments_At_Last() {
        boolean commentLast = driver.findElement(By.xpath("//div[@class=\"comment-list\"]")).isDisplayed();
        Assert.assertTrue(commentLast, "Your comments are not last");
        System.out.println("Your comments at last");


    }
}


