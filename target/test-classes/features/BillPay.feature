@billpay
Feature: Pay Bill
  As a logged-in user of the ParaBank application,
  I want to be able to pay a bill by entering payee details and payment information,
  So that I can complete a transaction successfully.

  Background:
    Given the user is logged in to the Parabank website

  Scenario Outline: User completes bill payment with valid details
    When I click the bill pay link
    And I enter payee name as "<payeename>"
    And I enter address as "<address>"
    And I enter city as "<city>"
    And I enter state as "<state>"
    And I enter zip code as "<zipcode>"
    And I enter phone number as "<phonenumber>"
    And I enter account number as "<accountnumber>"
    And I enter verify account number as "<verifyaccountnumber>"
    And I enter amount as "<amount>"
    And I click send payment button
    Then the system displays success message "<succesmessage>"

    Examples:
      | payeename | address         | city         | state   | zipcode | phonenumber | accountnumber | verifyaccountnumber | amount | succesmessage         |
      | Taylor    | 143 Kent Avenue | Johannesburg | Gauteng | 4000    | 0612345678  | 1122334455    | 1122334455          | 500    | Bill Payment Complete |
