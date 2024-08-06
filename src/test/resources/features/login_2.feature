#Given a wants to login to Parabank website, when a user login with valid credenatials them the system must display the home page.
Feature: Login
  Background:
    Given I lauch the parank website
    When I click the register
  Scenario Outline: Login function
    Given I have the parabank website URL
    When I enter the username as "<username>"
    And   I enter the password as "<password>"
    Then The system displays the home page
    And the system displpays a message "<message>"

    Examples:
      | username | password | message           |
      | mavusana | kamo     | welcome Vusi Pelo |
      | mavusana | tele     | invalid use       |


