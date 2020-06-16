Feature: Api example
  As an api user I want to execute request in order to get proper responses

  @Example
  Scenario Outline: Example scenario for get cases per 1m population in the world
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then I will get the proper status code '<statusCode>'
    And The total cases per 1m population is '<cases>'
    And The actual total deaths are <deaths>

    Examples:
      | jsonName    | statusCode | cases | operation | entity | deaths |
      | getTotals   | 200        | 1,048 | GET       | TOTALS | 440,514|

  @Example
  Scenario Outline: Example scenario for get cases per 1m population from a country
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then I will get the proper status code '<statusCode>'
    And The total cases per 1m population for <country> is <cases>

    Examples:
      | jsonName    | statusCode | cases | country  | operation | entity  |
      | getTotals   | 200        | 6,612 | USA      | GET       | COUNTRY |
      | getTotals   | 200        | 6,228 | Spain    | GET       | COUNTRY |

  @Example
  Scenario Outline: Example scenario for error 404
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then I will get the proper status code '<statusCode>'

    Examples:
      | jsonName     | statusCode | operation | entity |
      | errorRequest | 404        | POST      | TOTALS |
