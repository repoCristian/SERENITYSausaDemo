#lenguaje:en

  Feature: filter
    Scenario Outline: compare price of two products
      Given user opened website
      When user sing in
        |Username   |Pass   |
        |<username> |<pass> |
      And click on filter

      Then user should see the mayor price
      Examples:
        |username           |pass           |
        |standard_user      |secret_sauce   |