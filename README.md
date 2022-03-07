# ![image](https://user-images.githubusercontent.com/101045277/156920851-299f029f-585e-412e-ab6a-d404c1cf4b1e.png)


# Requirement
Scenario 1: Log into agent dashboard. Navigate to settings
on the left navigation panel. Account Settings -> Users,
Roles and Skills -> Create User. This scenario should also
validate required fields.


• https://accounts.uat.env.acquire.io/login?endpoint=account&return=&account
=lo4h4a

# Approach

Used the POM –PageObject Model and Page Factory as part of the automation framework

Language :Java with Selenium Webdriver

Tools:IntelliJ/Eclipse,TestNG,Maven

Browser:Chrome

# Automation Framework Design used

![image](https://user-images.githubusercontent.com/101045277/156920701-2ce4ec37-50c6-4b92-986a-052776a9822d.png)

# Implementation steps

Create Maven Project
Update pom.xml with seleniumjar, testng, maven build plugin dependency
Create Page Objects
Create the Test scenarios
Read the common values for ex., username, emailid, password,role from properties file
Run the test case on the browser i.e Chrome![image](https://user-images.githubusercontent.com/101045277/156920727-a42290db-4974-4ff3-870f-a82384b90cb9.png)

# Test Scenarios 

![image](https://user-images.githubusercontent.com/101045277/156920741-c219a90e-f598-42e4-a5f2-650788185e08.png)

# Steps to Execute the scripts

1.TestNG configuration is used to run the scripts.

2.Right click on the TestNG.xml file and run

3.All the test cases are included in the TestNG.xml file

4.Also we can run the script using the maven. Select the pom.xml file and perform the below instructions
    mvn clean install
    mvn test
    
5.Also we have created the run.bat file inside the project file. Refer the readme instruction to run the file![image](https://user-images.githubusercontent.com/101045277/156920778-a4400c11-9c6d-4963-b8f5-84773eb8ac58.png)

-----------------------
Readme Instructions
-------------------
1.Download the project file in the local repository

2.Open the run.bat file in the notepad to edit

3.Update the project location

4.Save and close the bat file

5.Double click on the bat file to run the script

# Test Report

![image](https://user-images.githubusercontent.com/101045277/156957745-e66603e2-5356-48f0-832e-9f632612d9f5.png)


# Thank You
