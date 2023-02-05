package timeTrackerTests;

import methods.TimeTrackerMethods;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TimeTrackerStartStopTest extends BaseTimeTrackerTest{
    @Test(testName = "Start and Stop time tracker test.")
    public void performStartStop(){
        TimeTrackerMethods timeTrackerMethods = new TimeTrackerMethods(driver);
        timeTrackerMethods.performStartStop();
        timeTrackerMethods.startStopButtonCheck();
    }

    @AfterMethod
    public void cleanUp(){
        TimeTrackerMethods timeTrackerMethods = new TimeTrackerMethods(driver);
        timeTrackerMethods.performTimeTrackCleanUp();
        driver.quit();
    }

}
