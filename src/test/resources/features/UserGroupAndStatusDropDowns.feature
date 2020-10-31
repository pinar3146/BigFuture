Feature:UserGroupAndStatusDropdowns

  Background:
    Given User is on the login page
    And User enter valid credentials
    When User clicks on "Users" icon

  @EUG12-286
  Scenario: User should be able to change "User Group" and "Status"

  Scenario: User Group   and Status dropdown list
    Then "User Group" default selected should be "ALL"
    Then "Status" default selected should be "ACTIVE"
    Then User click on "User Group" dropdown
    Then User should be able to see following:
      | ALL       |
      | Librarian |
      | Student   |

    Then User click on "Status" dropdown
    Then Then User should be able to see following:
      | ACTIVE   |
      | INACTIVE |
				
				
				