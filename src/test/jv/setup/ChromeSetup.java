package jv.setup;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeSetup {
    protected static WebDriver driver;

    @BeforeClass
    public static void setUp()  {
        File bin = new File ("/usr/bin/chromedriver");
        if(bin.exists()) {
            // For Linux:
            System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        }
        else
        {
            // For MacOS:
            System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        }
        
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }
}
