package Testcases;

import Utilities.Helper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver = null;

    @BeforeSuite
    @Parameters({"browser"})
    public void startDriver(@Optional("chrome") String browserName)
    {
        if (browserName.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @AfterSuite
    public void stopDriver()
    {
        driver.quit();
    }

    //TO TAKE SCREENSHOT OF THE FAILURE
    @AfterMethod
    public void screenshotOnFailure(ITestResult result)
    {
        if(result.getStatus()==ITestResult.FAILURE) {
            System.out.println("Failed");
            System.out.println("Taking Screenshot ...");
            Helper.captureScreenshot(driver, result.getName());
        }


    }

}
