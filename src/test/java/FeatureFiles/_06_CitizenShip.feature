Feature: Citizenship Functionality

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should be login successfully
    And Navigate to CitizenShip


  Scenario: Create a Citizenship with parameter
    When Create a CitizenShip name as "Aziz20G35" shortKod as "Aziz35G20"
    Then Success message should be displayed


  Scenario: Create a CitizenShip with parameter Negatif
    When Create a CitizenShip name as "Aziz20G35" shortKod as "Aziz35G20"
    Then Already exist message should be displayed

  Scenario: Delete Citizenship
    When user delete name as "Aziz20G35"
    Then Success message should be displayed