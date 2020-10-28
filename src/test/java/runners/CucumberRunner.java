package runners;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
        plugin = {"json:target/positive/cucumber.json", "pretty", "html:target/positive/cucumber.html"},
        features = "src/test/resources/features",
        glue = "steps",
        tags = { "@RandomBagCategoryProductCheckout,@JunitScenario,@TestngScenario" }
        )
public class CucumberRunner extends AbstractTestNGCucumberTests {

    public static Properties config = null;
    public static WebDriver driver = null;

    public void LoadConfigProperty() throws IOException {
        config = new Properties();
        FileInputStream ip = new FileInputStream(
                System.getProperty("user.dir") + "//src//test//resources//config//config.properties");
        config.load(ip);
    }

    public void configureDriverPath() throws IOException {
        if(System.getProperty("os.name").startsWith("Windows")) {
            String firefoxDriverPath = System.getProperty("user.dir") + "//src//test//resources//drivers//windows//geckodriver.exe";
            System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
            String chromeDriverPath = System.getProperty("user.dir") + "//src//test//resources//drivers//windows//chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        }
        else
        {
            System.out.println("No Driver");
        }
    }

    public void openBrowser() throws Exception {
        // loads the config options
        LoadConfigProperty();
        // configures the driver path
        configureDriverPath();
        if (config.getProperty("browserType").equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (config.getProperty("browserType").equals("chrome")) {
            ChromeOptions options = new ChromeOptions();
//			
            driver = new ChromeDriver(options);
        }
    }

   

    public void setEnv() throws Exception {
       // LoadConfigProperty();
        String baseUrl = config.getProperty("siteUrl");
        driver.get(baseUrl);
    }

 

    @BeforeSuite(alwaysRun = true)
    public void setUp() throws Exception {
        openBrowser();
       // maximizeWindow();
       // implicitWait(30);
//        deleteAllCookies();
    }
    @AfterSuite(alwaysRun = true)
    public void quit() throws IOException, InterruptedException {
        driver.quit();
    }
}
