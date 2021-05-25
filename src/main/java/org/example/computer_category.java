package org.example;

import org.openqa.selenium.By;

public class computer_category extends Utils {

    private By _software =By.xpath("(//a[contains(@href, 'software')])[3]");

    public void click_On_Software() {
        //click on software submenu
        clickOnElement(_software);

    }
    }
