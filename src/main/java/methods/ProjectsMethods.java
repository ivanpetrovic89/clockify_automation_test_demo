package methods;

import org.openqa.selenium.WebDriver;
import pages.ProjectsPage;

public class ProjectsMethods extends ProjectsPage {
    public ProjectsMethods(WebDriver driver) {
        super(driver);
    }

    public void performProjectCleanup(){
        clickProjectsButton();
        clickThreeDotDropdown();
        clickArchiveButton();
        clickFilterSelection();
        selectArchiveFilter();
        clickApplyFilter();
        clickThreeDotDropdownAgain();
        clickDeleteSelection();
        clickDeleteProject();
        clickFilterSelection();
        selectActiveFilter();
        clickApplyFilter();
    }
}
