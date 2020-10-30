@snapdeal
Feature: add to cart
  I want add blackberry phone to cart 

  @blackberry
  Scenario: add blackberry to cart
    Given I am user of snapdeal application
    When I click on Smartphones
    And select the blackberry phone
    And add to cart
    Then I able to see the mobile on cart
    And click on remove from cart
    Then I can able to come on main window and close
