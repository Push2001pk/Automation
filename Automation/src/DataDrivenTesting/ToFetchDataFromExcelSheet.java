package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ToFetchDataFromExcelSheet 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("D:\\Eclipse Programs\\Selenium\\Automation\\TestData\\Book1.xlsx");
		
	
	    Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row=sheet.getRow(2);
		
		Cell cell=row.getCell(1);
		
		//String Customername1 = cell.getStringCellValue();
	     double Customername1=cell.getColumnIndex();
		
		System.out.println(Customername1);
		
		
		
		
      
	}

}
