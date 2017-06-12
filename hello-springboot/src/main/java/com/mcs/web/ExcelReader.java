package com.mcs.web;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mcs.model.Car;
public class ExcelReader
{
	
	public void readExcel(byte[] file) throws Exception{
	
	InputStream is = new ByteArrayInputStream(file);
    Workbook workbook = new XSSFWorkbook(is);
    Sheet firstSheet = workbook.getSheetAt(0);
    Iterator<Row> iterator = firstSheet.iterator();
    Car c = new Car();
     
    while (iterator.hasNext()) {
        Row nextRow = iterator.next();
        Iterator<Cell> cellIterator = nextRow.cellIterator();
         
        while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();
            
             
          switch (cell.getCellType()) {
            case Cell.CELL_TYPE_STRING:
			//              System.out.print(cell.getStringCellValue());
              c.setModel(cell.getStringCellValue());
              if (c.getModel() != "") {
            	  c.setColor(cell.getStringCellValue());
            	  c.setModel(cell.getStringCellValue());
              }
              break;
                case Cell.CELL_TYPE_BOOLEAN:
     
//                	System.out.print(cell.getBooleanCellValue());
                    break;
                case Cell.CELL_TYPE_NUMERIC:
//                    System.out.print(cell.getNumericCellValue());
                	c.setYear(cell.getNumericCellValue());
                    break;
            }
           // System.out.print(" - ");
        }
        System.out.println(c);
        System.out.println();
    }
    System.exit(1);
    try {
		workbook.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    try {
		is.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	}


	