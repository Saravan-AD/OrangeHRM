Feature: Verify user can create new user

  Scenario: Creating new user
    Given user open the website
    Then verify user is on the login page
    When user login username "admin" and password "admin123"
    Then verify user is on home page
    When user click on admin link
    Then verify user is on admin page
    When user click on add button
    Then verify user is on add user page
    When user click on user role
    Then select ESS opt
    When user click on emp name box and enter the first letter of employee
    Then select the first option
    When user click on status
    Then select Enabled
    When user enter username
    And user enter password
    And user enter confirm password
    And user click save button
    Then verify success msg is displayed
    And verify user is on admin page
    When user enters the username in the search box
    And clicks search
    Then verify the user is displayed in the records
    When user clicks the dlt button
    And click on yes, delete
    Then verify success msg is displayed