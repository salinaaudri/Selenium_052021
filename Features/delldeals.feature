Feature: Dell Deals for Home User
@delldeals
Scenario Outline: User goes to Dell Laptop for Home section and soft by lowest price
    Given User landing Dell "<Homepage>"
    When User hover mouse over to Deals
    Then User hover mouse over to Laptop Deals
    Then User hover mouse over to For Home and click on it.
    Then User lands on Laptop Deals page
    When User select Lowest Price from the drop down
    Then User sees lowest priced laptop top of the list

    Examples: 
      | Homepage  |
      | https://www.dell.com/en-us |