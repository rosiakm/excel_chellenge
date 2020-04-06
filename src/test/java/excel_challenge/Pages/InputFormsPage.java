package excel_challenge.Pages;

import excel_challenge.Configuration.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputFormsPage
{
    @FindBy(xpath = "//input[@ng-reflect-name='labelLastName']")
    private WebElement lastNameInput;
    @FindBy(xpath = "//input[@ng-reflect-name='labelFirstName']")
    private WebElement firstNameInput;
    @FindBy(xpath = "//input[@ng-reflect-name='labelEmail']")
    private WebElement emailInput;
    @FindBy(xpath = "//input[@ng-reflect-name='labelRole']")
    private WebElement roleInCompanyInput;
    @FindBy(xpath = "//input[@ng-reflect-name='labelCompanyName']")
    private WebElement companyNameInput;
    @FindBy(xpath = "//input[@ng-reflect-name='labelPhone']")
    private WebElement phoneNumberInput;
    @FindBy(xpath = "//input[@ng-reflect-name='labelAddress']")
    private WebElement addressInput;
    @FindBy(xpath = "//input[@value='Submit']")
    private WebElement submitButton;

    public InputFormsPage()
    {
        PageFactory.initElements(DriverFactory.getDriver(),this);
    }
}
