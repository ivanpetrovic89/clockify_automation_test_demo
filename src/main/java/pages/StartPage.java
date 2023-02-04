package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage extends BasePage{
    public StartPage(WebDriver driver) {
        super(driver);
    }

    //public By loginLinkBy = By.xpath("//div[@class='header__row__item_right']//a[@href='https://app.clockify.me/login']");
    public By loginLinkBy = By.xpath("//div[@class='header__row__item_right']//a[text()='Log In']");

    public void clickLogin(){
        clickElement(loginLinkBy);
    }

}
