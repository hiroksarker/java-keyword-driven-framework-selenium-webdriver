package ExcelUtility;

import Utility.Constants;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadExcelSheet {
    public ArrayList readExcelData(int colNo) {

        // Call filePath variable using class name.
        String filePath = Constants.filePath;
        // Create an object of file class and pass filePath as an input parameter to its constructor.
        File file = new File(System.getProperty("user.dir") + filePath);
        System.out.println(file);
        // Create an ArrayList object of String type. It will accept String value only.
        ArrayList ar = new ArrayList();

        try {
            // Create an object of FileInputStream class and pass file as parameter to its constructor.
            FileInputStream fis = new FileInputStream(file);
            // Create an object of XSSFWorkbook class and pass fis as parameter to its.
            XSSFWorkbook wb = new XSSFWorkbook(fis);

            XSSFSheet sheet = wb.getSheet("Sheet1");
            Iterator row = sheet.rowIterator();
            row.next();

            // Checking the next element availability using reference variable row.
            while (row.hasNext()) {
                // Moving cursor to next Row using reference variable row.
                Row r = (Row) row.next();
                // Moving cursor to the cell by getting cell number.
                Cell c = r.getCell(colNo);
                // Read the value of the cell using getStringCellValue() method.
                String data = c.getStringCellValue();

                // Adding the value of the cells in the ArrayList by passing 'data'.
                ar.add(data);
                // OR One line code: ar.add(row.next().getCell(colNo).getStringCellValue());
            }
            System.out.println("List: " + ar);
            // Return the data to the ArrayList method.

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ar;
    }
}
