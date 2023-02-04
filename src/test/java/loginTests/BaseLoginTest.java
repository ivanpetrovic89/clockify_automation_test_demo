package loginTests;

import common.Browsers;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import utilities.PropertyManager;

public class BaseLoginTest extends Browsers {

    @BeforeMethod
    public void setup(@Optional("chrome") String browser){
        switch (browser.toLowerCase()) {
            case "chrome" -> startChrome();
            //case "firefox" -> startFirefox();
            case "edge" -> startEdge();
            default -> startChrome();
        }
        driver.get(PropertyManager.getInstance().getStartUrl());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
