Feature: Login functionality
Scenario Outline: To verify successful login with valid credentials

Given User is on sauce demo login page
When User enters valid credentials with "<username>" and "<password>"
And User clicks on login button
Then User should be navigated to home page

Examples: 
|username|password|
|standard_user|secret_sauce| 