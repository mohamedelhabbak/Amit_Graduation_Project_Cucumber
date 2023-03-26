@smoke
  Feature:  F07_followUs|user can follow the page
    Background: user is at Home Page

    Scenario Outline:user can click the link and go to follow the page
      When user click on "<Window>" icon
      And user switch to the new Window
      Then user is in the Facebook Page"<link>"
      And user close the new window
      Examples:
        | link                                 |Window|
        | https://www.facebook.com/nopCommerce | Facebook|
        |https://twitter.com/nopCommerce       |Twitter  |
      |https://demo.nopcommerce.com/new-online-store-is-open|Rss     |
      |https://www.youtube.com/user/nopCommerce|Youtube|
