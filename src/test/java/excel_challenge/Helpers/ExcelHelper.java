package excel_challenge.Helpers;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ExcelHelper
{

    public static List<Data> readExcelFile(File file) throws IOException
    {
        //An array to store the data from excel sheet
        List<Data> excelData = new ArrayList<Data>();
        FileInputStream stream = new FileInputStream(file);
        //An excel workbook from the streamed file
        XSSFWorkbook workbook = new XSSFWorkbook(stream);
        //A special sheet from data will be read
        XSSFSheet sheet = workbook.getSheetAt(0);

        /** When we have a sheet object in hand we can iterate on each
         *  sheet's row and on each row's cell. We store the data read on
         *  an ArrayList so that we can printed the content of the excel to the
         *  console **/
        int rowsNumber = sheet.getLastRowNum();
        int cellsNumber = sheet.getRow(0).getLastCellNum();
        for (int i = 0; i<rowsNumber;i++)
        {
            Row row = sheet.getRow(i+1);
            for(int j = 0; j<=cellsNumber; j++)
            {
                excelData.add(new Data(row.getCell(0).getStringCellValue(),
                                       row.getCell(1).getStringCellValue(),
                                       row.getCell(2).getStringCellValue(),
                                       row.getCell(3).getStringCellValue(),
                                       row.getCell(4).getStringCellValue(),
                                       row.getCell(5).getStringCellValue(),
                                       row.getCell(6).getStringCellValue()));
            }
        }
        return excelData;
    }
}
