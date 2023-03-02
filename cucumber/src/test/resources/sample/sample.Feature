
Feature:login page   
Background :
Given I am on the login page 

Scenario outline: login with valid credentials.
Given  User enter the valid credentials "<Username>" and "<password>"
When   I click  on the login button
Then i should be redirected to the home page.

Examples:
|username|                          |password| 
|standard_user|                    |secret_sauce| 
|locked_out_user|                   |secret_ sauce|
|problem_user|                        |secret_sauce|
|performance_glitch_user|              |seret _ sauce|