package parameterization11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelfile1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//to reach to excel file 
		FileInputStream page=new FileInputStream("C:\\Users\\Omkar\\OneDrive\\Desktop\\velocity class\\Parameterization.xlsx");
		//to open excel file 
	Workbook excel=WorkbookFactory.create(page);
		
		//to select sheet
	
	Sheet m1=excel.getSheet("Sheet1");
		
		//to high lig;ht the row
	
	Row p1=m1.getRow(3);
		
		//to high light the cell
	Cell p2=p1.getCell(0);
		
		
	
	//to fatch the data from the excel file
	
	String m5=p2.getStringCellValue();
	
	System.out.println(m5);
		
	}

}
