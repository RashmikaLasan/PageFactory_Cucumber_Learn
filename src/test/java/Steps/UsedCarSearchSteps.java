package Steps;

import PageActions.CarsGuideHomePageActions;
import PageActions.UsedCarSearchPageActions;
import Utilities.SeleniumDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import java.util.List;

public class UsedCarSearchSteps {

    UsedCarSearchPageActions usedCarSearchPageActions = new UsedCarSearchPageActions();
    CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();


    @And("^Click on \"([^\"]*)\" car link$")
    public void click_on_something_car_link(String Used){
        carsGuideHomePageActions.clickOnUsedCarsSearchMenu();
        System.out.println("Click Search Car Menu");

    }
    @And("^Select car model used cars$")
    public void select_car_model_used_cars(List<String> list){
        String usedCarModel=list.get(1);
        usedCarSearchPageActions.selectCarModel(usedCarModel);
        System.out.println("Click Used Car Model");
    }

    @And("^Select car Location as \"([^\"]*)\" from Select Location drop down used cars$")
    public void select_car_location_as_something_from_select_location_drop_down_used_cars(String Loca){
        usedCarSearchPageActions.selectLocation(Loca);
        System.out.println("Select a Location");
    }

    @And("^Select car Price as \"([^\"]*)\" from Select Price drop down used cars$")
    public void select_car_price_as_something_from_select_price_drop_down_used_cars(String carPrice){
        usedCarSearchPageActions.selectCarPrice(carPrice);
        System.out.println("Select a Price");
    }

    @And("^Click on Find My Next Car button used cars$")
    public void click_on_find_my_next_car_button_used_cars(){
        usedCarSearchPageActions.clickOnFindMyNextCarButton();
        System.out.println("Click Seacrh");

    }

    @Then("^I should see list of searched cars used cars$")
    public void i_should_see_list_of_searched_cars_used_cars(){

        System.out.println("Car list found");
    }

    @And("^the page title should be \"([^\"]*)\" used cars$")
    public void the_page_title_should_be_something_used_cars(String ExpectTitle){
        String actualTitle = SeleniumDriver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,ExpectTitle);
        System.out.println("Page Assertion success");

    }

}
