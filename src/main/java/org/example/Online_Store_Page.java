package org.example;

import org.openqa.selenium.By;

public class Online_Store_Page extends Utils{

    public void Type_Title_And_Comment(){
      //wait before next action
      // waitForClickable(By.xpath("//input[@class=\"enter-comment-title\"]"),5000);
        //enter title
        thread_Sleep();
        enterText(By.xpath("(//input[@type=\"text\"])[2]"),"Hello");
        //wait before next action
        waitForClickable(By.xpath("//textarea[@class=\"enter-comment-text\"]"),5000);
        //enter comment
        enterText(By.xpath("//textarea[@class=\"enter-comment-text\"]"),"This my first project");
        //click on new comment
        clickOnElement(By.xpath("(//button[@type=\"submit\"])[2]"));




    }

}
