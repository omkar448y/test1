package Drop_Down_Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alloption1 {
	public static void main(String[] args) throws InterruptedException
	  {
		  // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		  
		  
		  //Create object of chromedriver class and provide reference of  Webdriver interface             
		            WebDriver driver=new ChromeDriver();
		   
		  
		  driver.get("file:///C:/Users/Omkar/OneDrive/Desktop/listbox%20(1).html");
		  
		  
		 //Step-I: Identify listbox and store into an object    
		     WebElement Country=driver.findElement(By.xpath("//select[@id='1234']"));
		  
		     //Step-II:Create object of select class
		     Select S1=new Select(Country);
		  
		     //Step-III:Call the methods
		     S1.selectByVisibleText("Ind");
		     S1.selectByVisibleText("Pak");
		     S1.selectByIndex(2);
		     S1.selectByIndex(3);
		     
		     //To get all selected options of listbox
		    List<WebElement> alloptions=S1.getAllSelectedOptions();
		         
		         
		         for(WebElement S2:alloptions) 
		         {
		        	 System.out.println(S2.getText());//Ind pak sri lanka china
		         }
		         
		     
		     
	  }
	
	

}
