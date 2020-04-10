package excel_challenge.Helpers;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ExcelHelper
{
    public static List<Data> excelData = new ArrayList<>();

    public static List<Data> readExcelFile(File file) throws IOException
    {
        //An array to store the data from excel sheet
        FileInputStream stream = new FileInputStream(file);
        //An excel workbook from the streamed file
        XSSFWorkbook workbook = new XSSFWorkbook(stream);
        //A special sheet from data will be read
        XSSFSheet sheet = workbook.getSheetAt(0);

        Iterator<Row> rowIterator = sheet.rowIterator();
        DataFormatter formatter = new DataFormatter();

        while (rowIterator.hasNext())
        {
            Row row = rowIterator.next();
            excelData.add(new Data(formatter.formatCellValue(row.getCell(0)),
                                   formatter.formatCellValue(row.getCell(1)),
                                   formatter.formatCellValue(row.getCell(2)),
                                   formatter.formatCellValue(row.getCell(3)),
                                   formatter.formatCellValue(row.getCell(4)),
                                   formatter.formatCellValue(row.getCell(5)),
                                   formatter.formatCellValue(row.getCell(6))));
        }
        excelData.remove(0);
        return excelData;
    }
}
