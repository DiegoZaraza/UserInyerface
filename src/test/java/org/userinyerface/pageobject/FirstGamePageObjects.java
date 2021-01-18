package org.userinyerface.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FirstGamePageObjects extends BasePage {
    WebDriver driver;

    @FindBy(xpath = "//input[@placeholder='Choose Password']")
    WebElement txtPassword;

    @FindBy(xpath = "//button[@class='button button--solid button--transparent']")
    WebElement btnNoCookies;

    @FindBy(xpath = "//input[@placeholder='Your email']")
    WebElement txtNicknameMail;

    @FindBy(xpath = "//input[@placeholder='Domain']")
    WebElement txtDomainName;

    @FindBy(className = "dropdown__opener")
    WebElement dropDownDomainType;

    @FindBy(className = "dropdown__list-item")
    List<WebElement> listDomainCodes;

    @FindBy(className = "checkbox__box")
    WebElement checkAcceptTerms;

    @FindBy(className = "button--secondary")
    WebElement btnNext;

    public FirstGamePageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void setTxtPassword(String password) {
        clearTxt(txtPassword, "Clear txt until introduce password");
        sendKeys(txtPassword, password, "Send txt password");
    }

    public void clickBtbNoCookies() throws InterruptedException {
        waitForVisibility(btnNoCookies);
        click(btnNoCookies, "Clik No for cookies");
    }

    public void setTxtNicknameMail(String nickname) {
        clearTxt(txtNicknameMail, "Clear txt nickname until introduce nickname");
        sendKeys(txtNicknameMail, nickname, "Type nickname");
    }

    public void setDomainName(String domain) {
        clearTxt(txtDomainName, "");
        sendKeys(txtDomainName, domain, "");
    }

    public void selectDomainType() {
        click(dropDownDomainType, "Click on domain type list");
        listDomainCodes.remove(0);
        int randomDomainCode = (int) (Math.random() * listDomainCodes.size());
        click(listDomainCodes.get(randomDomainCode), "");
    }

    public void clickAcceptTerms() {
        click(checkAcceptTerms, "");
    }

    public boolean cookiesIsClosed() {
        return isDisplayed(btnNoCookies, "");
    }

    public void clickBtnNext() {
        click(btnNext, "");
    }
}
