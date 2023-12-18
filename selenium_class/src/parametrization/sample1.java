package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{		
		     //To reach upto Excel sheet
		FileInputStream file=new FileInputStream("C:\\Users\\Omkar\\OneDrive\\Desktop\\velocity class\\Parameterization.xlsx");
		
		   //to open excel sheet
	   Workbook book=WorkbookFactory.create(file);
		
		//to enter perticular sheet
	      Sheet Sh=book.getSheet("Sheet1");
	      
	    //to highlight row of excel sheet
	         Row S1=Sh.getRow(0);
	     
	   //to highlight cell/column of excel sheet 
	           Cell S2=S1.getCell(0);
	           
	        //To fetch Information   
	       String  value=S2.getStringCellValue();
	           
	       	System.out.println(value);
		
	}
	
	
	
	
	
}
