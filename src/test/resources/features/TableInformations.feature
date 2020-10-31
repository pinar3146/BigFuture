Feature: Table Informations

	Background:
		Given User is on the login page
		And User enter valid credentials
		When User clicks on "Users" icon


	@EUG12-290
	Scenario: User should be able to see other users information on the table

		    Scenario:
		    Then Table column name should be following:
		    |Actions|
		    |User ID|
		    |Full Name|
		    |Email|
		    |Group|
		    |Status|
		    Then User ID contains only numbers
		    Then Email contains only emails
		
		