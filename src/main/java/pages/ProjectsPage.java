package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectsPage extends BasePage{
    public ProjectsPage(WebDriver driver) {
        super(driver);
    }
    public By projectsButtonBy = By.xpath("//span[normalize-space()='Projects']");
    public By threeDotDropdownBy = By.xpath("//img[@class='cl-px-1']");
    public By archiveButtonBy = By.xpath("//a[normalize-space()='Archive']");
    public By filterSelectButtonBy = By.xpath("//div[@role='button']");
    public By archiveFilterBy = By.xpath("//a[normalize-space()='Archived']");
    public By activeFilterBy = By.xpath("//a[normalize-space()='Active']");
    public By applyFilterButtonBy = By.xpath("//button[@class='cl-btn cl-btn-outline-primary cl-ml-auto cl-d-none cl-d-lg-custom-block']");
    public By deleteSelectBy = By.xpath("//a[normalize-space()='Delete']");
    public By deleteButtonBy = By.xpath("//button[normalize-space()='Delete']");


    public void clickProjectsButton(){
        waitToBeClickable(projectsButtonBy);
        clickElement(projectsButtonBy);
    }

    public void clickThreeDotDropdown(){
        waitToBeClickable(threeDotDropdownBy);
        clickElement(threeDotDropdownBy);
    }

    public void clickArchiveButton(){
        waitToBeClickable(archiveButtonBy);
        clickElement(archiveButtonBy);
    }

    public void clickFilterSelection(){
        waitToBeClickable(filterSelectButtonBy);
        clickElement(filterSelectButtonBy);
    }

    public void selectArchiveFilter(){
        waitToBeClickable(archiveFilterBy);
        clickElement(archiveFilterBy);
    }

    public void clickApplyFilter(){
        waitToBeClickable(applyFilterButtonBy);
        clickElement(applyFilterButtonBy);
        driver.navigate().refresh();
    }

    public void clickThreeDotDropdownAgain(){
        waitToBeClickable(threeDotDropdownBy);
        clickElement(threeDotDropdownBy);
    }

    public void clickDeleteSelection(){
        waitToBeClickable(deleteSelectBy);
        clickElement(deleteSelectBy);
    }

    public void clickDeleteProject(){
        waitToBeClickable(deleteButtonBy);
        clickElement(deleteButtonBy);
        //driver.navigate().refresh();
    }

    public void selectActiveFilter(){
        waitToBeClickable(activeFilterBy);
        clickElement(activeFilterBy);
    }

}
