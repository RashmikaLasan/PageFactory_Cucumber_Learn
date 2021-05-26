package PageLocation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {

    @FindBy(how = How.XPATH,using = "//a[text()='buy + sell']")
    public WebElement CarsForSaleLink;

    @FindBy(how = How.XPATH,using = "//a[text()='Search Cars']")
    public WebElement SearchCarsLink;

    @FindBy(how = How.XPATH,using = "//a[text()='reviews']")
    public WebElement CarReviewsLink;

    @FindBy(how = How.XPATH,using = "//a[text()='Used']")
    public WebElement UsedCarsSearchLink;

    @FindBy(how = How.XPATH,using = "//header/div[@id='u_H']/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")
    public WebElement SellMyCarLink;

}
