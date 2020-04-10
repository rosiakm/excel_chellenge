package excel_challenge.Configuration;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class DriverSetUp
{
    public WebDriver driver;

    @Before
    public void setUpDriver()
    {
        driver = DriverFactory.getDriver();
    }

    @After
    public void tearDownDriver()
    {
        DriverFactory.quit();
    }
}
