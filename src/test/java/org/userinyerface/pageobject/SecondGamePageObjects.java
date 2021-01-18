package org.userinyerface.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SecondGamePageObjects extends BasePage {
    @FindBy(className = "page-indicator")
    WebElement pageIndicator;

    @FindBy(className = "avatar-and-interests__upload-button")
    WebElement browserAvatar;

    @FindBy(tagName = "label")
    List<WebElement> hobbiesList;

    @FindBy(xpath = "//button[@class='button button--stroked button--white button--fluid'] ")
    WebElement bntNext;

    public SecondGamePageObjects(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getThisIsMe() {
        waitForVisibility(pageIndicator);
        return getText(pageIndicator, "");
    }

    public void browserAvatar() {
        click(browserAvatar, "");
    }

    public void chooseDifferentHobbies(int hobbiesCount) {
        log.info("choose hobbies");
        int i = 0;

        for (WebElement hobby : hobbiesList) {
            i++;
            if (hobby.getAttribute("for").equals("interest_unselectall")) {
                break;
            } else if (i > hobbiesList.size()) {
                break;
            }
        }
        click(hobbiesList.get(i - 1), "");
        hobbiesList.removeIf(x -> getAttribute(x, "for").equals("interest_selectall") || getAttribute(x, "for").equals("interest_unselectall"));
        for (int j = 0; j < hobbiesCount; j++) {
            int randomHobby = (int) (Math.random() * hobbiesList.size());
            WebElement generatedHobby = hobbiesList.get(randomHobby);
            hobbiesList.remove(generatedHobby);
            click(hobbiesList.get(randomHobby), "");
        }
    }

    public void clickBtnNext() {
        click(bntNext, "");
    }
}
