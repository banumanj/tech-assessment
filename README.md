# tech-assessment

Get the latest Source Code
Open Terminal or command line cd to the desired folder where the test automation source code needs to be checkout

Run command git clone 

This will download the latest template source code https://github.com/banumanj/tech-assessment.git

Tools
*Cucumber-JVM:- BDD Framework
*JAVA: - Programming language
*TestNg: - TestNg Java testing framework
*Maven: - Build tool
*Intellij : - Integrated Development Environment
*Git: - Version Control
*Rest-Assured : - Restful Api framework

Import Project into Intellij
File>Import Project> 


Compile Build or Run Tests
Command Line

cd to root ot automationFramework project directory

To clean and compile the build
mvn clean install -DskipTests

To run all tests 
mvn clean test

Report
Local reports
Standard Report
A report will be generated at target/cucumber-reports/CucumberTestReport.json

Pretty Cucumber-Html Report
A report will be generated at target/cucumber-reports/cucumber-pretty/index.html

