package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelEg3 {

	public static void main(String[] args)throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
		File myFile=new File("E:\\Selenium Java\\Excel26thMarchB.xlsx");
		
		Sheet mySheet=WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		int totalNumberOfRows=mySheet.getLastRowNum(); //will give me total row count
		int rowCount=totalNumberOfRows;
		System.out.println("Total number of rows are "+rowCount);
		
		short totalNumberOfCells=mySheet.getRow(totalNumberOfRows).getLastCellNum();
        int cellCount=totalNumberOfCells-1;
		System.out.println("Total number of cell are "+cellCount);
		
		for(int i=0;i<=rowCount;i++)//outer for loop for rows
		{
			for(int j=0;j<=cellCount;j++)//inner for loop for cell
			{
				Cell cellValue=mySheet.getRow(i).getCell(j);
			    CellType dataType=cellValue.getCellType();
			    
				if(dataType==CellType.STRING)
				{
					String value=cellValue.getStringCellValue();
					System.out.println(value+" ");
				
				}
				else if(dataType==CellType.NUMERIC)
				{
					double value=cellValue.getNumericCellValue();
					System.out.println(value+" ");
				}
				else if(dataType==CellType.BOOLEAN)
				{
					Boolean value=cellValue.getBooleanCellValue();
					System.out.println(value+" ");
				}
				
				else if(dataType==CellType.BLANK)
				{
					System.out.println(" ");
				}
				
				
			}
			System.out.println();
		}
		
	}

}
