Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User is on Login Page
    When User enter username and password
    And User click on login button
    Then User is on Inventory page

Feature: Add To cart and checkout

  Scenario: Add item to cart and checkout the product
    Given User is logged in and clicks on add to cart button
    When User navigates to shopping cart
    And User enters details and checksout
    Then User is on Thank you page
