Feature: Validating Sign-Up page

  Scenario: Positive Testing

  Scenario Outline: Data-Driven Testing
    Given User is in the login page
    When User enter userId "<userId>" in the userid textbox
    Then User click on submit button
    Then User should navigate to the expected "<webpage>"

    Examples: 
      | userId                   | webpage                                                                                                                                                                                                                                                                   |
      | syed.shumon77@icloud.com | https://login.yahoo.com/account/challenge/recaptcha?.lang=en-US&src=homepage&specId=yidregsimplified&activity=ybar-signin&pspid=2023538075&done=https%3A%2F%2Fwww.yahoo.com%2F&intl=us&prompt=login&sessionIndex=QQ--&acrumb=uvtmqkFx&display=login&authMechanism=primary |
      | syed.shumon77@icloud.com |                                                                                                                                                                                                                                                                           |
      | tom.tom@icloud.com       |                                                                                                                                                                                                                                                                           |
