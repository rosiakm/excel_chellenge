package excel_challenge.Test;

import excel_challenge.Pages.InputFormsPage;
import org.testng.annotations.Test;

public class ExcelDataTest
{
    InputFormsPage inputforms = new InputFormsPage();

    @Test
    public void excelDataTest()
    {
        inputforms.fillInputs();
    }
}
