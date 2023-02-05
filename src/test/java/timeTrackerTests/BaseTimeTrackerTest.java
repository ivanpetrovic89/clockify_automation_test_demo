package timeTrackerTests;

import common.Browsers;
import methods.LoginMethods;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import utilities.PropertyManager;


public class BaseTimeTrackerTest extends Browsers {
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
