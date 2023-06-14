Feature: register and login the page

Scenario: first register the pedstore page

	Given User is on pedstore Landing page
	When user first register in login page
	Then user fill the user information
	And user also fill the Account information


Scenario: login the page
	Given User is on pedstore Landing page
	When user first login the page
	Then user fill the login credentials
	
