package com.acquire.io.testCases;

import com.acquire.io.pageObjects.CreateUserPage;
import com.acquire.io.pageObjects.LoginPage;
import com.acquire.io.pageObjects.SettingPage;
import org.testng.annotations.Test;

public class TC_CreateUserReq_005 extends BaseClass {


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

    //Validating the Mandatory attributes FullName,Email,Password,RepeatPassword,Role
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

    @Test
    public void VerifyUsermandatorycheck()
    {
        clickSettingDashboard();
        CreateUserPage cp=new CreateUserPage(driver);
        cp.setusernamesetting(createDuser);
        cp.clicksave();
        cp.verifyuserreqerror();
    }

    @Test
    public void VerifyEmailmandatorycheck()
    {
        clickSettingDashboard();
        CreateUserPage cp=new CreateUserPage(driver);
        cp.setemailid(createemail);
        cp.clicksave();
        cp.verifyuserreqerror();
    }

    @Test
    public void VerifyPwdmandatorycheck()
    {
        clickSettingDashboard();
        CreateUserPage cp=new CreateUserPage(driver);
        cp.setpassword(createpwd);
        cp.clicksave();
        cp.verifyuserreqerror();
    }

    @Test
    public void VerifyPqdReqmandatorycheck()
    {
        clickSettingDashboard();
        CreateUserPage cp=new CreateUserPage(driver);
        cp.setpasswordrepeat(createreppwd);
        cp.clicksave();
        cp.verifyuserreqerror();
    }

    @Test
    public void VerifyRolemandatorycheck()
    {
        clickSettingDashboard();
        CreateUserPage cp=new CreateUserPage(driver);
        cp.setrole(createrole);
        cp.clicksave();
        cp.verifyuserreqerror();
    }

    @Test
    public void VerifySaveCancelbutton(){
        clickSettingDashboard();
        CreateUserPage cp=new CreateUserPage(driver);
        cp.verifysavebutton();
        cp.verifycancelbutton();
    }

    @Test
    public void VerifySaveCancelbuttonenabled(){
        clickSettingDashboard();
        CreateUserPage cp=new CreateUserPage(driver);
        cp.setusernamesetting(createDuser);
        cp.verifysavebutton();
        cp.verifycancelbutton();
    }












}
