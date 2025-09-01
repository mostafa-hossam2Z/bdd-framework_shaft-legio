Feature: Technical Support feature

  @testcase1
  Scenario Outline: Add New chay / Technical support
    Given User Fill "<Email>" And "<Password>"
    And Click on the technical support page from sidebar menu
    And Click on the add new chat button
    And Enter the content
    And Enter the description
    And Click on the create button

    Examples:
      | Email        | Password |
      | Lawyer1Email |Password1 |

  @testcase2
  Scenario Outline: Add the chat
    Given User Fill "<Email>" And "<Password>"
    And Click on the technical support page from sidebar menu
    And Click on the add new chat button
    And Enter the content
    And Enter the description
    And Click on the create button
    And Add your text

    Examples:
      | Email        | Password |
      | Lawyer1Email |Password1 |

  @testcase3
  Scenario Outline: View the chat
    Given User Fill "<Email>" And "<Password>"
    And Click on the technical support page from sidebar menu
    And Click on the add new chat button
    And Enter the content
    And Enter the description
    And Click on the create button
    And Add your text
    And Click on  the view chat button

    Examples:
      | Email        | Password |
      | Lawyer1Email |Password1 |