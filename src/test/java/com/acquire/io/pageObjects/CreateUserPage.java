package com.acquire.io.pageObjects;

import com.acquire.io.testCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.*;

public class CreateUserPage extends BaseClass {
    WebDriver sdriver;

    public CreateUserPage(WebDriver rdriver){
        sdriver =rdriver;
        PageFactory.initElements(rdriver,this);

    }

    @FindBy(css ="button.button.setting-add-new-que" )
    WebElement createusersetting;

    @FindBy(id = "name")
    WebElement createuserid;

    @FindBy(id="email")
    WebElement createuseremail;

    @FindBy(css="div.country-select")
    WebElement createcountryname;

    @FindBy(css="div.state-select")
    WebElement createstatename;

    @FindBy(id="password")
    WebElement createuserpwd;


    @FindBy(id = "passwordRepeat")
    WebElement createuserRpwd;


    @FindBy(css = "div.add-edit-role i")
    WebElement createusereditrole;

    @FindBy(css="div.office-number-and-extn")
    WebElement createuserctryoffext;

    @FindBy(css="div.profile-mobile-number")
    WebElement createuserctryphone;

    @FindBy(css="add-edit-department")
    WebElement createuserdepat;

    @FindBy(css="add-edit-timezone")
    WebElement createusertimezone;


    @FindBy(css="button.button.form-button.is-primary")
    WebElement createusersave;

    @FindBy(css=" button.button.form-button.is-simple.is-primary")
    WebElement createuserCancel;

    @FindBy(id="div.password div.form-input-validation.is-error span")
    WebElement createuserpwderr;

    @FindBy(css="div.user-name-column div.is-error span")
    WebElement createnamereqerr;

    @FindBy(css="div.user-email-column div.is-error span")
    WebElement createemailreqerr;

    @FindBy(css="div.confirm-password div.is-error span")
    WebElement createreppwderr;

    @FindBy(css="div.add-edit-role div.is-error span")
    WebElement createrolereqerr;

    public void clicksave(){
        createusersave.click();
    }

    public void clickcancel(){
        createuserCancel.click();
    }

    public void verifysavebutton()
    {
        createusersave.isDisplayed();
    }

    public void verifycancelbutton()
    {
        createuserCancel.isDisplayed();
    }

    //values read from the Config.propertiesfile
    public void setusernamesetting(String createDuser){
        createuserid.sendKeys(createDuser);
    }


    public void setemailid(String createemail){
        createuseremail.sendKeys(createemail);
    }

    public void setpassword(String createpwd){
        createuserpwd.sendKeys(createpwd);
    }

    public void setpasswordrepeat(String createreppwd){
        createuserRpwd.sendKeys(createreppwd);
    }

    public void setrole(String createrole){
        createusereditrole.sendKeys(createrole);
    }

    //UPdate the other mandatory attributes in Create User page
    public void setcountryname(String createcountry)
    {
        List<WebElement> Allcountry=driver.findElements(By.cssSelector("div.country-select"));
        for(WebElement ele:Allcountry){
            if(ele.getText()==createcountry){
                ele.click();
                return;
        }
    }}


    //Error validation message for required attributes
    public void verifypwdreqerror(){
        createuserpwderr.isDisplayed();
    }

    public void verifyuserreqerror()
    {
        createnamereqerr.isDisplayed();
    }

    public void verifyrolereqerr(){
        createrolereqerr.isDisplayed();
    }

    public void verifyemailreqerr(){
        createemailreqerr.isDisplayed();
    }

    public void verifypwdreperr(){
        createreppwderr.isDisplayed();
    }


}
