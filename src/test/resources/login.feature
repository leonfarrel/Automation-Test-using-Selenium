@Login
Feature: Login

  @Valid-Login
  Scenario: Login with valid username and password
    Given user is on login page
    When user input username text box with valid data such as "standard_user"
    And user input password text box with valid data such as "secret_sauce"
    And user click login button
    Then user will be redirect to homepage

  @Invalid-Login
  Scenario: Login with invalid username and password
    Given user is on login page
    When user input username text box with invalid data such as "locked_out_user"
    And user input password text box with invalid data such as "wrong_password"
    And user click login button
    Then user is on login page
    And user see error message

  @Problem-User
  Scenario: Login with problem username and password
    Given user is on login page
    When user input username text box with problem data such as "problem_user"
    And user input password text box with valid data such as "secret_sauce"
    And user click login button
    Then user will be redirect to homepage

  @Performance-Glitch
  Scenario: Login with glitch username and password
    Given user is on login page
    When user input username text box with glitch data such as "performance_glitch_user"
    And user input password text box with valid data such as "secret_sauce"
    And user click login button
    Then user will be redirect to homepage

  @Error-User
  Scenario: Login with error username and password
    Given user is on login page
    When user input username text box with error data such as "error_user"
    And user input password text box with valid data such as "secret_sauce"
    And user click login button
    Then user will be redirect to homepage

  @Visual-User
  Scenario: Login with visual username and password
    Given user is on login page
    When user input username text box with visual data such as "visual_user"
    And user input password text box with valid data such as "secret_sauce"
    And user click login button
    Then user will be redirect to homepage

  @Empty-Field
  Scenario: Login with empty field username and password
    Given user is on login page
    When user click login button
    Then user is on login page
    And user see error message

