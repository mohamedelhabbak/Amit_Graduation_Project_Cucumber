@smoke
Feature: F01_Register | users could register with new accounts

  Scenario Outline: guest user could register with valid data successfully
    Given user go to register page
    When user enter all valid credentials"<gender>"
    And user enter first and last name "Mohamed" and "Elhabbak"
    And  user enter date of birth"9""September""1999"
    And  user enter email "<email>" field
    And  user fills Password fields "P@ssw0rd" "P@ssw0rd"
    And  user clicks on register button
    Then  success message is displayed
    Examples:
      | gender |email|
      | male   |test@example.com|
      | female |desdft@temil.com|
