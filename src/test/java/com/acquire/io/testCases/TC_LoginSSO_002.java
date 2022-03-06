package com.acquire.io.testCases;

import com.acquire.io.pageObjects.LoginPage;
import com.acquire.io.pageObjects.SingleSignOnPage;
import org.testng.annotations.Test;

public class TC_LoginSSO_002 extends BaseClass {

    @Test
    public void clickssologin(){

        //need to create the page object login page  ..loginpage need to make static
        LoginPage lp=new LoginPage(driver);
        lp.ssoclick();

        SingleSignOnPage sp=new SingleSignOnPage(driver);
        sp.clicksso();

    }

    @Test
    public void clickssouser(){
        //need to create the page object login page  ..loginpage need to make static
        LoginPage lp=new LoginPage(driver);
        lp.ssoclick();

        SingleSignOnPage sp=new SingleSignOnPage(driver);
        sp.clicksso();
        sp.ssoaccountidk(username);
        sp.clickbacktoemail();

    }

    //Invalid user
    @Test
    public void clickssoinvaliduser(){
        //need to create the page object login page  ..loginpage need to make static
        LoginPage lp=new LoginPage(driver);
        lp.ssoclick();

        SingleSignOnPage sp=new SingleSignOnPage(driver);
        sp.clicksso();
        sp.ssoaccountidk("username");
        sp.clickbacktoemail();

    }


}
