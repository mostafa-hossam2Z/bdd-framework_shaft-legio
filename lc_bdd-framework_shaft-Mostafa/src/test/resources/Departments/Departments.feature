Feature: Departments feature

  @testcase1
  Scenario Outline: Add New Department to the Departments
    Given User Fill "<Email>" And "<Password>"
    And Click on Departments From sidebar Menu
    When User click on the Add new Department button
    And Add new username
    And Add Email
    And Add department name
    And click on  the save button
    Then Check that new department is added successfully

    Examples:
      | Email                 | Password |
      | Admin1Email_Staging   |Password1  |

  @testcase2
  Scenario Outline: Search
    Given User Fill "<Email>" And "<Password>"
    And Click on Departments From sidebar Menu
    When User click on the Add new Department button
    And Add new username
    And Add Email
    And Add department name
    And click on  the save button
    And Search by the username
    Then Check that new department is founded successfully
    And Click on the delete button
    Examples:
      | Email                 | Password |
      | Admin1Email_Staging   |Password1  |

  @testcase3
  Scenario Outline: Edit the department
    Given User Fill "<Email>" And "<Password>"
    And Click on Departments From sidebar Menu
    When User click on the Add new Department button
    And Add new username
    And Add Email
    And Add department name
    And click on  the save button
    And Search by the username
    And Click on the Edit department option
    And change the username
    And click on  the save button
    Then Check that department name is updated successfully
    And Click on the delete button
    Examples:
      | Email                 | Password |
      | Admin1Email_Staging   |Password1  |


  @testcase5
  Scenario Outline: Delete the department
    Given User Fill "<Email>" And "<Password>"
    And Click on Departments From sidebar Menu
    When User click on the Add new Department button
    And Add new username
    And Add Email
    And Add department name
    And click on  the save button
    And Search by the username
    And Click on the delete button
    Then Check that department name is deleted successfully
    And Click on the delete button

    Examples:
      | Email                 | Password |
      | Admin1Email_Staging   |Password1  |

  @testcase6
  Scenario Outline: Reset Password of the department
    Given User Fill "<Email>" And "<Password>"
    And Click on Departments From sidebar Menu
    When User click on the Add new Department button
    And Add new username
    And Add Email
    And Add department name
    And click on  the save button
    And Search by the username
    And Click on the Reset password button
    Then Check that Password is updated successfully
    And Click on the delete button
    Examples:
      | Email                 | Password |
      | Admin1Email_Staging   |Password1  |