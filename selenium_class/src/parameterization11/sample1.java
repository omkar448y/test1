package parameterization11;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//to create fileinputStream object
		FileInputStream file=new FileInputStream("C:\\Users\\Omkar\\OneDrive\\Desktop\\velocity class\\Parameterization.xlsx");
		
		
		
		//to open excel sheet
		Workbook book=WorkbookFactory.create(file);
	
		//to enter particular sheet
		
	    Sheet sh=book.getSheet("Sheet1");
		
		//to highlight row of excel sheet
	    		
	        Row s1= sh.getRow(0);
	    
	       //to highkight row of excel file
	    		
	    	Cell s2=s1.getCell(0);	
	    		
	    	//to fetch informaton
	    	
	    	String value=s2.getStringCellValue();
	    	
	    	System.out.println(value);
	    	
		
		
		
	}
	

}
