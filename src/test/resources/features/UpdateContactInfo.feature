@update
Feature: Update Profile

  Scenario Outline: Update Profile
    Given the user is logged in to the Parabank websit
    When the user clicks on the Update Contact Info tab

    And the user updates their first name to "<FirstName>"
    And the user updates their last name to "<LastName>"
    And the user updates their address to "<Address>"
    And the user updates their city to "<City>"
    And the user updates their state to "<State>"
    And the user updates their zip code to "<ZipCode>"
    And the user updates their phone number to "<Phone>"
    Then the user clicks the Update Profile button

    Examples:
      | FirstName | LastName | Address     | City | State   | ZipCode | Phone      |
      | ashelu    | mfov     | 18 West str | Jozi | Gauteng | 0923    | 0812133609 |

