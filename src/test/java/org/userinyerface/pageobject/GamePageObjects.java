package org.userinyerface.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GamePageObjects extends BasePage {
    WebDriver driver;

    @FindBy(xpath = "//input[@placeholder='Choose Password']")
    WebElement txtPassword;

    @FindBy(xpath = "//button[@class='button button--solid button--transparent']")
    WebElement btnNoCookies;

    @FindBy(xpath = "//input[@placeholder='Your email']")
    WebElement txtNicknameMail;

    public GamePageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void setTxtPassword(String password) {
        System.out.println(password);
        clearTxt(txtPassword, "Clear txt until introduce password");
        sendKeys(txtPassword, password, "Send txt password");
    }

    public void clickBtbNoCookies() throws InterruptedException {
        setImplicitlyWait();
        click(btnNoCookies, "Clik No for cookies");
        Thread.sleep(10000);
    }

    public void setTxtNicknameMail(String Nickname){

    }
}
