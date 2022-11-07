@smoke @Regression
Feature:
  User story:
  As a user, I should be able to login with correct credentials to different accounts
  and dashboard should be displayed.
  Accounts are: librarian, student, admin

  Background: user is expected in the login page
    Given user is on the library log in page

  @smoke @librarian @employee
  Scenario: Login as a librarian
    #Given user is on the library log in page
    When user enter librarian username
    And user enter librarian password
    Then user should see dashboard
@student
    Scenario: Login as a student
      #Given user is on the library log in page
      When user enter student username
      And user enter student password
      Then user should see dashboard
@admin @employee @smoke
  Scenario: Login as admin
    #Given user is on the library log in page
    When user enter admin username
    And user enter admin password
    Then user should see dashboard