Feature:Add new Judicial session

  @testcase1
  Scenario Outline: Add new Judicial session
    Given User Fill "<Email>" And "<Password>"
    And Click on Judicial sessions page From sidebar Menu
    When User click on the Add new Judicial session button
    And Choose the case
    And Add the session number
    And Choose the lawyer of Judicial session
    And Select session type
    And Select the Date and Time
    And Add the Judicial Circuit
    And Select the Judicial department
    And Choose The court
    And Select Session subtype
    And Add Judge's name
    And Select Session procedures
    And Add Required documents
    And Add Attachment of the Judicial session
    And Add task of the Judicial session
    And Click on the save add new Judicial session
    Then Check that a new Judicial session is added successfully
  #  And Click on the delete Judicial session button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase1
  Scenario Outline: Add a new Judicial session
    Given User Fill "<Email>" And "<Password>"
    And Click on Judicial sessions page From sidebar Menu
    When User click on the Add new Judicial session button
    And Choose the case
    And Add Basic InFormations of the new session
    And Add Optional InFormations of the new session
    And Click on the save add new session button
    Then check that new Judicial session is added to the case successfully

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |
