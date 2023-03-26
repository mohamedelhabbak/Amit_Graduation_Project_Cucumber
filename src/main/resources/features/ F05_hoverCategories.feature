@smoke
Feature:  F05_hoverCategories|user could hover.

  Scenario: user can hover on a main category and select form a sub category
    Given user is at Home Page
    When user hover on computers
    And  user click on Desktops
    Then user is at the same page of the sub-title