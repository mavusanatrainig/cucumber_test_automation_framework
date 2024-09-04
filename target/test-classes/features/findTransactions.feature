@find @smoke @regression
Feature: Find Transactions on Parabank

  Background:
    Given I am on the Parabank Find Transactions page

  Scenario Outline: Find transactions by Transaction ID
    Given I select account "<account>" from the dropdown
    When I enter transaction ID "<transactionID>" in the "Find by Transaction ID" field
    And I click the "Find Transactions" button
    Then I should see the transactions with transaction ID "<transactionID>"
    Examples:
      | account | transactionID |
      | 15009   | 12345         |
      | 15010   | 67890         |

  Scenario Outline: Find transactions by Date
    Given I select account "<account>" from the dropdown
    When I enter date "<date>" in the "Find by Date" field
    And I click the "Find Transactions" button
    Then I should see the transactions from date "<date>"
    Examples:
      | account | date       |
      | 15009   | 01-01-2024 |
      | 15010   | 02-15-2024 |

  Scenario Outline: Find transactions by Date Range
    Given I select account "<account>" from the dropdown
    When I enter start date "<startDate>" and end date "<endDate>" in the "Find by Date Range" fields
    And I click the "Find Transactions" button
    Then I should see the transactions between "<startDate>" and "<endDate>"
    Examples:
      | account | startDate  | endDate    |
      | 15009   | 01-01-2024 | 01-31-2024 |
      | 15010   | 02-01-2024 | 02-28-2024 |

  Scenario Outline: Find transactions by Amount
    Given I select account "<account>" from the dropdown
    When I enter amount "<amount>" in the "Find by Amount" field
    And I click the "Find Transactions" button
    Then I should see the transactions with amount "<amount>"
    Examples:
      | account | amount  |
      | 15009   | 100.00  |
      | 15010   | 4500.00 |