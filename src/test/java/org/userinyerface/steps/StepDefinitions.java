package org.userinyerface.steps;

import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.userinyerface.pageobject.GamePageObjects;
import org.userinyerface.pageobject.MainPageObjects;
import org.userinyerface.utilities.StringUtils;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {
    private WebDriver webDriver;
    private String baseUrl = "https://userinyerface.com/";
    private MainPageObjects mainPageObjects;
    private GamePageObjects gamePageObjects;
    private StringUtils stringUtils;
    public Faker faker;

    @Before
    public void setup() {
        webDriver = new ChromeDriver();
        mainPageObjects = new MainPageObjects(webDriver);
        gamePageObjects = new GamePageObjects(webDriver);
        stringUtils = new StringUtils();
        faker = new Faker();
        webDriver.manage().window().maximize();
    }

    @Given("Open userinyerface.com")
    public void open_userinyerface_com() {
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get(baseUrl);
    }

    @And("Click on link HERE")
    public void clickOnLinkHERE() {
        mainPageObjects.clickLinkStart();
    }

    @When("User insert password")
    public void user_insert_password() {
        gamePageObjects.setTxtPassword(stringUtils.textGeneration(15));
    }

    @When("User click in button NO for cookies")
    public void userClickInButtonNOForCookies() throws InterruptedException {
        gamePageObjects.clickBtbNoCookies();
    }

    @When("User insert nickname")
    public void userInsertNickname() throws InterruptedException {
        String nickname = faker.pokemon().name();
        gamePageObjects.setTxtNicknameMail(nickname);
    }

    @When("User insert domain for mail")
    public void userInsertDomainForMail() {
        String domain = faker.internet().domainName();
        gamePageObjects.setDomainName(domain);
    }

    @When("Select domain code")
    public void selectDomainCode() throws InterruptedException {
        gamePageObjects.selectDomainType();
    }
    /*
    @When("Entering number {int} and {int}")
    public void entering_number_and(Integer first, Integer second) {
        WebElement googleTextBox = webDriver.findElement(By.className("gLFyf"));
        googleTextBox.sendKeys(first + " + " + second);
    }

    @When("Press enter")
    public void press_enter() {
        WebElement searchButton = webDriver.findElement(By.className("gNO89b"));
        searchButton.click();
    }

    @Then("Result should be {int}")
    public void result_should_be(Integer result) {
        WebElement calculatorTextBox = webDriver.findElement(By.className("qv3Wpe"));
        Integer getResult = Integer.parseInt(calculatorTextBox.getText());
        Assert.assertEquals(getResult, result);
        webDriver.close();
    }
*/
    @After
    public void end() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    @When("Click on accept terms")
    public void clickOnAcceptTerms() throws InterruptedException {
        gamePageObjects.clickAcceptTerms();
        Thread.sleep(10000);
    }
}
