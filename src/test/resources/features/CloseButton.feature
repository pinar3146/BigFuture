Feature: To close the add user window with "close" button

  @EUG12-295
  Scenario: to close the add user window with close button
    Given logged as a librarian
    When click user button and go to user management page
    When in user management page click "Add user "button
    Given write a "user name" in full name box
    Then Click close button to cancel