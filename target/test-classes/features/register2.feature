@register2 @smoke @regression
Feature: Register user

  Scenario: Register user and handle "username taken" error
    Given I am on the parabank website landing page
    When I click the register.htm link
    And I populate the registration information with:
      | first_name | lastname | password | confirm |
      | Vusi       | Pelo     | kamo     | kamo    |
    And I try the following usernames:
      | mavusana  |
      | ashely    |
      | thandiwe  |


    Then the system confirms registration
