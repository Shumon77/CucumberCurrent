Feature: Validating Log In page

  Scenario: Datadriven Testing

  Scenario Outline: Title of your scenario outline
    Given User is in the login page
    When User enter "<userId>" in the userid testbox
    Then User click on submit button
    And User is in the expected web page "<webpage>"

    Examples: 
      | userId             | webpage                                                                                 |
      | tom.tom@icloud.com | https:https://login.yahoo.com/?.lang=en-US&src=homepage&specId=yidregsimplified&activity=ybar-signin&pspid=2023538075&.done=https%3A%2F%2Fwww.yahoo.com%2F&done=https%3A%2F%2Fwww.yahoo.com%2F&intl=us&prompt=login|
