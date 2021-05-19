package org.example;

import org.openqa.selenium.By;

public class computer_category extends Utils {

    private By _software =By.xpath("(//a[@href=\"/software\"])[5]");

    public void click_on_Software() {
        //wait before next action
       // waitForClickable(_software,1000);
        //click on software submenu
        thread_Sleep();
        clickOnElement(_software);

    }
    }
