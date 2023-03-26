@smoke
  Feature:  F06_homeSliders|user can click on th home page sliders
    Background: user is at Home Page

    Scenario Outline: user can click on the first slider
      When user click on  "<slider>"
      Then user in on the right "<slider>"

      Examples:
        | slider  |
        | iphone  |
        | samsung |
