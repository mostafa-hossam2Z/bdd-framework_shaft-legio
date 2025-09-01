Feature: My Account feature

  @testcase1
  Scenario Outline: Change the public settings
  Given User Fill "<Email>" And "<Password>"
  When User click on the my account page from side bar menu
  And Change the phone number
  And Click on the save public settings button
 # Then Check that public settings is updated successfully


  Examples:
  | Email          | Password |
  | Lawyer1Email   |Password1 |

  @testcase2
  Scenario Outline: Add legal services
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the legal services tab
    And Add About your services
    And Click on the save add About your services button
    Then Check that About your services is updated successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password1  |

  @testcase3
  Scenario Outline: Add new services
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the legal services tab
    And Click on Add new service button
    And Add new service name
    And Click on the save add new service button
    Then Check that new service is added successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password1  |

  @testcase4
  Scenario Outline: Edit
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the legal services tab
    And Click on Add new service button
    And Add new service name
    And Click on the save add new service button
    And Click on the edit services button
    And Edit the service name
    And Click on the save add new service button
  #  Then Check that new service is Updated successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password1  |

  @testcase5
  Scenario Outline: Delete
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the legal services tab
    And Click on Add new service button
    And Add new service name
    And Click on the save add new service button
    And Click on the delete service button
   # Then Check that new service is deleted successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password1  |

  @testcase6
  Scenario Outline: Add new academic certificate
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the academic certificate tab
    And Click on Add certificate button
    And Write new certificate name
    And Click on the save add new certificate button
   # Then Check that new certificate is added successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password1  |

  @testcase6
  Scenario Outline: Edit academic certificate
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the academic certificate tab
    And Click on Add certificate button
    And Write new certificate name
    And Click on the save add new certificate button
    And Click on the edit certificate button
    And Change the certificate name
    And Click on the save edit certificate button
     # Then Check that new certificate is added successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password1  |

  @testcase7
  Scenario Outline: Delete academic certificate
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the academic certificate tab
    And Click on Add certificate button
    And Write new certificate name
    And Click on the save add new certificate button
    And Click on the Delete certificate button
    # Check that new certificate is deleted successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password1  |


  @testcase8
  Scenario Outline: Add about Work experience
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the Work experience tab
    And Add About your Work experience
    And Click on the save add About your Work experience button
    Then Check that About your Work experience is updated successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password1  |

  @testcase9
  Scenario Outline: Add experience
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the Work experience tab
    And Click on Add experience button
    And Add new experience name
    And Click on the save add new experience button
   # Then Check that new experience is added successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password1  |

  @testcase10
  Scenario Outline: Edit Experience
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the Work experience tab
    And Click on Add experience button
    And Add new experience name
    And Click on the save add new experience button
    And Click on the edit experience button
    And Edit the experience name
    And Click on the save Edit experience button
   # Then Check that new service is Updated successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password1  |

  @testcase11
  Scenario Outline: Delete Experience
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the Work experience tab
    And Click on Add experience button
    And Add new experience name
    And Click on the save add new experience button
    And Click on the delete Experience button
   # Then Check that new service is deleted successfully
    Examples:
      | Email        | Password |
      | Lawyer1Email |Password1 |

  @testcase12
  Scenario Outline: Add about clients
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the clients tab
    And Add About your clients
    And Click on the save add About your clients button
   # Then Check that About your clients is updated successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password1  |

  @testcase13
  Scenario Outline: Add clients
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the clients tab
    And Click on Add clients button
    And Add new clients name
    And Click on the save add new clients button
   # Then Check that new experience is added successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password1  |

  @testcase14
  Scenario Outline: Edit clients
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the clients tab
    And Click on Add clients button
    And Add new clients name
    And Click on the save add new clients button
    And Click on the edit client button
    And Edit the client name
    And Click on the save Edit experience button
   # Then Check that new service is Updated successfully
    Examples:
      | Email          | Password |
      | Lawyer1Email   |Password1  |

  @testcase15
  Scenario Outline: Delete clients
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the clients tab
    And Click on Add clients button
    And Add new clients name
    And Click on the save add new clients button
    And Click on the delete client button
   # Then Check that new service is deleted successfully
    Examples:
      | Email        | Password |
      | Lawyer1Email |Password1 |

  @testcase16
  Scenario Outline: Add social media accounts
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the social media accounts tab
    And Add social media accounts
    And Click on the save add social media accounts
    Then Check that social media accounts is added successfully
    Examples:
      | Email        | Password |
      | Lawyer1Email |Password1 |

  @testcase17
  Scenario Outline: Check added bank account
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the bank account tab
    And Add the bank account
    Then Check that bank account is added successfully
    Examples:
      | Email        | Password |
      | Lawyer1Email |Password1 |

  @testcase18
  Scenario Outline: Added Terms And conditions
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the Terms and Conditions tab
    And Add the Terms and Conditions
    And Click on the save terms And Conditions button
    Then Check that Terms and Conditions is added successfully
    Examples:
      | Email        | Password |
      | Lawyer1Email |Password1 |

  @testcase19
  Scenario Outline: Add Return Policy
    Given User Fill "<Email>" And "<Password>"
    When User click on the my account page from side bar menu
    And Click on the Return Policy tab
    And Add the Return Policy
    And Click on the save Return Policy button
    Then Check that Return Policy is added successfully
    Examples:
      | Email        | Password |
      | Lawyer1Email |Password1 |
