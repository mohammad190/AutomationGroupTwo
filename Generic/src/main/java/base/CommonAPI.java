package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver;

    public void launch_Browser_Open_Application(String browser, String URL) {
        get_Local_Driver(browser);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to(URL);
        driver.manage().window().maximize();
    }

    public WebDriver get_Local_Driver(String browser) {

        if(browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "Generic/driver/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "Generic/driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.IE.driver", "Generic/driver/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("Opera")) {
            System.setProperty("webdriver.opera.driver", "Generic/driver/operadriver.exe");
            driver = new OperaDriver();
        } else {
            System.err.println("Choose from: Firefox/Chrome/IE/Opera.");
        }
        return driver;
    }

    public void close_Browser() {
        driver.quit();
    }
}
