@smoke
Feature: Wikipedia Search Functionality and verification

  Background:
    Given User is on Wikipedia home page

  Scenario:Wikipedia search Functionality Title verification
 #Given User is on Wikipedia home page
    When User types Steve Jobs in the wiki search box
    And User clicks wiki search button
    Then User sees Steve Jobs is in the wiki title

  @stef
  Scenario:Wikipedia search Functionality Title verification
   # Given User is on Wikipedia home page
    When User types "Steve jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title
@scenarioOutLinePractice
  Scenario Outline:
    #Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title

    Examples:
      | searchValue       | expectedTitle     |
      | Steve Jobs        | Steve Jobs        |
      | Bill Gates        | Bill Gates        |
      | Cristiano Ronaldo | Cristiano Ronaldo |
      | Elon Musk         | Elon Musk         |
      | Albert Einstein   | Albert Einstein   |
      | Chuck Norris      | Chuck Norris      |
      | Alisher Usmanov   | Alisher Usmanov   |