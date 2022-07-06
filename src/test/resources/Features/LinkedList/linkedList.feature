Feature: feature to verify the Linked List page

  Scenario: Verify the Linked List page functionality
    Given user is on the home page
    When user clicks on the "Get Started" button
    And user clicks on the "Introduction" topic
    Then user clicks on the tryhere button
    And user navigates to tryEditor Page
    And user keys in the python code
    And user clicks on the Run button
    And user can view the result
   