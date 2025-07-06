Feature: Sessions Settings feature

  @testcase1
  Scenario Outline: Add New session type
    Given User Fill "<Email>" And "<Password>"
    And Click on Sessions types Settings From sidebar Menu
    When User click on the Add new session type settings button
    And Add new address
    And click on  the save Case button
    Then Check that new Sessions type is added successfully
    And Search by case address
    And Click on the delete session type button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase2
  Scenario Outline: Edit the session type
    Given User Fill "<Email>" And "<Password>"
    And Click on Sessions types Settings From sidebar Menu
    When User click on the Add new session type settings button
    And Add new address
    And click on  the save Case button
    Then Check that new Sessions type is added successfully
    And Search by case address
    And Click on the Edit case type option
    And Change the address name
    And click on  the save Case button
    Then Check that the new session type is updated successfully
    And Click on the delete session type button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase3
  Scenario Outline: Delete the session type
    Given User Fill "<Email>" And "<Password>"
    And Click on Sessions types Settings From sidebar Menu
    When User click on the Add new session type settings button
    And Add new address
    And click on  the save Case button
    Then Check that new Sessions type is added successfully
    And Search by case address
    And Click on the delete session type button
    Then Check that the added session is deleted successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase4
  Scenario Outline: Add New sub-session type
    Given User Fill "<Email>" And "<Password>"
    And Click on sub-session type Settings From sidebar Menu
    When User click on the Add new sub-session type settings button
    And Add new address
    And click on  the save Case button
    Then Check that new Sessions type is added successfully
    And Search by case address
    And Click on the delete session type button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase5
  Scenario Outline: Edit the sub-session type
    Given User Fill "<Email>" And "<Password>"
    And Click on sub-session type Settings From sidebar Menu
    When User click on the Add new sub-session type settings button
    And Add new address
    And click on  the save Case button
    Then Check that new Sessions type is added successfully
    And Search by case address
    And Click on the Edit Sub Session type option
    And Change the address name
    And click on  the save Sub Session type button
    Then Check that the new Sub Session type is updated successfully
    And Click on the delete Sub session type button

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase6
  Scenario Outline: Delete the sub-session type
    Given User Fill "<Email>" And "<Password>"
    And Click on sub-session type Settings From sidebar Menu
    When User click on the Add new sub-session type settings button
    And Add new address
    And click on  the save Case button
    Then Check that new Sessions type is added successfully
    And Search by case address
    And Click on the delete session type button
    Then Check that the added Sub session is deleted successfully

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase7
  Scenario Outline: Add a new session action
    Given User Fill "<Email>" And "<Password>"
    And Click on session procedure Settings From sidebar Menu
    When User click on the Add new session procedure settings button
    And Add new address
    And click on  the save Case button
    Then Check that new Sessions procedure is added successfully
    And Search by case address
    And Click on the delete session procedure button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase8
  Scenario Outline: Edit the new session action
    Given User Fill "<Email>" And "<Password>"
    And Click on session procedure Settings From sidebar Menu
    When User click on the Add new session procedure settings button
    And Add new address
    And click on  the save Case button
    Then Check that new Sessions procedure is added successfully
    And Search by case address
    And Click on the Edit Session procedure option
    And Change the address name
    And click on  the save Sub Session type button
    Then Check that the new Session procedure is updated successfully
    And Click on the delete session procedure button

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase9
  Scenario Outline: Delete the new session action
    Given User Fill "<Email>" And "<Password>"
    And Click on session procedure Settings From sidebar Menu
    When User click on the Add new session procedure settings button
    And Add new address
    And click on  the save Case button
    Then Check that new Sessions procedure is added successfully
    And Search by case address
    And Click on the delete session procedure button
    Then Check that the added session procedure is deleted successfully

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |