Feature: Test Login Functionality

	Scenario Outline: Check login is successful with valid credentials
	
	Given Browser is Open
	And User is on login page
	When User enters <username> and <password>
	And User clicks on login
	Then User is navigated to the home page
	
	Examples:
	|username|password|
	|Tin     |12345|