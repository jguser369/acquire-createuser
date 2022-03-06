package com.acquire.io.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.*;

public class SettingPage {

    WebDriver sdriver;

    public SettingPage(WebDriver rdriver){
        sdriver =rdriver;
        PageFactory.initElements(rdriver,this);

    }

    @FindBy(id = "secondary")
    WebElement Setting;

    @FindBy(id = "primary")
    WebElement Primary;

    @FindBy(css = "span.icon-setting")
    WebElement settingicon;

    @FindBy(css="span.expandable-menu-title")
    WebElement accountsetting;

    @FindBy(xpath="//a[contains(@href, '/settings')]")
    WebElement usersetting;

    @FindBy(css="button.button.setting-add-new-que")
    WebElement createusersetting;

    public void clicksettingoption(){
        settingicon.click();
    }


    public void clickaccountsetting(){
        List<WebElement> allelements=sdriver.findElements(By.cssSelector("span.expandable-menu-icon"));
        for(WebElement ele:allelements)
        {
            if(ele.getText()=="Account Settings"){
                ele.click();
            }
            else{
                System.out.println("element not found");
            }
        }

    }

    public void clickuserrolesetting(){
        usersetting.click();
    }


     public void clickcreateuser(){
        createusersetting.click();
    }


}
