package com.acquire.io.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//userid,pwd,login,other objects.Define the Webdriver object for the loginpage

    WebDriver ldriver;

    //create the constructor which takes driver as parameter
    public LoginPage(WebDriver rdriver)
    {
        ldriver=rdriver;

        //specify pagefactory class
        PageFactory.initElements(rdriver,this);
    }

    //Login page webelement
    @FindBy(id="usernameOrEmail")
    WebElement loginuser;

    @FindBy(id="password")
    WebElement password;

    @FindBy(css = "div button.form-button")
    WebElement loginbutton;

    @FindBy(css="span.login-options")
    WebElement singlesignonbutton;

     @FindBy(css="a.login_form-text")
     WebElement forgotpwd;

     @FindBy(id="keep-sign-in")
     WebElement keepsigncheckbox;

     @FindBy(css="div.acq-header-logo")
     WebElement homepagelogo;

    //action items

    public void verifyhomepagelogo(){
        homepagelogo.isDisplayed();
    }

    public void clickcheckbossign(){
        keepsigncheckbox.click();
    }
    public void clickforgotpwd()
    {
        forgotpwd.click();
    }

    public void ssoclick(){
        singlesignonbutton.click();
    }

    public void setUserName(String uname)
    {
        loginuser.sendKeys(uname);
    }

    public void setPassword(String pwd)
    {
        password.sendKeys(pwd);
    }

    public void clicklogin()
    {
        loginbutton.click();
    }



}
