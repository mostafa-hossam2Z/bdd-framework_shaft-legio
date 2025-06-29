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
    Then check that new Judicial session is added to the case successfully
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

  @testcase11
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
    And Enter the chat text
   Then check that message is sent successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase12
  Scenario Outline: Add Attachment
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
    When Click on the attachment button of the case
    And Upload the attachment
    Then check that file is Uploaded successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase13
  Scenario Outline: Delete Attachment
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
    When Click on the attachment button of the case
    And Upload the attachment
    And Click on the delete attachment button
    Then check that file is deleted successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase14
  Scenario Outline: Add Task
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
    When Click on the tasks tab
    And Click on the add new task button
    And Fill the basic information of the tasks field
    Then check that task is added successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase15
  Scenario Outline: Delete Task
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
    When Click on the tasks tab
    And Click on the add new task button
    And Fill the basic information of the tasks field
    And Click on the delete task button
    Then check that task is deleted successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase16
  Scenario Outline: Add Report
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
    When Click on the report tab
    And Click on the add new report button
    And Fill the report address
    And Add thr report details
    And click on the save add report button
    Then check that report is added successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase17
  Scenario Outline: Add agency
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
    When Click on the agency tab
    And Click on the add new agency button
    And Fill the Basic Data fields to add agency
    And click on the save add agency button
    Then check that agency is added successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |


  @testcase18
  Scenario Outline: Edit agency
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
    When Click on the agency tab
    And Click on the add new agency button
    And Fill the Basic Data fields to add agency
    And click on the save add agency button
    And Click on the edit agency btn
    And Edit the agency
    And click on the save add agency button
    Then check that agency is updated successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase19
  Scenario Outline: Add a new contact record
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
    When Click on the communication logs tab
    And Click on the add new contact button
    And Fill the Basic Data fields to add a new contact contact
    And click on the save add contact button
    Then check that contact is added successfully
    And Click on the delete contact button

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase20
  Scenario Outline: Delete a Contact
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
    When Click on the communication logs tab
    And Click on the add new contact button
    And Fill the Basic Data fields to add a new contact contact
    And click on the save add contact button
    And Click on the delete contact button
    Then check that contact is deleted successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |


  @testcase21
  Scenario Outline:Download the contact
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
    When Click on the communication logs tab
    And Click on the add new contact button
    And Fill the Basic Data fields to add a new contact contact
    And click on the save add contact button
    And Click on the contact details button
    And Click on the download contact button
    Then Check that contact is downloaded successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase22
  Scenario Outline: Archive Case
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
    When Click on the Archive button
    And Add the Report title
    And Add the final report
    And Click on the Archiving completed button
    Then check that case is Archived successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase23
  Scenario Outline: UnArchive Case
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
    When Click on the Archive button
    And Add the Report title
    And Add the final report
    And Click on the Archiving completed button
    And Click on the UnArchiving completed button
    And Add the Report title
    And Add the final report
    And Click on the UnArchive completed button
    Then check that case is UnArchived successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

