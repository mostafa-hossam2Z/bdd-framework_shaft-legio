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

  @testcase4
  Scenario Outline: Add a new case model
    Given User Fill "<Email>" And "<Password>"
    And Click on Case models From sidebar Menu
    When User click on the Add new Case model button
    And Add new address
    And Select type of models
    And Add the type model
    And Click on the save type model button
    Then Check that new type Case model is added successfully
    And Click on the delete case Model button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase5
  Scenario Outline: Edit the case model
    Given User Fill "<Email>" And "<Password>"
    And Click on Case models From sidebar Menu
    When User click on the Add new Case model button
    And Add new address
    And Select type of models
    And Add the type model
    And Click on the save type model button
    And Click on the edit case Model button
    And Change the address name
    And Click on the save type model button
    Then Check that new type Case model is updated successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase6
  Scenario Outline: Delete a new case model
    Given User Fill "<Email>" And "<Password>"
    And Click on Case models From sidebar Menu
    When User click on the Add new Case model button
    And Add new address
    And Select type of models
    And Add the type model
    And Click on the save type model button
    And Click on the delete case Model button
    Then Check that new type Case model is deleted successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase7
  Scenario Outline: Add a new court
    Given User Fill "<Email>" And "<Password>"
    And Click on Case courts setting From sidebar Menu
    When User click on the Add new Court button
    And Add new court name
    And Click on the save court button
    Then Check that new court is added successfully
    And Click on the delete case court button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |
  @testcase8
  Scenario Outline: Edit the court
    Given User Fill "<Email>" And "<Password>"
    And Click on Case courts setting From sidebar Menu
    When User click on the Add new Court button
    And Add new court name
    And Click on the save court button
    And Click on edit court button
    And Change the court name
    And Click on the save court button
    Then Check that the court name is updated successfully
    And Click on the delete case court button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase9
  Scenario Outline: Delete the added court
    Given User Fill "<Email>" And "<Password>"
    And Click on Case courts setting From sidebar Menu
    When User click on the Add new Court button
    And Add new court name
    And Click on the save court button
    Then Check that new court is added successfully
    And Click on the delete case court button
    Then Check that the added court is deleted successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |
