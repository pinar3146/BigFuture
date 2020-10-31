Feature:

	Background:
		Given User is on the login page
		And User enter valid credentials
		When User clicks on "Users" icon

	@EUG12-291
	Scenario: Editing user Informations
		Scenario:
		Then user click on First Edit User icon on the table
		Then User should be able to see "Edit User Information" popup page
		Then User enter Full Name input box as a name "Olcay Smith"
		Then User close Save changes button under the page
		Then User should be able to see edited "Olcay Smith" name first row on the table
		
		