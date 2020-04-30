package excelreadandwrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcel {

    public static final String FILE_NAME = System.getProperty("user.dir") + "/DataTest/NewExcel.xlsx";

    public static void main(String[] args)  {
        readExcelFile(0);
    }

    public static void readExcelFile(int sheetNumber){
        try {
            FileInputStream inputStream=new FileInputStream(new File(FILE_NAME));
            Workbook workbook=new XSSFWorkbook(inputStream);
            Sheet dataTypeSheet=workbook.getSheetAt(sheetNumber);

            Iterator<Row> rowIterator=dataTypeSheet.iterator();
            while (rowIterator.hasNext()){
                Row currentRow=rowIterator.next();

                Iterator<Cell> cellIterator=currentRow.iterator();
                while (cellIterator.hasNext()){
                    Cell currentCell=cellIterator.next();

                    if (currentCell.getCellType()== CellType.STRING){
                        System.out.print(currentCell.getStringCellValue()+"    ");
                    } else if(currentCell.getCellType()== CellType.NUMERIC){
                        System.out.print(currentCell.getNumericCellValue()+"    ");
                    }
                }
                System.out.println();
            }


        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("File Not Found");
        } catch (IOException e1){
            e1.printStackTrace();
            System.out.println("Reading Done");
        }

    }


}
