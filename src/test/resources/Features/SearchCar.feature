@Search-Cars
  Feature: Acceptance testing to validate Search cars page is word
    In order to validate that
    the search cars page is working fine
    we will do the acceptance testing

    @Search-Cars-Positive
    Scenario: Validate search cars page
      Given I am on the Home Page "https://www.carsguide.com.au/"
      When I move to the menu
      | Menu        |
      | Cars for Sale|
      | Review       |
      And Click on "Search Cars" link
      And Select car brand as "BMW" from Any Make drop down
      And Select car model as "1 Series" from Select Model drop down
      And Select car Location as "NSW - Sydney" from Select Location drop down
      And Select car Price as "$1,000" from Select Price drop down
      And Click on Find My Next Car button
      Then I should see list of searched cars
      And the page title should be "Bmw 1 Series Under 1000 for Sale Sydney NSW | carsguide"

