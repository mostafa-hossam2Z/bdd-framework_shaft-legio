 Feature: My Profile

  @testcase1
  Scenario Outline: Add New photo to the user
  Given User Fill "<Email>" And "<Password>"
  And Go to my profile page
  When Change profile picture
  And Confirm the upload photo
  Then Check that profile picture is uploaded successfully

  Examples:
  | Email                 | Password |
  | Admin1Email_Staging   |Password  |