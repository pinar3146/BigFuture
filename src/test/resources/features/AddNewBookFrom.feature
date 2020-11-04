@wip
Feature: librarian should be able to add a book
//Background: user logs in successfully

  Scenario: librarian should be able to add a new book
    Given user logs in successfully
    Given librarian is on the Books page
    And  librarian clicks on AddBook button
    Then  AddBook form opens
    Then librarian adds a BookName
    Then librarian adds an ISBN number
    Then librarian adds the Year
    Then librarian adds the Author
    When librarian clicks the BookCategory dropdown
    Then from dropdown he chooses the category
    Then librarian adds information in the Description
    Then librarian clicks the SaveChanges button


