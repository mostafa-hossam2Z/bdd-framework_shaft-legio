Feature: Time packages feature

  @testcase1
  Scenario Outline: Edit price for Time package 15 minute
    Given User Fill "<Email>" And "<Password>"
    And Click on the time package page from side bar menu
    And Click on the edit time package for quarter hour
    And Change the price
    And Click on the save edit price
    Then Check that price is changed Successfully
    Examples:
      | Email        | Password |
      | Lawyer1Email |Password1 |

  @testcase2
  Scenario Outline: Block Time package for 15 minute
    Given User Fill "<Email>" And "<Password>"
    And Click on the time package page from side bar menu
    And Click on the block time package for quarter hour
    Then Check that time package for quarter hour is blocked Successfully
    Examples:
      | Email        | Password |
      | Lawyer1Email |Password1 |

  @testcase3
  Scenario Outline: Edit price for Time package 30 minute
    Given User Fill "<Email>" And "<Password>"
    And Click on the time package page from side bar menu
    And Click on the edit time package for half hour
    And Change the price for half hour
    And Click on the save edit price
    Then Check that price for half hour is changed Successfully
    Examples:
      | Email        | Password |
      | Lawyer1Email |Password1 |

  @testcase4
  Scenario Outline: Block Time package for 30 minute
    Given User Fill "<Email>" And "<Password>"
    And Click on the time package page from side bar menu
    And Click on the block time package for half hour
    Then Check that time package for half hour is blocked Successfully
    Examples:
      | Email        | Password |
      | Lawyer1Email |Password1 |

  @testcase5
  Scenario Outline: Edit price for Time package 45 minute
    Given User Fill "<Email>" And "<Password>"
    And Click on the time package page from side bar menu
    And Click on the edit time package for forty five minute
    And Change the price for forty five minute
    And Click on the save edit price
    Then Check that price for forty five minute is changed Successfully
    Examples:
      | Email        | Password |
      | Lawyer1Email |Password1 |

  @testcase6
  Scenario Outline: Block Time package for 45 minute
    Given User Fill "<Email>" And "<Password>"
    And Click on the time package page from side bar menu
    And Click on the block time package for forty five minute
    Then Check that time package for forty five minute is blocked Successfully
    Examples:
      | Email        | Password |
      | Lawyer1Email |Password1 |

  @testcase7
  Scenario Outline: Edit price for Time package 1 hour
    Given User Fill "<Email>" And "<Password>"
    And Click on the time package page from side bar menu
    And Click on the edit time package for one hour
    And Change the price for one hour
    And Click on the save edit price
    Then Check that price for one hour is changed Successfully
    Examples:
      | Email        | Password |
      | Lawyer1Email |Password1 |

  @testcase8
  Scenario Outline: Block Time package for one hour
    Given User Fill "<Email>" And "<Password>"
    And Click on the time package page from side bar menu
    And Click on the block time package for one hour
    Then Check that time package for one hour is blocked Successfully
    Examples:
      | Email        | Password |
      | Lawyer1Email |Password1 |
