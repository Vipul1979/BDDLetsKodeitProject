Feature:
  Background:
    Given user is on Letskodeit website homepage
    When user click on practice button
    Then user is on practice page

    Scenario: user click on multiple element
      Given user is on practice page at the moment
      When user click on multiple element
      Then user can see all element selected
