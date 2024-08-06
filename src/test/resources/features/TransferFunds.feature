Feature: Transfer Funds

  Background: I have logged into the the ParaBank home page

  Scenario Outline: Transferring money from one account to another positive amount
    Given  I have clicked the transfer funds link
    And The system displays the transfer funds page
    When I enter the positive <amount>
    And Select "<fromaccount>"
    And Select "<toaccount>"
    And Click the transfer button
    Then You get a conformation message


    Examples:
      | amount | fromaccount | toaccount |
      | 200    | 14898       | 20559     |


#insufficient funds on the account

  Scenario Outline: Transferring money from one account to another with insufficient funds
    Given  I have clicked the transfer funds link
    And The system displays the transfer funds page
    When I enter more funds than the available <amount>
    And Select "<fromaccount>"
    And Select "<toaccount>"
    And Click the transfer button
    Then You get a conformation message


    Examples:
      | amount | fromaccount | toaccount |
      | 2150   | 14898       | 20559     |



 # Negative outcome of transferring funds
Feature: Transfer Funds

  Background: I have logged into the the ParaBank home page

  Scenario Outline: Transferring money from one account to another
    Given  I have clicked the transfer funds link
    And The system displays the transfer funds page
    When I enter the negative <amount>
    And Select "<fromaccount>"
    And Select "<toaccount>"
    And Click the transfer button
    Then You get a conformation message


    Examples:
      | amount   | fromaccount | toaccount |
      | -1934.50 | 14898       | 20559     |



 #Transferring zero amount of funds
  Scenario Outline: Transferring money from one account to another with zero funds
    Given  I have clicked the transfer funds link
    And The system displays the transfer funds page
    When I enter zero funds <amount>
    And Select "<fromaccount>"
    And Select "<toaccount>"
    And Click the transfer button
    Then You get a conformation message



    Examples:
      | amount | fromaccount | toaccount |
      | 0.00   | 14898       | 20559     |