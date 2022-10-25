@Demo
Feature: As a potential client i want to interact with the mobile application

  Background:
    Given The app is loaded correctly

  Scenario Outline: Successful Log In
    When The user logs in the application with: <email>, <password>
    Then Home page is displayed

    Examples:
      | email                    | password    |
      | pruebaqamanual@gmail.com | Crowdar2022 |

  Scenario Outline: Successful Time Entry
    When The user logs in the application with: <email>, <password>
    And Clicks on the plus button
    And Set the hours '<hours>' and minutes '<minutes>'
    And Set the description '<description>'
    And Select the Crowdar Academy project on the Project Menu
    And Clicks on the save button
    Then The time entry is saved

    Examples:
      | email                    | password    | hours | minutes | description        |
      | pruebaqamanual@gmail.com | Crowdar2022 | 02    | 05      | TP Crowdar Academy |