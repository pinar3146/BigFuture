Feature: Borrowing Books Page

  Scenario: Borrowing Books
    Given The user is on the Borrowing Books Page
    And The user should see the user name on the Users  drop down box
    When The user see Borrowed Books title under the Users drop down
    Then The user should see following column names
      | Action              |
      | Book Name           |
      | Borrowed Date       |
      | Planned Return Date |
      | Return Date         |
      | Is Returned?        |