package methods;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.TimeTrackerPage;

public class LoginMethods extends LoginPage {
    public LoginMethods(WebDriver driver) {
        super(driver);
    }

    public void performLogin(String email, String password){
        clickLogin();
        clickEmailField();
        writeEmail(email);
        clickPasswordField();
        writePassword(password);
        clickLoginButton();
    }

    public void loginCheck(){
        isElementDisplayed(TimeTrackerPage.startButtonBy);
    }

}
