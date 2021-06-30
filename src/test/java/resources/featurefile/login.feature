Feature: Login Test
  As a User I want to login into nop commerce website

#@Sanity
#  Scenario: User should navigate to longin page Successfully
#    Given I am on homepage
#    When I click on login link
#    Then I should navigate to login page successfully
#
@Sanity
    Scenario: User should login Sucessfully with valid credentials
      Given I am on homepage
      When I click on login link
      And I enter email "topper5@gmail.com"
      And I enter passwork "prime123"
      And I click on login button
      Then I should login sucessfully
#
@Sanity
  Scenario Outline: verify the error message with invalidcredentials
    Given I am on homepage
    When I click on login link
    And I enter email "<email>"
    And I enter passwork "<password>"
    And I click on login button
    Then I should see the error message "<errorMessage>"
    Examples:
      | email            | password | errorMessage                                                                               |
      | acd123@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.  No customer account found |
      |                  | xyz123   | Login was unsuccessful. Please correct the errors and try again. No customer account found |
      | acd123@gmail.com |          | Login was unsuccessful. Please correct the errors and try again. No customer account found |
      | xyz123@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again. No customer account found |


