@smoke
  Feature: F03_Currencies |user could select currency
    Scenario: guest user could select currency successfully
      Given user is at Home Page
      When  user can select euro currency
      Then user can find Euro Symbol at All The products

