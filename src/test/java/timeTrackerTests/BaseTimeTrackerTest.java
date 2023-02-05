package timeTrackerTests;

import common.Browsers;
import methods.LoginMethods;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utilities.PropertyManager;


public class BaseTimeTrackerTest extends Browsers {
    @Parameters({"browser"})
    @BeforeMethod
    public void setup(@Optional("chrome") String browser){
        switch (browser.toLowerCase()) {
            case "chrome" -> startChrome();
            //case "firefox" -> startFirefox();
            case "edge" -> startEdge();
            default -> startChrome();
        }
        driver.get(PropertyManager.getInstance().getStartUrl());
        LoginMethods loginMethods = new LoginMethods(driver);
        loginMethods.performLogin(PropertyManager.getInstance().getValidEmail(), PropertyManager.getInstance().getValidPassword());
    }

}
