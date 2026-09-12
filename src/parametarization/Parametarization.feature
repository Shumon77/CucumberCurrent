#Author: your.email@your.domain.com
#Keywords Summary :
Feature: Log-in Test

  Scenario: Parametarization

  Scenario Outline: Parametarized testing
    Given user navigate to the log in page
    When user enters "<username>" in the user name textbox
    Then user enters "<passward>" in the password textbox
    Then user is in the expected webpage "<webpage>"

    Examples: 
      | username                 | passward    | webpage                                                                                                                                                                                 |
      | fsdfsdfsdsdfsfss         | 45345353453 | https://login.yahoo.com/?.lang=en-US&src=frontpage&done=https%3A%2F%2Fwww.yahoo.com%2F                                                                                                  |
      | syed.shumon77@icloud.com | Orangeplus2 | https://login.yahoo.com/account/challenge/recaptcha?.lang=en-US&src=frontpage&done=https%3A%2F%2Fwww.yahoo.com%2F&sessionIndex=QQ--&acrumb=nFgYRCyd&display=login&authMechanism=primary |
