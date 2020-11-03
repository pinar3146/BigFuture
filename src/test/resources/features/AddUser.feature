Feature:To close the add user window with "close" button

  Scenario: to close the add user window with close button
    Given logged as a librarian
    When click user button and go to user management page
    When in user management page click "Add user "button
    Given write a "user name" in full name box
    Given write a "password" in password box
    Given write an email in email box
    And Select "student" in user Group dropdown box
    And Select "active" in  user Status dropdown box
    And write an "address" in address box
    Then Click save change button