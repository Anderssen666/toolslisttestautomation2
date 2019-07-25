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
  Scenario Outline: i search for a valid tool name()
    Given I am already logged in using username "tester" and password "letmein"
    When I search for a valid tool name "<toolname>"
    Then The tool is returned in the search results
    Examples:
    | toolname     |
    | Selenium |

 @to-do
  Scenario: remove tool
    Given a tool is no longer used
    When I select to delete the tool
    Then The tool is no longer available on the website

  @high-impact
  Scenario Outline: new tool
    Given I am already logged in using username "tester" and password "letmein"
    When I create a new tool with Name "<newToolName>", Use "<toolUse>" and Website "<toolwebsite>"
    Then The new tool is added to the website
    Examples:
      | newToolName | toolUse | toolwebsite       |
      | tool1    | use1    | www.bbc.co.uk |