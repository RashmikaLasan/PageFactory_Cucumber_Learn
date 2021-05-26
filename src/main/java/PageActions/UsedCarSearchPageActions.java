package PageActions;

import PageLocation.UsedCarSearchPageLocators;
import Utilities.SeleniumDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UsedCarSearchPageActions {
    UsedCarSearchPageLocators usedCarSearchPageLocators = null;

    public UsedCarSearchPageActions(){
        this.usedCarSearchPageLocators = new UsedCarSearchPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),usedCarSearchPageLocators);
    }


    public void selectCarModel(String carModel){
        Select selectCarModel = new Select(usedCarSearchPageLocators.SelectModelsDropDown);
        selectCarModel.selectByVisibleText(carModel);

    }

    public void selectLocation(String Location){
        Select selectLocation = new Select(usedCarSearchPageLocators.SelectLocationsDropDown);
        selectLocation.selectByVisibleText(Location);
    }

    public void selectCarPrice(String CarPrice){
        Select selectPrice = new Select(usedCarSearchPageLocators.PriceToDropDown);
        selectPrice.selectByVisibleText(CarPrice);
    }

    public void clickOnFindMyNextCarButton(){
        usedCarSearchPageLocators.FindMyNextCarButton.click();
    }



}
