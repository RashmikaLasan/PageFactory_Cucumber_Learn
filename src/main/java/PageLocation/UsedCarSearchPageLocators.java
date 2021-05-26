package PageLocation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsedCarSearchPageLocators {

    @FindBy(how = How.ID, using = "makes")
    public WebElement carMakerDropDown;;

    @FindBy(how = How.ID,using = "models")
    public WebElement SelectModelsDropDown;

    @FindBy(how = How.ID,using = "locations")
    public WebElement SelectLocationsDropDown;

    @FindBy(how = How.ID,using = "priceTo")
    public WebElement PriceToDropDown;

    @FindBy(how = How.ID,using = "search-submit")
    public WebElement FindMyNextCarButton;


}
