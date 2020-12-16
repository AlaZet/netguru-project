--- Project Description ---

This is a project made for a recruitment process to Netguru.

The task was to prepare tests scenarios for any chosen application that has a login and registration form. 
From the test scenarios prepared in other document I decided to automate two:

- LOGIN CASE: happy path - user enters all the correct data and logs in to the application.
- REGISTRATION CASE: user enters all the corect data except for the name. The name is too short, so we expect an error message.

I have used Maven with Java and Selenium to write these tests. They are executed in the Chrome browser using Selenium ChromeDriver.
I wrote the code using Page Object pattern, so all the selectors and functions are in separate, appropriate files. 


--- Execution ---

1. Pull this repository.
2. You need to have JDK installed. 
3. You need to have Maven installed, please see the documentation here: http://maven.apache.org/install.html.
4. You need to have ChromeDriver installed: https://chromedriver.chromium.org/downloads.
5. Execute the tests using "mvn clean test" command.
6. If you want to run only one test at a time, use the following command: "mvn -Dtest=[nameOfTheTest] test".
