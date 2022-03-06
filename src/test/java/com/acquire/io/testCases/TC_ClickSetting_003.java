package com.acquire.io.testCases;

import com.acquire.io.pageObjects.LoginPage;
import com.acquire.io.pageObjects.SettingPage;
import org.testng.annotations.Test;
//import sun.jvm.hotspot.runtime.Thread;

public class TC_ClickSetting_003 extends BaseClass{

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
    }

}
