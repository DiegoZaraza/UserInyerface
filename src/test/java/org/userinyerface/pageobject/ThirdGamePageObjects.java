package org.userinyerface.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ThirdGamePageObjects extends BasePage{
    
    public ThirdGamePageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
