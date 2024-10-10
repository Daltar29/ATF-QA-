@Run
Feature: Add new user

  Scenario: Add new user to our website
    Given User navigate to the website homepage
    And User navigates to Register Page

    When User give userName
    When User give lastName
    When User give customer address city
    When User give customer address state
    Then User press register
    Then User have some error messages
    Then User insert fields with valid data
    Then User clicks on Register
    Then User confirm name
    Then User insert pass

