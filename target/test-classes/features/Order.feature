Feature: Order Testing

  Scenario: Testing buy Hummingbird Printed Sweater

    Given user logged in system
    And user chose Hummingbird Printed Sweater
    And user added 10 product to cart
    And user confirmed order
    When user buy t-shirt
    Then take screenshot


