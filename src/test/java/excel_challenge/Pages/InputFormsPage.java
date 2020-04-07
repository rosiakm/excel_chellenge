package excel_challenge.Pages;

import excel_challenge.Configuration.DriverFactory;
import excel_challenge.Helpers.ExcelHelper;
import excel_challenge.Helpers.SetFile;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

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

    public void fillInputs()
    {
        for (int i = 0; i == 10; i++)
        {
            try
            {
                firstNameInput.sendKeys(ExcelHelper.readExcelFile(SetFile.getFile()).get(i).getFirstName());
                lastNameInput.sendKeys(ExcelHelper.readExcelFile(SetFile.getFile()).get(i).getLastName());
                companyNameInput.sendKeys((ExcelHelper.readExcelFile(SetFile.getFile()).get(i).getCompanyName()));
                roleInCompanyInput.sendKeys(ExcelHelper.readExcelFile(SetFile.getFile()).get(i).getRoleInCompany());
                addressInput.sendKeys(ExcelHelper.readExcelFile(SetFile.getFile()).get(i).getAddress());
                emailInput.sendKeys(ExcelHelper.readExcelFile(SetFile.getFile()).get(i).geteMail());
                phoneNumberInput.sendKeys(ExcelHelper.readExcelFile(SetFile.getFile()).get(i).getPhoneNumber());
            } catch (IOException e)
            {
                e.printStackTrace();
            }
            submitButton.click();
        }
    }
}
