#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps


Feature: Feature to test login functionality 


  Scenario: check login is successful with valid credentials 
    Given user is on login page 
    When User Enters valid credentials
    Then user click the login button

  