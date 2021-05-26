package PageActions;

import PageLocation.CarsGuideHomePageLocators;
import Utilities.SeleniumDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class CarsGuideHomePageActions {

    CarsGuideHomePageLocators carsGuideHomePageLocators = null;

    public CarsGuideHomePageActions(){
        this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),carsGuideHomePageLocators);
    }

    public void moveToCarsForSaleMenu(){
        Actions action = new Actions(SeleniumDriver.getDriver());
        action.moveToElement(carsGuideHomePageLocators.CarsForSaleLink).perform();
    }

    public void clickOnSearchCarsMenu(){
        //moveToCarsForSaleMenu
        carsGuideHomePageLocators.SearchCarsLink.click();

    }

    public void clickOnUsedCarsSearchMenu(){
        //moveToCarsForSaleMenu
        carsGuideHomePageLocators.UsedCarsSearchLink.click();

    }
//
//    public void moveToSellMyCarMenu(){
//        this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
//        PageFactory.initElements(SeleniumDriver.getDriver(),carsGuideHomePageLocators);
//
//        carsGuideHomePageLocators.SellMyCarLink.click();
//    }
}
