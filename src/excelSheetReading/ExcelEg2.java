package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		File myFile=new File("E:\\Selenium Java\\Excel26thMarchB.xlsx");
		
		Workbook book=WorkbookFactory.create(myFile);
		Sheet mySheet=book.getSheet("Sheet1");
		Row myRow=mySheet.getRow(0);
		Cell myCell=myRow.getCell(0);
		System.out.println(myCell.getCellType());
		System.out.println("==================");
		
		
		//Code for reading  whole data from excel sheet
		
		Sheet mySheet2=book.getSheet("Sheet2");
		
		for(int i=0;i<=2;i++)//outer for loop-->rows
			
		{
			
			for(int j=0;j<=2;j++)//inner for loop-->cells
			{
				String value=mySheet2.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value+"");
			}
			System.out.println();
		
		
		}
		System.out.println("========================");
		
		
		
	}

}
