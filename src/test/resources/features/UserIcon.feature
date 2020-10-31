Feature:User icon

  @EUG12-284
  Scenario: Librarian should be able to see "User Management" page
    Given User is on the login page
    And User enter valid credentials
    When User clicks on "Users" icon
    Then User should be able to see "User Management" headline



