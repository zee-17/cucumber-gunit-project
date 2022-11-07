Feature: User should be able to login with valid credential
  @webtableApp
  Scenario: Login scenario with 1 param
    Given user is on the login page of web table app
    When  user enters username "Test"
    And user enters password "Tester"
    And  uesr click to login button
    Then user should see url contains orders

  Scenario: Login scenario with 1 param
    Given user is on the login page of web table app
    When  user enters username "Test"
    And user enters password "Tester"
    And  uesr click to login button