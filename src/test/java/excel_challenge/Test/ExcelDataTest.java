package excel_challenge.Test;

import excel_challenge.Helpers.Data;
import excel_challenge.Helpers.ExcelHelper;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ExcelDataTest
{
    String path = "C:\\Users\\rosiakm\\IdeaProjects\\excel_challenge\\challenge.xlsx";

    @Test
    public void excelDataTest() throws IOException
    {
        System.out.println(ExcelHelper.readExcelFile(new File(path)).size());
    }
}
