# java-selenium-ui-demo
### Purpose
The purpose of this project is to automate UI tests of the website, https://www.theredx.com/ using Java & Selenium with Maven.

##
### FRAMEWORK INFORMATION
This framework uses the following:

#### Languages
- Java - version 12

#### Dependencies
These should all be part of the pom.xml file.
- Maven.compiler - version 1.2
- Selenium - version 3.141.59
- Test NG - version 6.14.3
- Surefire - version 3.0.0-M5

#### Design Pattern
- Page Object Model - if you haven't used the Page Object Model before, check out the Page Object Model section below.

##
### GETTING STARTED
You will need the following on your computer in order to work on this project:
* Java - Using version 12 for this project
* Maven - Check out the Maven section below for more info on installing it

1. Open the terminal
2. Navigate to the directory you want to store this project
3. Run this command ```git clone https://github.com/vernko/redx-demo.git```
4. Once it has cloned the repo, you should see something like ```redx-demo git:(main)```
5. Now you know you have the code for the repo on your machine
6. Open this project in the code editor of your choice
(for java, IntelliJ is really nice, recommend downloading the free community version at https://www.jetbrains.com/idea/download/)
7. Once you have the project open, check & make sure you have the right version 

##
### NAMING CONVENTIONS
- Packages - camelCase (typically only one word though)
- Classes - PascalCase
- Methods - camelCase

##
### ORGANIZATION - PAGE OBJECTS
#### Page Object Classes
You'll find any Page Objects under the "main" directory in the "pages" package.

Essentially, for each page you create a new class. You can use that class object anywhere in the automation.
We use these classes to put any selenium-based operations such as:
- Locators
- Clicks
- Sending keys/inputs

Add methods & locators related to that page inside this class.

I prefer to organize these in a hybrid alphabetical/functionality order.
- If there is no related functionality, order it alphabetically.
- If there is related functionality, put that in order of occurrence.

##
### ORGANIZATION - TESTS
 
You'll find any tests under the "test" directory. 
- Each page is a separate test package.
- Each package has a test class to hold all the tests
- All tests are separate methods within the test class. 

##
### CREATING TESTS
This framework uses TestNG. If you aren't familiar with TestNG. Check out the TestNG section below for more info.

With TestNG, every test is its own method with the notation of ```@Test```.

Just like with methods in a Page Object class, organize these in a hybrid alphabetical/functionality order.
- If there is no related functionality, order it alphabetically.
- If there is related functionality, put that in order of occurrence.

#### Test Structure
- A descriptive name for the test
- Test data/info needed for validation of tests
- Clean descriptive steps (aka methods from page object class)
- Assertion - whatever you are validating to ensure the test passes as you expect.

#### Assert
TestNG provides an "Assert" class with a variety of asserts including:
- assertEquals
- assertTrue
- assertFalse
- assertNotEquals

#### Example of Creating a New Test
If you need to create new tests related to a group of test already created, go to that test class, and add the new test there.

If you need to create a test that does not relate to a current test. Add a new package for that particular page, then add the new test.

For example, if you need to add a test for filling in the contact info on the About Me page. We might do something like this.
1. Go to test -> java
2. Create a ```aboutMe``` package
3. Create a ```AboutMeTests``` class under the ```aboutMe``` package.
4. Make sure ```AboutMeTests``` extends the correct class, in this case that would be ```BaseTests```.
5. Add a new test, named something like ```testCanSumbitContactForm```
6. Add test steps
7. Assert that form was submitted
```
@Test
public void testCanSubmitContactForm(){
# Go to About Me
# Fill out contact form
# Submit that form
# Assert form was submitted
}
```
##
### RUNNING TESTS
#### Individual Tests
From IDE
1. Go to the test class of the test you want to run
2. Find the test (aka test method) you want to run
3. Click the play button next to the test

From Command Line

To run tests from the command line, you'll need to have ```mvn``` installed on your device.
Once you have maven installed on your device, run ```mvn -v```. This verifies maven installed.

- Test Class - run all the tests in an entire class

```mvn test -Dtest=ClassName test```

#### Automation Suite
There are 2 ways to run the entire suite for automation

XML File
1. Find the "aumniAutomationSuite.xml" file
2. Run the suite of tests.

Command Line

```mvn test```


##
### ADDITIONAL RESOURCES
#### Maven
If you don't have maven installed on your device, check out this article to help install it on your device.
[Install Maven](https://www.baeldung.com/install-maven-on-windows-linux-mac)

For mac users, you can install maven view Homebrew by running this command ```brew install maven```

##
#### Test NG
Below are some good resources to help with Test NG if you have never used it before.

TestNG's official site - [TestNG](https://testng.org/doc/)

A good tutorial [Test Automation University](https://testautomationu.applitools.com/) - [Intro to TestNG](https://testautomationu.applitools.com/introduction-to-testng/index.html)

##
### Selenium
If you haven't used Selenium before, basically it's a tool that helps to help automate tasks. In testing, we use it to help automate user flows especially web-related items.

Selenium's official site - [Selenium](https://www.theredx.com/)

##
#### Page Object Model
The article below from BrowserStack provides good info about the POM - [Article on POM](https://www.browserstack.com/guide/page-object-model-in-selenium)
