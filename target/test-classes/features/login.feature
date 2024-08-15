@login @smoke @regression
#Given a wants to login to Parabank website, when a user login with valid credenatials them the system must display the home page.
Feature: Login
  Scenario: User with valid credentials
    Given I have the parabank website URL
    When I enter the username as "mozo"
    And   I enter the password as "1234"
    And I click the login button
    Then The system displays the register page
    And the system displays a message "Welcome Ashly mozo"


  Scenario: User with invalid credentials
    Given I have the parabank website URL
    When I enter the username as "mavusana"
    And   I enter the password as "tele"
    And I click the login button
    Then The system displays the login page
    And the system displays a error message "Error!"