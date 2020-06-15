Feature: Api example
  As an api user I want to execute request in order to get proper responses

  @Example
  Scenario Outline: Example scenario for get user data
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then I will get the proper status code '<statusCode>'
    And The total cases per 1m population is '<cases>'

    Examples:
      | jsonName    | statusCode | cases | operation | entity |
      | getTotals   | 200        | 1,031 | GET       | TOTALS |

  @Example
  Scenario Outline: Example scenario for get user data
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then I will get the proper status code '<statusCode>'
    And The total cases per 1m population for <country> is <cases>

    Examples:
      | jsonName    | statusCode | cases | country  | operation | entity  |
      | getTotals   | 200        | 6,547 | USA      | GET       | COUNTRY |
      | getTotals   | 200        | 4,084 | Brazil   | GET       | COUNTRY |
      | getTotals   | 200        | 6,224 | Spain    | GET       | COUNTRY |

  @Example
  Scenario Outline: Example scenario for error 404
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then I will get the proper status code '<statusCode>'

    Examples:
      | jsonName     | statusCode | operation | entity |
      | errorRequest | 404        | POST      | TOTALS |