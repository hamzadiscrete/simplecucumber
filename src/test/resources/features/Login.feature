Feature: Automation of Mont5

  @RandomBagCategoryProductCheckout
  Scenario Outline: Mont5 Checkout
    Given I am on Mont5 Home page
    Then I Click Login my account
    Then I Enter  "<email>" and "<password>" credentials
    Then I Select a random category of Bags
    Then Proceed to checkout and redirect to paypal
    Then I am on Mont5 Home page
    Then I logout
    Examples:
      | email | password |
      |test@test.com            |test_123 |

