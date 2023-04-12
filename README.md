The Brief

As part of the selection process for the Quality Assurance Engineer role, you are required to complete a technical test to help us get a feel of your practical skills given a real-world problem.

Instructions

This assessment has two sections: UI automation and API automation. Please complete both sections. The complete task should be submitted by Tuesday, 11th April, 2023, 5.00pm EAT.

The challenge - UI Automation

Instructions

As a Quality Assurance Engineer for Betika, you have been tasked with ensuring that new changes to the
website do not break existing functionality. The scope of this assignment is login authentication and
placing bets on the website.
1. Come up with automated test cases that can be ran against new PRs to ensure they don’t break
   existing functionality.
2. Use the pages provided below as your test surfaces.
3. For placing bets, you will need to programmatically add picks to the betslip and place a bet.
4. The challenge is in the choice of tools you use,your mastery of those tools and how you organize and
   communicate your work.
5. Commit your assessment to a repository of your choice.
6. Your choice of tool should share an automated report including the test cases, methodology and
   results.
7. Feel free to seek any clarification by email.
   Success criteria
   Bonus
1. Automated test report
2. Working codebase
3. Thorough test cases
1. Add other test cases
2. Scalable application
3. Usage of Gitlab CI/CD

Resources
Login: https://www.betika.com/en-ke/login
Soccer matches: https://www.betika.com/en-ke/s/soccer 
Placebo: https://www.betika.com/en-ke/betslip
(We shall send you details privately about temporary test accounts that you can use)

The challenge - API Automation

Instructions

1. Come up with automated test cases that can be run against a test api-
   https://fakerestapi.azurewebsites.net/api/v1/Users
   Success criteria
2. Working tests
3. Commit your assessment to a repository of your choice.
 

Requirements:

You can use any language or programming tool of your choice

Please upload your code to github and share the project URL with us

Ensure that the code is runnable and the steps to set up the project are included in a readme

# Betika.comassessment
This is an assessment provided by Betika.com for Mlungisi Mbele to complete

# Selenium-RestAssured Hybrid Framework

The aim of this project is to create a test automation framework that will be used for testing Web and API applications. This is a Selenium-RestAssured hybrid framework designed using Page Factory and Behavior-Driver design pattern.

## Getting Started

This project is a Maven project. To access this project, import this project directly from github into your IntelliJ IDE or clone the Repository in your local machine and open the Maven project from your local directory into IntelliJ.

## Prerequisites

```bash
IntelliJ IDEA
JRE-8.0.x
JDK-8.0.x
Chrome Web browser (for this test but any browser may be used)

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

```bash
Web and API tests use TestNG annotations following the same structure:

@BeforeMethod – This is the precondition / setup of the tests
@APITest – steps to run
@AfterMethod – Post condition / resetting the driver into its initial state 

```

### To execute Tests

Right click on the test file and click on maven tests

### Reporting

Due to time constraints, maven surefire reporting was implemented for reporting as opposed to EXTENT REPORTS
as initially planned, after running a test, the report can be found in target -> surefire reports -> emailable-report.html or the respective test folders

