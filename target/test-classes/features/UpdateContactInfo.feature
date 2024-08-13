Feature: Update Profile
  Scenario Outline: Update Profile

    Given  User is logged in to PARA BANK website
    When User clicks on Update Contact Info tab
    And User should be taken to Update Profile screen where they can update their details
    And User should be able to update their <FirstName>
    And User should be able to update their "<LastName>"
    And User should be able to update their <"Address">
    And User should be able to update their <"City">
    And User should be able to update their <"State">
    And User should be able to update their <"Zip Code">
    And User should be able to update their <"Phone">
    Then click

    
    Examples:
    |FirstName    |Last Name    |Address    |City    |State   |Zip Code|Phone       |
    |Tsepiso      |Ramugondo    |18 West str|Jozi    |Gauteng |   0923 |0812133609  |
    |Themba       |Vuzwayo      |09 South   |HumCrest|Gauteng |  0971  |0812133686  |
       