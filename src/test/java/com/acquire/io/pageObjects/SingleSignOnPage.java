package com.acquire.io.pageObjects;

import com.acquire.io.testCases.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingleSignOnPage extends BaseClass {
    WebDriver ldriver;

    //create the constructor which takes driver as parameter
    public SingleSignOnPage(WebDriver rdriver)
    {
        ldriver=rdriver;

        //specify pagefactory class
        PageFactory.initElements(rdriver,this);
    }

    //locate webelement
    @FindBy(id="configName")
    WebElement ssoaccountid;

    @FindBy(css="button.button")
    WebElement ssologin;

    @FindBy(css="a.login_form-text")
    WebElement backtoemail;

    //action

    public void ssoaccountidk(String username){
        ssoaccountid.sendKeys(username);
    }

    public void clicksso()
    {
        ssologin.click();
    }

    public void clickbacktoemail(){
        backtoemail.click();
    }







}
