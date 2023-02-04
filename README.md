# Info
This is automation testing demonstration for web aplication Clockify done with Selenium for Java, using TestNG tool and Maven for dependencies.

It's done in three layers, where first layer has all individual locators of web elements and individual methods that perform singe action (as in classic Page Object Model);
second layer which has all methods that combine individual single action methods from the first layer into one (which represents actions from test cases);
and third layer that is used for test execution.

Currently, there are three tests:

positive login test - src/test/java/loginTests/LoginTest.java

positive logout test - src/test/java/loginTests/LogoutTest.java

positive start/stop tracking time test - src/test/java/timeTrackerTests/TimeTrackerStartStopTest.java

You can see all mock test cases here:
https://docs.google.com/spreadsheets/d/1CbKcagVxBw133ksSxDljzW9T6buYgmjBCGAbkYc-xig/edit?usp=sharing

For my other, much more detailed automation test demo visit:
https://github.com/ivanpetrovic89/tri-layer_automation_demo.git
