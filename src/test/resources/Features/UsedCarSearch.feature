@Used-Search-Cars
Feature: Acceptance testing to validate Used Search cars page is word
  In order to validate that
  the search Used cars page is working fine
  we will do the acceptance testing

  @Used-Search-Cars-Positive
  Scenario: Validate used search cars page
    Given I am on the Home Page "https://www.carsguide.com.au/"
    When I move to the menu
      | Menu         |
      | Cars for Sale|
      | Review       |
    And Click on "Used" car link
    And Select car brand as "Audi" from Any Make drop down
    And Select car model used cars
    |CarModel    |
    |A4          |
    |A3          |
    And Select car Location as "NSW - All" from Select Location drop down used cars
    And Select car Price as "$80,000" from Select Price drop down used cars
    And Click on Find My Next Car button used cars
    Then I should see list of searched cars used cars
    And the page title should be "Used Audi A4 Under 80000 for Sale NSW | carsguide" used cars

