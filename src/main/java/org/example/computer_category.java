package org.example;

import org.openqa.selenium.By;

public class computer_category extends Utils {

    public void click_on_Software() {
        //wait before next action
        waitForClickable(By.xpath("(//a[@href=\"/software\"])[5]"),60000);
        //click on software submenu
        clickOnElement(By.xpath("(//a[@href=\"/software\"])[5]"));

    }
    }
