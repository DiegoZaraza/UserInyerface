Feature: Validate Firts Game Page

  Background:
    Given Open userinyerface.com
    And Click on link HERE

  Scenario: Validate Cookies were closed
    When User click in button NO for cookies
    And User insert password
    And User insert nickname
    And User insert domain for mail
    And Select domain code
    And Click on accept terms
    And Click button Next
    Then Validate enter second page