# Tech-assessment
Task  – PetStore API Testing

1.getPetsByStatus(PetStatus peStatus).
and uses the following REST endpoint:
https://petstore.swagger.io/#/pet/findPetsByStatus

2.getPetsByStatus(PetStatus peStatus).
and uses the following REST endpoint:
Stub wiremock response 

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

cd to root ot tech-assessment project directory

To clean and compile the build
mvn clean install -DskipTests

To run the tests :Run the following maven command from command line
mvn clean test

Report
Local reports
Standard Report
A report will be generated at target/cucumber-reports/CucumberTestReport.json

Pretty Cucumber-Html Report
A report will be generated at target/cucumber-reports/cucumber-pretty/index.html


