Feature: ShowingRecord

	Background:
		Given User is on the login page
		And User enter valid credentials
		When User clicks on "Users" icon


	@EUG12-288
	Scenario: Changing book record from  Show dropdown

		    Then default select option of show record should be 10
		    Then User click on show dropdown
		    Then User should be able to see following record options:
		    |5|
		    |10|
		    |15|
		    |50|
		    |100|
		    |200|
		    |500|
		    Then User select 100 from show record option
		    Then User should be able to see 100 user on the grid
		    Then System should be able to show "Showing 1 to 100" text under the grid
		    Then User select 200 from show record option
		    Then User should be able to see 200 user on the grid
		    Then System should be able to show "Showing 1 to 200" text under the grid
		    