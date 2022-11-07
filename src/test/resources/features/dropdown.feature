Feature: Practice

  @wip
  Scenario: User should see all 12 months in month dropdown
    Given user on the dropdowns page of practice page
    Then user should see information in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | june      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |