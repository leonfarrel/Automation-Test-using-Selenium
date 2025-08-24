Feature: Checkout Complete
  @Finish-Order-Overview
  Scenario: Finish Order Overview
    Given user is on homepage with username "standard_user" and password "secret_sauce"
    And user click the add to cart button on the Sauce Labs Backpack product
    And user click on the Cart Icon
    And user will be redirect to the Cart Page
    And user click ont the Checkout Button
    And user will be redirect to the Checkout Page
    And user input first name with "Jonathan"
    And user input last name with "Joestar"
    And user input zipcode with "123456"
    And user click on the Continue Button
    And user will be redirect to the Checkout Overview Page
    And user click on the Finish Button
    And user will be redirect to the checkout complete
    When user click on the Back Home Button
    Then user will be redirect to homepage