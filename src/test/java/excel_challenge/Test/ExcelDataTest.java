package excel_challenge.Test;

import excel_challenge.Configuration.DriverSetUp;
import excel_challenge.Helpers.ExcelHelper;
import excel_challenge.Pages.InputFormsPage;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ExcelDataTest extends DriverSetUp
{
    InputFormsPage inputForms = new InputFormsPage();
    String path = "C:\\Users\\rosiakm\\IdeaProjects\\excel_challenge\\challenge.xlsx";

    @Test
    public void excelDataTest() throws IOException
    {
        inputForms.fillInputs(ExcelHelper.readExcelFile(new File(path)));
        inputForms.roundNumberChecking();
        inputForms.resultMessageChecking();
    }
}
