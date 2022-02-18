Dear candidate,

 

This is a technical testing Kata that we will use to gain insight and understanding into your approach to software test automation.

We are looking to assess your thought process, problem solving and programming ability, as well as how you create and manage value adding automated tests.

 

Part one:  UI Test

 

Please automate the following process:

Navigate to https://www.investec.com/
Using the search functionality, look for the cash investment rates information page (which is located here: https://www.investec.com/en_za/focus/money/understanding-interest-rates.html)" 
Navigate to: “Understanding cash investment interest rates”
Sign up to receive focus insights straight to your inbox – you can use test@investec.co.za as the email address
Ensure that the sign up process is successful
 

Part two: API Test

 

Create an API Test that executes a GET request to: https://swapi.dev/api/people/ and assert that R2-D2’s skin colour is white and blue.

 

Requirements:

You can use any language or programming tool of your choice

Please upload your code to github and share the project URL with us

Ensure that the code is runnable and the steps to set up the project are included in a readme

# investecassessment
This is an assessment provided by Investec for Mlungisi Mbele to complete

# Selenium-RestAssured Hybrid Framework

The aim of this project is to create a test automation framework that will be used for testing Web and API applications. This is a Selenium-RestAssured hybrid framework designed using Page Factory and Behavior-Driver design pattern.

## Getting Started

This project is a Maven project. To access this project, import this project directly from github into your IntelliJ IDE or clone the Repository in your local machine and open the Maven project from your local directory into IntelliJ.

## Prerequisites

```bash
IntelliJ IDEA Community 2018.x
JRE-9.0.x
JDK-9.0.x
Chrome Web browser

```

## Installing - following the instructions from the links
```bash
Download and Install:
1.	IntelliJ IDE  - https://www.guru99.com/intellij-selenium-webdriver.html#2
4.	JRE and JDK  - https://docs.oracle.com/javase/7/docs/webnotes/install
5.	Chrome - https://support.google.com/chrome/answer/95346?co=GENIE.Platform%3DDesktop&hl=en-GB
```

## Framework
### Tools
```bash
Web Testing Framework: Selenium Webdriver
API Testing Framework: RestAssured
Build Tool: Maven
Testing Tool: TestNG
Programming Language: Java
```

### Design
Framework consists of following modules / packages:
•	common (web and api driver utils class), 
•	pages (web applications page factory), 
•	resources(api and web config.properties file)

```

```bash
Web and API tests use TestNG annotations following the same structure:

@BeforeClass – This is the precondition / setup of the tests
@Test – steps to run
@AfterClass – Post condition / resetting the driver into its initial state 

```

### To execute Tests

Right click on the pom.xml file and click on maven tests

