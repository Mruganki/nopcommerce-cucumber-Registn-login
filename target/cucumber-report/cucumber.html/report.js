$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test",
  "description": "As a User I want to login into nop commerce website",
  "id": "login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5437594900,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#@Sanity"
    },
    {
      "line": 5,
      "value": "#  Scenario: User should navigate to longin page Successfully"
    },
    {
      "line": 6,
      "value": "#    Given I am on homepage"
    },
    {
      "line": 7,
      "value": "#    When I click on login link"
    },
    {
      "line": 8,
      "value": "#    Then I should navigate to login page successfully"
    },
    {
      "line": 9,
      "value": "#"
    }
  ],
  "line": 11,
  "name": "User should login Sucessfully with valid credentials",
  "description": "",
  "id": "login-test;user-should-login-sucessfully-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter email \"topper5@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter passwork \"prime123\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should login sucessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationstepsDefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 237499200,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepsDefs.iClickOnLoginLink()"
});
formatter.result({
  "duration": 1277423000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "topper5@gmail.com",
      "offset": 15
    }
  ],
  "location": "LoginstepsDefs.iEnterEmail(String)"
});
formatter.result({
  "duration": 2144877200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prime123",
      "offset": 18
    }
  ],
  "location": "LoginstepsDefs.iEnterPasswork(String)"
});
formatter.result({
  "duration": 2136703300,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepsDefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 484205000,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepsDefs.iShouldLoginSucessfully()"
});
formatter.result({
  "duration": 42187100,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Welcome to our store]\u003e but was:\u003c[About login / registration]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.nopcommerce.demo.stepdefs.LoginstepsDefs.iShouldLoginSucessfully(LoginstepsDefs.java:42)\r\n\tat ✽.Then I should login sucessfully(src/test/java/resources/featurefile/login.feature:17)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1156782100,
  "status": "passed"
});
});