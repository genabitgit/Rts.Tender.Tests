Feature: Check the search form with the most likely data that
  the user enters and to the procurement list

  Scenario: Open the Advanced search page, enter data, click button "search"

    Given open Advanced Search Page
    And user enters price from "0", to "150000"
    And user enters provision size requisition from "25000", to "150000"
    And user enters the start date of publication from "1.10.2019", to "31.10.2019"
    And user enters the end date of publication from "1.10.2019", to "30.11.2019"
    And press show button
    Then the search result should not be empty

