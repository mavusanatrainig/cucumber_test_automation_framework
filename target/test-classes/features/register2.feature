@register2 @smoke @regression
Feature: Register user

  Scenario Outline:
    Given I am on the parabank website landing page
    When I click the register link
    And I pupulate the registration information
      | first_name   | lastname   | username   | password   | confirm   |
      | <first_name> | <lastname> | <username> | <password> | <confirm> |

    Then I click the register button
    And the system confirms the registration
    Examples:
      | first_name | lastname | username | password | confirm |
      | Vusi       | Pelo     | mavusana | kamo     | kamo    |
      | p-fname    | p-lname  | ashely   | pager    | pager   |
      | p-fname    | p-lname  | thandiwe | sweet    | sweet   |

