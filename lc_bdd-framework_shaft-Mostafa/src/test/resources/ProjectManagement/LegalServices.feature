Feature: Cases feature
  @testcase1
  Scenario Outline: Add New legal services
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal services page from sidebar menu
    And User click on the Add new legal service button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    Then Check that legal services is added successfully
    And Click on the legal services page from sidebar menu
    And Click on the delete legal service button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |


  @testcase2
  Scenario Outline: Search
    Given User Fill "<Email>" And "<Password>"
    When Click on the legal services page from sidebar menu
    And User click on the Add new legal service button
    And Add new legal service address
    And Choose the model
    And Add the Type of legal service
    And Choose the lawyer
    And Click on the save add new legal button
    Then Check that legal services is added successfully
    And Click on the legal services page from sidebar menu
    And Search by the legal address
    And Click on the delete legal service button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase3
  Scenario Outline: Delete
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
    And Click on the delete legal service button
    Then Check that legal services is deleted successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase4
  Scenario Outline: Add legal service details
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
    And Click on the add field button
    And Choose text field
    And Enter text name and value
    Then Check that legal services details is added successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |


  @testcase19
  Scenario Outline: Add a new contact record
    Given User Fill "<Email>" And "<Password>"
    And Click on the legal services button
    And Click on the add field button
    And Choose text field
    And Enter text name and value

    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |
