package excelSheetReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException,IOException { 
		
		//create excel sheet and pass the path along with name and extensions in file object
		
		File myFile=new File ("E:\\Selenium Java\\Excel26thMarchB.xlsx");
				
		//using WorkBookFactory	class read excel sheet
	   
		
		       //how to read string value//
				
				String name=WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		       
		         System.out.println(name);
		         
		        //HOW TO READ NUMERIC VALUE//
		         
		         double number=WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		         
		         System.out.println(number);
		         
		        //HOW TO READ CHAR VALUE//
		         
		         String mychar=WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		         
		         System.out.println(mychar);
		         
		        //How to read boolean value //
		         
		         boolean myValue=WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
		         
		         System.out.println(myValue);
		         
				
				

	}

}
