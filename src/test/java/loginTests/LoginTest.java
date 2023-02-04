package loginTests;

import methods.LoginMethods;
import org.testng.annotations.Test;
import utilities.PropertyManager;

public class LoginTest extends BaseLoginTest{
    @Test(testName = "Positive login test")
    public void performLogin(){
        LoginMethods loginMethods = new LoginMethods(driver);
        loginMethods.performLogin(PropertyManager.getInstance().getValidEmail(), PropertyManager.getInstance().getValidPassword());
        loginMethods.loginCheck();
    }

}
