Feature: Country Functionality
  @SmokeTest
  Scenario: Create a country

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should be login successfully
    And Navigate to Country
    When Create a country
    Then Success message should be displayed