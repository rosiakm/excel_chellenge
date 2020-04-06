package excel_challenge.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory
{
    public static WebDriver driver;

    public static WebDriver getDriver()
    {
        if(driver == null)
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://www.rpachallenge.com/");
        }
        return driver;
    }

    public static void quit()
    {
        if(driver !=null)
        {
            driver.quit();
        }
        driver = null;
    }
}
