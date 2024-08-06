Feature: Account Overview

  Scenario Outline: User views account overview

    Given user is logged in to the Parabank website
    When user navigates to the "Account Overview" page
    Then user should see a list of all accounts
    And each account should display the current balance
    And user should see the text "Balance includes deposits that may be subject to holds"
    Examples:

      | Account  | Balance | Available Amount | Total      |
      | 15120    | $515.50 | $515.50          | $515.50    |
       