package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;

public class Online_Store_Page extends Utils{
    LoadProperty loadProperty = new LoadProperty();
    private By _titleType=By.xpath("(//input[@type=\"text\"])[2]");
    private By _commentType=By.xpath("//textarea[@class=\"enter-comment-text\"]");
    private By _newComment=By.xpath("(//button[@type=\"submit\"])[2]");
    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public void Type_Title_And_Comment(){
      //wait before next action
       //waitForClickable(_titleType,5000);
        //enter title
        thread_Sleep();
        enterText(_titleType,loadProperty.getProperty("TitleName")+timestamp.getTime());
        //wait before next action
        waitForClickable(_commentType,5000);
        //enter comment
        enterText(_commentType,loadProperty.getProperty("Comment_Give"));
        //click on new comment
        clickOnElement(_newComment);




    }

}
