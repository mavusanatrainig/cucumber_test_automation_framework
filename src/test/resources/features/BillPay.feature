
  Feature: Pay Bill
    Scenario Outline: User logged in with valid user credentials
      Given I am on the parabank account service page
      When I click the bill pay link
      And I enter payee name as <payeename>
      And I enter address as <address>
      And I enter city as <city>
      And I enter state as <state>
      And I enter zip code as <zipcode>
      And I enter phone number as <phonenumber>
      And I enter account number as <accountnumber>
      And I enter account number as <verifyaccountnumber>
      And I enter amount as <amount>
      And I click send payment button
      And the system displays "<message>"

      @dev
      Examples:
        | payeename | address         | city         | state        | zipcode | phonenumber | accountnumber | verifyaccountnumber | amount | message                     |
        | Taylor    | 143 Kent Avenue | Johannesburg | Johannesburg | 4000    | 0612345678  | 1122334455    | 1122334455          | 500    | Bill Payment Complete       |
        | Taylor    | 143 Kent Avenue | Johannesburg | Johannesburg | 4000    | 0612345678  | 1122334455    | 1122334455          | KK     | Please enter a valid amount |
        | Taylor    | 143 Kent Avenue | Johannesburg | Johannesburg | 4000    | 0612345678  | 1122334455    | 1122334455          | KK     | Account number is required  |

      @preprod
      Examples:
        | payeename | address         | city         | state        | zipcode | phonenumber | accountnumber | verifyaccountnumber | amount | message                     |
        | Taylor    | 143 Kent Avenue | Johannesburg | Johannesburg | 4000    | 0612345678  | 1122334455    | 1122334455          | 500    | Bill Payment Complete       |
        | Taylor    | 143 Kent Avenue | Johannesburg | Johannesburg | 4000    | 0612345678  | 1122334455    | 1122334455          | KK     | Please enter a valid amount |
        | Taylor    | 143 Kent Avenue | Johannesburg | Johannesburg | 4000    | 0612345678  | 1122334455    | 1122334455          | KK     | Account number is required  |

      @uat
      Examples:
        | payeename | address         | city         | state        | zipcode | phonenumber | accountnumber | verifyaccountnumber | amount | message                     |
        | Taylor    | 143 Kent Avenue | Johannesburg | Johannesburg | 4000    | 0612345678  | 1122334455    | 1122334455          | 500    | Bill Payment Complete       |
        | Taylor    | 143 Kent Avenue | Johannesburg | Johannesburg | 4000    | 0612345678  | 1122334455    | 1122334455          | KK     | Please enter a valid amount |
        | Taylor    | 143 Kent Avenue | Johannesburg | Johannesburg | 4000    | 0612345678  | 1122334455    | 1122334455          | KK     | Account number is required  |

