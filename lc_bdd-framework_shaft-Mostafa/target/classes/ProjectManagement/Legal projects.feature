Feature: Legal Projects feature
  @testcase1
  Scenario Outline: Add New legal project
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal Projects page from sidebar menu
    And User click on the Add new legal Project button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    Then Check that legal project is added successfully
    And Click on the legal Projects page from sidebar menu
    And Click on the delete legal project button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |


  @testcase2
  Scenario Outline: Search
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal Projects page from sidebar menu
    And User click on the Add new legal Project button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    And Click on the legal Projects page from sidebar menu
    And Search by the legal address
    And Click on the delete legal project button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase3
  Scenario Outline: Delete
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal Projects page from sidebar menu
    And User click on the Add new legal Project button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    And Click on the legal Projects page from sidebar menu
    And Search by the legal address
    And Click on the delete legal project button
    Then Check that legal project is deleted successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase4
  Scenario Outline: Add legal Project details
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal Projects page from sidebar menu
    And User click on the Add new legal Project button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    And Click on the legal Projects page from sidebar menu
    And Search by the legal address
    And Click on the legal services details page
    And Click on the add field button
    And Choose text field
    And Enter text name and value
    Then Check that legal project details is added successfully
    And Delete Legal Project
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase5
  Scenario Outline: Delete legal service details
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal Projects page from sidebar menu
    And User click on the Add new legal Project button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    And Click on the legal Projects page from sidebar menu
    And Search by the legal address
    And Click on the legal services details page
    And Click on the add field button
    And Choose text field
    And Enter text name and value
    And Delete Legal Project
    Then Check that legal project is deleted successfully

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase6
  Scenario Outline: Add comment legal service details
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal Projects page from sidebar menu
    And User click on the Add new legal Project button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    And Click on the legal Projects page from sidebar menu
    And Search by the legal address
    And Click on the legal services details page
    And Add comment to the case details
    And Click on the save button
    Then Check that comment is added to the Case details successfully
    And Delete Legal Project

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase7
  Scenario Outline: Add to the list of models to the projects
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal Projects page from sidebar menu
    And User click on the Add new legal Project button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    And Click on the legal Projects page from sidebar menu
    And Search by the legal address
    And Click on the legal services details page
    When Click on the add model button
    And Add to the list of models
    And Click on the save model button
    Then Check that model is added to the Case details successfully
    And Delete Legal Project
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |


  @testcase8
  Scenario Outline: Add Chats to the legal project
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal Projects page from sidebar menu
    And User click on the Add new legal Project button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    And Click on the legal Projects page from sidebar menu
    And Search by the legal address
    And Click on the legal services details page
    When Click on the chats button of the case
    And Enter the chat text
    Then check that message is sent successfully
    And Delete Legal Project

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |


  @testcase9
  Scenario Outline: Add Attachment to the project
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal Projects page from sidebar menu
    And User click on the Add new legal Project button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    And Click on the legal Projects page from sidebar menu
    And Search by the legal address
    And Click on the legal services details page
    When Click on the attachment button of the case
    And Upload the attachment
    Then check that file is Uploaded successfully
    And Delete Legal Project

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase10
  Scenario Outline: Delete Attachment to the project
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal Projects page from sidebar menu
    And User click on the Add new legal Project button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    And Click on the legal Projects page from sidebar menu
    And Search by the legal address
    And Click on the legal services details page
    When Click on the attachment button of the case
    And Upload the attachment
    And Click on the delete attachment button
    Then check that file is deleted successfully
    And Delete Legal Project

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase11
  Scenario Outline: Add Task to the legal project
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal Projects page from sidebar menu
    And User click on the Add new legal Project button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    And Click on the legal Projects page from sidebar menu
    And Search by the legal address
    And Click on the legal services details page
    When Click on the tasks tab
    And Click on the add new task button
    And Fill the basic information of the tasks field
    Then check that task is added successfully
    And Delete Legal Project

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |


  @testcase12
  Scenario Outline: Delete Task to the project
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal Projects page from sidebar menu
    And User click on the Add new legal Project button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    And Click on the legal Projects page from sidebar menu
    And Search by the legal address
    And Click on the legal services details page
    When Click on the tasks tab
    And Click on the add new task button
    And Fill the basic information of the tasks field
    And Click on the delete task button
    Then check that task is deleted successfully
    And Delete Legal Project

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |


  @testcase13
  Scenario Outline: Add a new contact record
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal Projects page from sidebar menu
    And User click on the Add new legal Project button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    And Click on the legal Projects page from sidebar menu
    And Search by the legal address
    And Click on the legal services details page
    When Click on the communication logs tab of logs services
    And Click on the add new contact button
    And Fill the Basic Data fields to add a new contact contact
    And click on the save add contact button
    Then check that contact is added successfully
    And Delete Legal Project

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase14
  Scenario Outline: Delete a Contact
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal Projects page from sidebar menu
    And User click on the Add new legal Project button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    And Click on the legal Projects page from sidebar menu
    And Search by the legal address
    And Click on the legal services details page
    When Click on the communication logs tab of logs services
    And Click on the add new contact button
    And Fill the Basic Data fields to add a new contact contact
    And click on the save add contact button
    And Click on the delete contact button
    Then check that contact is deleted successfully
    And Delete Legal Project

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |


  @testcase15
  Scenario Outline: Download the contact of the legal project
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal Projects page from sidebar menu
    And User click on the Add new legal Project button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    And Click on the legal Projects page from sidebar menu
    And Search by the legal address
    And Click on the legal services details page
    When Click on the communication logs tab of logs services
    And Click on the add new contact button
    And Fill the Basic Data fields to add a new contact contact
    And click on the save add contact button
    And Click on the contact details button
    And Click on the download contact button
    Then Check that contact is downloaded successfully
    And Delete Legal Project

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase16
  Scenario Outline:Archive legal projects
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal Projects page from sidebar menu
    And User click on the Add new legal Project button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    And Click on the legal Projects page from sidebar menu
    And Search by the legal address
    And Click on the legal services details page
    When Click on the Archive project button
    And Select the archive reason
    And Click on the Archiving completed button
    Then check that Project is Archived successfully
    And Delete Legal Project


    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase17
  Scenario Outline:UnArchive Service
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal Projects page from sidebar menu
    And User click on the Add new legal Project button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    And Click on the legal Projects page from sidebar menu
    And Search by the legal address
    And Click on the legal services details page
    When Click on the Archive project button
    And Select the archive reason
    And Click on the Archiving completed button
    And Click on the UnArchive legal project button
    And Enter the reason of unArchive service
    And confirm the UnArchive
    Then check that project is UnArchived successfully
    And Delete Legal service


    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |


  @testcase77777
  Scenario Outline: Add to the list of models
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal services page from sidebar menu
    And User click on the Add new legal service button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    And Click on the legal services page from sidebar menu
    And Search by the legal address
    And Click on the legal services details page

    And Delete Legal service

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |


