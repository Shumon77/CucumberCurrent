#Author: your.email@your.domain.com
#Keywords Summary :
Feature: Validating Sign In page

  Scenario: DataDriven Testing

  Scenario Outline: 
    Given user is in the signin page
    When user enters "<UserID>" in the userid textbox
    Then user click on SignIn button
    And user is in the expected "<Webpage>"

    Examples: 
      | UserID             | Webpage                                                                                                                                                                                                       |
      | tom.tom@icloud.com | https://login.yahoo.com/?.lang=en-US&src=homepage&specId=yidregsimplified&activity=ybar-signin&pspid=2023538075&.done=https%3A%2F%2Fwww.yahoo.com%2F&done=https%3A%2F%2Fwww.yahoo.com%2F&intl=us&prompt=login|
