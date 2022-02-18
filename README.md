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

