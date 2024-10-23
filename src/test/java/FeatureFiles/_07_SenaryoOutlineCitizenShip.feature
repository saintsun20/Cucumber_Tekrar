Feature: Citizenship Functionality

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should be login successfully
    And Navigate to CitizenShip


  Scenario Outline: Create a Citizenship with parameter

    When Create a CitizenShip name as "<name>" shortKod as "<shortName>>"
    Then Success message should be displayed
    When Create a CitizenShip name as "<name>" shortKod as "<shortName>"
    Then Already exist message should be displayed
    When user delete name as "<name>>"
    Then Success message should be displayed

    Examples:
      | name    | shortName    |
      | is71m22CS12 | is71mCS12shor1t |
      | is71m22CS13 | is71mCS13shor1t |
      | is71m22CS14 | is71mCS14shor1t |
      | is71m22CS15 | is71mCS15shor1t |
      | is71m22CS16 | is71mCS16shor1t |

    # dataProvider (TestNG için), Senaryo Outline (Cucumber)
    # görevi verilen her değer için, tüm senaryo çalışır.

  #TODO : States menusu create, update, delete olarak, Senaryo ouline şeklinde 5 kez çalıştırınız.