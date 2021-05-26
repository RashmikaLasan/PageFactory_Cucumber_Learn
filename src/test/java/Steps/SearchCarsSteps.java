package Steps;

import PageActions.CarsGuideHomePageActions;
import PageActions.CarsSearchPageActions;
import Utilities.SeleniumDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import java.util.List;

public class SearchCarsSteps {

    CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
    CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();

    @Given("^I am on the Home Page \"([^\"]*)\"$")
    public void i_am_on_the_home_page_something(String webSiteURL){

        SeleniumDriver.openPage(webSiteURL);
        System.out.println("Redirect to the URL");
    }

    @When("^I move to the menu$")
    public void i_move_to_the_menu(List<String> list){
        String menu = list.get(1);
        System.out.println("Menu Selected is"+ menu);
        carsGuideHomePageActions.moveToCarsForSaleMenu();

    }

    @And("^Click on \"([^\"]*)\" link$")
    public void click_on_something_link(String searchCars) throws InterruptedException {
        carsGuideHomePageActions.clickOnSearchCarsMenu();
        System.out.println("Click on Seacrh Menu");
        Thread.sleep(2000);

    }

    @And("^Select car brand as \"([^\"]*)\" from Any Make drop down$")
    public void select_car_brand_as_something_from_any_make_drop_down(String carBrand){

        carsSearchPageActions.selectCarMake(carBrand);
        System.out.println("Select Car Brand");
    }

    @And("^Select car model as \"([^\"]*)\" from Select Model drop down$")
    public void select_car_model_as_something_from_select_model_drop_down(String carModel){
        carsSearchPageActions.selectCarModel(carModel);
        System.out.println("Select Car Model");
    }

    @And("^Select car Location as \"([^\"]*)\" from Select Location drop down$")
    public void select_car_location_as_something_from_select_location_drop_down(String location){

        carsSearchPageActions.selectLocation(location);
        System.out.println("Select Location");
    }

    @And("^Select car Price as \"([^\"]*)\" from Select Price drop down$")
    public void select_car_price_as_something_from_select_price_drop_down(String carPrice){

        carsSearchPageActions.selectCarPrice(carPrice);
        System.out.println("Select Price");
    }

    @And("^Click on Find My Next Car button$")
    public void click_on_find_my_next_car_button(){

        carsSearchPageActions.clickOnFindMyNextCarButton();
        System.out.println("Click Search Icon to Search");
    }
    @Then("^I should see list of searched cars$")
    public void i_should_see_list_of_searched_cars(){

        System.out.println("Car list found");

    }

    @And("^the page title should be \"([^\"]*)\"$")
    public void the_page_title_should_be_something(String expectedTitle){
        String actualTitle = SeleniumDriver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("Page Assertion success");
    }
}
