Feature:Citizenship Functionality

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should be login successfully
    And Navigate to CitizenShip

  Scenario: Create a Citizenship with parameter 1
    When Create a CitizenShip name as "AzizAG20" shortKod as "Merk20"
    Then Success message should be displayed

  Scenario: Create a Citizenship with parameter 2
    When Create a CitizenShip name as "AzizAG201" shortKod as "Merk201"
    Then Success message should be displayed
