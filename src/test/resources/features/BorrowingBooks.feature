Feature: Borrowing Books Display

  Scenario: Returning the borrowed books
    Given The user is on the Borrowing Books Page
    When The user clicks to the return button
    Then The user sees the following options changed
    |Return Book|
    |Return Date|
    |Is Returned ?|