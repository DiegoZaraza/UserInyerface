$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/MainPage.feature");
formatter.feature({
  "name": "Validate First Page",
  "description": "",
  "keyword": "Feature"
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
  "name": "Validate load page correct",
  "description": "",
  "keyword": "Scenario"
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
formatter.after({
  "status": "passed"
});
});