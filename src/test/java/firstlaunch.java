import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class firstlaunch {

    public static void main(String[] args) throws InterruptedException{
        //System.setProperty("webdriver.chrome.driver","C:\\personal\\QATraining\\PRoject_Juveria\\chromedriverv95\\chromedriver.exe");
        //Initiate the Chrome driver

        System.setProperty("webdriver.chrome.driver", "src\\tools\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        //launch the acquire.io
        driver.get("https://accounts.uat.env.acquire.io/login?endpoint=account&return=&account=lo4h4a");
        driver.getTitle();

        //login page WebElements
        WebElement loginuser = driver.findElement(By.id("usernameOrEmail"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginbutton = driver.findElement(By.cssSelector("div button.form-button"));
        WebElement logoimage = driver.findElement(By.className("acq-header-logo"));
        WebElement keeptext = driver.findElement(By.cssSelector("span.login_form-text"));
        WebElement signincheck = driver.findElement(By.cssSelector("input.checkbox"));
        WebElement Forgotlink = driver.findElement(By.cssSelector("div.col a"));
        WebElement loginform = driver.findElement(By.cssSelector("div.login__form"));
        WebElement singlesignon = driver.findElement(By.cssSelector("div.login__form-more-option-buttons"));
        WebElement loginwelcometext = driver.findElement(By.cssSelector("div.login__form h4"));
        WebElement passwordhide = driver.findElement(By.cssSelector("span.icon-hide"));
        WebElement imagelink = driver.findElement(By.cssSelector("div.video img"));

        //Maximise the browser
        driver.manage().window().maximize();

        //login using the normalsignin with valid credentials
        loginuser.sendKeys(" virijukix@givmail.com");
        password.sendKeys(" Hereisanew1!");
        loginbutton.click();

        driver.switchTo();
        System.out.println(driver.getTitle());
        Thread.sleep(1000);

        List<WebElement> allElements = driver.findElements(By.xpath(".//li[@class='selected is-action-button-selected sidebar-main__settings']"));//cssSelector(" div.sidebar__footer  li.sidebar__menu li"));//xpath("//div[@class='sidebar__footer']"));
        for(WebElement ele:allElements)
        {
            System.out.println(ele.getAttribute("class"));

        }

        WebElement setting= driver.findElement(By.xpath("//a[contains(@href, '/settings')]"));
        setting.click();

        driver.close();

       //WebElement setting =driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul[1]/div[2]/li/ul/li[1]/a/span"));
       // "//a[@title='TutorialsPoint - Home']"
        /*

        //Login using the singlesignon
        driver.get("https://accounts.uat.env.acquire.io/login?endpoint=account&return=&account=lo4h4a");
        singlesignon.isDisplayed();
        //Add assertions
        System.out.println(singlesignon.isDisplayed());
        singlesignon.click();

        //SingleSignon page Webelements
        WebElement ssologin=driver.findElement(By.id("configName"));
        WebElement ssobutton=driver.findElement(By.cssSelector("button.is-primary"));
        WebElement backemail=driver.findElement(By.cssSelector("a.login_form-text"));




        //SettingPage WebElement
        WebElement settingS=driver.findElement(By.id("secondary"));
        WebElement settingP=driver.findElement(By.id("primary"));
        WebElement sidebarsetting=driver.findElement(By.cssSelector("span.icon-setting"));

        sidebarsetting.click();

        //Create User
        WebElement createuser=driver.findElement(By.cssSelector("button.button.setting-add-new-que"));
        WebElement breadcrumb =driver.findElement(By.className("header-breadcrumbs__list"));
        WebElement createuserid =driver.findElement(By.id("name"));
        WebElement createuseremail =driver.findElement(By.id("email"));
        WebElement createuserpwd =driver.findElement(By.id("password"));
        WebElement createuserpwderr=driver.findElement(By.cssSelector("div.password div.form-input-validation.is-error span"));
        WebElement createuserRpwd =driver.findElement(By.id("passwordRepeat"));
        WebElement createusereditrole =driver.findElement(By.cssSelector("div.add-edit-role i"));
        WebElement createusersave=driver.findElement(By.cssSelector("button.button.form-button.is-primary"));
        WebElement createuserCancel=driver.findElement(By.cssSelector("button.button.form-button.is-simple.is-primary"));





    }*/




    }
}
