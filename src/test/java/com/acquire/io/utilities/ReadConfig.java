package com.acquire.io.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties pro;
    //create construction
    public ReadConfig()
    {
        File src=new File("./Configuration/config.properties");
        try{
            FileInputStream fis=new FileInputStream(src);
            pro=new Properties();
            pro.load(fis);

        } catch (Exception e){
            System.out.println("Exception is "+e.getMessage());
        }
    }

    public String getApplicationURL()
    {
        String url=pro.getProperty("baseURL");
        return url;
    }

    public String getusername()
    {
        String username=pro.getProperty("username");
        return username;
    }

    public String getpassword()
    {
        String password=pro.getProperty("password");
        return password;
    }

    public String getbrowser()
    {
        String browser=pro.getProperty("browser");
        return browser;
    }

    public String getcountry()
    {
        String createcountry=pro.getProperty("createcountry");
        return createcountry;
    }



    //createuser value

    public String createuser()
    {
        String createDuser=pro.getProperty("createDuser");
        return createDuser;
    }

    public String createemailid()
    {
        String createemail=pro.getProperty("createemail");
        return createemail;
    }

    public String createrole()
    {
        String createrole=pro.getProperty("createrole");
        return createrole;
    }

    public String createpwdU()
    {
        String createpwrd=pro.getProperty("createpwd");
        return createpwrd;
    }

    public String createreppwd()
    {
        String createrepwrd=pro.getProperty("createreppwd");
        return createrepwrd;
    }




}
