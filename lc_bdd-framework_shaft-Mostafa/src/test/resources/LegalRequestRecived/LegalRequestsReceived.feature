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
   # And Upload the attachment of the request
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
  Scenario Outline: Edit Attachment to the legal received address
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

  @testcase6
  Scenario Outline: Delete Attachment to the legal received address
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
