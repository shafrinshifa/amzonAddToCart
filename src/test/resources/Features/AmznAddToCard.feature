Feature: Amazon Page Test

  Scenario Outline: AddToCard Scenario
    Given User Should on the login page
    And user should enter the valid "<username>""<password>"
    When user should click the login btn
    And user should search "<mobile>"
    Then user should add the mobile to the card
    And user give the valid details for the payment details and "<Address>"

    Examples: 
      | username                 | password   | mobile   | Address |
      | shafrinshifa64@gmail.com | 9600282648 | iphone15 | chennai |
 