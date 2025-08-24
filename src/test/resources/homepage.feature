Feature: Home Page

  @Add-Cart-Backpack
  Scenario: Add Sauce Backpack to cart
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click the add to cart button on the Sauce Labs Backpack product
    Then user will see the Remove button at the Sauce Labs Backpack Product

  @Add-Cart-Bike-Light
  Scenario: Add Sauce Bike Light to cart
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click the add to cart button on the Sauce Labs Bike Light product
    Then user will see the Remove button at the Sauce Labs Bike Light Product

  @Add-Cart-Bolt-Shirt
  Scenario: Add Sauce Bolt Shirt to cart
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click the add to cart button on the Sauce Labs Bolt Shirt product
    Then user will see the Remove button at the Sauce Labs Bolt Shirt Product

  @Add-Cart-Fleece-Jacket
  Scenario: Add Sauce Fleece Jacket to cart
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click the add to cart button on the Sauce Labs Fleece Jacket product
    Then user will see the Remove button at the Sauce Labs Fleece Jacket Product

  @Add-Cart-Onesie
  Scenario: Add Sauce Onesie to cart
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click the add to cart button on the Sauce Labs Onesie product
    Then user will see the Remove button at the Sauce Labs Onesie Product

  @Add-Cart-Red-Shirt
  Scenario: Add Sauce Red Shirt to cart
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click the add to cart button on the Sauce Labs Red Shirt product
    Then user will see the Remove button at the Sauce Labs Red Shirt Product

  @Remove-Backpack
  Scenario: Remove Sauce Backpack from cart
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click the add to cart button on the Sauce Labs Backpack product
    And user click the Remove button on the Sauce Labs Backpack Product
    Then user will see the Add to Cart button at the Sauce Labs Backpack Product

  @Remove-Bike-light
  Scenario: Remove Sauce Bike Light from cart
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click the add to cart button on the Sauce Labs Bike Light product
    And user click the Remove button on the Sauce Labs Bike light Product
    Then user will see the Add to Cart button at the Sauce Labs Bike Light Product

  @Remove-Bolt-Shirt
  Scenario: Remove Sauce Bolt Shirt from cart
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click the add to cart button on the Sauce Labs Bolt Shirt product
    And user click the Remove button on the Sauce Labs Bolt Shirt Product
    Then user will see the Add to Cart button at the Sauce Labs Bolt Shirt Product

  @Remove-Fleece-Jacket
  Scenario: Remove Sauce Fleece Jacket from cart
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click the add to cart button on the Sauce Labs Fleece Jacket product
    And user click the Remove button on the Sauce Labs Fleece Jacket Product
    Then user will see the Add to Cart button at the Sauce Labs Fleece Jacket Product

  @Remove-Onesie
  Scenario: Remove Sauce Onesie from cart
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click the add to cart button on the Sauce Labs Onesie product
    And user click the Remove button on the Sauce Labs Onesie Product
    Then user will see the Add to Cart button at the Sauce Labs Onesie Product

  @Remove-Red-Shirt
  Scenario: Remove Sauce Red Shirt from cart
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click the add to cart button on the Sauce Labs Red Shirt product
    And user click the Remove button on the Sauce Labs Red Shirt Product
    Then user will see the Add to Cart button at the Sauce Labs Red Shirt Product

  @Access-Backpack-Product-Detail-Page
  Scenario: Access Backpack Product Detail Page
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click on the Sauce Labs Backpack product name
    Then user will be redirect to the Sauce Lab product detail page

  @Access-Bike-Light-Product-Detail-Page
  Scenario: Access Bike LightProduct Detail Page
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click on the Sauce Labs Bike Light product name
    Then user will be redirect to the Sauce Lab product detail page

  @Access-Bolt-Shirt-Product-Detail-Page
  Scenario: Access Bolt Shirt Product Detail Page
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click on the Sauce Labs Bolt Shirt product name
    Then user will be redirect to the Sauce Lab product detail page

  @Access-Fleece-Jacket-Product-Detail-Page
  Scenario: Access Fleece Jacket Product Detail Page
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click on the Sauce Labs Fleece Jacket product name
    Then user will be redirect to the Sauce Lab product detail page

  @Access-Onesie-Product-Detail-Page
  Scenario: Access Backpack Product Detail Page
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click on the Sauce Labs Onesie product name
    Then user will be redirect to the Sauce Lab product detail page

  @Access-Red-Shirt-Product-Detail-Page
  Scenario: Access Backpack Product Detail Page
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click on the Sauce Labs Red Shirt product name
    Then user will be redirect to the Sauce Lab product detail page

  @Access-Cart_Page
  Scenario: User access the Cart Page
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click on the Cart Icon
    Then user will be redirect to the Cart Page

  @Logout
  Scenario: User Logout of the App
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    When user click on the Burger Menu Button
    And user click on the Logout Button
    Then user will be redirect to the Login Page

