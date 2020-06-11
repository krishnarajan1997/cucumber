Feature: verify the adactin webpage

  Background: 
    Given user in the login page

  Scenario: verfy with valid details
    When user enter the username and password
    And click the login button

  Scenario: verify with invalid details
    When user pass username and password data
    And clicked login button
