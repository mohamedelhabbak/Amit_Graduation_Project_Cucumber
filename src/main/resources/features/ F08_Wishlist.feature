@smoke
  Feature:  F08_Wishlist| user can control  wishlist
    Background: user is at Home Page
    Scenario: user add item to wishlist
      When user click the wishlist button
      Then user can see a green success message displayed

      Scenario: user can see Qty value
        When  user click the wishlist button
        And success message disappear
        And user can go to wishlistPage
        Then user can find the Qty greater than Zero
