$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/01_MainPage.feature");
formatter.feature({
  "name": "Validate Main Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@MainPage"
    }
  ]
});
formatter.scenario({
  "name": "Validate load page correct",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MainPage"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open userinyerface.com",
  "keyword": "Given "
});
formatter.match({
  "location": "org.userinyerface.steps.StepDefinitions.open_userinyerface_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate button NO is present",
  "keyword": "Then "
});
formatter.match({
  "location": "org.userinyerface.steps.StepDefinitions.validateButtonNOIsPresent()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/02_FirstGamePage.feature");
formatter.feature({
  "name": "Validate Firts Game Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FirstPage"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open userinyerface.com",
  "keyword": "Given "
});
formatter.match({
  "location": "org.userinyerface.steps.StepDefinitions.open_userinyerface_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on link HERE",
  "keyword": "And "
});
formatter.match({
  "location": "org.userinyerface.steps.StepDefinitions.clickOnLinkHERE()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Cookies were closed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FirstPage"
    }
  ]
});
formatter.step({
  "name": "User click in button NO for cookies",
  "keyword": "When "
});
formatter.match({
  "location": "org.userinyerface.steps.StepDefinitions.userClickInButtonNOForCookies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User insert password",
  "keyword": "And "
});
formatter.match({
  "location": "org.userinyerface.steps.StepDefinitions.user_insert_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User insert nickname",
  "keyword": "And "
});
formatter.match({
  "location": "org.userinyerface.steps.StepDefinitions.userInsertNickname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User insert domain for mail",
  "keyword": "And "
});
formatter.match({
  "location": "org.userinyerface.steps.StepDefinitions.userInsertDomainForMail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select domain code",
  "keyword": "And "
});
formatter.match({
  "location": "org.userinyerface.steps.StepDefinitions.selectDomainCode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on accept terms",
  "keyword": "And "
});
formatter.match({
  "location": "org.userinyerface.steps.StepDefinitions.clickOnAcceptTerms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click button Next",
  "keyword": "And "
});
formatter.match({
  "location": "org.userinyerface.steps.StepDefinitions.clickButtonNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate enter second page",
  "keyword": "Then "
});
formatter.match({
  "location": "org.userinyerface.steps.StepDefinitions.validateEnterSecondPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});