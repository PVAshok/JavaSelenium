Feature: Feature to test login functionality
	
	
  Scenario: check login succesful with valid credentials
    Given User is on login page
    When user enters username and password
    And Clicks on Login button
    Then user navigated to home page
