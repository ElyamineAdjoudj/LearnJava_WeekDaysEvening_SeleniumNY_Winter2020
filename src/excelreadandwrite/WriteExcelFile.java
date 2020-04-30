package excelreadandwrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {

    //Dynamic Relative Path
    public static final String FILE_NAME=System.getProperty("user.dir")+"/DataTest/YourExcel.xlsx";
    // Absolute path

    public static void main(String[] args) {
        writeExcel();

    }


    public static void writeExcel(){
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Student Details");

        Object[][] stDetails={
                {"Sl","First Name","Last Name", "Address"},
                {"101","MD","Alam","Ozone Park, NY"},
                {"102","MD","Parvaz","Brooklyn, NY"},
                {"103","Anas","Chikh","Bronx Park, NY"},
                {"104","Hakim","Bouaraba","Jackson Heights, NY"},
        };
        int rowNum=0;
        System.out.println("Excel File Created");
        for (Object[] std:stDetails) {
            Row row=sheet.createRow(rowNum++);
            int colNum=0;
            for (Object field:std) {
                Cell cell=row.createCell(colNum++);
                if (field instanceof String){
                    cell.setCellValue((String) field);
                }else if (field instanceof Integer){
                    cell.setCellValue((Integer)field);
                }
            }
        }

        try {
            // File output steam
            FileOutputStream out=new FileOutputStream(FILE_NAME);
            workbook.write(out);
            workbook.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found Exception");
        }catch (IOException e1){
            System.out.println("Done");
        }


    }








}
