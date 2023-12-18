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

public class class1 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		
		//to reach to excel file
	FileInputStream file=new FileInputStream("C:\\Users\\Omkar\\OneDrive\\Desktop\\velocity class\\Parameterization.xlsx");	
		//to oopen  excel file
	Workbook main=	WorkbookFactory.create(file);
		
		//to highlight the row
	Sheet page=main.getSheet("Sheet1");
		
		//to high light the row and cell
	Row m1=page.getRow(3);
		
	Cell m2=m1.getCell(0);
		
	//to fatch the data 
	String p1=m2.getStringCellValue();
	System.out.println(p1);	
		
		
		
		
		
		
	}

}
