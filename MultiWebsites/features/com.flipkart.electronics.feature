@filpkart	
Feature: add to cart
  I want add an item to cart in flipkart

  @Mobile 
  Scenario: add one electronic item to cart
    Given I am user of flipkart application
    When I click on moblies
    And select the one moblie
    And click on add to cart
    Then I able to see the mobile on cart
    And click on remove from cart

 