Feature: Feature to test google search functionality

	Scenario: Validate Google Search is working
	
		Given Browser is open
		And User is on Google Search page
		When User enters a text in the search box
		And click Enter
		Then User is navigated to Search Results