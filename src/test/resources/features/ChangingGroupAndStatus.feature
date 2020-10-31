Feature: Changing User Group and Status

	Background:
		Given User is on the login page
		And User enter valid credentials
		When User clicks on "Users" icon

	@EUG12-287

		    Scenario: Selection of User Group and Status
		    Then User select "Student" from "User Group"
		    Then All "Group" column should be contains"Student" on the grid
		    Then "Group" column should not contains any "Librarian" on the grid
		    Then User select "Librarian" from "User Group"
		    Then All "Group" column should be contains "Librarian" on the grid
		    Then "Group" column should not contains any "Student" on the grid
		    
		    Scenario:
		    Then User select "ACTIVE" from "Status"
		    Then All "Status" column should be contains "ACTIVE" on the grid
		    Then "Status" column should not contains any "INACTIVE" on the grid
		    Then User select "INACTIVE" from "Status"
		    Then All "Status" column should be contains "INACTIVE" on the grid
		    Then "Status" column should not contains any "ACTIVE" on the grid
		    
		    
		    
		    
		    
		    
		    