Feature: Checkout Information

  @Input-Personal-Information
  Scenario: Input Personal Information
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    And user click the add to cart button on the Sauce Labs Backpack product
    And user click on the Cart Icon
    And user will be redirect to the Cart Page
    And user click ont the Checkout Button
    And user will be redirect to the Checkout Page
    And user input first name with "Jonathan"
    And user input last name with "Joestar"
    And user input zipcode with "123456"
    When user click on the Continue Button
    Then user will be redirect to the Checkout Overview Page

  @Input-Personal-Information
  Scenario: Cancel Checkout
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    And user click the add to cart button on the Sauce Labs Backpack product
    And user click on the Cart Icon
    And user will be redirect to the Cart Page
    And user click ont the Checkout Button
    And user will be redirect to the Checkout Page
    When user click on the Cancel Button
    Then user will be redirect to the Cart Page

  @Input-with-Empty-Field
  Scenario: Empty Field Personal Information
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    And user click the add to cart button on the Sauce Labs Backpack product
    And user click on the Cart Icon
    And user will be redirect to the Cart Page
    And user click ont the Checkout Button
    And user will be redirect to the Checkout Page
    When user click on the Continue Button
    Then user will see error message
