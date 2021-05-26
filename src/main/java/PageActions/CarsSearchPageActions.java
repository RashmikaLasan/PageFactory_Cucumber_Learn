package PageActions;

import PageLocation.CarsSearchPageLocators;
import Utilities.SeleniumDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CarsSearchPageActions {

    CarsSearchPageLocators carsSearchPageLocators = null;

    public CarsSearchPageActions(){

        this.carsSearchPageLocators = new CarsSearchPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),carsSearchPageLocators);
    }
    public void selectCarMake(String carBrand){
        Select selectCarMaker = new Select(carsSearchPageLocators.CarMakeDropDown);
        selectCarMaker.selectByVisibleText(carBrand);
    }
    public void selectCarModel(String carModel){
        Select selectCarModel = new Select(carsSearchPageLocators.SelectModelsDropDown);
        selectCarModel.selectByVisibleText(carModel);
    }
    public void selectLocation(String Location){
        Select selectLocation = new Select(carsSearchPageLocators.SelectLocationsDropDown);
        selectLocation.selectByVisibleText(Location);
    }
    public void selectCarPrice(String CarPrice){
        Select selectPrice = new Select(carsSearchPageLocators.PriceToDropDown);
        selectPrice.selectByVisibleText(CarPrice);
    }

    public void clickOnFindMyNextCarButton(){
        carsSearchPageLocators.FindMyNextCarButton.click();
    }
}
