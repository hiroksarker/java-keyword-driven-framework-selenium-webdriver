# Keyword Driven Framework in Selenium WebDriver Example
Keyword-driven automation framework is the most popular testing framework that is easy to design in selenium. It is a technique in which we represent the test scenario in terms of keywords and corresponding parameters. 

# Main Components of Keyword Driven Framework in Selenium
There are some common components for each keyword driven automation framework that you need in order to create a Selenium keyword driven framework. They are as follows:
1. Excel Sheet: It is used to store keywords and data required for test cases, test steps, test objects, and test actions

2. Object Repository: These are property files that are used to store locator values of web elements present in the application. A property file is a text file where data is stored in the form of key-value pairs. These property files act as an object repository in Selenium WebDriver.

3. Function Library: Functions library plays an important role that is used to perform actions. These functions that we create, should be tied up with keywords.

4. Test Data Sheet (Generally in Excel format): This is an excel file that is used to store data values within objects to perform actions on it.

5. Test Scripts: Test scripts perform operations on AUT (Application under test) with the help of Library functions and Test Data.

6. Driver Script: Driver script is heart of the keyword driven framework in selenium. This script is also known as execution engine. This is the main script that interacts with all test scripts. The driver script does so with the help of Library functions.

The main task that is accomplished by driver script, is to read data from environment variables, read excel file, call functions mapped to keywords, and log the result.
7. Selenium - Setting and Environment variables.

# Test Data Sheet in Keyword Driven Framework in Selenium

Generally, automated test cases are stored in an excel spreadsheet. In Selenium keyword driven framework, we read excel sheet and then row by row we execute functions in the test case. Each test case is implemented as a set of keywords that represents the functionalities of an application.
List of common columns in Data Sheet are as follows:
1. Test case ID: ID of test case. A test case is basically a set of cases to test, steps, expected results and actual results to ensure quality of an application.
2. Test case Name: Name of test cases/scenario.

3. Execute Flag: If it is marked Y then test case will be executed.
4. Test step ID: Steps in a test case which is going to perform on the test objects.
5 Action: Name of the action that has to be performed on any Object such as open browser, enter username, enter password, click, etc.

6. Keyword: A set of user actions or functions that we would like to test in the application.
7. Object Name: Name of WebElement like username, password present on a web page.
8. Object Type: Name of locators like XPath, CSS id, name, etc.
9. Object Value: Actual test data that has to be entered in objects.
10. Parameter: It is used to control the execution flow in the function.

Blog Reference Source : https://www.scientecheasy.com/2020/01/keyword-driven-framework-in-selenium.html?fbclid=IwAR3AO5DjNCW4BspLwKIvFI6rNMBfdjsrjTyNyJk4wjK2nxWs1wGO7Xn20Ew
