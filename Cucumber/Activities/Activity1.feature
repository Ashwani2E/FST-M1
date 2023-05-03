Feature: Basic Syntax

  @FirstActivity
  Scenario: Testing CRM system
    Given user is on the CRM system they click the navigation link
    Then get the title of website
    Then if it matches with SuiteCRM
    Then close the browser
