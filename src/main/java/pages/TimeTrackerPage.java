package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimeTrackerPage extends LoginPage{
    public TimeTrackerPage(WebDriver driver) {
        super(driver);
    }

    public static By logoutButtonBy = By.xpath("//a[normalize-space()='Log out']");
    public static By startButtonBy = By.xpath("//button[@class='cl-btn cl-btn-primary cl-d-none cl-d-lg-custom-block ng-star-inserted']");
    public static By stopButtonBy = By.xpath("//button[contains(text(), 'Stop')]");

    //Careful with this locator because it is name dependent, if default valid user is changed, this locator xpath should change.
    public static By profileIconBy = By.xpath("//span[normalize-space()='Iv']");

    public static By treeDotMenuBy = By.xpath("//img[@class='cl-px-2']");
    public By deleteTrackingBy = By.xpath("//a[normalize-space()='Delete']");
    public By deleteButtonBy = By.xpath("//button[normalize-space()='Delete']");
    public By activeTimerBy = By.xpath("//span[@class='cl-form-control cl-input-time-picker-sum']");
    public By projectButtonBy = By.xpath("//span[@class='cl-ml-2 w-fit cl-cut-text']");
    public By createNewProjectButtonBy = By.xpath("//span[@class='cl-ml-2 cl-text-primary w-fit v-align-middle cl-d-inline-block cl-cut-text']");
    public By projectNameBarBy = By.xpath("//input[@placeholder='Enter project name']");
    public By createButtonBy = By.xpath("//button[normalize-space()='Create']");
    public By nameOfProjectBy = By.xpath("//span[contains(text(),'Test project')]");

    public void clickProfileIcon(){
        clickElement(profileIconBy);
    }

    public void clickLogout(){
        clickElement(logoutButtonBy);
    }

    public void clickStartButton(){
        clickElement(startButtonBy);
    }

    public void clickStopButton(){
        clickElement(stopButtonBy);
        //keyPressElement(stopButtonBy);
    }

    public void clickTreeDotMenu(){
        clickElement(treeDotMenuBy);
    }

    public void clickDeleteTracking(){
        clickElement(deleteTrackingBy);
    }

    public void clickDeleteTrackingButton(){
        clickElement(deleteButtonBy);
    }

    public void waitTreeDotDisappear(){
        waitToDisappear(treeDotMenuBy);
    }

    public String getCurrentTime(){
        return readText(activeTimerBy);
    }

    public void clickOnProjectButton(){
        clickElement(projectButtonBy);
    }

    public void clickOnCreateNewProjectButton(){
        clickElement(createNewProjectButtonBy);
    }

    public void clickOnProjectNameBar(){
        clickElement(projectNameBarBy);
    }

    public void writeProjectName(){
        writeText(projectNameBarBy, "Test project");
    }

    public void clickCreate(){
        clickElement(createButtonBy);
    }

}
