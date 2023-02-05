package timeTrackerTests;

import methods.ProjectsMethods;
import methods.TimeTrackerMethods;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ProjectCreateTest extends BaseTimeTrackerTest{
    @Test(testName = "Create new project from Time Tracker test.")
    public void performStartStop() {
        TimeTrackerMethods mainMethods = new TimeTrackerMethods(driver);
        mainMethods.performCreateNewProject();
    }

    @AfterMethod
    public void cleanUp(){
        ProjectsMethods projectsMethods = new ProjectsMethods(driver);
        projectsMethods.performProjectCleanup();
        driver.quit();
    }
}
