Feature: Dropdown
  @Drop
  Scenario: User should see 12 months in the month dropdown
    Given User is on the dropdown page
    Then user should see info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |
