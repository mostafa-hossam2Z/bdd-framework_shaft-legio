Feature: Legal services Settings feature

  @testcase1
  Scenario Outline: Add New type legal project
    Given User Fill "<Email>" And "<Password>"
    And Click on Legal services types Settings From sidebar Menu
    When User click on the Add new Legal services type settings button
    And Add new address
    And Add the model
    And click on  the save Case button
    Then Check that new Legal services type is added successfully
    And Search by case address
    And Click on the delete case type button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase2
  Scenario Outline: Edit New type legal service
    Given User Fill "<Email>" And "<Password>"
    And Click on Legal services types Settings From sidebar Menu
    When User click on the Add new Legal services type settings button
    And Add new address
    And Add the model
    And click on  the save Case button
    And Search by case address
    And Click on the Edit case type option
    And Change the address name
    And click on  the save Case button
    Then Check that the new type legal service is updated successfully
    And Click one delete legal service type btn
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase3
  Scenario Outline: Delete New type legal service
    Given User Fill "<Email>" And "<Password>"
    And Click on Legal services types Settings From sidebar Menu
    When User click on the Add new Legal services type settings button
    And Add new address
    And Add the model
    And click on  the save Case button
    And Search by case address
    And Click one delete legal service type btn
    Then Check that new Legal service type is deleted successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase4
  Scenario Outline: Add New legal service model
    Given User Fill "<Email>" And "<Password>"
    And Click on Legal service model Settings From sidebar Menu
    When User click on the Add new Legal service model settings button
    And Add new address
    And Select type of models
    And Add the type model
    And Click on the save type model button
    Then Check that new legal service model is added successfully
    And Click on the delete case Model button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase5
  Scenario Outline: Edit legal service model
    Given User Fill "<Email>" And "<Password>"
    And Click on Legal service model Settings From sidebar Menu
    When User click on the Add new Legal service model settings button
    And Add new address
  #  And Select type of models
    And Add the type model
    And Click on the save type model button
    And Click on the edit case Model button
    And Change the address name
    And Click on the save type model button
   Then Check that new type Case model is updated successfully
    And Click on the delete case Model button

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase6
  Scenario Outline: Delete legal service model
    Given User Fill "<Email>" And "<Password>"
    And Click on Legal service model Settings From sidebar Menu
    When User click on the Add new Legal service model settings button
    And Add new address
    And Select type of models
    And Add the type model
    And Click on the save type model button
    Then Check that new type Case model is added successfully
    And Click on the delete case Model button
    Then Check that new type Case model is deleted successfully

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase7
  Scenario Outline: Add a new reasons for archiving legal service
    Given User Fill "<Email>" And "<Password>"
    And Click on reasons for archiving legal service From sidebar Menu
    When User click on the Add new reasons for archiving legal service button
    And Add new Archive reasons name
    And Click on the save Add a new reasons for archiving legal projects button
    Then Check that new Archive reasons is added successfully
    And Click on the delete Archive reasons  button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase8
  Scenario Outline: Edit the reasons for archiving legal projects
    Given User Fill "<Email>" And "<Password>"
    And Click on reasons for archiving legal service From sidebar Menu
    When User click on the Add new reasons for archiving legal service button
    And Add new Archive reasons name
    And Click on the save Add a new reasons for archiving legal projects button
    Then Check that new Archive reasons is added successfully
    And Click on the edit archive legal project button
    And Change the address name
    And Click on the save Add a new reasons for archiving legal projects button
    Then Check that the archive legal project reason is updated successfully
    And Click on the delete Archive reasons  button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase9
  Scenario Outline: Delete the reasons for archiving legal projects
    Given User Fill "<Email>" And "<Password>"
    And Click on reasons for archiving legal service From sidebar Menu
    When User click on the Add new reasons for archiving legal service button
    And Add new Archive reasons name
    And Click on the save Add a new reasons for archiving legal projects button
    Then Check that new Archive reasons is added successfully
    And Click on the delete Archive reasons  button
    Then Check that Archive reason is deleted successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |
