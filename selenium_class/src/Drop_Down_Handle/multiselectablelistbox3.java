package Drop_Down_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectablelistbox3 {
	public static void main(String[] args) throws InterruptedException
	  {

		  // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Users\\samsung\\Desktop\\selenium-II\\Browser\\chromedriver_win32 (1)\\chromedriver.exe");
		  
		  
		  //Create object of chromedriver class and provide reference of  Webdriver interface             
		            WebDriver driver=new ChromeDriver();
		   
		  
		  driver.get("file:///C:/Users/samsung/Desktop/Automation/html%20coding/multiselectable_listbox.html");
		  
		  
		 //Step-I: Identify listbox and store into an object    
		     WebElement Country=driver.findElement(By.xpath("//select[@id='1234']"));
		  
		     //Step-II:Create object of select class
		     Select S1=new Select(Country);
		  
		     //Step-III:Call the methods
		     S1.selectByVisibleText("Ind");
		     S1.selectByVisibleText("Pak");
		     S1.selectByIndex(2);
		     S1.selectByIndex(3);
		   
		     //wait
		     Thread.sleep(1000);
		     
		     //deselect the options
		        S1.deselectAll();
		     
		  
		  
	  }
	
	
}
