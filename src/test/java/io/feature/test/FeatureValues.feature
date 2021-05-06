Feature:SmokeTest
@SmokeTest
Scenario Outline: Need to verify the right count of values appear on the screen
Given Navigate exercise1 UI
Then Get the count of values appear on the screen Verify the count is correct  "<ExpResult>"
  

Examples:
| ExpResult |
| 5 | 

Scenario Outline: Need to verify the values on the screen are greater than zero
Given Navigate exercise1 UI
Then  Need to verify the values on the screen are greater than zero Verify the count is correct

Scenario Outline: Need to verify the total balance is correct based on the values listed on the screen
Given Navigate exercise1 UI
Then  Check the total balance is correct and Verify the count is correct  


Scenario Outline: Need to verify the values are formatted as currencies
Given Navigate exercise1 UI
Then  verify the values are formatted as currencies


Scenario Outline: Need to verify the total balance matches the sum of the values
Given Navigate exercise1 UI 
Then  verify the the total balance matches the sum of the values Verify the count is correct


