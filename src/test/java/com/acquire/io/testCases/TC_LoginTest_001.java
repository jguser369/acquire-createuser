package com.acquire.io.testCases;

import com.acquire.io.pageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {

    @Test
    public void loginTest()
    {
        System.out.println("Before "+baseURL);
        //implement code for the login .beforeclass is executed to trigger the browser
        driver.get(baseURL);
        System.out.println("URL "+baseURL);

        //need to create the page object login page  ..loginpage need to make static
        LoginPage lp=new LoginPage(driver);
        lp.setUserName(username);
        lp.setPassword(password);
        lp.clicklogin();

        if(driver.getTitle().equals("Acquire Admin Login — Acquire Admin"))
        {
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);
        }

    }

    //Verify login wiht invalid credentials
    @Test
    public void loginwithinvalidcredential()
    {
        //need to create the page object login page  ..loginpage need to make static
        LoginPage lp=new LoginPage(driver);
        lp.setUserName("username");
        lp.setPassword("password");
        lp.clicklogin();

        if(driver.getTitle().equals("Acquire Admin Login — Acquire Admin"))
        {
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);
        }

    }





}
