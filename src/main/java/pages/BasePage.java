package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BasePage {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public static void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.presenceOfElementLocated(elementBy));
    }

    public void waitToBeClickable(By elementBy){
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    public static void waitToDisappear(By elementBy){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(elementBy));
    }

    public void clickElement(By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    public void keyPressElement(By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(Keys.ENTER);
    }

    public static String readText(By elementBy){
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    public void writeText(By elementBy, String text){
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);
    }

    public void isElementDisplayed(By elementBy){
        waitVisibility(elementBy);
        Assert.assertTrue(driver.findElement(elementBy).isDisplayed());
    }

}
