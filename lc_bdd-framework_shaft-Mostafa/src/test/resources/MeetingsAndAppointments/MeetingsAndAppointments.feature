Feature:Add new Meetings and appointments

  @testcase1
  Scenario Outline: Add new Meetings and appointments
  Given User Fill "<Email>" And "<Password>"
  And Click on the Meetings and appointments from sidebar menu
  When Click on add meeting period button
  And change the time
  And Click on add icon
  Then Check that time is changed successfully
  And delete the added time

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password1  |

  @testcase2
  Scenario Outline: Delete Meetings and appointments
    Given User Fill "<Email>" And "<Password>"
    And Click on the Meetings and appointments from sidebar menu
    When Click on add meeting period button
    And change the time
    And Click on add icon
    And delete the added time
    Then Check that time is deleted successfully

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password1  |
