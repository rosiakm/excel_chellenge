package excel_challenge.Pages;

import excel_challenge.Configuration.DriverFactory;
import excel_challenge.Helpers.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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
    @FindBy(xpath = "//button[@class='waves-effect col s12 m12 l12 btn-large uiColorButton']")
    private WebElement startButton;

    public InputFormsPage()
    {
        PageFactory.initElements(DriverFactory.getDriver(),this);
    }

    public void fillInputs (List<Data> excelData)
    {
        startButton.click();

        for (int i = 0; i == 10; i++)
        {
            firstNameInput.sendKeys(excelData.get(i).getFirstName());
            lastNameInput.sendKeys(excelData.get(i).getLastName());
            emailInput.sendKeys(excelData.get(i).geteMail());
            roleInCompanyInput.sendKeys(excelData.get(i).getRoleInCompany());
            companyNameInput.sendKeys(excelData.get(i).getCompanyName());
            phoneNumberInput.sendKeys(excelData.get(i).getPhoneNumber());
            addressInput.sendKeys(excelData.get(i).getAddress());

            submitButton.click();
        }
    }
}
