package org.userinyerface.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.userinyerface.utilities.PropertiesRead;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {
    private static WebDriver driver = null;
    private static final int TIMEOUT = Integer.parseInt(PropertiesRead.readFromFrameworkConfig("timeout"));
    static final Logger log = Logger.getLogger(BasePage.class);

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForVisibility(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void click(WebElement e, String msg) {
        log.info(msg);
        e.click();
    }

    public void clearTxt(WebElement e, String msg) {
        log.info(msg);
        e.clear();
    }

    public void sendKeys(WebElement e, String txt, String msg) {
        log.info(msg);
        e.sendKeys(txt);
    }

    public String getAttribute(WebElement e, String attribute) {
        return e.getAttribute(attribute);
    }

    public String getText(WebElement e, String msg) {
        return getAttribute(e, "text");
    }

    /*public List<WebElement> getList(WebElement e, String msg) { return e; }*/

    public static void setImplicitlyWait() {
        log.info("Timeout is " + TIMEOUT);
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
    }
}
