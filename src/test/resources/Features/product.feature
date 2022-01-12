Feature: To validate the search functionality of amazon page
@sanity
  Scenario: To check the searchablity of desired product
    Given user need to be in amazon page
    When user will enter product name in search box
      | product    |
      | iphone     |
      | mac laptop |
    And use clicks search button
    Then user will redirect tp product page
