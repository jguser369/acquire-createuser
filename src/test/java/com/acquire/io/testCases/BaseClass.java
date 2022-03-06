package com.acquire.io.testCases;
import com.acquire.io.utilities.ReadConfig;
import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;
import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
//import org.apache.log4j.logger;
import java.io.File;
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class BaseClass {

    ReadConfig readconfig=new ReadConfig();


    //include common things and common class
    public String baseURL=readconfig.getApplicationURL();
    public String username=readconfig.getusername();
    public String password=readconfig.getpassword();

    public String createDuser=readconfig.createuser();
    public String createemail=readconfig.createemailid();
    public String createrole=readconfig.createrole();
    public String createpwd=readconfig.createpwdU();
    public String createreppwd=readconfig.createreppwd();
    public String createcountry=readconfig.getcountry();

    public static WebDriver driver;
    public static Logger logger;

    @Parameters("browser")
    @BeforeClass
    public void setup(String br){


         logger =Logger.getLogger("acquire");

         System.setProperty("webdriver.chrome.driver","src\\tools\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseURL);


        //Run test case on desred browser
         if(br.equals("chrome")){
                System.setProperty("webdriver.chrome.driver","src\\tools\\chromedriver.exe");
                driver=new ChromeDriver();
         }
          else{
             return;
         }
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

    //screenshot if any error
    public void captureScreen(WebDriver driver,String tname) throws IOException{
        TakesScreenshot ts=(TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tname);
        System.out.println("Screenshot captured");
    }


}
