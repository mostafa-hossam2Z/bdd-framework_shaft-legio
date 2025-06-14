Feature: Cases feature

  @testcase1
  Scenario Outline: Add New Case to the Cases
    Given User Fill "<Email>" And "<Password>"
    And Click on Cases From sidebar Menu
    When User click on the Add new Case button
    And Add new address
    And Add the model
    And Add case type
    And Add case number
    And Add the court name
    And Add choose the lawyers names
    And click on  the save Case button
    Then Check that new Case is added successfully
    And Click on Cases From sidebar Menu
    And Click on the delete case button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase2
  Scenario Outline: Search
    Given User Fill "<Email>" And "<Password>"
    And Click on Cases From sidebar Menu
    When User click on the Add new Case button
    And Add new address
    And Add the model
    And Add case type
    And Add case number
    And Add the court name
    And Add choose the lawyers names
    And click on  the save Case button
    Given Search by the case id and case address
    #  Then Check that  Case is founded successfully
    And Click on the delete case button

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase3
  Scenario Outline: Edit the case
    Given User Fill "<Email>" And "<Password>"
    And Click on Cases From sidebar Menu
    When User click on the Add new Case button
    And Add new address
    And Add the model
    And Add case type
    And Add case number
    And Add the court name
    And Add choose the lawyers names
    And click on  the save Case button
    Given Search by the case id and case address
    And Click on the Edit case option
    And Change the address name
    And click on  the save Case button
    Then Check that new Case is Updated successfully
    And Click on the delete case button


    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase4
  Scenario Outline: Delete the case
    Given User Fill "<Email>" And "<Password>"
    And Click on Cases From sidebar Menu
    When User click on the Add new Case button
    And Add new address
    And Add the model
    And Add case type
    And Add case number
    And Add the court name
    And Add choose the lawyers names
    And click on  the save Case button
    Given Search by the case id and case address
    And Click on the delete case button
    Then Check that new Case is deleted successfully

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase5
  Scenario Outline: Add case details
    Given User Fill "<Email>" And "<Password>"
    And Click on Cases From sidebar Menu
    When User click on the Add new Case button
    And Add new address
    And Add the model
    And Add case type
    And Add case number
    And Add the court name
    And Add choose the lawyers names
    And click on  the save Case button
    Given Search by the case id and case address
    And Click on the case details button
    And Click on the add field button
    And Choose text field
    And Enter text name and value
    Then Check that Case details are added successfully

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase6
  Scenario Outline: Delete case details
    Given User Fill "<Email>" And "<Password>"
    And Click on Cases From sidebar Menu
    When User click on the Add new Case button
    And Add new address
    And Add the model
    And Add case type
    And Add case number
    And Add the court name
    And Add choose the lawyers names
    And click on  the save Case button
    Given Search by the case id and case address
    And Click on the case details button
    And Click on the add field button
    And Choose text field
    And Enter text name and value
    And Click on the delete case details button
    Then Check that Case details are deleted successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase7
  Scenario Outline: Add comment case details
    Given User Fill "<Email>" And "<Password>"
    And Click on Cases From sidebar Menu
    When User click on the Add new Case button
    And Add new address
    And Add the model
    And Add case type
    And Add case number
    And Add the court name
    And Add choose the lawyers names
    And click on  the save Case button
    Given Search by the case id and case address
    And Click on the case details button
    And Add comment to the case details
    And Click on the save button
    Then Check that comment is added to the Case details successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase8
  Scenario Outline: Add to the list of models
    Given User Fill "<Email>" And "<Password>"
    And Click on Cases From sidebar Menu
    When User click on the Add new Case button
    And Add new address
    And Add the model
    And Add case type
    And Add case number
    And Add the court name
    And Add choose the lawyers names
    And click on  the save Case button
    Given Search by the case id and case address
    And Click on the case details button
    When Click on the add model button
    And Add to the list of models
    And Click on the save model button
    Then Check that model is added to the Case details successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase9
  Scenario Outline: Add new session to the case
    Given User Fill "<Email>" And "<Password>"
    And Click on Cases From sidebar Menu
    When User click on the Add new Case button
    And Add new address
    And Add the model
    And Add case type
    And Add case number
    And Add the court name
    And Add choose the lawyers names
    And click on  the save Case button
    Given Search by the case id and case address
    And Click on the case details button
    When Click on the add new session button
    And Add Basic InFormations of the new session
    And Add Optional InFormations of the new session
    And Click on the save add new session button
    Then check that new session is added to the case successfully

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase10
  Scenario Outline: Delete the session
    Given User Fill "<Email>" And "<Password>"
    And Click on Cases From sidebar Menu
    When User click on the Add new Case button
    And Add new address
    And Add the model
    And Add case type
    And Add case number
    And Add the court name
    And Add choose the lawyers names
    And click on  the save Case button
    Given Search by the case id and case address
    And Click on the case details button
    When Click on the add new session button
    And Add Basic InFormations of the new session
    And Add Optional InFormations of the new session
    And Click on the save add new session button
    And Click on the delete session button
    Then check that new session is deleted successfully

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase10
  Scenario Outline: Add chats
    Given User Fill "<Email>" And "<Password>"
    And Click on Cases From sidebar Menu
    When User click on the Add new Case button
    And Add new address
    And Add the model
    And Add case type
    And Add case number
    And Add the court name
    And Add choose the lawyers names
    And click on  the save Case button
    Given Search by the case id and case address
    And Click on the case details button
    When Click on the chats button of the case
   # And Enter the chat text
   #Then check that message is sent successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |