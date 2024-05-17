#languaje:en

  Feature: login
    Scenario Outline: insert user info
      Given that user open website
      When user attemp to sing in
      |Username   |Pass   |
      |<username> |<pass> |
      Then user should see error mesage

     Examples:
     |username|pass |
     |123     |567  |