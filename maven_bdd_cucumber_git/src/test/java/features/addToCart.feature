Feature: Add to cart functionality

@addtocart
Scenario Outline: To verify add to cart in the saucedemo application

Given User is logged into saucedemo app with valid creds "<user>" and "<pass>" 
And User is on the dashboard page
When User click on the Add to Cart button for any item
Then Verify that item should be added to the cart successfully
And Close the browser

Examples:

|user|pass|
|standard_user|secret_sauce|