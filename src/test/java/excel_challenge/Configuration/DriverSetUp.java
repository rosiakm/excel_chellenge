package excel_challenge.Configuration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverSetUp
{
    public WebDriver driver;

    @BeforeClass
    public void setUpDriver()
    {
        driver = DriverFactory.getDriver();
    }

    @AfterClass
    public void tearDownDriver()
    {
        DriverFactory.quit();
    }
}
