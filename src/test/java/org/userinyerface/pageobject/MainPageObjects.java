package org.userinyerface.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageObjects extends BasePage {
    WebDriver driver;

    @FindBy(className = "start__link")
    WebElement linkStart;

    @FindBy(className = "start__button")
    WebElement btnNo;

    public MainPageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getLinkStart() {
        return getText(linkStart, "");
    }

    public void clickLinkStart() {
        click(linkStart, "Click HERE");
    }

    public void clickBtnNo() {
        click(btnNo, "");
    }
}
