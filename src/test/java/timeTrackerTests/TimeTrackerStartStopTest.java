package timeTrackerTests;

import methods.MainMethods;
import org.testng.annotations.Test;

public class TimeTrackerStartStopTest extends BaseTimeTrackerTest{
    @Test(testName = "Start and Stop time tracker test.")
    public void performStartStop(){
        MainMethods mainMethods = new MainMethods(driver);
        mainMethods.performStartStop();
        mainMethods.startStopButtonCheck();
    }

}
