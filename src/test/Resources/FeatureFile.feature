Feature: Search in Goog

  Scenario Outline: To search in Goog and enter the website
    Given User Open the goog url
    When user searches for the <item> in Goog
    Then the user should vbe returned the corresponding webpage

    Examples: 
      | item |
      |Flipkart|
      |Amazon|
      |Facebook|
