Feature: Cases Settings feature

  @testcase1
  Scenario Outline: Add New Case type to the Cases
    Given User Fill "<Email>" And "<Password>"
    And Click on Cases Settings From sidebar Menu
    When User click on the Add new Case settings button
    And Add new address
    And Add the model
    And click on  the save Case button
    Then Check that new Case type is added successfully
    And Search by case address
    And Click on the delete case type button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase2
  Scenario Outline: Edit the case type
    Given User Fill "<Email>" And "<Password>"
    And Click on Cases Settings From sidebar Menu
    When User click on the Add new Case settings button
    And Add new address
    And Add the model
    And click on  the save Case button
    Then Check that new Case type is added successfully
    And Search by case address
    And Click on the Edit case type option
    And Change the address name
    And click on  the save Case button
    Then Check that new Case type is updated successfully
    And Click on the delete case type button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase3
  Scenario Outline: Delete the case type
    Given User Fill "<Email>" And "<Password>"
    And Click on Cases Settings From sidebar Menu
    When User click on the Add new Case settings button
    And Add new address
    And Add the model
    And click on  the save Case button
    Then Check that new Case type is added successfully
    And Search by case address
    And Click on the delete case type button
    Then Check that new Case type is deleted successfully

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |
