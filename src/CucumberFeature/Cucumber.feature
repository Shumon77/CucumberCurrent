#Author: your.email@your.domain.com
#Keywords Summary :
Feature: "Regression Testing"

  Background: 
    Given User is in sign in page
    Given User is in the sign in page

  Scenario: "Project Perspectives Testing"
    When User enter right username
    
    I have added a new file here 
    
    Then User enter right password
    And User click on next button

  Scenario: "Project Perspectives Negative Testing"
    When User enter wrong username
    Then User enter wrong password
    And User click on the next button

  Scenario Outline: 
    Examples:

