Feature: Agencies And Delegations feature

  @testcase1
  Scenario Outline: Add New Agency
  Given User Fill "<Email>" And "<Password>"
  And Click on Agencies And Delegations From sidebar Menu
  When User click on the Add new Agency button
  And Add Agency number
  And Add Select the case
  And Choose start date
  And Choose end date
  And Enter the comments
  And Click on the save add new agency button
  Then Check that new Agency is added successfully
  And Delete the agency

  Examples:
  | Email                 | Password |
  | Lawyer1Email          |Password  |

  @testcase2
  Scenario Outline: Deleted  Agency
    Given User Fill "<Email>" And "<Password>"
    And Click on Agencies And Delegations From sidebar Menu
    When User click on the Add new Agency button
    And Add Agency number
    And Add Select the case
    And Choose start date
    And Choose end date
    And Enter the comments
    And Click on the save add new agency button
    And Delete the agency
    Then Check that  Agency is Deleted successfully

    Examples:
      | Email                 | Password |
      | Lawyer1Email          |Password  |

  @testcase3
  Scenario Outline: Edit Agency
    Given User Fill "<Email>" And "<Password>"
    And Click on Agencies And Delegations From sidebar Menu
    When User click on the Add new Agency button
    And Add Agency number
    And Add Select the case
    And Choose start date
    And Choose end date
    And Enter the comments
    And Click on the save add new agency button
    And Click on edit agency button
    And Edit the agency
    And Click on the save add new agency button
    Then check that agency is updated successfully
    And Delete the agency
    Examples:
      | Email                 | Password |
      | Lawyer1Email          |Password  |