@register @smoke @regression
Feature: Register user

  Scenario Outline:
    Given I am on the parabank website landing page
    When I click the register link
    And I enter name as "<first_name>"
    And I enter lastname as "<lastname>"
    And I enter address
    And I enter city
    And I enter state
    And I enter zipcode
    And I enter phone
    And I enter ssn
    And I enter username as "<username">
    And I enter password as "<password>"
    And I enter confirm as "<confirm>"
    Then I click the register button
    And the system confirms the registration
    Examples:
      | first_name | lastname | username | password | confirm |
      | Vusi       | Pelo     | mavusana | kamo     | kamo    |
      | p-fname    |p-lname   | ashely     |pager     |pager    |
      | p-fname    |p-lname   | thandiwe     |sweet    |sweet    |

