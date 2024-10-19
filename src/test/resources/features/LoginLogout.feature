Feature: Verify user can login and logout

  Scenario: User login and logout
    Given user open the website
    Then verify user is on the login page
    When user login username "admin" and password "admin123"
    Then verify user is on home page
    When user click on the user button
    And user choose the logout option
    Then verify user is on the login page
