@search
Feature: Etsy Search functionality
  User Story: As a user i should be able to search  Wooden Spoon in the search box of Etsy.Wooden spoon
  should be displayed as a title

@esty


    Scenario: Title verification
      Given user in Etsy search page
      When User search Wooden Spoon in search box
      Then Title should be displayed as Wooden Spoon