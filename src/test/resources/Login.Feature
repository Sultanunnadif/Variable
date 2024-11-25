Feature: Login Shoppee
  Scenario Login with valid username & password
    Given user is on login page
    When user input email text box with "sultanunnadif@gmail.com"
    And user input password on text box "dummypassword"
    And user click Login button
    Then user will redirect to homepage

  Scenario Login with Invalid username or password
    Given user is on login page
    When user input email text box with "sultanunnadif25@gmail.com"
    And user input password on text box "dummypassword25"
    And user click Login button
    Then user or password not found

Feature: Search Item
  Scenario Looking for item to buy
    Given user on homepage
    When  user input item name on search box
    And user click on search button
    Then user will redirect to item list fit the text box

  Scenario Looking for item to buy but not available
    Given user on homepage
    When  user input item name on search box
    And user click on search button
    Then user will redirect to new page with "there's no item available"

Feature: Check Out
  Scenario Check out the item
    Given user on item page
    When  user click on check out button
    And user choose payment method
    And user choose courier
    Then user get receipt and the item proceed to send process

  Scenario Check out item but lack token/money
    Given user on item page
    When  user click on check out button
    And user choose payment method
    And user choose courier
    Then user get warning "not enough token to buy"

Feature: Discount Event
  Scenario user get discount for certain amount of time during event
    Given user on homepage
    When  user pick item to buy during discount event
    And user would have option to use the discount coupon
    Then user get discount when check out

  Scenario user get discount but choose to pay normally
    Given user on homepage
    When  user pick item to buy during discount event
    And user would have option to use the discount coupon but user choose not to
    Then user pay normally