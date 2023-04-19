Feature: Select item from Art galary
  Scenario: test scenario
    Given I am on the Ebay url "https://www.ebay.com"
    When Ebay logo should available
    Then Select Art item
    Then Type as Elephant
    Then Click on search button
