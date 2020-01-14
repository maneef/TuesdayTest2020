Feature: Login Actions
Test login functionality
Scenario Outline: Successful login with crendentials
Given Navigate to home page
When user enters the username and password "<Username>" "<Password>"
Then Message login successfully

Examples:
|Username|Password|
|Lalitha|Password123|
|Rick|Rick123|
|Andrew|Andrew123|


