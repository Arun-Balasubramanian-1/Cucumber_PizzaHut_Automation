Feature: This feature will be used to automate PizzaHut Website

  Scenario: This scenario will be used to place a order
    Given I have launched the application
    When I enter location as "Pune"
    And I select first suggestion from list
    Then I should land on deals page
    And I select the tab as "Pizzas"
    And I select the pizza as "Schezwan Margherita"
    Then I should see "Schezwan Margherita" pizza added to cart
    And I click on checkout button
    Then I should land on checkout page
    And I enter personal details
    | Name | Arun |
    | Mobile | 9989898989 |
    | Email | arun@yopmail.com |
    And I enter address details
    | 12 main street |
    | some landmark |
    Then I should see three payment options
    | Online Payment |
    | Paytm |
    | Cash |
    Then I select the payment option as "Cash"
    
