Feature: Legal Requests Received feature

  @testcase1
  Scenario Outline: Add Request
    Given User Fill "<Email>" And "<Password>"
    And Click on Legal requests received From sidebar Menu
    When User click on the Add new request button
    And Add address of request
    And Add the content
    And Upload the attachment of the request
    And Click on the sent request button
    Then Check that new Request is added successfully
    And Search bt the legal received address

    And Click on the delete Request button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase2
  Scenario Outline: Search by the legal received address
    Given User Fill "<Email>" And "<Password>"
    And Click on Legal requests received From sidebar Menu
    When User click on the Add new request button
    And Add address of request
    And Add the content
    And Upload the attachment of the request
    And Click on the sent request button
    And Search bt the legal received address
    And Click on the delete Request button
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase3
  Scenario Outline: Delete the legal request received
    Given User Fill "<Email>" And "<Password>"
    And Click on Legal requests received From sidebar Menu
    When User click on the Add new request button
    And Add address of request
    And Add the content
    And Upload the attachment of the request
    And Click on the sent request button
    And Search bt the legal received address
    And Click on the delete Request button
    And Search bt the legal received address
    Then Check that the legal request received is deleted successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |



  @testcase4
  Scenario Outline: Add Attachment to the legal received address
    Given User Fill "<Email>" And "<Password>"
    And Click on Legal requests received From sidebar Menu
    When User click on the Add new request button
    And Add address of request
    And Add the content
    And Click on the sent request button
    And Search bt the legal received address
    And Click on the legal request received details button
    And Go to the attachment tab
    And Upload the attachment legal request
    And Click on the save add attachment button
    Then Check that attachment is added successfully
    And Click on the delete Request button from side bar menu
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase5
  Scenario Outline: Delete Attachment to the legal received address
    Given User Fill "<Email>" And "<Password>"
    And Click on Legal requests received From sidebar Menu
    When User click on the Add new request button
    And Add address of request
    And Add the content
    And Click on the sent request button
    And Search bt the legal received address
    And Click on the legal request received details button
    And Go to the attachment tab
    And Upload the attachment legal request
    And Click on the save add attachment button
    And Click on the delete attachment button
    Then check that file is deleted successfully
    And Click on the delete Request button from side bar menu
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase6
  Scenario Outline: Download Attachment to the legal received address
    Given User Fill "<Email>" And "<Password>"
    And Click on Legal requests received From sidebar Menu
    When User click on the Add new request button
    And Add address of request
    And Add the content
    And Click on the sent request button
    And Search bt the legal received address
    And Click on the legal request received details button
    And Go to the attachment tab
    And Upload the attachment legal request
    And Click on the save add attachment button
    And Click on the download legal request received button
    Then Check that request is downloaded successfully
    And Click on the delete Request button from side bar menu
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase7
  Scenario Outline: Add an inquiry to the legal received address
    Given User Fill "<Email>" And "<Password>"
    And Click on Legal requests received From sidebar Menu
    When User click on the Add new request button
    And Add address of request
    And Add the content
    And Click on the sent request button
    And Search bt the legal received address
    And Click on the legal request received details button
    And Go to the inquiry tab
    And Click on the add new inquiry
     And Add address of Add InQuery
    And Add the content of Add InQuery
    And Click on the sent inquiry button
    Then Check that new inquiry is added successfully
    And Click on the delete Request button from side bar menu
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase8
  Scenario Outline: Add response for an inquiry
    Given User Fill "<Email>" And "<Password>"
    And Click on Legal requests received From sidebar Menu
    When User click on the Add new request button
    And Add address of request
    And Add the content
    And Click on the sent request button
    And Search bt the legal received address
    And Click on the legal request received details button
    And Go to the inquiry tab
    And Click on the add new inquiry
    And Add address of Add InQuery
    And Add the content of Add InQuery
    And Click on the sent inquiry button
    And Click on Add response button
    And Add the response
    Then Check that response is added successfully
    And Close The Added Response pop up
    And Click on the delete Request button from side bar menu
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase9
  Scenario Outline: Delete the response of an inquiry
    Given User Fill "<Email>" And "<Password>"
    And Click on Legal requests received From sidebar Menu
    When User click on the Add new request button
    And Add address of request
    And Add the content
    And Click on the sent request button
    And Search bt the legal received address
    And Click on the legal request received details button
    And Go to the inquiry tab
    And Click on the add new inquiry
    And Add address of Add InQuery
    And Add the content of Add InQuery
    And Click on the sent inquiry button
    And Click on Add response button
    And Add the response
    And Delete The response of an inquiry
    Then Check that the response is deleted successfully
    And Close The Added Response pop up
    And Click on the delete Request button from side bar menu
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase10
  Scenario Outline: Delete an inquiry
    Given User Fill "<Email>" And "<Password>"
    And Click on Legal requests received From sidebar Menu
    When User click on the Add new request button
    And Add address of request
    And Add the content
    And Click on the sent request button
    And Search bt the legal received address
    And Click on the legal request received details button
    And Go to the inquiry tab
    And Click on the add new inquiry
    And Add address of Add InQuery
    And Add the content of Add InQuery
    And Click on the sent inquiry button
    And Click on delete inquiry button
    Then Check that inquiry is deleted successfully
    And Click on the delete Request button from side bar menu
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |

  @testcase11
  Scenario Outline: Add an updates
    Given User Fill "<Email>" And "<Password>"
    And Click on Legal requests received From sidebar Menu
    When User click on the Add new request button
    And Add address of request
    And Add the content
    And Click on the sent request button
    And Search bt the legal received address
    And Click on the legal request received details button
    And Go to the Updates tab
    And Click on the add new Update
    And Add address of Add InQuery
    And Add the content of Add InQuery
    And Click on the sent inquiry button
   Then Check that Update is added successfully
    And Click on the delete Request button from side bar menu
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password  |
