Feature: Search
  As a user
  In order to access an available tool
  I am able to find it via a search engine

  Rules:
  * The User must be logged in
  * The User is able to search for all available tools

  Glossary:
  * User: Someone who wants to create a Tools List using our application
  * Supporters: This is what the customer calls 'Admin' users.

  @high-impact
  Scenario: search for a tool
    Given I have logged in successfully
    When I search for a valid tool name
    Then The tool is returned in the search results

  @high-impact
  Scenario: remove tool
    Given a tool is no longer used
    When I select the delete option for the tool
    Then The tool is no longer available

  @high-impact
  Scenario: add tool
    Given I want to add a new tool
    When I select the new tool option
    Then The new tool screen opens

  @high-impact
  Scenario Outline: new tool screen
    Given I am on the new tool screen
    When I can enter a Name "<toolname>", Use "<tooluse>" and Website "<website>" and confirm
    Then The new tool is added
    Examples:
      | toolname | tooluse | website       |
      | tool1    | use1    | www.bbc.co.uk |
      | tool2    | use2    | www.abc.co.uk |
      | tool3    | use3    | www.cde.co.uk |