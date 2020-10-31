Feature: Search input box

  Background:
    Given User is on the login page
    And User enter valid credentials
    And User clicks on "Users" icon


  @EUG12-289
  Scenario Outline: Searching users from the search input box

    When User enter "<Name>" in the search input box
    Then Grid table should only display containing "<Name>" under "FullName" column
    When User enter "<User ID>" in the search input box
    Then Grid table should only display containing "<User ID>" under "User ID" column
    Examples:
      | Name       | User ID |
      | John Smith | 1745    |
      | Ali Osman  | 1746    |
      | Tim Duncon | 1747    |
      | ali        | 1748    |