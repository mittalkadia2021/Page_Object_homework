package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.sql.Timestamp;
import java.util.List;

public class Online_Store_Page extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    private By _titleType = By.xpath("//input[starts-with(@class, 'enter')]");
    private By _commentType = By.cssSelector("textarea#AddNewComment_CommentText");
    private By _click_NewComment = By.xpath("//button[contains(text(), 'New comment')]");
    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    String commentTitle = loadProperty.getProperty("TitleName") + dateStamp();
    String commentText = loadProperty.getProperty("Comment_Give") + dateStamp();

    public void enter_Title_And_Comment() {
        thread_Sleep();
        //enter title
        enterText(_titleType, commentTitle);
        waitForClickable(_commentType, 30);
        //enter comment
        enterText(_commentType,commentText);
        //click on new comment
        clickOnElement(_click_NewComment);
    }

}
