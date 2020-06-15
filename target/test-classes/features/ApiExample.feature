Feature: Api example
  As an api user I want to execute request in order to get proper responses

  @Example
  Scenario Outline: Example scenario for get user data
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then I will get the proper status code '<statusCode>'
    And The total cases per 1m population is '<cases>'

    Examples:
      | jsonName    | statusCode | cases | operation | entity |
      | getTotals   | 200        | 1,024 | GET       | TOTALS |