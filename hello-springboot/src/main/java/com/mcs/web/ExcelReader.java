package com.mcs.web;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.mcs.model.Car;



@Service
public class ExcelReader implements IExcelReader
{
	
	public List<Car> readFile(byte[] file) throws Exception{
	
	InputStream is = new ByteArrayInputStream(file);
    Workbook workbook = new XSSFWorkbook(is);
    Sheet firstSheet = workbook.getSheetAt(0);
    Iterator<Row> iterator = firstSheet.iterator();
    List<Car> cars = new ArrayList<Car>();
   
     
    while (iterator.hasNext()) {
    	
    	Car car = new Car();
    	
        Row nextRow = iterator.next();
        Iterator<Cell> cellIterator = nextRow.cellIterator();
        int counter = 0; 
        while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();
            if(counter==0) car.setModel(cell.getStringCellValue());
            
            if(counter==1) car.setYear(cell.getStringCellValue());
            
            if(counter==2) car.setColor(cell.getStringCellValue());
            
            counter++;
          
        }
       
        cars.add(car);
    }
  
    System.out.println(cars);
    
    
    
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
    
    return cars;
}
	}


	