#Author: andreagm_17@hotmail.com
@tag
Feature: Search in Computrabajo
  As a web user
  I want to search in computer work
  to find job offers

  @tag2
  Scenario: consult offers in computrabajo
    Given that Andrea wants to enter computrabajo to search for offers.
    When you enter the information
      | area   | place    |
      | tester | Arequipa |
    Then you should see all related offers.
