Feature: CitizenShip Functionality
  @RegressionTest
  Scenario: Create a citizenShip

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should be login successfully
    And Navigate to CitizenShip
    When Create a Citizenship
    Then Success message should be displayed