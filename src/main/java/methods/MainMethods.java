package methods;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.MainPage;
import utilities.PropertyManager;

public class MainMethods extends MainPage {
    public MainMethods(WebDriver driver) {
        super(driver);
    }

    public void performLogout(){
        clickProfileIcon();
        clickLogout();
    }

    public void logoutCheck(){
        isElementDisplayed(LoginPage.loginButtonBy);
    }

    // In this method the length of test time is defined in configuration.properties file, and it is called
    // from PropertyManager class because we want to avoid any kind of hardcoding.
    public void performStartStop(){
        clickStartButton();
        String time = getCurrentTime();
        while(!time.equals(PropertyManager.getInstance().getTestTime())) {
            time = getCurrentTime();
        }
        clickStopButton();
    }

    public void startStopButtonCheck(){
        isElementDisplayed(startButtonBy);
    }

    public void performCleanUp(){
        clickTreeDotMenu();
        clickDeleteTracking();
        clickDeleteTrackingButton();
        waitTreeDotDisappear();
    }

}
