package org.userinyerface.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ThirdGamePageObjects extends BasePage{
    @FindBy(className = "page-indicator")
    WebElement pageIndicator;

    @FindBy(xpath = "//input[@placeholder='Placeholder...']")
    List<WebElement> inputFields;

    @FindBy(className = "dropdown__opener")
    List<WebElement> dropDownOpenerList;

    @FindBy(className = "dropdown__list-item")
    List<WebElement> dropDownList;

    public ThirdGamePageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getPageIndicator() {
        waitForVisibility(pageIndicator);
        return getText(pageIndicator, "");
    }

    public void selectList() {
        for (WebElement hobby : dropDownOpenerList) {
            System.out.println(hobby.getAttribute("innerHTML") + " - " + dropDownOpenerList.size());
        }
        /*
        click(dropDownOpenerList, "Click on domain type list");
        listDomainCodes.remove(0);
        int randomDomainCode = (int) (Math.random() * listDomainCodes.size());
        click(listDomainCodes.get(randomDomainCode), "");*/
    }
}
