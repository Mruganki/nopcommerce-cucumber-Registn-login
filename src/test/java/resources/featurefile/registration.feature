Feature: Registration functionality test

  As a User I should able to register sucessfully

@Sanity
  Scenario: User should be able to Register Sucessfully
    Given I am on homepage
    When I navigate to RegisterLink
    And I select Gender 'Male'
    And I select FirstName "Topper"
    And I select LastName "Prime"
    And I select DOB "12"
    And I select MOB "5"
    And I select YOB "1990"
    And I Enter Email "topper5prime@gmail.com"
    And I Enter Password"prime123"
    And I Enter ConfirmPassword "prime123"
    And I click on 'Registration Button'
    Then I should see text "Your registration completed"


  @Smoke
    Scenario: User should not able to register without First name
    Given I am on homepage
    When I navigate to RegisterLink
    And I click on 'Registration Button'
    Then I should see text "First name is required."below firstname field

  @Regression
  Scenario: User should login Sucessfully with valid credentials
    When I navigate to RegisterLink
    And I select Gender 'Male'
    And I select FirstName "Topper"
    And I select LastName "Prime"
    And I select DOB "12"
    And I select MOB "5"
    And I select YOB "1990"
    And I Enter Email "topper5@gmail.com"
    And I Enter Password"prime123"
    And I Enter ConfirmPassword "prime123"
    And I click on 'Registration Button'
    Then I should see text "Your registration completed"
    And I click logout button
    When I click on login link
    And I enter email "topper5@gmail.com"
    And I enter passwork "prime123"
    And I click on login button
    Then I should login sucessfully
