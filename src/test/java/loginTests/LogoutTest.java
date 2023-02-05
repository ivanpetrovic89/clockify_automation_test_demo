package loginTests;

import methods.LoginMethods;
import methods.TimeTrackerMethods;
import org.testng.annotations.Test;
import utilities.PropertyManager;

public class LogoutTest extends BaseLoginTest{
    @Test(testName = "Positive logout test")
    public void performLogot(){
        LoginMethods loginMethods = new LoginMethods(driver);
        loginMethods.performLogin(PropertyManager.getInstance().getValidEmail(), PropertyManager.getInstance().getValidPassword());
        TimeTrackerMethods mainMethods = new TimeTrackerMethods(driver);
        mainMethods.performLogout();
        mainMethods.logoutCheck();
    }

}
