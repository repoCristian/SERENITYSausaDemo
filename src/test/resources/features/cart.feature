#lenguaje:en

  Feature: cart
    Scenario Outline:check the car functions
      Given the user has opened URL
      When user get in select six items
        |Username   |Pass   |
        |<username> |<pass> |
      And user click on two items
        |firstName   |Lastname   |Zipcode  |
        |<firstName> |<lastname> |<zipcode>|


      Then user should in the car section 2 products

      Examples:
        |username           |pass           |lastname |zipcode|firstName |
        |standard_user      |secret_sauce   |casa     |50001  |first     |

