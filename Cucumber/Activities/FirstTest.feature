Feature: Basic Syntax

   @FirstScenario
   Scenario: Testing TS homepage
     Given user is on the TS homepage
     When they click the About Us link
     Then they are redirected to the About Us page
     Then close the browser

