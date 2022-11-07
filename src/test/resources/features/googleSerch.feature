Feature: Google Search functionality
  User Story: as a user, when I am on the google search page
  I should be able to search what ever I want and see relevant information


  Scenario: Search functionally result title verification
    Given User is on Google search page
    When User type apple in the google search and clicks enter
    Then User sees apple - Google Search is in the google title

  @wip
  Scenario: Search functionally result title verification
    Given User is on Google search page
    When User type "tesla" in the google search and clicks enter
    Then User sees "tesla - Google Search" is in the google title