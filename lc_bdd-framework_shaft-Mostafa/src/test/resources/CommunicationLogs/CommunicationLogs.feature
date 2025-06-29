Feature: Communication Logs feature


  @testcase19
  Scenario Outline: Add a new contact record
  Given User Fill "<Email>" And "<Password>"
  And Click on communication logs page From sidebar Menu
  When User click on the add new contact record button
  And Fill the Basic Data fields to add a new contact contact
  And click on the save add contact button
  Then check that contact is added successfully
  #And Click on the delete contact button

  Examples:
  | Email          | Password |
  | Lawyer1Email   |Password  |
