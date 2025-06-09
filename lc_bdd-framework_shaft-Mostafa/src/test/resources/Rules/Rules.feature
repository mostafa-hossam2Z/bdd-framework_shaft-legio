Feature: Rules feature

  @testcase1
  Scenario Outline: Add New Rule to the Rules
    Given User Fill "<Email>" And "<Password>"
    And Click on Rules From sidebar Menu
    When User click on the Add new rules button
    And Add new Rule name
    And Add The Authorities
    And click on  the save Rule button
    Then Check that new rule is added successfully

    Examples:
      | Email                 | Password |
      | Admin1Email_Staging   |Password  |

  @testcase2
  Scenario Outline: Edit the Rule
    Given User Fill "<Email>" And "<Password>"
    And Click on Rules From sidebar Menu
    When User click on the Add new rules button
    And Add new Rule name
    And Add The Authorities
    And click on  the save Rule button
    And click on the edit button of the rule
    And Change the rule name
    And click on  the save Rule button
    Then Check that new rule is updated successfully

    Examples:
      | Email                 | Password |
      | Admin1Email_Staging   |Password  |

  @testcase3
  Scenario Outline: Delete the Rule
    Given User Fill "<Email>" And "<Password>"
    And Click on Rules From sidebar Menu
    When User click on the Add new rules button
    And Add new Rule name
    And Add The Authorities
    And click on  the save Rule button
    And Click on the delete rule button
    Then Check that rule is deleted successfully
    Examples:
      | Email                 | Password |
      | Admin1Email_Staging   |Password  |