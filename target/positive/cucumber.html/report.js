$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchCar.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate Search cars page is word",
  "description": "In order to validate that\r\nthe search cars page is working fine\r\nwe will do the acceptance testing",
  "id": "acceptance-testing-to-validate-search-cars-page-is-word",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Search-Cars"
    }
  ]
});
formatter.before({
  "duration": 12422559300,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validate search cars page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-cars-page-is-word;validate-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Search-Cars-Positive"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the Home Page \"https://www.carsguide.com.au/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I move to the menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 11
    },
    {
      "cells": [
        "Cars for Sale"
      ],
      "line": 12
    },
    {
      "cells": [
        "Review"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Click on \"Search Cars\" link",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Select car brand as \"BMW\" from Any Make drop down",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Select car model as \"1 Series\" from Select Model drop down",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Select car Location as \"NSW - Sydney\" from Select Location drop down",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Select car Price as \"$1,000\" from Select Price drop down",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Click on Find My Next Car button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should see list of searched cars",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "the page title should be \"Bmw 1 Series Under 1000 for Sale Sydney NSW | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 23
    }
  ],
  "location": "SearchCarsSteps.i_am_on_the_home_page_something(String)"
});
formatter.result({
  "duration": 5688885300,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.i_move_to_the_menu(String\u003e)"
});
formatter.result({
  "duration": 2111500900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search Cars",
      "offset": 10
    }
  ],
  "location": "SearchCarsSteps.click_on_something_link(String)"
});
formatter.result({
  "duration": 12489406100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 21
    }
  ],
  "location": "SearchCarsSteps.select_car_brand_as_something_from_any_make_drop_down(String)"
});
formatter.result({
  "duration": 707688900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Series",
      "offset": 21
    }
  ],
  "location": "SearchCarsSteps.select_car_model_as_something_from_select_model_drop_down(String)"
});
formatter.result({
  "duration": 1000052400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NSW - Sydney",
      "offset": 24
    }
  ],
  "location": "SearchCarsSteps.select_car_location_as_something_from_select_location_drop_down(String)"
});
formatter.result({
  "duration": 316201300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$1,000",
      "offset": 21
    }
  ],
  "location": "SearchCarsSteps.select_car_price_as_something_from_select_price_drop_down(String)"
});
formatter.result({
  "duration": 254759200,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.click_on_find_my_next_car_button()"
});
formatter.result({
  "duration": 17283569000,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.i_should_see_list_of_searched_cars()"
});
formatter.result({
  "duration": 76200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series Under 1000 for Sale Sydney NSW | carsguide",
      "offset": 26
    }
  ],
  "location": "SearchCarsSteps.the_page_title_should_be_something(String)"
});
formatter.result({
  "duration": 526337500,
  "status": "passed"
});
formatter.after({
  "duration": 3781293500,
  "status": "passed"
});
formatter.uri("UsedCarSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance testing to validate Used Search cars page is word",
  "description": "In order to validate that\r\nthe search Used cars page is working fine\r\nwe will do the acceptance testing",
  "id": "acceptance-testing-to-validate-used-search-cars-page-is-word",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Used-Search-Cars"
    }
  ]
});
formatter.before({
  "duration": 9358061300,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validate used search cars page",
  "description": "",
  "id": "acceptance-testing-to-validate-used-search-cars-page-is-word;validate-used-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Used-Search-Cars-Positive"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the Home Page \"https://www.carsguide.com.au/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I move to the menu",
  "rows": [
    {
      "cells": [
        "Menu"
      ],
      "line": 11
    },
    {
      "cells": [
        "Cars for Sale"
      ],
      "line": 12
    },
    {
      "cells": [
        "Review"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Click on \"Used\" car link",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Select car brand as \"Audi\" from Any Make drop down",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Select car model used cars",
  "rows": [
    {
      "cells": [
        "CarModel"
      ],
      "line": 17
    },
    {
      "cells": [
        "A4"
      ],
      "line": 18
    },
    {
      "cells": [
        "A3"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Select car Location as \"NSW - All\" from Select Location drop down used cars",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Select car Price as \"$80,000\" from Select Price drop down used cars",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Click on Find My Next Car button used cars",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I should see list of searched cars used cars",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "the page title should be \"Used Audi A4 Under 80000 for Sale NSW | carsguide\" used cars",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au/",
      "offset": 23
    }
  ],
  "location": "SearchCarsSteps.i_am_on_the_home_page_something(String)"
});
formatter.result({
  "duration": 13730152600,
  "status": "passed"
});
formatter.match({
  "location": "SearchCarsSteps.i_move_to_the_menu(String\u003e)"
});
formatter.result({
  "duration": 452285000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used",
      "offset": 10
    }
  ],
  "location": "UsedCarSearchSteps.click_on_something_car_link(String)"
});
formatter.result({
  "duration": 4952395500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Audi",
      "offset": 21
    }
  ],
  "location": "SearchCarsSteps.select_car_brand_as_something_from_any_make_drop_down(String)"
});
formatter.result({
  "duration": 635853100,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSearchSteps.select_car_model_used_cars(String\u003e)"
});
formatter.result({
  "duration": 411266700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NSW - All",
      "offset": 24
    }
  ],
  "location": "UsedCarSearchSteps.select_car_location_as_something_from_select_location_drop_down_used_cars(String)"
});
formatter.result({
  "duration": 239101000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$80,000",
      "offset": 21
    }
  ],
  "location": "UsedCarSearchSteps.select_car_price_as_something_from_select_price_drop_down_used_cars(String)"
});
formatter.result({
  "duration": 279287900,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSearchSteps.click_on_find_my_next_car_button_used_cars()"
});
formatter.result({
  "duration": 13077237500,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSearchSteps.i_should_see_list_of_searched_cars_used_cars()"
});
formatter.result({
  "duration": 86700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used Audi A4 Under 80000 for Sale NSW | carsguide",
      "offset": 26
    }
  ],
  "location": "UsedCarSearchSteps.the_page_title_should_be_something_used_cars(String)"
});
formatter.result({
  "duration": 149890100,
  "status": "passed"
});
formatter.after({
  "duration": 1161441600,
  "status": "passed"
});
});