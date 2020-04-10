package excel_challenge.Pages;

import excel_challenge.Configuration.DriverFactory;
import excel_challenge.Helpers.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

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

    @FindBy(xpath = "//button[@class='col s12 m12 l12 btn-large uiColorButton']")
    private WebElement roundButton;

    @FindBy(xpath = "//div[@class='message2']")
    private WebElement resultMessage;

    List<String> roundNumbers = new ArrayList<>();

    public InputFormsPage()
    {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public List<String> fillInputs (List<Data> excelData)
    {
        startButton.click();
        long startTimeMillis = Calendar.getInstance().getTimeInMillis();

        for (int i = 1; i <= 10; i++)
        {
            roundNumbers.add(roundButton.getText());
            firstNameInput.sendKeys(excelData.get(i-1).getFirstName());
            lastNameInput.sendKeys(excelData.get(i-1).getLastName());
            emailInput.sendKeys(excelData.get(i-1).geteMail());
            roleInCompanyInput.sendKeys(excelData.get(i-1).getRoleInCompany());
            companyNameInput.sendKeys(excelData.get(i-1).getCompanyName());
            phoneNumberInput.sendKeys(excelData.get(i-1).getPhoneNumber());
            addressInput.sendKeys(excelData.get(i-1).getAddress());

            submitButton.click();
        }
        long endTimeMillis = Calendar.getInstance().getTimeInMillis();

        long testTimeInMillis = endTimeMillis - startTimeMillis;
        double testTimeInSeconds = testTimeInMillis / 1000.0;

        System.out.println(testTimeInMillis);
        System.out.println(testTimeInSeconds);

        return roundNumbers;
    }

    public void resultMessageChecking()
    {
        assertThat(resultMessage.getText()).contains("70 out of 70 fields");
    }

     public List<String> getRoundNumbers()
     {
         List<String> allRoundNumbers = new ArrayList<>();
         for(String roundNumber : roundNumbers)
         {
             allRoundNumbers.add(roundNumber);
         }
         return allRoundNumbers;
     }

     public void roundNumberChecking()
     {
         for(int i = 0; i < 10; i++)
         {
             assertThat(getRoundNumbers().get(i)).isEqualTo(String.format("ROUND %d",i+1));
         }
     }

}
