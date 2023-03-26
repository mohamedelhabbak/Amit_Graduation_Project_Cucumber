@smoke
Feature: F04_Search | user could search

  Background: user is at Home Page


  Scenario Outline:  user could search using product name
    When  user enter "<search>"
    Then user is on the Correct page
    And user can find relevant results"<search>"

    Examples:
      | search |
      | book   |
      | laptop |
      | nike   |
    #    the book step will fail because not all search OPS have the word Book


  Scenario Outline:
    When  user enter "<searchSku>"
    Then user is on the Correct page
    When   user go to the product details
    Then user can find relevant results with Sku"<searchSku>"
    Examples:
      | searchSku |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |
