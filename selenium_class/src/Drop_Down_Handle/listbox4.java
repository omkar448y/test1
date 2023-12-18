package Drop_Down_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox4 {
	public static void main(String[] args) throws InterruptedException
	  {
		  // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		  System.setProperty("webdriver.chrome.driver", 
				  "C:\\Selenium\\browser\\chromedriver_win32\\chromedriver.exe");
		  
		  
		  //Create object of chromedriver class and provide reference of  Webdriver interface             
		            WebDriver driver=new ChromeDriver();
		   
		  
		  driver.get("https://www.facebook.com/");
		  
		  //click on create new account button
		  driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		  
		  //wait
		  Thread.sleep(2000);
		  
		 //Step-I: Identify listbox and store into an object  
		    WebElement  date=driver.findElement(By.xpath("//select[@id='day']"));
		    
		    //Step-II:Create object of select class
		               Select S=new Select(date);
		               
		      //Step-III:Call the methods
		               	S.selectByVisibleText("27");
	
	  }
	
	
}
