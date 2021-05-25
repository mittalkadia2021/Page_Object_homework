package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.sql.Timestamp;
import java.util.List;


public class AssertPage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private By _register_actualResult = By.xpath("//div[contains(text(),'Your registration completed')]");
    private By _comment_Successfully_Added = By.xpath("//div[contains(text(),'News comment is successfully added.')]");
    private  By _commentsBox = By.cssSelector("div.comments");
    private By _comment_Whole_Box=By.cssSelector("div.comment.news-comment");

    String commentText = loadProperty.getProperty("Comment_Give") + dateStamp();


    public void registration_Completed_Assert() {
        //verify register successfully message
        Assert.assertEquals(get_Text_From_Element(_register_actualResult), "Your registration completed", "Registration is not complete");

        //print output
        System.out.println(loadProperty.getProperty("RegisterPassAssertMessage"));
    }

    public void verify_Comment_Successfully_Added()
    {
        //to verify comment added successfully
        Assert.assertEquals(get_Text_From_Element(_comment_Successfully_Added), "News comment is successfully added.", "Comment not added successfully");

        //print output
        System.out.println(loadProperty.getProperty("Comment_Added_Successfully"));
    }

    public void verify_Comment_Present_In_Comment_List()
    {
        //verify Comment Present In Comment List
        Assert.assertTrue(get_Text_From_Element(_commentsBox).contains(commentText),"newly added comment is NOt present in comment list");

        //print output
        System.out.println(loadProperty.getProperty("Comment_Present_In_List"));
    }

    public void verify_Your_Comment_Last_In_List()
    {
        //finding total comments
        List<WebElement> commentList = driver.findElements(_comment_Whole_Box);

        //total comments
        int numberOfComments = commentList.size();

        //finding last comment index
        int lastCommentIndex = numberOfComments-1;

        //get text of whole last comment
        String lastCommentActualText = commentList.get(lastCommentIndex).getText();

        //verifying last comments contains text of added comment
        Assert.assertTrue(lastCommentActualText.contains(commentText),"Added comment is NOT at last in comment list");

        //print output
        System.out.println(loadProperty.getProperty("Comment_Last_In_LIst"));
    }

    public void alert_Message_Verification() {
        Alert confirmation = driver.switchTo().alert();
        String alertText = confirmation.getText();

        //verify alert message
        Assert.assertEquals(alertText, "Please enter some search keyword", "It is not match");

        //print output
        System.out.println(loadProperty.getProperty("Verify_Alert_Message"));

        // To click on the 'OK' button of the alert.
        driver.switchTo().alert().accept();

    }
}


