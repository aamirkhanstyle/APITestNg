Feature: login functionality

//@Reg @smoke
//Scenario: Verify successful login when username and password is correct
//Given User launch site URL
//When User enter correct User and password
//And user click on login button
//Then Validate user navigate to home page


@smoke
Scenario Outline:: Verify sucesful login when username and password is correct
When User enter correct "<username>" and "<password>"
And user click on login button
Then Validate user navigate to home page

Examples:
|username|password|
|Test|Automation| 
|Test1|Automation1|
|Test2|Automation2|
|standard_user|secret_sauce|
|locked_out_user|secret_sauce|
|problem_user|secret_sauce|
|performance_glitch_user|secret_sauce|