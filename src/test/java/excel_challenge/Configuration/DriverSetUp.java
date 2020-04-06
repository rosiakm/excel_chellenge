package excel_challenge.Configuration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DriverSetUp
{
    public WebDriver driver;

    @BeforeTest
    public void setUpDriver()
    {
        driver = DriverFactory.getDriver();
    }

    @AfterTest
    public void tearDownDriver()
    {
        DriverFactory.quit();
    }
}
