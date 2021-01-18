package org.userinyerface.steps;

import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.userinyerface.pageobject.FirstGamePageObjects;
import org.userinyerface.pageobject.MainPageObjects;
import org.userinyerface.pageobject.SecondGamePageObjects;
import org.userinyerface.pageobject.ThirdGamePageObjects;
import org.userinyerface.utilities.PropertiesRead;
import org.userinyerface.utilities.ScripExecution;
import org.userinyerface.utilities.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class StepDefinitions {
    private static final String PAGE = PropertiesRead.readFromFrameworkConfig("URL");
    private static final String FILE = PropertiesRead.readFromDataConfig("FILE");
    public Faker faker;
    private WebDriver webDriver;
    private SoftAssertions softAssertions;
    private MainPageObjects mainPageObjects;
    private FirstGamePageObjects firstGamePageObjects;
    private SecondGamePageObjects secondGamePageObjects;
    private ThirdGamePageObjects thirdGamePageObjects;
    private ScripExecution scriptExecution;
    private StringUtils stringUtils;

    @Before
    public void setup() {
        webDriver = new ChromeDriver();
        mainPageObjects = new MainPageObjects(webDriver);
        firstGamePageObjects = new FirstGamePageObjects(webDriver);
        secondGamePageObjects = new SecondGamePageObjects(webDriver);
        thirdGamePageObjects = new ThirdGamePageObjects(webDriver);
        softAssertions = new SoftAssertions();
        scriptExecution = new ScripExecution();
        stringUtils = new StringUtils();
        faker = new Faker();
        webDriver.manage().window().maximize();
    }

    @Given("Open userinyerface.com")
    public void open_userinyerface_com() {
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get(PAGE);
    }

    @Given("Click on link HERE")
    public void clickOnLinkHERE() {
        mainPageObjects.clickLinkStart();
    }

    @When("User insert password")
    public void user_insert_password() {
        firstGamePageObjects.setTxtPassword(stringUtils.textGeneration(15));
    }

    @When("User click in button NO for cookies")
    public void userClickInButtonNOForCookies() throws InterruptedException {
        firstGamePageObjects.clickBtbNoCookies();
    }

    @When("User insert nickname")
    public void userInsertNickname() throws InterruptedException {
        String nickname = faker.pokemon().name().replace(" ","");;
        firstGamePageObjects.setTxtNicknameMail(nickname);
    }

    @When("User insert domain for mail")
    public void userInsertDomainForMail() {
        String domain = faker.superhero().name().replace(" ","");
        firstGamePageObjects.setDomainName(domain);
    }

    @When("Select domain code")
    public void selectDomainCode() throws InterruptedException {
        firstGamePageObjects.selectDomainType();
    }

    @After
    public void end() {
        softAssertions.assertAll();
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    @When("Click on accept terms")
    public void clickOnAcceptTerms() throws InterruptedException {
        firstGamePageObjects.clickAcceptTerms();
    }

    @Then("Validate button NO is present")
    public void validateButtonNOIsPresent() {
        mainPageObjects.getLinkStart();
        softAssertions.assertThat(mainPageObjects.btnNoVisible());
    }

    @Then("Cookies closed")
    public void cookiesClosed() {
        boolean val = false;
        if (!firstGamePageObjects.cookiesIsClosed()) {
            val = true;
        }
        softAssertions.assertThat(val);
    }

    @And("Click button Next")
    public void clickButtonNext() throws InterruptedException {
        firstGamePageObjects.clickBtnNext();
    }

    @Then("Validate enter second page")
    public void validateEnterSecondPage() throws InterruptedException {
        softAssertions.assertThat(secondGamePageObjects.getThisIsMe()).isEqualTo("2 / 4");
    }

    @When("Browser avatar")
    public void browserAvatar() throws InterruptedException, IOException {
        secondGamePageObjects.browserAvatar();
        scriptExecution.uploadFile(FILE);
    }

    @When("Choose hobbies")
    public void chooseHobbies() throws InterruptedException {
        secondGamePageObjects.chooseDifferentHobbies(3);
    }

    @And("Click on button Next")
    public void clickOnButtonNext() throws InterruptedException {
        secondGamePageObjects.clickBtnNext();
    }

    @Then("Validate enter third page")
    public void validateEnterThirdPage() {
        softAssertions.assertThat(thirdGamePageObjects.getPageIndicator()).isEqualTo("3 / 4");
    }

    @When("Print values")
    public void printValues() throws InterruptedException {
        Thread.sleep(5000);
        thirdGamePageObjects.selectList();
    }
}
