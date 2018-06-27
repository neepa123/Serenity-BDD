Feature: Google search
  In order to find items
  As a generic user
  I want to be able to search with Google

  Scenario: Google search
    Given I want to search in Google
    When I search for 'Serenity BDD'
    Then I should see link to 'Serenity BDD - Automated Acceptance Testing with Style'

