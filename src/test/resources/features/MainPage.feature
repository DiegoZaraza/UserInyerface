Feature: Validate First Page

  Background:
    Given Open userinyerface.com
    And Click on link HERE

  Scenario: Validate load page correct
    When User click in button NO for cookies
    And User insert password
    And User insert nickname
    And User insert domain for mail
    And Select domain code
    And Click on accept terms