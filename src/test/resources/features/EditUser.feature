Feature: EUG12-LibraryCT Edit user info

	#{color:#de350b}*U.S.:*{color}
	#
	#"As a librarian, I should be able to add users from users page."
	#
	#{color:#de350b}*A.C.:*{color}
	#
	#Librarians able to edit user info.
  @EUG12-296 @wip
  Scenario: to close the add user window with close button
    Given logged as a librarian
    When click user button and go to user management page
    When in user management click edit user button from any user line
    Given write a "user name" in full name box
    Then Click save change button