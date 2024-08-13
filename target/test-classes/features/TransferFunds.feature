Feature: Transfer Funds

  Background: I have logged into the the ParaBank home page

  Scenario Outline: Transferring money from one account to another
    Given  I have clicked the transfer funds link
    And The system displays the transfer funds page
    When I enter the positive <amount>
    And Select "<fromaccount>"
    And Select "<toaccount>"
    And Click the transfer button
    Then You get a conformation message "<message>"


    Examples:
      | amount   | fromaccount | toaccount | message            |
      | 200      | 14898       | 20559     | Negative           |
      | 2150     | 14898       | 20559     | Positive           |
      | -1934.50 | 14898       | 20559     | Insufficient funds |
      | 0.00     | 14898       | 20559     | No funds           |

