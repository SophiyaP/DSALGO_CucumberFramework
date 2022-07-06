Feature: Feature to test the login functionality
  
  Scenario: Check login is successful with valid credentials
  
  Given <Class Topic>, <Class Date>, <Staff Name>, <Description> and <Comments> 
  When user enters username and password
  And clicks on login button
  Then user is navigated to the home page
