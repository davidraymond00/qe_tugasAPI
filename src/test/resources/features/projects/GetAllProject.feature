Feature: Get All Project
  As a user
  I want to get all my project
  So i can manage my project

  Scenario: Get all project with invalid token
    Given I set url and invalid token to get all project
    When I request get all project
    Then I will get 401
    And get Forbidden message
