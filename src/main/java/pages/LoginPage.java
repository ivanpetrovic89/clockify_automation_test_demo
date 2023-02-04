package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends StartPage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public By emailFieldBy = By.id("email");
    public By passwordFieldBy = By.id("password");
    public static By loginButtonBy = By.xpath("//button[@type='submit']");

    public void clickEmailField(){
        clickElement(emailFieldBy);
    }

    public void writeEmail(String email){
        writeText(emailFieldBy, email);
    }

    public void clickPasswordField(){
        clickElement(passwordFieldBy);
    }

    public void writePassword(String password){
        writeText(passwordFieldBy, password);
    }

    public void clickLoginButton(){
        clickElement(loginButtonBy);
    }

}
