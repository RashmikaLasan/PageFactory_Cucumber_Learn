package Steps;

import Utilities.SeleniumDriver;
import cucumber.api.java.Before;

public class BeforeActions {

    @Before
    public static void setup(){

        SeleniumDriver.setUpDriver();

    }

}