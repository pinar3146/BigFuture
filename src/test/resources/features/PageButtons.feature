Feature: Page Buttons


  @EUG12-292
  Scenario Outline: Changing page number under the table

    When User click on page number as "<page number>"
    Then User should be able to see "<entries>" users on the table

    Examples:
      | page number | entries  |
      | 2           | 11 to 20 |
      | 3           | 21 to 20 |
      | 4           | 31 to 40 |

  Scenario: Changing the page by clicking page icons
    When User click on "last" page
    Then User should be able to see "last" page on the table
    Then User click on "first" page
    Then User should be able to see "first" page on the table
    Then User click on "next" page
    Then User should be able to see "next" page on the table
    Then User click on "prev" page
    Then User should be able to see "prev" page on the table
		