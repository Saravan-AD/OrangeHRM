Feature: Verify user can create new candidate

  Scenario: Creating new candidate
    Given user open the website
    Then verify user is on the login page
    When user login username "admin" and password "admin123"
    Then verify user is on home page
    When user click on recruitment link
    Then verify user is on recruitment page
    When user click on add button in recruitment page
    Then verify user is on add candidate page for recruitment
    And user enter first and last name
    And user enter email
    And user click upload resume button
    And user click on save button
    Then verify success msg is displayed
    When user click on recruitment link
    Then verify user is on recruitment page
    When user enter name on search candidate name
    And clicks search
    Then verify the candidate is displayed in the records