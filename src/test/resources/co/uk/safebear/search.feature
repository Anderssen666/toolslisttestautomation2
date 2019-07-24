Feature: Search
  As a user
  In order to access an available tool
  I am able to find it via a search engine

  Rules:
  * The User must be logged in
  * The User is able to search for all available tools
  * The User is able to remove all available tools

  Glossary:
  * User: Someone who wants to create or remove a Tools List using our application
  * Supporters: This is what the customer calls 'Admin' users.

 @high-impact
  Scenario Outline: search for a tool
    When I search for tool "<name>"
    Then The tool is returned in the search results
    Examples:
    | name     |
    | Selenium |

 @high-impact
  Scenario: remove tool
    Given a tool is no longer used
    When I select to delete the tool
    Then The tool is no longer available on the website

  @high-impact
  Scenario Outline: new tool
    When I create a new tool with Name "<toolname>", Use "<tooluse>" and Website "<website>"
    Then The new tool is added to the website
    Examples:
      | toolname | tooluse | website       |
      | tool1    | use1    | www.bbc.co.uk |
      | tool2    | use2    | www.abc.co.uk |
      | tool3    | use3    | www.cde.co.uk |