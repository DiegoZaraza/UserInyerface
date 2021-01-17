Feature: Validate First Page

  Background:
    Given Open userinyerface.com
    And Click on link HERE

  Scenario: Validate load page correct
    When User click in button NO for cookies
    And User insert password