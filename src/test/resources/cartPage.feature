Feature: Cart Page

  @Add-item-Access-Cart
  Scenario: User add item and access the Cart Page
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    And user click the add to cart button on the Sauce Labs Backpack product
    When user click on the Cart Icon
    Then user will be redirect to the Cart Page

  @Add-item-Access-Cart
  Scenario: User remove item on access the Cart Page
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    And user click the add to cart button on the Sauce Labs Backpack product
    When user click on the Cart Icon
    And user click on the Remove button at the cart page
    Then item will be removed from cart page

  @Return-to-Homepage
  Scenario: User return to homepage
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    And user click on the Cart Icon
    When user click on the Continue Shopping Button
    Then user will be redirect to homepage

  @Add-item-Access-Cart
  Scenario: User checkout backpack
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    And user click the add to cart button on the Sauce Labs Backpack product
    And user click on the Cart Icon
    And user will be redirect to the Cart Page
    When user click ont the Checkout Button
    Then user will be redirect to the Checkout Page


