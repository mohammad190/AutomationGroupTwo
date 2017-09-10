package base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver;

    @Parameters({"browser","url"})
    @BeforeMethod
    public void launch_Browser_Open_Application(@Optional String browser, @Optional String URL) {
        get_Local_Driver(browser);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to(URL);
        driver.manage().window().maximize();
    }

    public WebDriver get_Local_Driver(String browser) {

        if(browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Local Account\\Desktop\\AutomationGroupTwo\\Generic\\driver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Local Account\\Desktop\\AutomationGroupTwo\\Generic\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.IE.driver", "C:\\Users\\Local Account\\Desktop\\AutomationGroupTwo\\Generic\\driver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("Opera")) {
            System.setProperty("webdriver.opera.driver", "C:\\Users\\Local Account\\Desktop\\AutomationGroupTwo\\Generic\\driver\\operadriver.exe");
            driver = new OperaDriver();
        } else {
            System.err.println("ERROR: Choose from: Firefox/Chrome/IE/Opera.");
        }
        return driver;
    }

    @AfterMethod
    public void close_Browser() {
        driver.quit();
    }
}
