# Info
This is automation testing demonstration for web aplication Clockify done with Selenium for Java, using TestNG tool and Maven for dependencies.

It's done in three layers, where first layer has all individual locators of web elements and individual methods that perform singe action (as in classic Page Object Model);
second layer which has all methods that combine individual single action methods from the first layer into one (which represents actions from test cases);
and third layer that is used for individual test execution.

Currently, there are three tests: positive login test, positive logout test and positive start/stop tracking time test.

You can see mock test cases for each automated case here:
https://docs.google.com/spreadsheets/d/1CbKcagVxBw133ksSxDljzW9T6buYgmjBCGAbkYc-xig/edit?usp=sharing

For more detailed automation test demo wisit my other repo: 
https://github.com/ivanpetrovic89/tri-layer_automation_demo.git
