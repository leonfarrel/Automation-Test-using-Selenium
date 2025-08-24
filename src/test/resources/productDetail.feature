Feature: Product Detail Page

  @Add-item
  Scenario: Add item in Product Detail Page
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    And user click on the Sauce Labs Backpack product name
    And user will be redirect to the Sauce Lab product detail page
    When user click on the Add to Cart page
    Then user will see the Remove button

  @Remove-item
  Scenario: Remove item in Product Detail Page
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    And user click on the Sauce Labs Backpack product name
    And user will be redirect to the Sauce Lab product detail page
    When user click on the Add to Cart page
    And  user click on the Remove button
    Then user will see tje Add tp Cart button

  @Back-to-Products
  Scenario: Back to Products
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    And user click on the Sauce Labs Backpack product name
    And user will be redirect to the Sauce Lab product detail page
    When user click on the Back to Product button
    Then user will be redirect to homepage

  @Access-Cart
  Scenario: Access Cart from Product Detail Page
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    And user click on the Sauce Labs Backpack product name
    And user will be redirect to the Sauce Lab product detail page
    When user click on the Cart Icon
    Then user will be redirect to the Cart Page



