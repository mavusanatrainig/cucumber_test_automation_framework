@register @smoke @regression
Feature: Register user

  Scenario Outline: Register user
    Given I am on the parabank website landing page
    When I click the register link
    And I enter name as "<first_name>"
    And I enter lastname as "<lastname>"
    And I enter address as "<address>"
    And I enter city as "<city>"
    And I enter state as "<state>"
    And I enter zipcode as "<zipcode>"
    And I enter phone as "<phone>"
    And I enter ssn as "<ssn>"
    And I enter username as "<username>"
    And I enter password as "<password>"
    And I enter confirm as "<confirm>"
    Then I click the register button
    And the system confirms the registration
    Examples:
      | first_name | lastname | address     | city    | state | zipcode | phone      | ssn            | username   | password | confirm |
      | Thandiwe   | Murungu  | 78 Primrose | Delmoew | Home  | 2230    | 0834083284 | 80982309480923 | thandiwe07 | ntuli    | ntuli   |


