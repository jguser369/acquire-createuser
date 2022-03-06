package com.acquire.io.testCases;

import com.acquire.io.pageObjects.CreateUserPage;
import com.acquire.io.pageObjects.LoginPage;
import com.acquire.io.pageObjects.SettingPage;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_CreateUser_004 extends BaseClass {

    //Navigate to the Add User Page
    @Test
    public void clickSettingDashboard()
    {
        LoginPage lp=new LoginPage(driver);
        lp.setUserName(username);
        lp.setPassword(password);
        lp.clicklogin();

        SettingPage setpage=new SettingPage(driver);
        setpage.clicksettingoption();
        setpage.clickaccountsetting();
        setpage.clickcreateuser();



    }

    //Create the User Successfully
    @Test
    public void CreateUser()
    {
        clickSettingDashboard();

        CreateUserPage cp=new CreateUserPage(driver);
        cp.setusernamesetting(createDuser);
        cp.setemailid(createemail);
        cp.setpassword(createpwd);
        cp.setpasswordrepeat(createreppwd);
        cp.setcountryname(createcountry);
        cp.setrole(createrole);
        cp.clicksave();



    }
}
