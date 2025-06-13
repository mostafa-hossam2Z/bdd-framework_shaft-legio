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
  #  And Click on the delete case button
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