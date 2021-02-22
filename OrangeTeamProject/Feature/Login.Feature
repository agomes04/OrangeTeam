Feature: Login testing feature

Scenario: As an AutomationPoint72 user, I am able to login with valid credentials. 
	Given Open the browser
	When Send URL
	And Click Sign in Button
	And Send Valid Email
	And Send Valid Password
	And Click Submit button
	Then Validate Login
	When close the browser