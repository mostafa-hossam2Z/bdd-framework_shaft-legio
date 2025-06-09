Feature: Users feature

  @testcase1
  Scenario Outline: Add New user to the users
    Given User Fill "<Email>" And "<Password>"
    And Click on users From sidebar Menu
    When User click on the Add new user button
    And Add new username
    And Add Email
    And choose rule
    And Add permissions
    And click on  the save button
    Then Check that new user is added successfully
    Examples:
      | Email                 | Password |
      | Admin1Email_Staging   |Password  |

  @testcase2
  Scenario Outline: Search by the username
    Given User Fill "<Email>" And "<Password>"
    And Click on users From sidebar Menu
    When User click on the Add new user button
    And Add new username
    And Add Email
    And choose rule
    And Add permissions
    And click on  the save button
    And Search by the username
    Then Check that new user is added successfully
    And Click on the delete button

    Examples:
      | Email                 | Password |
      | Admin1Email_Staging   |Password  |

  @testcase3
  Scenario Outline: Edit the user information
    Given User Fill "<Email>" And "<Password>"
    And Click on users From sidebar Menu
    When User click on the Add new user button
    And Add new username
    And Add Email
    And choose rule
    And Add permissions
    And click on  the save button
    And Search by the username
    And Click on the Edit option
    And change the username
    And click on  the save button
    Then Check that username is updated successfully
    And Click on the delete button

    Examples:
      | Email                 | Password |
      | Admin1Email_Staging   |Password  |

  @testcase4
  Scenario Outline: Delete the user
    Given User Fill "<Email>" And "<Password>"
    And Click on users From sidebar Menu
    When User click on the Add new user button
    And Add new username
    And Add Email
    And choose rule
    And Add permissions
    And click on  the save button
    And Search by the username
    And Click on the delete button
    Then Check that username is deleted successfully

    Examples:
      | Email                 | Password |
      | Admin1Email_Staging   |Password  |

  @testcase5
  Scenario Outline: Reset Password
    Given User Fill "<Email>" And "<Password>"
    And Click on users From sidebar Menu
    When User click on the Add new user button
    And Add new username
    And Add Email
    And choose rule
    And Add permissions
    And click on  the save button
    And Search by the username
    And Click on the reset password button
    Then Check that Password is updated successfully

    Examples:
      | Email                 | Password |
      | Admin1Email_Staging   |Password  |

