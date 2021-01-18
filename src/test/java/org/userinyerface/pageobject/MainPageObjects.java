package org.userinyerface.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageObjects extends BasePage {
    @FindBy(className = "start__link")
    WebElement linkStart;

    @FindBy(className = "start__button")
    WebElement btnNo;

    public MainPageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void getLinkStart() {
        getText(linkStart, "");
    }

    public void clickLinkStart() {
        click(linkStart, "Click HERE");
    }

    public boolean btnNoVisible() {
        return isDisplayed(btnNo, "");
    }
}
