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

public class sample2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	
	{
		//to create object of fileinputstream and pass the parameter inside the file inputstream constructor
		//to reach excel sheet
		FileInputStream file=new FileInputStream("C:\\Users\\Omkar\\OneDrive\\Desktop\\velocity class\\Parameterization.xlsx");
		//to open sheet 
		
	Workbook sheet1=WorkbookFactory.create(file);
		
		//to selet sheetno
	
	Sheet m1=sheet1.getSheet("Sheet1");
		
		//to select row
	
    Row p1=	m1.getRow(0);
		//to selct column
     Cell p2=p1.getCell(0);	
		
		//to fatch data
   String value =p2.getStringCellValue();		
		
	System.out.println(value);	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
